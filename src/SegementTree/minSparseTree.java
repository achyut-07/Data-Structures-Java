package SegementTree;
import java.util.*;
public class minSparseTree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int col=(int)((Math.log(n)/Math.log(2))+1);
        long[][] arr=new long[n][col];
        for(int i=0;i<n;i++){
            arr[i][0]=sc.nextLong();
        }
        for(int j=1;j<arr[0].length;j++){
            int pow=1<<j-1;
            for(int i=0;i+pow<n;i++){
                arr[i][j]=Math.min(arr[i][j-1],arr[i+pow][j-1]);
            }
        }
        int q=sc.nextInt();
        while(q-->0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int len = (r - l + 1);
            int idx = (int) (Math.log(len) / Math.log(2));
            long ans = Math.min(arr[l][idx], arr[r - (1 << idx) + 1][idx]);
            System.out.println(ans);
        }
    }
}
