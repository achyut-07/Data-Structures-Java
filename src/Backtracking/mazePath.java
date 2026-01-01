package Backtracking;

public class mazePath {
    public static void main(String[] args) {
        int row=3,col=3;
        System.out.println(maze(1,1,row,col));
    }

    private static int maze(int sr, int sc, int row, int col) {
        if(sr>row||sc>col) return 0;
        if(sr==row&&sc==col) return 1;
        return  maze(sr+1,sc,row,col)+maze(sr,sc+1,row,col);
    }
}
