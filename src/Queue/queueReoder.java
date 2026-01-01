package Queue;
import java.util.*;
public class queueReoder {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> st=new Stack<>();
        for (int i =1;i<=8;i++) {
             q.add(i);
        }
        System.out.println(q);
        int n=q.size();
        for(int i=0;i<n/2;i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        for(int i=0;i<n/2;i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
            q.add(q.remove());
        }
        while(!q.isEmpty()){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
