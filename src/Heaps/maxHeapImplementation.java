package Heaps;

import java.util.ArrayList;

class MaxHeap{
    private int[] arr;
    private int size;
    public void swap(int i,int j){
        int t=arr[i];
        arr[i]=arr[j];
        arr[j]=t;
    }
    MaxHeap(int capacity){
        arr=new int[capacity];
        size=0;
    }
    public void add(int num)throws Error{
        if(size==arr.length) throw new Error("Heap Is Full");
        arr[size++]=num;
        upHeapify(size-1);
    }
    public void upHeapify(int idx){
        if(idx==0) return;
        int parent=(idx-1)/2;
        if(arr[idx]>arr[parent]){
            swap(idx,parent);
            upHeapify(parent);
        }
    }
    public int remove()throws Error{
        if(size==0) throw new Error("The heap is empty");
        int peek=arr[0];
        swap(0,size-1);
        size--;
        downHeapify(0);
        return peek;
    }
    public void downHeapify(int i){
        int lc=2*i+1,rc=2*i+2;
        int maxidx=i;
        if(lc<size&&arr[lc]>arr[maxidx]) maxidx=lc;
        if(rc<size&&arr[rc]>arr[maxidx]) maxidx=rc;
        if(maxidx==i) return;
        swap(i,maxidx);
        downHeapify(maxidx);
    }
    public void display(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
    }


}
public class maxHeapImplementation {
    public static void main(String[] args) {
        MaxHeap pq=new MaxHeap(10);
        pq.add(10);
        pq.add(3);
        pq.add(14);
        pq.display();

    }
}
