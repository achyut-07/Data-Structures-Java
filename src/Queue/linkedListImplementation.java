package Queue;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }
}
class queue1{
    Node head;
    Node tail;
    int size=0;
    public void add(int val){
        Node temp=new Node(val);
        if(head==null){
            head=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
            tail=tail.next;
        }
        size++;
    }
    public int remove(){
        Node temp=head;
        head=head.next;
        return temp.val;
    }
    public int peek(){
        return head.val;
    }
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
}
public class linkedListImplementation {
    public static void main(String[] args) {
        queue1 q=new queue1();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
    }
}
