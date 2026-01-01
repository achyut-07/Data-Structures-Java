package Heaps;

import java.util.Collections;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class heapBasicSTL {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();// Min Heap
        PriorityQueue<Integer> pq1=new PriorityQueue<>(Collections.reverseOrder());//Max Heap
        pq.add(2);
        System.out.println(pq+" "+pq.peek());
        pq.add(10);
        System.out.println(pq+" "+pq.peek());
        pq.add(1);
        System.out.println(pq+" "+pq.peek());
        pq.remove();
        System.out.println(pq+" "+pq.peek());
        pq.add(0);
        System.out.println(pq+" "+pq.peek());
        pq.add(-34);
        System.out.println(pq+" "+pq.peek());

        Map<Integer,Integer> map=new TreeMap<>(Collections.reverseOrder());
    }

}
