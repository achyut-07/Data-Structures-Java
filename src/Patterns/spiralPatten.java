package Patterns;

import java.util.*;

public class spiralPatten {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[][] arr=new char[n][n];
        for(char[] ele:arr) Arrays.fill(ele,' ');
        int minr=0,maxr=n-1;
        int minc=0,maxc=n-1;
        while(minr<=maxr&&minc<=maxc){

            for(int i=minc;i<=maxc;i++){
                arr[minr][i]='*';
            }
            minr++;
            if(minr>maxr||minc>maxc) break;

            for(int i=minr;i<=maxr;i++){
                arr[i][maxc]='*';
            }
            maxc--;minr++;
            if(minr>maxr||minc>maxc) break;
            for(int i=maxc;i>=minc;i--){
                arr[maxr][i]='*';
            }
            maxr--;maxc--;
            if(minr>maxr||minc>maxc) break;
            for(int i=maxr;i>=minr;i--){
                arr[i][minc]='*';
            }
            maxr--;
            if(minr>maxr||minc>maxc) break;
            if(minc!=maxc) arr[minr][minc+1]='*';
            minc+=2;

        }
        for(char[] ele:arr){
            for(char x:ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());

        String s="abcd";
        

    }
}
