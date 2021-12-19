import java.util.*;
class Main{
    static List<String> lis = new ArrayList<>();
    
    public static void main(String[] args)
    {
        String s = "abc";
        findSub(s, "");
        System.out.println(lis);
    }
    private static void findSub(String s, String ans)
    {
        if(s.length() == 0)
        {
            lis.add(ans);
            return;
        }
        findSub(s.substring(1), ans + s.charAt(0));
        
        findSub(s.substring(1), ans );
    }
}