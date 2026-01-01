package Queue;
import java.util.*;
public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq=new LinkedList<>();
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.addFirst(5);
        System.out.println(dq);
        dq.addLast(10);
        System.out.println(dq);
    }
}
