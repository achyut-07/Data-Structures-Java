package Recursion;
import java.util.*;
public class GCD {
    public static int gcd(int a,int b)
    {
        if(b%a==0) return a;
        return gcd(b%a,a);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a:- ");
        int a=sc.nextInt();
        System.out.print("Enter b:- ");
        int b=sc.nextInt();
        int ans=gcd(a,b);
        System.out.println("Gcd of "+a+" and "+b+" is "+ans);
    }
}

