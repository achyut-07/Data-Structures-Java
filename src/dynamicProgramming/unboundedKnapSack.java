package dynamicProgramming;

public class unboundedKnapSack {
    public static int profit(int i,int[] wt,int[] val,int c,int[][] dp){
        if(i==wt.length) return 0;
        if(dp[i][c]!=-1) return dp[i][c];
        int skip=profit(i+1,wt,val,c,dp);
        if(wt[i]>c) return dp[i][c]=skip;
        int take=val[i]+profit(i,wt,val,c-wt[i],dp);
        return dp[i][c]=Math.max(take,skip);
    } 
    public static void main(String[] args) {
        int[] val={5,3,9,16};
        int[] wt={1,2,8,10};
        int c=8;
        int n=wt.length;
        int[][] dp=new int[n][c+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<=c;j++){
                dp[i][j]=-1;;
            }
        }
        System.out.println(profit(0,wt,val,c,dp));

    }
    public int noOfCoins(int i,int[] arr,int amount,int[][] dp){
        if(i==arr.length) return -1;
        if(dp[i][amount]!=-1) return dp[i][amount];
        int skip=noOfCoins(i,arr,amount,dp);
        if(amount-arr[i]<=0) return dp[i][amount]=skip;
        int take=1+noOfCoins(i+1,arr,amount-arr[i],dp);
        return dp[i][amount]=Math.max(take,skip);

    }

    public int ways(int i,int[] arr,int target){
        if(i==arr.length){
            if(target==0) return 1;
            else return 0;
        }
        int add=ways(i+1,arr,target-arr[i]);
        int sub=ways(i+1,arr,target+arr[i]);
        return add+sub;
    }
}
