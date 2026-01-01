package Queue;
import java.util.*;
public class reverseQueue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=5;i++){
            q.add(i);
        }
        System.out.println(q);
        Stack<Integer> st=new Stack<>();
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
