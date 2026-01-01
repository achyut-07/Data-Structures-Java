package SlidingWindow;

import java.util.HashMap;

public class maximumSumSubArray {
    public static void main(String[] args) {
        int[] arr={10,20,1,3,-40,80,10};
        int k=3;
        int maxsum=0;
        int sum=0;
//        for(int i=0;i<=arr.length-k;i++){
//            int sum=0;
//            for(int j=i;j<i+k;j++){
//                sum+=arr[j];
//            }
//            maxsum=Math.max(sum,maxsum);
//        }
        int i=0,j=k-1;
        for(i=0;i<k;i++){
            sum+=arr[i];
        }
        i=1;j++;
        while(j< arr.length){
            sum=sum-arr[i-1]+arr[j];
            maxsum=Math.max(sum,maxsum);
            i++;j++;
        }
        System.out.println(maxsum);
    }
    public int minSubArrayLen(int target, int[] arr) {
        int n=arr.length;
        int minLen=Integer.MAX_VALUE;
        int i=0,j=0;
        int sum=0;
        while(j<n&&sum<target){
            sum+=arr[j++];
        }
        if(j==n&&sum<target) return 0;
        j--;
        while(i<n&&j<n){
            int len=j-i+1;
            if(sum>=target) minLen=Math.min(len,minLen);
            sum=sum-arr[i];
            i++;j++;
            while(j<n && sum<target){
                sum+=arr[j++];
            }
            j--;
        }
        return minLen;

    }
    public int longestSubarray(int[] arr) {
        int n=arr.length;
        int maxlen=0;
        int zero=0;
        int i=0,j=0;
        while(i<n&&arr[i]!=1){
            i++;
        }
        j=i;
        while(j<n){
            if(arr[j]==1) j++;
            else{
                if(zero==0){
                    j++;
                    zero++;
                }
                else{
                    int len=j-i-1;
                    maxlen=Math.max(len,maxlen);
                    j++;
                    while(i<n&&arr[i]==1){
                        i++;
                    }
                    i++;
                }
            }
        }
        if(zero==1){
            int len=j-i-1;
            maxlen=Math.max(maxlen,len);
        }
        if(zero==0) return n-1;
        return maxlen;
    }
    public int maxSatisfied(int[] arr, int[] grumpy, int k) {
        int n=arr.length;
        int i=0,j=k-1;
        int a=i,b=j;
        int maxUnsatisfied=Integer.MIN_VALUE;
        int unSatisfied=0;
        for(int x=0;x<j;x++){
            if(grumpy[x]==1) unSatisfied+=arr[x];
        }
        while(j<n){
            if(maxUnsatisfied<unSatisfied){
                maxUnsatisfied=unSatisfied;
                a=i;b=j;
            }
            if(grumpy[i]==1){
                unSatisfied-=arr[i];
            }
            i++;
            j++;
            if(grumpy[j]==1){
                unSatisfied+=arr[i];
            }
        }
        int sum=0;
        for(int x=0;x<a;x++){
            if(grumpy[x]==0) sum+=arr[0];
        }
        while(a<=b){
            sum+=arr[a++];
        }
        return sum;
    }


    public int totalFruit(int[] arr) {
        int n=arr.length,i=0,j=0;
        int maxlen=0;
        HashMap<Integer,Integer> map= new HashMap<>();
        while(j<n){
            if(map.containsKey(arr[j])){
                int freq=map.get(arr[j]);
                map.put(arr[j],freq+1);
            }
            else map.put(arr[j],0);
            while(map.size()>2){
                int freq=map.get(arr[i]);
                if(freq==1) map.remove(arr[i]);
                else map.put(arr[i],freq-1);
                i++;
            }
            maxlen=Math.max(maxlen,j-i);
            j++;
        }

        return maxlen;
    }
    public int numberOfSubarrays(int[] arr, int k) {
        int n=arr.length;
        int count=0;

        for(int i=0;i<n;i++) arr[i]=arr[i]%2;

        for(int i=1;i<n;i++) arr[i]+=arr[i-1];

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            int ele=arr[i];
            if(!map.containsKey(ele)){
                map.put(ele,i);
            }
            int a=0;
            if(map.containsKey(ele-k)) a=map.get(ele-k);
            int b=0;
            if(map.containsKey(ele-k+1)) a=map.get(ele-k+1);
            if(ele==k){
                count+=b-a+1;
            } else if (ele>k) {
                count+=b-a;
            }
        }

        return count;

    }
}
