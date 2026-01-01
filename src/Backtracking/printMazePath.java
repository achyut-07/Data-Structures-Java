package Backtracking;

import java.util.PriorityQueue;

public class printMazePath {
    public static void main(String[] args) {
        int row=3,col=3;
        print(1,1,row,col,"");

    }

    private static void print(int sr, int sc, int row, int col,String s) {
        if(sr>row||sc>col) return;
        if(sr==row&&sc==col){
            System.out.println(s);
            return ;
        }
        print(sr,sc+1,row,col,s+"R");
        print(sr+1,sc,row,col,s+"D");
    }
}
