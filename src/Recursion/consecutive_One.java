package Recursion;
import java.util.*;
public class consecutive_One {
    public static void consecutive(int n,String s)
    {
        if(s.length()==n)
        {
            System.out.println(s);
            return;
        }
        if(s.length()==0||s.charAt(s.length()-1)!='1')
        {
            consecutive(n,s+0);
            consecutive(n,s+1);
        }
       else consecutive(n,s+0);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        consecutive(n,"");
    }
}
