package Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
public class reversKQueueElements {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        for(int i=1;i<=5;i++){
            q.add(i);
        }
        int k=3;
        System.out.println(q);
        Stack<Integer> st=new Stack<>();

        for(int i=0;i<k;i++){
            st.push(q.remove());
        }
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        int m=q.size()-k;
        for(int i=0;i<m;i++){
            st.push(q.remove());
        }
        Stack<Integer> helper=new Stack<>();
        while(!st.isEmpty()){
            helper.push(st.pop());
        }
        while(!helper.isEmpty()){
            q.add(helper.pop());
        }
        System.out.println(q);
    }
}
