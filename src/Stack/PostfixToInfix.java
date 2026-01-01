package Stack;
import java.util.Stack;
public class PostfixToInfix {
    public static void main(String[] args) {
        String str="953+4*6/-";
        Stack<String> val=new Stack<>();
        int n=str.length();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            int ascii=(int) ch;
            if(ascii>=48&&ascii<=57){
                String s=""+ch;
                val.push(s);
            }
            else{
                String v2=val.pop();
                String v1=val.pop();
                String s='('+v1+ch+v2+')';
                val.push(s);
            }
        }
        System.out.println(val.peek());
    }
}
