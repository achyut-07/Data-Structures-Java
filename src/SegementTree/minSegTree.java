package SegementTree;


import java.util.*;

public class minSegTree {
    static long[] arr;
    public static void set(int idx,long val,int root,int left,int right){
        if(idx>right||idx<left) return;
        if(left==right){
            arr[root]=val;
            return;
        }
        int mid=left+(right-left)/2;
        set(idx,val,2*root,left,mid);
        set(idx,val,2*root+1,mid+1,right);
        arr[root]=Math.min(arr[2*root],arr[2*root+1]);
    }
    public static long getMin(int l,int r,int root,int left,int right){
        if(l>right||r<left) return Long.MAX_VALUE;
        if(left>=l&&right<=r) return arr[root];
        int mid=left+(right-left)/2;
        long la=getMin(l,r,root*2,left,mid);
        long ra=getMin(l,r,root*2+1,mid+1,right);
        return Math.min(la,ra);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        arr=new long[n*4];
        Arrays.fill(arr, Long.MAX_VALUE);
        int root=1,stl=0,str=n-1;
        for(int i=0;i<n;i++){
            long val=sc.nextLong();
            set(i,val,root,stl,str);
        }
        while(q-->0){
            int op=sc.nextInt();
            if(op==1){
                int idx=sc.nextInt();
                long val=sc.nextLong();
                set(idx,val,root,stl,str);
            }
            else{
                int l=sc.nextInt();
                int r=sc.nextInt();
                System.out.println(getMin(l,r-1,root,stl,str));
            }
        }

    }
}


