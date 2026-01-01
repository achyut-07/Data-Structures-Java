package Heaps;

import java.util.Arrays;

class students implements Comparable<students>{
    int rno;
    double perc;
    String name;
    students(int rno,double perc,String name){
        this.rno=rno;
        this.perc=perc;
        this.name=name;
    }
    public int compareTo(students s){
        return this.rno-s.rno;
    }

}
public class customCompartor {
    public static void print(students[] s){
        for(students ele:s){
            System.out.println(ele.name+" "+ele.perc+" "+ele.rno);
        }
        System.out.println();
        System.out.println();

    }
    public static void main(String[] args) {
        students[] s=new students[4];
        s[0]=new students(76,99,"raghav");
        s[1]=new students(53,98.5,"Achyut");
        s[2]=new students(44,97.4,"Ra-one");
        s[3]=new students(14,86.5,"Madhuri");
        print(s);
        Arrays.sort(s);
        print(s);
    }
}
