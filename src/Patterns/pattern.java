package Patterns;
import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int n=sc.nextInt();
        int nst=1;
        int nsp=n-1;
        int mid=((2*n-1)/2)+1;
        System.out.println(mid);
        for(int i=1;i<=2*n-1;i++)
        {
            for(int j=1;j<=nsp;j++)
            {
                System.out.print("  ");
            }
            for (int j = 1; j<=nst; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
            if(i>=mid)
            {
                nsp++;
                nst-=2;
            }
            else
            {
                nsp--;
                nst += 2;
            }
        }
        char[] a={'r','a','g'};
        String s=a.toString();
    }
}
