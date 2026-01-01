package arrays;

import java.util.*;

public class basicsOfArrayList {
    public static void main(String[] args) {
      ArrayList<Integer> list=new ArrayList<>();
      list.add(60);
      list.add(50);
      list.add(40);
      list.add(30);
      list.add(70);
      int m=list.size();
      int n=m/2;
      list.remove(n);
//      int[] arr=new int[m];
//      for(int i=0;i<m;i++)
//      {
//          arr[i]= list.get(i);
//      }
//      for(int ele: arr)
//      {
//        System.out.print(ele+" ");
//      }
      System.out.println(list);

    }
}
