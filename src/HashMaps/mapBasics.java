package HashMaps;

import java.util.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class Pair{
    Node node;
    int level;
    Pair(Node node,int level){
        this.node=node;
        this.level=level;
    }
}
public class mapBasics {
    public static void main(String[] args) {
//        HashMap<String,Integer> map=new HashMap<>();
//        map.put("Achyut",53);
//        map.put("Raghav",76);
//        map.put("Mahi",07);
//        map.put("deepika",18);
//        System.out.println(map);
//        System.out.println(map.containsKey("Sunny"));
//        System.out.println(map.containsValue(539));
//        map.remove("Achyut");
//        System.out.println(map+" "+map.size());
    }
    public static void topView(Node root) {
        HashMap<Integer,Integer> map=new HashMap<>();
        Queue<Pair> q=new LinkedList<>();
        Pair r=new Pair(root,0);
        q.add(r);
        int minlvl=Integer.MAX_VALUE;
        int maxlvl=Integer.MIN_VALUE;
        while(!q.isEmpty()){
            Pair temp=q.remove();
            Node node=temp.node;
            int level=temp.level;
            minlvl=Math.min(minlvl,level);
            maxlvl=Math.max(maxlvl,level);
            if(!map.containsKey(level)){
                map.put(level,node.data);
                System.out.println(node.data);
                if(node.left!=null) q.add(new Pair(node.left,level-1));
                if(node.right!=null) q.add(new Pair(node.right,level+1));
            }
            else{
                if(node.left!=null) q.add(new Pair(node.left,level-1));
                if(node.right!=null) q.add(new Pair(node.right,level+1));
            }
        }
        for(int i=minlvl;i<=maxlvl;i++){
            System.out.println(map.get(i)+" ");
        }
    }
}
