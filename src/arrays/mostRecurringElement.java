package arrays;

public class mostRecurringElement {
    public static void main(String[] args) {
        int[] arr={10,10,20,20,20,20,30,30,30,50};
        int n=arr.length;
        int moc=0;
    int i=0,j=0,max=Integer.MIN_VALUE;
        while(j<n)
        {
            if(arr[j]==arr[i])
                j++;
            else
            {
                int cmax=(j-i)+1;
                if(max<cmax)
                {
                    max=cmax;
                    moc=arr[i];
                }
                i=j+1;
                j=i;
            }
        }
        System.out.println(moc);
    }
}
