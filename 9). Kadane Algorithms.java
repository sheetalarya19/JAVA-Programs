import java.util.Scanner;  
public class Main  
{  
public static int KadaneAlgo(int[] a, int n)
{
    int max_ending_here = 0, max_so_far = Integer.MIN_VALUE;
    for(int i=0;i<n;i++)
    {
        max_ending_here = max_ending_here + a[i];
        if(max_so_far<max_ending_here)
        {
            max_so_far = max_ending_here;
        }
        if(max_ending_here<0)
        {
            max_ending_here = 0;
        }
    }
    return max_so_far;
   
    
}
public static void main(String[] args)   
{  
int n;  
Scanner sc=new Scanner(System.in);  

n=sc.nextInt();  
//creates an array in the memory of length 10  
int[] array = new int[n];  
for(int i=0; i<n; i++)  
{  
//reading array elements from the user   
array[i]=sc.nextInt();  
}  

System.out.println(KadaneAlgo(array,n));  
 
}  
}  