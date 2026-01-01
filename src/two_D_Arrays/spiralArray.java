package two_D_Arrays;
import java.util.Scanner;
public class spiralArray {
    public static void main(String[] args) {
        int[][] a={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        int n=a.length,m=a[0].length;
        int minr=0,maxr=n-1,minc=0,maxc=m-1;

        while(minr<=maxr)
        {
            for(int i=minc;i<=maxc;i++)
            {
                System.out.print(a[minr][i]+" ");
            }
            minr++;
            if(minr>maxr) break;
            for(int i=minr;i<=maxr;i++)
            {
                System.out.print(a[i][maxc]+" ");
            }
            maxc--;
            if(minr>maxr) break;
            for(int i=maxc;i>=minc;i--)
            {
                System.out.print(a[maxr][i]+" ");
            }
            maxr--;
            if(minr>maxr) break;
            for(int i=maxr;i>=minr;i--)
            {
                System.out.print(a[i][minc]+" ");
            }
            minc++;
            if(minr>maxr) break;

        }
    }
}
