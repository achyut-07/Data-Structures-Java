package arrays;

public class dutchFlag {
    public static void main(String[] args) {
        int[] arr={0,1,2,0,1,2,1,2,0,0};
        int n=arr.length;
        int mid=0,low=0,high=n-1;
        while(mid<=high)
        {
            if(arr[mid]==0)
            {
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                mid++;
                low++;
            }
            else if(arr[mid]==1) mid++;
            else if(arr[mid]==2)
            {
                int temp=arr[high];
                arr[high]=arr[mid];
                arr[mid]=temp;
                high--;
            }
        }
        for(int ele:arr)
        {
            System.out.print(ele+" ");

        }
    }
}
