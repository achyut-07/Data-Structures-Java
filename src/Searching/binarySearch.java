package Searching;
import java.util.*;
public class binarySearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={10,15,21,34,81,105,180,500};
        int n=arr.length;
        System.out.print("Enter Your Target: ");
        int target=sc.nextInt();
        int lo=0,hi=n-1;
        boolean flag=false;
        while(lo<=hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] == target) {
                System.out.println("Target found");
                flag = true;
                break;
            } else if (arr[mid] < target) {
                lo = mid + 1;
            } else if (arr[mid] > target) {
                hi = mid - 1;
            }
        }
        if(flag==false) System.out.println("Not Found");
    }
}
