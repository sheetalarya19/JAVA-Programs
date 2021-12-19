import java.util.*;
public class Main {
    public static boolean isPalindrome(String s)
    {
       int n = s.length();
       int i =0, j = n-1;
       while(i<j)
       {
           if(s.charAt(i) != s.charAt(j))
           {
               return false;
           }
           i++;
           j--;
         
       }
        return true;
       
    }
    public static void main(String[] args)
    {
        String s = "LooL";
        if(isPalindrome(s))
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}