package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class pos{
    int i;
    int j;
    pos(int i,int j){
        this.i=i;
        this.j=j;
    }
}

public class bfsMatrices {

    static int k=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        int idx1=sc.nextInt();
        int idx2=sc.nextInt();
        boolean[][] vis=new boolean[n][m];
        k=1;
        pos p=new pos(idx1,idx2);
        bfsFill(arr,p,vis);

        for(int[] ele:arr){
            for(int x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }
    public static boolean isvalid(int[][] arr,int i,int j){
        int n=arr.length;
        int m=arr[0].length;
        if(i<0||i>=n||j<0||j>=m) return false;

        return true;
    }
    private static void bfsFill(int[][] arr, pos p, boolean[][] vis) {

        Queue<pos> q=new LinkedList<>();
        q.add(p);
        arr[p.i][p.j]=0;
        vis[p.i][p.j]=true;
      //k+=1;
        while(!q.isEmpty()){
            pos val=q.remove();
            //north
            if(isvalid(arr,val.i-1,val.j)&&!vis[val.i-1][val.j]){
                arr[val.i-1][val.j]=arr[val.i][val.j]+1;
                k++;
                vis[val.i-1][val.j]=true;
                q.add(new pos(val.i-1,val.j));
            }
            //east
            if(isvalid(arr,val.i,val.j+1)&&!vis[val.i][val.j+1]){
                arr[val.i][val.j+1]=arr[val.i][val.j]+1;
                k++;
                vis[val.i][val.j+1]=true;
                q.add(new pos(val.i,val.j+1));
            }
            //south
            if(isvalid(arr,val.i+1,val.j)&&!vis[val.i+1][val.j]){
                arr[val.i+1][val.j]=arr[val.i][val.j]+1;
                k++;
                vis[val.i+1][val.j]=true;
                q.add(new pos(val.i+1,val.j));
            }
            //west
            if(isvalid(arr,val.i,val.j-1)&&!vis[val.i][val.j-1]){
                arr[val.i][val.j-1]=arr[val.i][val.j]+1;
                k++;
                vis[val.i][val.j-1]=true;
                q.add(new pos(val.i,val.j-1));
            }

        }

    }
}
