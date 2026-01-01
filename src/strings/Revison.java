package strings;
import java.util.*;
public class Revison {
    public static void main(String[] args) {
        String s="This is sample text, for testing.";
        s = s.replaceAll("[.,:;!?@]", "");
        String[] arr = s.split("\\s");
        int[] a=new int[arr.length];

        for(String ele:arr){
            System.out.println(ele);
        }
    }
    public int subarraySum(int[] arr, int k) {
        int count=0;
        for(int i=1;i<arr.length;i++){
            arr[i]+=arr[i-1];
        }
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:arr){
            if(ele==k) count++;
            int rem=ele-k;
            if(map.containsKey(rem)){
                int freq=map.get(rem);
                count+=rem;
            }
            map.put(map.getOrDefault(ele,0),1 );


        }
        return count;

    }
}
//            if(map.containsKey(ele)){
//                int freq=map.get(rem);
//                map.put(ele,freq+1);
//            }
//            else{
//                map.put(ele,1);
//            }
