package strings;
import java.util.Scanner;
public class reverseWithoutFunction{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        int n=sb.length();
        for(int i=0,j=n-1;i<j;i++,j--)
        {
            char temp1=sb.charAt(i);
            sb.setCharAt(i,sb.charAt(j));
            sb.setCharAt(j,temp1);
        }
        System.out.println(sb);
    }
}
