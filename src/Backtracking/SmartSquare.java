package Backtracking;

import java.util.Arrays;

public class SmartSquare {
    static int minval;
    public static void main(String[] args) {
        int[][] sqr={{1,4,8},{3,5,9},{2,7,6}};
        int[] arr=new int[10];
        boolean[] visited=new boolean[10];
        minval=Integer.MAX_VALUE;
        fills(arr,1,visited,sqr);
        System.out.println(minval);
    }

    private static void fills(int[] arr, int idx, boolean[] visited,int[][] sqr) {
        if(idx>9){
            if(isValid(arr)) {
                int val = cost(arr, sqr);
               // System.out.println(val);
                System.out.println(Arrays.toString(arr)+"  "+val);

                minval = Math.min(minval, val);
                //System.out.println(minval);
                return;
            }
        }
        for(int i=1;i<10;i++){
            if(!visited[i]){
                arr[idx]=i;
                visited[i]=true;
                fills(arr,idx+1,visited,sqr);
                visited[i]=false;
            }
        }
    }

    private static int cost(int[] arr, int[][] sqr) {
        int k=1;
        int sum=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                int diff=Math.abs(sqr[i][j]-arr[k++]);
                sum+=diff;
            }
        }
        return sum;
    }

    private static boolean isValid(int[] arr) {
        //rowsum;
        int rsum=0;
        for(int i=1;i<4;i++){
            rsum+=arr[i];
        }
        int csum=0;
        for(int i=4;i<10;i++){
            if(i%3!=0){
                csum+=arr[i];
            }
            else{
                csum+=arr[i];
                if(csum!=rsum) return false;
                csum=0;
            }
        }
        //colsum
        int colsum=0;
        colsum+=arr[1]+arr[4]+arr[7];
        csum=0;
        for(int i=2;i<4;i++){
            csum=arr[i]+arr[i+3]+arr[i+6];
            if(csum!=colsum) return false;
        }

        if(colsum!=rsum) return false;
        //diasum
        int dia1=arr[1]+arr[5]+arr[9];
        int dia2=arr[3]+arr[5]+arr[7];
        if(dia1!=dia2) return false;
        //if(dia1!=rsum) return false;

        return true;
    }
}
