package Heaps;
import java.util.*;
public class minimumCostToConnectRopes {
    public static void main(String[] args) {
        int[] arr={2,7,4,1,8};
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele:arr){
            pq.add(ele);
        }
        int totalCost=0;
        while(pq.size()>1){
            int cost=pq.remove()+pq.remove();
            totalCost+=cost;
            pq.add(cost);
        }
        System.out.println(totalCost);
    }
}
