package sorting;

public class cycleSort {

    public static void main(String[] args) {
        int[] arr={4,1,2,0,3};
        int i=0;
        while(i<arr.length){
            if(i==arr[i]) i++;
            else{
                int t=arr[arr[i]];
                arr[arr[i]]=arr[i];
                arr[i]=t;
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
