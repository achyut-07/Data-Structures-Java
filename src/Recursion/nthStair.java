package Recursion;
import java.util.*;
public class nthStair {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n :- ");
        int n=sc.nextInt();
        int res=stair(n);
        int ans=stair1(n);
        System.out.println(res);
        System.out.println(ans);
    }
    public static int stair(int n) {
        if(n<=2) return n;
        return stair(n-1)+stair(n-2);
    }
    public static int stair1(int n) {
        if(n==1||n==3) return n;
        return stair(n-1)+stair(n-3);
    }
}
