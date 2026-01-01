package strings;
import java.util.*;
public class stringBuilderFunction {
    public static void main(String[] args) {
          StringBuilder sb=new StringBuilder("abcdefgh");
          sb.deleteCharAt(3);
          System.out.println(sb);
          sb.delete(2,4);
        System.out.println(sb);
        sb.insert(2,4);
        System.out.println(sb);
    }
}
