package Recursion;
import java.util.*;
public class a_RaisedTo_B {
//    public static int pow(int a,int b)
//    {
//        if(a==0) return 0;
//        if(b==0) return 1;
//        return a*pow(a,b-1);
//    }
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);;
//        System.out.print("Enter a and b values: ");
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int ans=pow(a,b);
//        System.out.println(a+" raised to power "+b+" is "+ans);
//    }

    public static int pow(int a,int b)
    {
        if(b==0) return 1;
        int ans=pow(a,b/2);;
        if(b%2==0) return ans*ans;
        return ans*ans*a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);;
        System.out.print("Enter base:- ");
        int a=sc.nextInt();
        System.out.print("Enter power:- ");
        int b=sc.nextInt();
        int ans=pow(a,b);
        System.out.println(a+" raised to power "+b+" is "+ans);
      }
      
}
