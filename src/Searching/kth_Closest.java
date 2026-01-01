package Searching;
import java.util.*;
public class kth_Closest {
    public static List<Integer> find(int[] arr,int k,int x)
    {
        List<Integer> ans=new ArrayList<>();
        int n=arr.length;
        if(x<arr[0])
        {
            for(int i=0;i<k;i++)
            {
                ans.add(arr[i]);
            }
            return ans;
        }
        if(x>arr[n-1])
        {
            for(int i=n-1;i>=n-k;i--)
            {
                ans.add(arr[i]);
            }
            Collections.sort(ans);
            return ans;
        }
        int lb=n,lo=0,hi=n-1;
        while(lo<=hi)
        {
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>=x)
            {
                lb=mid;
                hi=mid-1;
            }
            else lo=mid+1;
        }
        int i=lb-1,j=lb;
        while(k>0 && i>=0 && j<n)
        {
            int di=Math.abs(x-arr[i]);
            int dj=Math.abs(x-arr[j]);
            if(di<=dj)
            {
                ans.add(arr[i]);
                i--;
            }
            else
            {
                ans.add(arr[j]);
                j++;
            }
            k--;
        }
        while(i<0&&k>0)
        {
            ans.add(arr[j]);
            j++;
            k--;
        }
        while(j==n&&k>0)
        {
            ans.add(arr[i]);
            i--;
            k--;
        }
        Collections.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=3;//3 elements
        int x=3;// closest to no 3 in array
        List<Integer> ans=find(arr,k,x);
        System.out.println(ans);
    }

}
