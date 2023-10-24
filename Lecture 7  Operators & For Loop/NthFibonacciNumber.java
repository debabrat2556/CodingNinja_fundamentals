// Nth Fibonacci Number
// Send Feedback
// The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
//     F(n) = F(n - 1) + F(n - 2), 
//     Where, F(1) = 1, F(2) = 1


// Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.


// Example :
// Input: 6

// Output: 8

// Explanation: The number is ‘6’ so we have to find the “6th” Fibonacci number.
// So by using the given formula of the Fibonacci series, we get the series:    
// [ 1, 1, 2, 3, 5, 8, 13, 21]
// So the “6th” element is “8” hence we get the output.

package Lecture 7  Operators & For Loop ;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the position");
        int position=sc.nextInt();
        int count=1; //we are taking count with value 1
        int first=0;
        int second=1;
        int sum=0;
        while(count!=position)
        {
            sum=first+second;       //this will only give 1 2 3 5 8 13 
            first=second;
            second=sum;
            System.out.print(sum+" ");
            System.out.println("count is "+count);
            if(count==position-1)
            {
                System.out.println("position is "+count);
                System.out.println(sum);
            }
            count++;
        }   
    }
}
