package sorting;

public class insertionSort {
    public static void print(int[] arr){
        for(int ele: arr)
        {
            System.out.print(ele+" ");
        }
    }
    public static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr={10,-4,20,7,-6,8};
        int n=arr.length;
//        for(int i=1;i<=n-1;i++)
//        {
//            int key=arr[i];
//            int j=i-1;
//            while(j>=0&& arr[j]>key)
//            {
//                arr[j+1]=arr[j];
//                j--;
//            }
//            arr[j+1]=key;
//        }
      /*  for(int i=1;i<n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else break;
            }
        }
        print(arr);

       */
        //insertion 2
        for(int i=1;i<n;i++)
        {
            int j=i;
            while(j>0 && arr[j]<arr[j-1])
            {
                swap(arr,j,j-1);
                j--;
            }
        }
        print(arr);
    }
}
