package Stack;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val=val;
    }

}
class stackll{
    Node top=null;
    int size=0;
    void push(int x){
        Node temp=new Node(x);
        temp.next=top;
        top=temp;
        size++;
    }
    void pop(){
        if(top==null) {
            System.out.println("Stack Empty");

        }
       else {
            top = top.next;
            size--;
        }
    }
    int peek(){
        if(top==null) {
            System.out.println("Stack Empty");
            return -1;
        }

            return top.val;

    }
    void displayreverse(){
        Node temp=top;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    void displayrec(Node head){
       if(head==null) return;
       displayrec(head.next);
       System.out.print(head.val+" ");
    }
    void display(){
        displayrec(top);
        System.out.println();
    }
    int size(){return size;}


}
public class linkedListImplementation{
    public static void main(String[] args) {
       stackll st=new stackll();
       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       st.push(5);
       st.display();
       System.out.println(st.peek());
       st.pop();
       st.display();
       st.push(7);
       st.display();
    }
}
