package strings;
import java.util.*;
public class toggleString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder str=new StringBuilder(s);
        int n=str.length();
        for(int i=0;i<n;i++)
        {
           char ch=str.charAt(i);
           int ascii=(int)ch;
            if(ch>=65&&ch<=90)
            {
                ascii+=32;
                ch=(char)ascii;
                str.setCharAt(i,ch);
            }
            else if(ch>=97&&ch<=122)
            {
                ascii-=32;
                ch=(char)ascii;
                str.setCharAt(i,ch);
            }
        }
        System.out.println(str);
    }
}
