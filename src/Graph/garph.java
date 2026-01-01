package Graph;

import java.util.*;

public class garph {
    public static void main(String[] args) {

    }
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int n=adj.size();
        boolean[] vis=new boolean[n];
        vis[0]=true;
        bfs(0,adj,vis);
        for(int i=0;i<n;i++){
            if(!vis[i]) return false;
        }
        return true;
    }

    private void bfs(int start, List<List<Integer>> adj, boolean[] vis) {
        Queue<Integer> q=new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int front=q.remove();
            for(int i=0;i<adj.get(front).size();i++){
                int ele=adj.get(front).get(i);
                if(!vis[ele]){
                    q.add(ele);
                    vis[i]=true;
                }
            }
        }
    }


//    private void bfs(int i,boolean[] vis,int[][] adj) {
//        vis[i]=true;
//        Queue<Integer> q=new LinkedList<>();
//        q.add(i);
//        while(!q.isEmpty()){
//            int front=q.remove();
//            for(int j=0;j<adj.length;j++){
//                if(adj[front][j]==1&&vis[j]==false){
//                    q.add(j);
//                    vis[j]=true;
//                }
//            }
//        }
//    }

}
