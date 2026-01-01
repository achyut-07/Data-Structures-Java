package two_D_Arrays;
import java.util.Scanner;
public class searchEfficient {
    public static void main(String[] args) {
        int[][] a={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int m=a.length,n=a[0].length;
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        boolean flag=false;
        int i=0,j=n-1;
        while(i<m && j>=0)
        {
            if(a[i][j]==key){
                System.out.println("found");
                i=m;
                flag=true;
            }
            else if(a[i][j]>key)
                j--;
            else i++;
        }
        if(flag == false) System.out.println("Not found");
    }
}
