package sorting;
import java.util.*;
public class bubbleSort {
    public static void print(int [] arr)
    {
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={-2,0,1,4,10};
        int n=arr.length;
        //Bubble Sort 1
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //Bubble Sort 2
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        //bubble Sort-3
        for(int i=0;i<n-1;i++)
        {
            boolean flag=true;
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag==true) break;
        }
//            print(arr);
        //increasing Order
        for(int i=0;i<n-1;i++)
        {
            boolean flag=true;
            for(int j=0;j<n-1-i;j++)
            {
                if(arr[j]<arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=false;
                }
            }
            if(flag==true) break;
        }
        print(arr);
    }
}
