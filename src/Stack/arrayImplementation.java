package Stack;
class Stack{
    private int[] arr=new int[5];
    private int top=-1;
    boolean isEmpty(){
        if(top==-1) return true;
        return false;
    }
    boolean isFull(){
        if(top==arr.length-1) return true;
        return false;
    }
    void push(int x){
         if(isFull()){
             System.out.println("Stack is full");
         }
         else{
             arr[++top]=x;
         }
    }
    int peek()throws Error{
        if(isEmpty()) {
            throw new Error("Stack is empty");
        }
        return arr[top];
    }
    int pop()throws Error{
        if(isEmpty()) {
            throw new Error("Stack is empty");
        }
        return arr[top--];
    }
    void display(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    int size(){
        return top+1;
    }
}

public class arrayImplementation {
    public static void main(String[] args) {
        Stack st=new Stack();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.display();
        System.out.println(st.size());
        st.push(7);
        st.display();
        System.out.println(st.peek());
        st.push(6);
        st.display();
//        int r= st.peek();

    }
}
