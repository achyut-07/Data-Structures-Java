package HashMaps;

import java.util.*;

public class TreeSetImplementation {

    public static void main(String[] args) {
        TreeSet<Integer> set=new TreeSet();
        set.add(100);
        set.add(-8);
        set.add(20);
        set.add(200);
        System.out.println(set);
        for(int ele:set){
            System.out.print(ele+" ");
        }

    }
    public class Triplet implements Comparable<Triplet>{
        int val;
        int row;
        int col;
        Triplet(int val,int row,int col){
            this.val=val;
            this.row=row;
            this.col=col;
        }

        @Override
        public int compareTo(Triplet t) {
            return this.val-t.val;
        }
    }

    public int[] smallestRange(List<List<Integer>> nums) {
        int [] ans={0,Integer.MAX_VALUE};
        PriorityQueue<Triplet> pq=new PriorityQueue<>();
        int k=nums.size();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<k;i++){
            int ele=nums.get(i).get(0);
            pq.add(new Triplet(ele,i,0));
            max=Math.max(ele,max);
        }
        while(true){
            Triplet top=pq.remove();
            int ele=top.val;
            int row=top.row;
            int col=top.col;
            if(max-ele<ans[1]-ans[0]){
                ans[0]=ele;
                ans[1]=max;
            }
            if(col==nums.get(row).size()-1) break;
            int next=nums.get(row).get(col+1);
            pq.add(new Triplet(next,row,col+1));


        }


        return ans;
    }

    public int romanToInt(String s) {
        int sum=0;
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);


        for(int i=0;i<s.length();i++){
            int val=map.get(s.charAt(i));
            int val1=map.get(s.charAt(i+1));
            if(val>val1){
                sum+=val;
            }else{
                sum+=(val1-val);
                i++;
            }
        }

        return sum;
    }


}
