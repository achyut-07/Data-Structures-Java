package strings;
import java.util.*;
public class characterOcuuringMost {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] freq=new int[26];
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int idx=(int)ch-97;
            freq[idx]++;
        }
        int max=freq[0];

        for(int i=0;i<freq.length;i++)
        {
            max=Math.max(max,freq[i]);
        }
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]==max)
            {
                char ch=(char)(i+97);
                System.out.println(ch+" ");
            }

        }
    }
}
