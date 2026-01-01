package two_D_Arrays;

import java.util.Scanner;
public class rotatingArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][3];
        int m=arr.length;
        int n=arr[0].length;
        System.out.println("Enter the matrix: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            for(int j=i;j<n;j++)
            {
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<m;i++)
        {
            int lo=0,hi=n-1;
            while(lo<hi)
            {
                int temp=arr[i][lo];
                arr[i][lo]=arr[i][hi];
                arr[i][hi]=temp;
                lo++;
                hi--;
            }

        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
