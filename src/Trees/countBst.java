package Trees;

public class countBst {
    static int count=0;
    public static void preorder(Node root){
        if(root==null) return;
        boolean ans=countLeft(root,2) && countRight(root,8);
        if(ans==true) count++;
        preorder(root.left);
        preorder(root.right);
    }
    public static boolean countLeft(Node root,int lo){
        while(root.left!=null){
            root=root.left;
        }
        if(root.val>=lo) return true;
        return false;
    }
    public static boolean countRight(Node root,int hi){
        while(root.right!=null){
            root=root.right;
        }
        if(root.val<=hi) return true;
        return false;
    }

    public static void main(String[] args) {
        Node a=new Node(5);
        Node b=new Node(2);
        Node c=new Node(8);
        Node d=new Node(1);
        Node e=new Node(4);
        Node f=new Node(6);
        Node g=new Node(9);
        Node h=new Node(3);
        Node i=new Node(7);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        e.left=h;
        f.right=i;
        count=0;
        preorder(a);
        System.out.println(count);

    }
}
