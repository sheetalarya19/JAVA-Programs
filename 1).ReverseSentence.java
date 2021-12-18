import java.util.*;
public class ReverseSentence {
    public static void reverse(String s)
    {
        Stack<String> st = new Stack<>();
        String temp = "";
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == ' ')
            {
                st.add(temp);
                temp = "";
            }
            else{
                temp = temp + s.charAt(i);
            }
        }
        st.add(temp);
        
        while(!st.isEmpty())
        {
            temp = st.peek();
            System.out.print(temp + " ");
            st.pop();
        }
       System.out.println();
    }
    public static void main(String[] args)
    {
        String s = "I Love to code";
        reverse(s);
    }
}