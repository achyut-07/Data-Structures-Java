package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayTraversal {
//    public static void print(int i,int[] arr)
//    {
//        if(i==arr.length) return;
//        System.out.print(arr[i]+" ");
//        print(i+1,arr);
//    }
//    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6};
//       print(0,arr);
//    }
    public static void print(int i,String s)
    {
        if(i==s.length()) return;
        if(s.charAt(i)!='a')System.out.print(s.charAt(i));
        print(i+1,s);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="aaAaacaahaayaauaat";
        System.out.println();
        print(0,s);
    }
}
