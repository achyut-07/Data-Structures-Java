package strings;

import java.util.*;

public class stringArrayInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] st=s.split(" ");
        int[] arr=new int[st.length];
        for(int i=0;i<st.length;i++){
            arr[i]=Integer.parseInt(st[i]);
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]*2+" ");
        }

    }
}
