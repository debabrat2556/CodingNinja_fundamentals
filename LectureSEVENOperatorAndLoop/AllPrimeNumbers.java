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
        for(int i=2;i<=number;i++)   //We have to find all prime numbers within the range from 2 to given number  
        {
            int count=0;
            for(int j=2;j<=i;j++)       //the divisor goes from 2 to upto max i value 
                                        //so if i value becomes equal to number given the j loop will run till that value
            {
                if(i%j==0)
                {
                    count++;        //if i is completely divisible by two or more value of j 
                                    //the count value becomes more than 1, and we dont want that for prime
                }
            }
            if(count==1)            //so because of the above reason if count value 
                                    //does not exceed 1 that means that the number is only divisible one time
                                    //and that too by itself, so it's a prime number
                {
                    System.out.println(i); //printing the prime numbers
                }
        }
    }
}
