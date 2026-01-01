package Recursion;
import java.util.*;
public class maze_Path {
    public static int maze2(int m,int n)
    {
        if(m==1||n==1) return 1;
        int rightways=maze2(m,n-1);
        int downways=maze2(m-1,n);
        return rightways+downways;
    }
    public static int maze(int row,int col,int m,int n)
    {
        if(row==m||col==n) return 1;
        int rightways=maze(row,col+1,m,n);
        int downways=maze(row+1,col,m,n);
        return rightways+downways;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n and m value: ");
        int n=sc.nextInt();
        int m=sc.nextInt();
        //System.out.println(maze(1,1,m,n));
        System.out.println(maze2(m,n));
    }
}
