package dynamicProgramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class knapsack {
    public static int profit(int i,int[] wt,int[] val,int c,int[][] dp){
        if(i==wt.length) return 0;
        if(dp[i][c]!=-1) return dp[i][c];
        int skip=profit(i+1,wt,val,c,dp);
        if(wt[i]>c) return dp[i][c]=skip;
        int take=val[i]+profit(i+1,wt,val,c-wt[i],dp);
        return dp[i][c]=Math.max(take,skip);
    }
    public static int knapsackleftToright(int i,int[] wt,int[] val,int c,int[][] dp){
        if(i<0) return 0;
        if(dp[i][c]!=-1) return dp[i][c];
        int skip=profit(i-1,wt,val,c,dp);
        if(wt[i]>c) return dp[i][c]=skip;
        int take=val[i]+profit(i-1,wt,val,c-wt[i],dp);
        return dp[i][c]=Math.max(take,skip);
    }

    public static void main(String[] args) {
        int[] val={5,3,9,16};
        int[] wt={1,2,8,10};
        int c=8;
        int n=wt.length;
        int[][] dp=new int[n][c+1];
        //tabulation Knapsack

        for(int i=0;i<n;i++){
            for(int j=0;j<dp[0].length;j++){
                int skip= (i>0)? dp[i-1][j]: 0;
                if(wt[i]>j) dp[i][j]=skip;
                else{
                    int pick=val[i];
                    pick+=(i>0)?dp[i-1][c-wt[i]]:0;
                    dp[i][j]=Math.max(pick,skip);
                }
            }
        }
        System.out.println(dp[n-1][c]);

        //memoization
//        for(int i=0;i<n;i++){
//            for(int j=0;j<=c;j++){
//                dp[i][j]=-1;;
//            }
//        }
//        System.out.println(knapsackleftToright(n-1,wt,val,c,dp));
//       // System.out.println(profit(0,wt,val,c,dp));

    }
}
