package arrays;
import java.util.HashSet;
import java.util.Scanner;
public class rotationArray {
    public static void rotate(int[] arr,int si,int ei)
    {
        while(si<ei)
        {
            int temp = arr[si];
            arr[si] = arr[ei];
            arr[ei] = temp;
            si++;
            ei--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        System.out.println("Enter NO oF Rotations: ");
        int k=sc.nextInt();
        if(k>=n) k=k%n;
        rotate(arr,0,n-1);
        rotate(arr,k,n-1);
        rotate(arr,0,k-1);
        for(int ele:arr)
        {
            System.out.print(ele+" ");
        }

    }
    public static void practice(){
        HashSet<Integer> set =new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

    }
}
