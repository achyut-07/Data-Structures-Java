package Trees;

public class BstBasics {
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(5);
        Node c=new Node(15);
        Node d=new Node(2);
        Node e=new Node(8);
        Node f=new Node(12);
        Node g=new Node(19);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=f;c.right=g;
        int max=findmax(a);
        int min=findmin(a);
        System.out.println(max);
        System.out.println(min);
    }

    private static int findmin(Node root) {
        if(root.left==null) return root.val;
        return findmin(root.left);
    }

    private static int findmax(Node root) {
        if(root.right==null) return root.val;
        return findmax(root.right);
    }
}
