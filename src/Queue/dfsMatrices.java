package Queue;

import java.util.*;

public class dfsMatrices {
    static int k=1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        int idx1=sc.nextInt();
        int idx2=sc.nextInt();
        boolean[][] vis=new boolean[n][m];
        k=1;
        dfsFill(arr,idx1,idx2,1,vis);

        for(int[] ele:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }

    private static void dfsFill(int[][] arr, int i, int j, int val, boolean[][] vis) {
        int n=arr.length;
        int m=arr[0].length;
        if(i<0||i>=n||j<0||j>=m) return;
        if(vis[i][j]) return;
        vis[i][j]=true;
        arr[i][j]=k;
        k++;
//        for(int k=val+1; k<=n*m; k++){
            //north
            dfsFill(arr,i-1,j,val+1,vis);
            //east
            dfsFill(arr,i,j+1,val+1,vis);
            //south
            dfsFill(arr,i+1,j,val+1,vis);
            //west
            dfsFill(arr,i,j-1,val+1,vis);
        //}


    }
    
}
