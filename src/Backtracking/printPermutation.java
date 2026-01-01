package Backtracking;
import java.util.*;
public class printPermutation {
    public static void main(String[] args) {
        String str="abc";
        int[] arr={1,2,3};
        boolean[] isvisited=new boolean[arr.length];
        ArrayList<Integer> t=new ArrayList<>();
        //printp(str,"");
        printnump(arr,t,isvisited);
    }

    private static void printp(String str, String t) {
        if(str.equals("")){
            System.out.println(t);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            String left=str.substring(0,i);
            String right=str.substring(i+1);
            String rem=left+right;
            printp(rem,t+ch);
        }
    }
    public static void printnump(int[] arr,ArrayList<Integer> t,boolean[] isvisited){
        if(t.size()==arr.length){
            ArrayList<Integer> l=new ArrayList<>();
            for(int ele:t) l.add(ele);
            System.out.println(l);
            return;
        }
        for(int i=0;i< arr.length;i++){
            if(isvisited[i]) return;
            if(isvisited[i]==false){
                t.add(arr[i]);
                isvisited[i]=true;
                printnump(arr,t,isvisited);
                isvisited[i]=false;
                t.remove(t.size()-1);
            }
        }
    }
}
