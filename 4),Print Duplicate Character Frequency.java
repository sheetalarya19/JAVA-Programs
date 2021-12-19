import java.util.*;
public class Main {
    public static void CountDuplicate(String s)
    {
       int n = s.length();
       Map<Character, Integer> map = new HashMap<Character,Integer>();
       
       char[] charArray = s.toCharArray();
       
       for(char c : charArray)
       {
           if(map.containsKey(c))
           {
               map.put(c , map.get(c) + 1);
           }
           else
           {
               map.put(c, 1);
           }
       }
       for(Map.Entry<Character, Integer> entry : map.entrySet())
       {
           if(entry.getValue() > 1)
           {
               System.out.println(entry.getKey() + ":" + entry.getValue());
           }
       }
       
    }
    public static void main(String[] args)
    {
        String s = "SHEETAL";
       CountDuplicate(s);
    }
}