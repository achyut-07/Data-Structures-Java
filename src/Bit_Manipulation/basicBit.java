package Bit_Manipulation;

import java.util.*;

public class basicBit {
    public static void main(String[] args) {
        System.out.println(5|9);
        System.out.println(~5);
        Scanner sc=new Scanner(System.in);
 //       int n= sc.nextInt();
//        int ans=1<<n;
//        System.out.println("power of two:- "+ans);
        //-> Swap Two numbers
        int a=5,b=2;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" "+b);
        List<Integer> arr=new ArrayList<>();

        System.out.println(arr.contains(1));
    }
}
