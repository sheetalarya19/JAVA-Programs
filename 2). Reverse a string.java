import java.util.*;
public class Main {
    public static void reverse(String s)
    {
       int n = s.length();
       StringBuilder input1 = new StringBuilder();
       
       input1.append(s);
       
       input1.reverse();
       
       System.out.println(input1);
       
    }
    public static void main(String[] args)
    {
        String s = "Love";
        reverse(s);
    }
}