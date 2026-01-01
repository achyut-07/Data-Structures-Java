package Trees;
import java.util.*;
public class travarsealIterative {
    public static  void postorder(Node root){
        Stack<Node> st=new Stack<>();
        ArrayList<Integer> arr=new ArrayList<>();
        st.push(root);
        while(st.size()>0){
            Node temp=st.pop();
            arr.add(temp.val);
            if(temp.left!=null) st.push(temp.left);
            if(temp.right!=null) st.push(temp.right);
        }
        Collections.reverse(arr);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }

    public static void inorder(Node root){
        Stack<Node> st=new Stack<>();
        Node temp=root;
        while(true){
            if(temp!=null){
                st.push(temp);
                temp=temp.left;
            }
            else{
                if(st.isEmpty()) break;
                Node top=st.pop();
                System.out.print(top.val+" ");
                temp=top.right;
            }
        }
    }
    public static void preorder(Node root){
        Stack<Node> st=new Stack<>();
        st.push(root);
        while(st.size()>0){
            Node temp=st.pop();
            System.out.print(temp.val+" ");
            if(temp.right!=null) st.push(temp.right);
            if(temp.left!=null) st.push(temp.left);
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        Node f=new Node(6);
        Node g=new Node(7);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        //preorder(a);
       // postorder(a);
        inorder(a);
    }
}
