package sorting;

public class selectionSort {
    public static void print(int[] arr) {
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int[] arr={-6,8,1,20,-4,10};
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int minidx = i;
            for(int j=i+1;j<n;j++)
            {
                if (arr[j] < arr[minidx]) {
                    minidx = j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minidx];
            arr[minidx]=temp;
        }
       print(arr);
        System.out.println();
        //Increasing Order
        for(int i=0;i<n;i++)
        {
            int max=arr[i];
            int maxidx=i;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                    maxidx=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[maxidx];
            arr[maxidx]=temp;
        }
        print(arr);
    }
}
