public class Main{
    public static void main(String[] args)
    {
        String str = "ABC";
        int n = str.length();
        Main permutation = new Main();
        permutation.permute(str, 0, n-1);
    }
    private void permute(String s, int l, int r)
    {
        if(l == r)
        {
            System.out.println(s);
        }
        else
        {
            for(int i = l;i<=r;i++)
            {
                s = swap(s,l,i);
                permute(s,l+1,r);
                s = swap(s,l,i);
            }
        }
    }
    public String swap(String s , int i, int j)
    {
        char temp;
        char[] charArray = s.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}