package dynamicProgramming;

import java.util.Arrays;

public class matrixChainMultiplication {
    public static void main(String[] args) {
        int[][] arr={{1,2},{2,3},{3,4}};
        int[] brr={1,2,3,4,2};
        int n=arr.length;
        int m=brr.length;
        int[][] dp=new int[n-1][n-1];
        for(int[] ele:dp) Arrays.fill(ele,-1);
        System.out.println(mcm(0,n-1,arr));
        System.out.println(mcm2(0,m-2,brr,dp));
    }
    public static int mcm(int i,int j,int[][] arr){
        if(i==j) return 0;
        int mincost=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int x=arr[i][0]*arr[j][1]*arr[k][1];
            int tc=mcm(i,k,arr)+mcm(k+1,j,arr)+x;
            mincost=Math.min(tc,mincost);
        }
        return mincost;
    }
    public static int mcm2(int i,int j,int[] arr, int[][] dp){
        if(i==j) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int mincost=Integer.MAX_VALUE;
        for(int k=i;k<j;k++){
            int x=arr[i]*arr[j+1]*arr[k+1];
            int tc=mcm2(i,k,arr,dp)+mcm2(k+1,j,arr,dp)+x;
            mincost=Math.min(tc,mincost);
        }
        return dp[i][j]=mincost;
    }

    public int minCost(int n, int[] cuts) {
        int[] arr=new int[cuts.length+2];
        int i;
        for(i=0;i<cuts.length;i++){
            arr[i]=cuts[i];
        }
        arr[i++]=0;
        arr[i]=n;
        Arrays.sort(arr);
        int m=arr.length;
        int[][] dp=new int[m-1][m-1];
        for(int[] ele:dp) Arrays.fill(ele,-1);
        return cost(1,m-2,arr,dp);
    }

    private int cost(int i, int j, int[] arr, int[][] dp) {
        if(i>j) return 0;
        int mincost=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
            int len=arr[i-1]+arr[j+1];
            int tc=cost(i,k-1,arr,dp)+cost(k+1,j,arr,dp)+len;
            mincost=Math.min(mincost,tc);
        }
        return mincost;
    }
}
