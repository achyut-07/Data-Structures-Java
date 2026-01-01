package Heaps;

class MinHeap{
    private int[] arr;
    private int size;
    public int getSize(){
        return size;
    }
    public int peek() throws Error{
        if(size==0) throw new Error("Heap is Empty");
        return arr[0];
    }
    public  void swap(int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public void display(){
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    MinHeap(int capacity){
        arr=new int[capacity];
        size=0;
    }
    public void add(int num)throws Error{
        if(size==arr.length) throw new Error("Heap Is Full");
        arr[size++]=num;
        upHeapify(size-1);
    }
    public int remove()throws Error{
        if(size==0) throw new Error("The heap is empty");
        int peek=arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }

    private void downHeapify(int i) {
        int lc=2*i+1, rc=2*i+2;
        int minDx=i;
        if(lc<size&&arr[lc]<arr[minDx]) minDx=lc;
        if(rc<size&&arr[rc]<arr[minDx]) minDx=rc;
        if(i==minDx) return;
        swap(i,minDx);
        downHeapify(minDx);

    }

    private void upHeapify(int idx) {
        if(idx==0) return;
        int parent=(idx-1)/2;
        if(arr[idx]<arr[parent]){
            swap(idx,parent);
            upHeapify(parent);
        }
    }


}
public class minHeapImplementation {
    public static void main(String[] args) {
        MinHeap pq=new MinHeap(10);
        pq.add(1);
        pq.add(2);
        pq.add(3);
        pq.add(4);
        pq.add(5);
        pq.add(6);
        pq.add(7);

        System.out.println(pq.peek());
        pq.display();
        pq.remove();
        pq.display();
//        System.out.println(pq.peek());

    }


}



