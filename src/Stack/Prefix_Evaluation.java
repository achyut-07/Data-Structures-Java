package Stack;
import java.util.Stack;
public class Prefix_Evaluation {
    public static void main(String[] args) {
        String pre="-9/*+5346";
        Stack<Integer> val=new Stack<>();
        int n=pre.length();
        for(int i=n-1;i>=0;i--){
            char ch=pre.charAt(i);
            int ascii=(int) ch;
            if(ascii>=48&&ascii<=57) val.push(ascii-48);
            else if(ch=='+'){
                int v1=val.pop();
                int v2=val.pop();
                val.push(v1+v2);
            }
            else if(ch=='-'){
                int v1=val.pop();
                int v2=val.pop();
                val.push(v1-v2);
            }
            else if(ch=='*'){
                int v1=val.pop();
                int v2=val.pop();
                val.push(v1*v2);
            }
            else if(ch=='/'){
                int v1=val.pop();
                int v2=val.pop();
                val.push(v1/v2);
            }
        }
        System.out.println(val.peek());
    }
}
