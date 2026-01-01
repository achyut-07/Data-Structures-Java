package Assignments;
public class assignQ1 {
    public static void main(String[] args) {
        int[] arr={11,23,44,22,12};
        int n=arr.length;   
        for(int i=1;i<n;i++)
        {
            int j=i;
            while(j>0&&arr[j]<arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        int minsum=arr[0]+arr[1];
        System.out.println(minsum);
    }
}
