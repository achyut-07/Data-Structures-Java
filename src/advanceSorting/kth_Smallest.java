package advanceSorting;

public class kth_Smallest {
        static int ans;
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
        public static void quickselect(int[] arr,int lo,int hi,int k)
        {
            if(lo>hi) return ;
            if(lo==hi)
            {
                if(lo==k-1) ans=arr[lo];
                return;
            }
            int p = partition(arr, lo, hi );
            if(p==k-1) {
                ans= arr[p];
                return;
            }
            else if(k-1<p)quickselect(arr, lo, p - 1,k);
            else quickselect(arr, p + 1, hi,k);


        }
        public static void main(String[] args) {
            int[] arr={4,9,1,2,6,5,8};
            print(arr);
            int n=arr.length;
            int k=2;
            ans=0;
            quickselect(arr,0,n-1,n-k+1);//to find kth largest element we pass n-k+1;
            System.out.println(ans);              //to find kth smallest element we pass k;
            //print(arr);
        }
    }

