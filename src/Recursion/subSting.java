package Recursion;
import java.util.*;
public class subSting {

    public static void printSubset(int i,int n,int k,String ans)
    {
       if(ans.length()==k)
       {
           System.out.println(ans);
           return;
       }
        if (i >n) {
            return;
        }
        printSubset(i+1,n,k,ans);
        printSubset(i+1,n,k,ans+i);
    }
    public static void main(String[] args) {
        int n=6;
        int k=4;
        printSubset(1,n,k,"");
    }

}
