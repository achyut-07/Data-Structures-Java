package Queue;
import java.util.*;

public class basicCollectionFrameWork {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.poll();
        Queue<Integer> qu=new LinkedList<>();
        while(!q.isEmpty()){
            System.out.print(q.peek()+" ");
            qu.add(q.remove());
        }
        while(!qu.isEmpty()){
            q.add(qu.remove());
        }
        System.out.println();
        System.out.println(q);
    }
}
