package Graph;

import java.util.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class pair{
    int row;
    int col;
    pair(int row,int col){
        this.row=row;
        this.col=col;
    }
}
public class Main {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            List<Integer> l=new ArrayList<>();
            adj.add(l);
        }
        for(int i=0;i< edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean[] vis=new boolean[n];
        vis[source]=true;
        //bfs(source,adj,vis);
        return vis[destination];

    }
//    private void bfs(int start, List<List<Integer>> adj, boolean[] vis) {
//        Queue<Integer> q=new LinkedList<>();
//        q.add(start);
//        while(!q.isEmpty()){
//            int front=q.remove();
//            for(int i=0;i<adj.get(front).size();i++){
//                int ele=adj.get(front).get(i);
//                if(!vis[ele]){
//                    q.add(ele);
//                    vis[ele]=true;
//                }
//            }
//        }
//    }

    public int numIslands(char[][] grid) {
        int n= grid.length;
        int m=grid[0].length;
        boolean[][] vis=new boolean[n][m];
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1&&vis[i][j]==false){
                    bfs(grid,vis,new pair(i,j));
                    count++;
                }
            }
        }
        return count;
    }

    private void bfs(char[][] grid,boolean[][] vis,pair start) {
        Queue<pair> q=new LinkedList<>();
        q.add(start);
        vis[start.row][start.col]=true;
        while(!q.isEmpty()){
            pair front=q.remove();
            int row=front.row,col= front.col;
            if(row!=0){
                if(!vis[row-1][col]&&grid[row-1][col]==1) {
                    q.add(new pair(row - 1, col));
                    vis[row - 1][col] = true;
                }
            }
            if(row!=grid.length-1){
                if(!vis[row+1][col]&&grid[row+1][col]==1) {
                    q.add(new pair(row + 1, col));
                    vis[row + 1][col] = true;
                }
            }
            if(col!=grid[0].length-1){
                if(!vis[row][col+1]&&grid[row][col+1]==1) {
                    q.add(new pair(row, col+1));
                    vis[row ][col+1] = true;
                }
            }
            if(col!=0){
                if(!vis[row][col-1]&&grid[row][col-1]==1) {
                    q.add(new pair(row, col-1));
                    vis[row ][col-1] = true;
                }
            }
        }
    }
}
