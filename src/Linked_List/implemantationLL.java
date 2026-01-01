package Linked_List;
import java.util.*;
class SLL{
    Scanner sc=new Scanner(System.in);
    Node head;
    Node tail;
    int size;
    void insertAtEnd(int val){
       Node temp=new Node(val);
       if(head==null){
           head=tail=temp;
       }
       else{
           tail.next=temp;
           tail=temp;
       }
       size++;
   }
    void insertAtBegin(int val){
       Node temp=new Node(val);
       if(head==null) head=tail=temp;
       else{
           temp.next=head;
           head=temp;
           
       }
        size++;
    }
    void insertAtIdx(int pos, int val){
       if(pos==0){
           insertAtBegin(val);
           return;
       }
       if(pos==size){
          insertAtEnd(val);
          return;
       }
       if(pos>size||pos<0){
           System.out.println("Invalid position");
           return;
       }

           Node temp=new Node(val);
           Node temp1=head;
           for(int i=0;i<pos-1;i++){
               temp1=temp1.next;
           }
           temp.next=temp1.next;
           temp1.next=temp;
           size++;

    }
    int get(int idx) throws Error{
       if(idx==size-1) return tail.val;
       if(idx>=size||idx<0) {
           System.out.println("Invalid position");
           return -1;
       }
       Node temp=head;
       for(int i=0;i<idx;i++){
           temp=temp.next;
       }
       return temp.val;
    }
    void set(int idx,int val) throws Error{
       if(idx==size-1){
           tail.val=val;

       }
       if(idx>=size||idx<0){
           throw new Error("Galt Index hai bhai");
       }
       Node temp=head;
       for(int i=0;i<idx;i++){
           temp=temp.next;
       }
       temp.val=val;
    }
    void deleteAtHead() throws Error{
        if(head==null){
            throw new Error("Linked List is empty");
        }
        head=head.next;
        size--;
     }
    void deleteAtTail(){
         if(head==null) throw new Error("Linked List is empty");
//         else{
//
//         }
     }
    void deleteAtIdx(int idx) throws Error  {
        if(head==null) throw new Error("Linked List is empty");
        if(idx<0||idx>=size) throw new Error("Invalid Index");
        Node temp=head;
        for(int i=0;i<idx-1;i++){
            temp=temp.next;
        }
        if(temp.next==tail) tail=temp;
        temp.next=temp.next.next;
        size--;
    }
    void display(){
       Node temp=head;
       while(temp!=null){
           System.out.print(temp.val+" ");
           temp=temp.next;
       }
       System.out.println();
   }

}
public class implemantationLL {
    public static void main(String[] args) {
       SLL list=new SLL();
       list.insertAtEnd(30);
       list.insertAtEnd(40);
       list.insertAtEnd(50);
       list.insertAtBegin(20);
       list.insertAtBegin(10);
      // list.display();
      // list.insertAtIdx(1,100);
       list.display();
//        System.out.println(list.get(3));
//        list.set(2,7);
        //list.deleteAtHead();

        list.deleteAtIdx(2);
        list.display();
    }
}
