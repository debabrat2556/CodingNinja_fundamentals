// All Prime Numbers
// Send Feedback
// Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
// Print the prime numbers in different lines.

// Sample Input 1:
// 9
// Sample Output 1:
// 2
// 3
// 5
// 7

package LectureSEVENOperatorAndLoop;

import java.util.Scanner;

public class AllPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number");
        int number=sc.nextInt();
        for(int i=2;i<=number;i++)
        {
            int count=0;
            for(int j=2;j<=i;j++)
            {
                if(i%j==0)
                {
                    count++;
                }
                if(count==1)
                {
                    System.out.println(i);
                }
            }
        }
    }
}
