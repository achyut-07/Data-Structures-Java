import java.util.Scanner;
class Sum{
    public static int add(int a,int b) {
        int ans=a+b;
        return ans;
    }
}

public class method {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Sum obj=new Sum();
        int x=sc.nextInt();
        int y=sc.nextInt();
        int res=obj.add(x,y);
        System.out.println(res);
    }
}
