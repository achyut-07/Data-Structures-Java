package Backtracking;

public class fourDirectionMazePath {
    public static void main(String[] args) {
        int row=3,col=3;
        boolean[][] visited=new boolean[row][col];
        print(0,0,row-1,col-1,"",visited);
    }
    private static void print(int sr, int sc, int row, int col,String s, boolean[][] visited) {
        if(sr<0||sc<0) return;
        if(sr>row||sc>col) return;
        if(visited[sr][sc]) return;
        if(sr==row&&sc==col){
            System.out.println(s);
            return ;
        }
        visited[sr][sc]=true;
        print(sr,sc+1,row,col,s+"R",visited);
        print(sr+1,sc,row,col,s+"D",visited);
        print(sr,sc-1,row,col,s+"L",visited);
        print(sr-1,sc,row,col,s+"U",visited);
        //bactrack
        visited[sr][sc]=false;
    }


    
}
