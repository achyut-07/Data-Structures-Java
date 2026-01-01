package two_D_Arrays;
import java.util.Scanner;
public class basics2DArrays {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int[][] a=new int[4][4];
//        int m=a.length;
//        int n=a[0].length;
//        System.out.println("Enter the matrix: ");
//        for(int i=0;i<m;i++)
//        {
//            for(int j=0;j<n;j++)
//            {
//                a[i][j]=sc.nextInt();
//            }
//        }
////        for(int i=0;i<m;i++)
////        {
////            for(int j=0;j<n;j++)
////            {
////                b[i][j]=a[j][i];
////            }
////        }
////        for(int i=0;i<m;i++)
////        {
////            for(int j=0;j<n;j++)
////            {
////                System.out.print(b[i][j]+" ");
////            }
////            System.out.println();
////        }
//        for(int i=0;i<m;i++)
//        {
//            for(int j=i;j<n;j++)
//            {
//                int temp=a[i][j];
//                a[i][j]=a[j][i];
//                a[j][i]=temp;
//            }
//        }
//        for(int i=0;i<m;i++)
//        {
//            int lo=0,hi=n-1;
//            for(int j=n-1;j>=0;j--)
//            {
//               int temp=a[i][j];
//            }
//            System.out.println();
//
//        }
        int[][] ans=new int[3][3];
        int n=2;
        int a=1;
        int minr=0,maxr=n-1,minc=0,maxc=n-1;
        while(minr<=maxr&&minc<=maxc)
        {
            for(int i=minc;i<=maxc;i++)
            {
                ans[minr][i]=a;
                a++;
            }
            minr++;
            if(minr>maxr||minc>maxc) break;
            for(int i=minr;i<=maxr;i++)
            {
                ans[i][maxc]=a;
                a++;
            }
            maxc--;
            if(minr>maxr||minc>maxc) break;
            for(int i=maxc;i>=minc;i--)
            {
                ans[maxr][i]=a;
                a++;
            }
            maxr--;
            if(minr>maxr||minc>maxc) break;
            for(int i=maxr;i>=minr;i--)
            {
                ans[i][minc]=a;
                a++;
            }
            minc++;

        }
        for(int[] ele:ans)
        {
            for(int x:ele)
            {
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }
}
