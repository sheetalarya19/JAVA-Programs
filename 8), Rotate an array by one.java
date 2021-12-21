import java.util.Scanner;  
public class Main  
{  
public static void rotate(int[] a, int n)
{
    int x = a[n-1];
    for(int i=n-1;i>0;i--)
    {
        a[i] = a[i-1];
    }
    a[0] = x;
    
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

 rotate(array,n);
for (int i=0; i<n; i++)   
{  
System.out.println(array[i]);  
}  
}  
}  