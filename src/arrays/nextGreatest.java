package arrays;
import java.util.Arrays;
public class nextGreatest {
    public static void main(String[] args) {
        int[] a ={12, 8, 41, 37, 2, 49, 16, 28, 21};
        int n=a.length;
        int[] ans=new int[n];
        int nge=a[n-1];
        ans[n-1]=-1;
        for(int i=n-2;i>=0;i--)
        {
            ans[i]=nge;
            nge=Math.max(nge,a[i]);
        }
        for(int ele:ans)
        {
            System.out.print(ele+" ");
        }


    }
}
