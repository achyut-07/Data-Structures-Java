package Stack;

import java.util.Stack;
public class displayRecursively {
    public static void displayrec(Stack<Integer> st,int ele){
        if(st.size()<1){
            st.push(ele);
            return;
        }
        int top=st.pop();
        //System.out.print(top+" ");
        displayrec(st,ele);
        //System.out.print(top+" ");
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==0) return;
        int top=st.pop();
        reverse(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        //displayrec(st,6);
        System.out.println();
        reverse(st);
        System.out.println(st);
    }
}
