package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class kthSmallestElement {
    public static void main(String[] args) {
        int[] arr={10,2,8,3,-6,-2,9,-12};
        int k=2;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
       for(int i=0;i<arr.length;i++){
           pq.add(arr[i]);
           if(pq.size()>k) pq.remove();
       }
        System.out.println(pq.peek());
    }
}
