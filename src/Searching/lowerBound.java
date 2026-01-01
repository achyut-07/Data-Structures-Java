package Searching;

public class lowerBound {
    public static void main(String[] args){
        int[] arr={10,20,30,30,40,50,60,70};
        int n=arr.length;
        int x=30;
        int lo=0,hi=n-1,lb=n;
        while(lo<=hi)
        {
            int mid=(hi-lo)/2+lo;
            if(arr[mid]>x){
               lb=Math.min(lb,mid);
               hi=mid-1;
            }
            else lo=mid+1;
        }
        System.out.println(lb);
    }
}
