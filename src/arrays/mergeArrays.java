package arrays;

public class mergeArrays {
    public static void main(String[] args) {
        int[] a={11,33,42,71};
        int[] b={26,54,69,81,};
        int p=a.length+b.length;
        int[] c=new int[p];
        int m=a.length,n=b.length;
         int i=m-1,j=n-1,k=p-1;
         while(i>=0&&j>=0)
         {
             if(a[i]>=b[j])
             {
                 c[k]=a[i];
                 i--;
                 k--;
             }
             else if(a[i]<b[j])
             {
                 c[k]=b[j];
                 j--;
                 k--;

             }
         }
           if(i<0) {
               while (j >= 0) {
                   c[k] = b[j];
                   j--;
                   k--;
               }
           }

            else {
               while (i >= 0) {
                   c[k] = a[i];
                   i--;
                   k--;
               }
           }

         for(int ele:c)
         {
             System.out.print(ele+" ");
         }
    }
}
