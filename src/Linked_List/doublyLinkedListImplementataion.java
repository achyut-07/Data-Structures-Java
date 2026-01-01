package Linked_List;
class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val=val;
    }
}
class DLL{
     dNode head;
     dNode tail;
     int size=0;
     void display(){
        dNode temp=head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
         System.out.println();
    }
     void insertAtEnd(int val){
         dNode temp=new dNode(val);
         if(head==null){
             tail=head=temp;
         }
         else{
             tail.next=temp;
             temp.prev=tail;
             tail=temp;
         }
         size++;
     }
     void insertAtStart(int val){
         dNode temp=new dNode(val);
         if(head==null){
             tail=head=temp;
         }
         else {
             head.prev = temp;
             temp.next = head;
             head = temp;
         }
         size++;
     }
     void insertAtIdx(int val,int idx){
         if(idx==0) insertAtStart(val);
         if(idx==size) insertAtEnd(val);
         if(idx>size||idx<0) System.out.println("Invalid location");
         else {
             dNode temp = new dNode(val);
             dNode x = head;
             for (int i = 0; i<idx-1; i++) {
                 x = x.next;
             }
             dNode y = x.next;
             y.prev = temp;
             x.next = temp;
             temp.next=y;
             temp.prev=x;
             size++;
         }

     }
     void deleteAtHead() throws Error{
        if(head==null){
            throw new Error("Linked List is empty");
        }
        head=head.next;
        head.prev=null;
        size--;
    }
     void deleteAtTail(){
         if(head==null) System.out.println("Empty");
         else{
             tail=tail.prev;
             tail.next=null;
             size--;
         }
     }
     void deleteAtIdx(int idx) throws Error  {
        if(head==null) throw new Error("Linked List is empty");
        if(idx<0||idx>=size) throw new Error("Invalid Index");
        if(idx==0){
            deleteAtHead();
        }
        if(idx==size-1){
            deleteAtTail();
        }
        else {
            dNode temp = head;
            for (int i = 1; i < idx; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            temp=temp.next;
            temp.prev=temp.prev.prev;
            size--;
        }
    }
}
public class doublyLinkedListImplementataion {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.insertAtStart(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.insertAtEnd(50);
        list.display();
        list.insertAtIdx(7,2);
        list.display();
        list.deleteAtTail();
        list.display();
    }
}
