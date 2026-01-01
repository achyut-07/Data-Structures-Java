package Trees;

import java.sql.SQLOutput;

public class nthLevel {
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(7);
        Node c=new Node(9);
        Node d=new Node(2);
        Node e=new Node(6);
        Node f=new Node(9);
        Node g=new Node(5);
        Node h=new Node(11);
        Node i=new Node(5);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.right=f;
        e.left=g;e.right=h;
        f.left=i;
        level(a,0);



    }
    private static void level(Node root,int n){
        if(root==null) return;
        if(n==2){
            System.out.print(root.val+" ");
        }
        level(root.left,n+1);
        level(root.right,n+1);
    }

    
}
