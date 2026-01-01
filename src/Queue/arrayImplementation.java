package Queue;
class queue{
    int front=-1;
    int rear=-1;
    int[] arr=new int[100];
    int size=0;
    public boolean isFull(){
        if(rear==arr.length-1) return true;
        return false;
    }
    public boolean isEmpty(){
        if(front==-1) return true;
        return false;
    }
    public void add(int val){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(front==-1)front =0;
        arr[++rear]=val;
        size++;
    }
    public int remove(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front++];
    }
    public int peek(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    public void display(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class arrayImplementation {
    public static void main(String[] args) {
        queue q=new queue();
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
