package strings;
import java.util.Scanner;
public class stringBuilder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        StringBuilder sb=new StringBuilder(sc.nextLine());
        sb.setCharAt(1,'a');
        System.out.println(sb);
    }
}
