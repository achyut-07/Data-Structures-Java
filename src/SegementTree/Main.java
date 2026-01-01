package SegementTree;


import java.util.*;

public class Main {
    static class pair{
        long val;
        int freq;
        pair(long val,int freq){
            this.val=val;
            this.freq=freq;
        }
    }
    static pair[] arr;
    public static void set(int idx,long val,int root,int left,int right){
        if(idx>right||idx<left) return;
        if(left==right){
            arr[root]=new pair(val,1);
            return;
        }
        int mid=left+(right-left)/2;
        set(idx,val,2*root,left,mid);
        set(idx,val,2*root+1,mid+1,right);
        long lv=arr[2*root].val;
        long rv=arr[2*root+1].val;
        if(lv==rv){
            int newf=arr[2*root].freq+arr[2*root+1].freq;
            arr[root]=new pair(lv,newf);
        }
        else{
            if(lv<rv){
                int newf=arr[2*root].freq;
                arr[root]=new pair(lv,newf);
            }
            else{
                int newf=arr[2*root+1].freq;
                arr[root]=new pair(rv,newf);
            }
        }
    }
    public static pair getMin(int l,int r,int root,int left,int right){
        if(l>right||r<left) return new pair(Long.MAX_VALUE,0);
        if(left>=l&&right<=r) return arr[root];
        int mid=left+(right-left)/2;
        pair la=getMin(l,r,root*2,left,mid);
        pair ra=getMin(l,r,root*2+1,mid+1,right);
        if(la.val<ra.val){
            return la;
        }
        else if(ra.val<la.val)  return ra;

        else return new pair(la.val,la.freq+ra.freq);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=sc.nextInt();
        arr=new pair[n*4];
        for(int i=0;i<arr.length;i++){
            arr[i]=new pair(Long.MAX_VALUE,0);
        }
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
                pair p=getMin(l,r-1,root,stl,str);
                System.out.println(p.val+" "+p.freq);
            }
        }

    }
}
