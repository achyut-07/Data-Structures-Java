package two_D_Arrays;
import java.util.Scanner;
public class flippingMatrixScore {
    public static void main(String[] args) {
        int[][] arr=new int[3][4];
        int m=arr.length,n=arr[0].length;
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++)
        {
            if(arr[i][0]==0)
            {
                for(int j=0;j<n;j++)
                {
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }
        for(int j=1;j<n;j++)
        {
            int noOfZeroes=0,noOfOnes=0;
            for(int i=0;i<m;i++)
            {
                if(arr[i][j]==0) noOfZeroes++;
                    else noOfOnes++;
            }
            if(noOfZeroes>noOfOnes)
            {
                for(int i=0;i<m;i++)
                {
                    if(arr[i][j]==0) arr[i][j]=1;
                    else arr[i][j]=0;
                }
            }
        }
            int score=0;
            int x=1,bm=0;
            for (int j =n-1; j >=0; j--) {
                for (int i =0; i <m; i++) {
                score+=(arr[i][j]*x);
            }
           x*=2;
        }
        System.out.println(score);
    }
}
