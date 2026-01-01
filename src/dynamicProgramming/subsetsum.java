package dynamicProgramming;

import java.util.Arrays;
import java.util.HashMap;

public class subsetsum {
    public static void main(String[] args) {
        int[] arr={0,8,1,2,4};
        int t=16;
        int n=arr.length;
        int[][] dp=new int[n][t+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<t+1;j++){
                dp[i][j]=-1;
            }
        }
        //System.out.println(subset(dp,0, arr,t));
        System.out.println(subsetnto0(dp,n-1, arr,t));
    }

    private static boolean subset(int[][] dp,int i ,int[] arr, int t) {
        if(i==arr.length){
            if(t==0) return true;
            else return false;
        }
        if(dp[i][t]!=-1) return dp[i][t]==1;
        boolean ans=false;
        boolean skip=subset(dp,i+1,arr,t);
        if(t-arr[i]<0) ans=skip;  //only if all values  are +ve
        else {
            boolean pick = subset(dp, i + 1, arr, t - arr[i]);
            ans=pick||skip;
        }
        if(ans) dp[i][t]=1;
        else dp[i][t]=0;
        return ans;
    }

    private static boolean subsetnto0(int[][] dp,int i ,int[] arr, int t) {
        if(i<0){
            if(t==0) return true;
            else return false;
        }
        if(dp[i][t]!=-1) return dp[i][t]==1;
        boolean ans=false;
        boolean skip=subset(dp,i-1,arr,t);
        if(t-arr[i]<0) ans=skip;  //only if all values  are +ve
        else {
            boolean pick = subset(dp, i - 1, arr, t - arr[i]);
            ans=pick||skip;
        }
        if(ans) dp[i][t]=1;
        else dp[i][t]=0;
        return ans;
    }

    public int numOfUnplacedFruits(int[] arr, int[] brr) {
        int count=0;
        for(int ele:arr){
            for(int i=0;i<brr.length;i++){
                if(brr[i]>=arr[i]) {
                    count++;
                    brr[i]=-1;
                    break;
                }
            }
        }
        return arr.length-count;
    }
    
}
