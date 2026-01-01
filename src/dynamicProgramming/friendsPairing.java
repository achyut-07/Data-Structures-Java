package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class friendsPairing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(pairFriend(n,dp));
    }

    private static int pairFriend(int n,int[] dp) {
        if(n==1||n==2) return n;
        if(dp[n]!=-1) return dp[n];
        return dp[n]=pairFriend(n-1,dp)+(n-1)*pairFriend(n-2,dp);
    }

    public int uniquePaths(int m, int n) {
        int[][] dp=new int[m][n];
        Arrays.fill(dp,-1);
        return path(dp,0,0,m-1,n-1);

    }

    private int path(int[][] dp,int row, int col, int m, int n) {
        if(row>=m||col>=n) return 0;
        if (row==m-1&&col==n-1) return 1;
        if(dp[m][n]!=-1) return dp[m][n];
        return dp[m][n]=path(dp,row-1,col,m,n)+path(dp,row,col-1,m,n);
    }
}
