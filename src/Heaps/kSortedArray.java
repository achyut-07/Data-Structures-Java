package Heaps;

import java.util.*;

public class kSortedArray {
    public static void main(String[] args) {
        int[] arr={6,5,3,2,8,10,9};
        int k=3;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
            if(pq.size()>k){
                ans.add(pq.remove());
            }
        }
        while(!pq.isEmpty()){
            ans.add(pq.remove());
        }
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }
    public class pair implements Comparable<pair>{
        int key;
        int freq;
        pair(int key,int freq){
            this.key=key;
            this.freq=freq;
        }
        public int compareTo(pair t){
            if(this.freq==t.freq) return this.key-t.key;
            return this.freq-t.freq;
        }
    }
    public int lastStoneWeight(int[] arr) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int ele:arr){
            pq.add(ele);
        }
        while(pq.size()>1){
            int y=pq.remove();
            int x=pq.remove();
            if(x<y){
                pq.add(y-x);
            }
        }
        int sum=0;
        String s=Integer.toString(sum);
        return pq.peek();
    }

}

