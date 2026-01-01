package OOPS;

public class studentClass {
    public static class student{
        String name;
        int rno;
        double percentage;
    }

    public static void main(String[] args) {
        student x=new student();
        System.out.println();
        x.name="Raghav";
        x.rno=30053;
        x.percentage=99.9;
        System.out.println(x.name);
        System.out.println(x.rno);
        System.out.println(x.percentage);
    }
}
