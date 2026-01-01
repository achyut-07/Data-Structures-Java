package arrays;

import java.util.*;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] arr=new int[n];

            int i;
            for(i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int maxdist=Integer.MIN_VALUE;
            if(arr.length==1){
                int dist=Math.abs(arr[0]-x);
                int dist2=Math.abs(arr[0]-0);
                maxdist=Math.max(maxdist,Math.max(dist+dist,dist2));
            }
            else{
                for( i=0;i<arr.length;i++){
                    if(i==0){
                        int dist=Math.abs(arr[i]-0);
                        maxdist=Math.max(maxdist,dist+dist);
                    }
                    if(i==n-1){
                        int dist=Math.abs(arr[i]-x);
                        maxdist=Math.max(maxdist,dist+dist);
                    }
                    else{
                        int dist=Math.abs(arr[i]-arr[i+1]);
                        maxdist=Math.max(maxdist,dist);
                    }
                }
            }

            System.out.println(maxdist);

        }

        
    }
}
