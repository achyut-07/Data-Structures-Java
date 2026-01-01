package advanceSorting;

public class merge_Sort {
    public static void print(int[] arr)
    {
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void merge(int[] a,int[] b,int[] arr)
    {
        int i=0,j=0,k=0;
        while(i<a.length&&j<b.length)
        {
            if(a[i]<=b[j]) arr[k++]=a[i++];
            else arr[k++]=b[j++];
        }
        while(i<a.length) arr[k++]=a[i++];
        while(j<b.length) arr[k++]=b[j++];
    }
    public static void mergesort(int[] arr)
    {

        int n=arr.length;
        if(n==1) return;
        int[] a=new int[n/2];
        int[] b=new int[n-(n/2)];
        for(int i=0;i<n/2;i++)
        {
            a[i]=arr[i];
        }
        for(int i=0;i<n-n/2;i++)
        {
            b[i]=arr[i+n/2];
        }
        mergesort(a);
        mergesort(b);
        merge(a,b,arr);

    }
    public static void main(String[] args) {
       int[] arr={80,30,50,20,60,10,70,40};
       print(arr);
       mergesort(arr);
       print(arr);
    }
}
