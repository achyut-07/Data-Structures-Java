package Stack;
import java.util.Stack;
public class reverseStack {
    public static void pushAtbottom(Stack<Integer> st,int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top=st.pop();
        pushAtbottom(st,ele);
        st.push(top);
    }
    public static void reverse(Stack<Integer> st){
        if(st.size()==1) return;
        int top=st.pop();
        reverse(st);
        pushAtbottom(st,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        //pushAtbottom(st,6);
//        Stack<Integer> rt=new Stack<>();
//        while(st.size()>0){
//            rt.push(st.pop());
//        }
//        Stack<Integer> gt=new Stack<>();
//        while(rt.size()>0){
//            gt.push(rt.pop());
//        }
//        while(gt.size()>0){
//            st.push(gt.pop());
//        }
        reverse(st);
        System.out.println(st);
    }
}
