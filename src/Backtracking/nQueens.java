package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class nQueens {
    public static void main(String[] args) {
        int n=4;
        char[][] board=new char[n][n];
        for(char[]ele: board) Arrays.fill(ele,'X');
        List<List<String>> ans=new ArrayList<>();
        nqueen(board,0,ans);
    }

    private static void nqueen(char[][] board, int row,List<List<String>> ans) {
        int n= board.length;
        if(row==n){
            List<String > l=new ArrayList<>();
            for(int i=0;i<n;i++){
                StringBuilder sb=new StringBuilder("");
                for(int j=0;j<n;j++){
                    System.out.print(board[i][j]+" ");
                    sb.append(board[i][j]);
                }
                System.out.println();
                l.add(sb.toString());
            }
            ans.add(l);
            System.out.println();
            return;
        }
        for(int j=0;j<n;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
                nqueen(board,row+1,ans);
                board[row][j]='X';
            }
        }
        return;
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int n= board.length;
        int i=0,j=0;
        for(j=0;j<n;j++){
            if(board[row][j]=='Q') return false;
        }
        for(i=0;i<n;i++){
            if(board[i][col]=='Q') return false;
        }
        //north-east
        i=row;j=col;
        while(i>=0&&j<n){
            if(board[i][j]=='Q') return false;
            i--;j++;
        }
        //south-east
        i=row;j=col;
        while(i<n&&j<n){
            if(board[i][j]=='Q') return false;
            i++;j++;
        }
        //south-west
        i=row;j=col;
        while(i<n&&j>=0){
            if(board[i][j]=='Q') return false;
            i++;j--;
        }
        //north-west
        i=row;j=col;
        while(i>=0&&j>=0){
            if(board[i][j]=='Q') return false;
            i--;j--;
        }

        return true;
    }
}
