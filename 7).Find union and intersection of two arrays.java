import java.io.*;
import java.util.Arrays;
 
class Main {
    // Function to find union
    static void union(int a[], int b[], int n, int m)
    {
        int i = 0, j = 0;
 
        while (i < n && j < m) {
 
            if (a[i] > b[j]) {
                System.out.print(a[i] + " ");
                j++;
            }
 
            else if (b[j] > a[i]) {
                System.out.print(a[i] + " ");
                i++;
            }
            else {
                // when both are equal
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        System.out.println();
    }
    // Function to find intersection
    static void intersection(int a[], int b[], int n, int m)
    {
        int i = 0, j = 0;
 
        while (i < n && j < m) {
 
            if (a[i] > b[j]) {
                j++;
            }
 
            else if (b[j] > a[i]) {
                i++;
            }
            else {
                // when both are equal
                System.out.print(a[i] + " ");
                i++;
                j++;
            }
        }
        System.out.println();
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int a[] = { 1, 3, 2, 3, 4, 5, 5, 6 };
        int b[] = { 3, 3, 5 };
 
        int n = a.length;
        int m = b.length;
       
        // sort
        Arrays.sort(a);
        Arrays.sort(b);
       
        // Function call
        System.out.print("Intersection of two arrays : ");
        intersection(a, b, n, m);
        System.out.print("Union of two arrays : ");
        union(a,b,n,m);
    }
}