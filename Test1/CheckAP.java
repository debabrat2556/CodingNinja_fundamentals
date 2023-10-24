// Check AP
// Send Feedback
// Given input consists of n numbers. Check whether those n numbers form an arithmetic progression or not. Print true or false.
// Input format :
// Line 1 : n
// Line 2 : n numbers
// Sample Input 1 :
// 6
// 2 6 10 14 18 22
// Sample Output 1 :
// true

package Test1;

import java.util.Scanner;

public class CheckAP {
    public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    int N = s.nextInt();
    
    
    int[] a= new int[N];
    for (int i =0; i<N;i++)
    {
        a[i]= s.nextInt();
    }
    int [] A= new int [N-1];

    for ( int i =0;i<N-1;i++)
    {
        if ( a[i]==a[i+1])
        {
            System.out.println("false");
			return ;
        }
        A[i]= a[i] -a[i+1];
    }
    int i =0;
    while (i<N-2)
    {
        if (A[i]<0 && A[i+1]>0)
        {
            System.out.println("false");
			return ;
        }
    	i++;
    }
   	System.out.println("true");
    }
}
