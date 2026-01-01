package advanceSorting;

public class quick_Sort {
    public static void print(int[] arr)
    {
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static int partition1(int[] arr,int lo,int hi)
    {
        int mid=(lo+hi)/2;
        int pivot=arr[mid],pivIdx=mid;
        int smallercount=0;
        for(int i=lo;i<=hi;i++)
        {
            if(arr[i]<pivot&&i!=mid) smallercount++;
        }
        int correctidx=lo+smallercount;
        swap(arr,pivIdx,correctidx);
        int i=lo,j=hi;
        while(i<correctidx&&j>correctidx)
        {
            if(arr[i]<=pivot) i++;
            else if(arr[j]>pivot) j--;
            else if (arr[i]>pivot&&arr[j]<=pivot) {
                swap(arr,i,j);
            }
        }
        return correctidx;
    }
    public static int partition(int[] arr,int lo,int hi)
    {
         int pivot=arr[lo];
         int pividx=lo;
         int smallercount=0;
         for(int i=lo+1;i<=hi;i++)
         {
             if(arr[i]<=pivot) smallercount++;
         }
         int correctIdx=pividx+smallercount;
         swap(arr,pividx,correctIdx);
         int i=lo,j=hi;
         while(i<correctIdx && j>correctIdx){
             if(arr[i]<=pivot) i++;
             else if(arr[j]>pivot) j--;
             else if(arr[i]>pivot && arr[j]<=pivot) swap(arr,i,j);
         }
        return correctIdx;

    }
    public static void quicksort(int[] arr,int lo,int hi)
    {
         if(lo<hi) {
             int p = partition1(arr, lo, hi);
             quicksort(arr, lo, p - 1);
             quicksort(arr, p + 1, hi);
         }

    }
    public static void main(String[] args) {
        int[] arr={4,9,7,1,2,3,6,5,8};
        print(arr);
        int n=arr.length;
        quicksort(arr,0,n-1);
        print(arr);
    }
}
