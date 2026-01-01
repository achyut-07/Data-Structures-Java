package Stack;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class basicsOfStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(12);
        st.push(32);
        st.push(92);
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        Map<Integer,Integer> map=new TreeMap<>();

    }
}
