package Trees;
class Node{
    int val;
    Node right;
    Node left;
    Node(int val){
        this.val=val;
    }
}
public class NodeOfTree {
    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(41);
        Node c = new Node(3);
        Node d = new Node(2);
        Node e = new Node(6);
        Node f = new Node(5);
        Node g = new Node(10);
        Node h = new Node(20);
        a.left=b;a.right=c;
        b.left=d;b.right=e;
        c.left=g;c.right=f;
        e.right=h;
        display(a);
        System.out.println();
//        int sum=0;
//        int s=add(a);
//        System.out.println(s);
//        System.out.println(product(a));
        System.out.println(max(a));
        System.out.println(min(a));
        System.out.println(size(a));
        System.out.println(levels(a));
    }
    private static void display(Node root){
        if(root== null) return;
        System.out.print(root.val+" ");
        display(root.left);
        display(root.right);
    }
    private static int add(Node root){
        if(root== null) return 0;
        int sum=root.val+add(root.left)+add(root.right);
        return sum;
    }
    private static int product(Node root){
        if(root== null) return 1;
        if(root.val==0)  return product(root.left) * product(root.right);
        return root.val*product(root.left)*product(root.right);

    }
    private static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
         int max=Math.max(root.val,Math.max(max(root.left),max(root.right)));
         return max;
    }
    private static int min(Node root){
        if(root==null) return Integer.MAX_VALUE;
        int min=Math.min(root.val,Math.min(min(root.left),min(root.right)));
        return min;
    }
    private static int size(Node root){
        if(root==null) return 0;
       return 1+size(root.left)+size(root.right);
    }
    private static int levels(Node root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }

}
