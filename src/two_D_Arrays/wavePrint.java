package two_D_Arrays;
import java.util.Scanner;
public class wavePrint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[3][3];
        int n=a.length,m=a[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<m;j++)
            {
                int temp=a[i][j];
                a[i][j]=a[j][i];
                a[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            int low=0,hi=n-1;
            while(low<=hi)
            {
                int temp=a[i][low];
                a[i][low]=a[i][hi];
                a[i][hi]=temp;
                low++;hi--;
            }
        }
        //for printing 741 258 963
//        for(int i=0;i<n;i++)
//        {
//            if (i % 2 != 0) {
//                for (int j = m - 1; j >= 0; j--) {
//                    System.out.print(a[i][j] + " ");
//                }
//            } else {
//                for (int j = 0; j < m; j++) {
//                    System.out.print(a[i][j] + " ");
//                }
//            }
//        }
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                for(int j=m-1;j>=0;j--)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            else {
                for(int j=0;j<m;j++)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }
}
