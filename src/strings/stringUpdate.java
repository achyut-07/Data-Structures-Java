package strings;

public class stringUpdate {
    public static void main(String[] args) {
        String s="Physics Wallah Skills";
        int n=s.length();
        String p="";
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
                p=p+"a";
            else
            p+=s.charAt(i);
        }
        System.out.println(p);
    }
}
