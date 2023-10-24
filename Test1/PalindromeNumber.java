// Palindrome number
// Send Feedback
// Check whether a given number ’n’ is a palindrome number.
// Note :
// Palindrome numbers are the numbers that don't change when reversed.
// You don’t need to print anything. Just implement the given function.
// Example:
// Input: 'n' = 51415
// Output: true
// Explanation: On reversing, 51415 gives 51415.

package Test1;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a number");
        int number=sc.nextInt(); //say number is 51415 
        int revNumber=0;
        int numberKept=number;
        boolean flag;
        while(number!=0)
        {
            int remainder=number%10;
            revNumber=revNumber*10+remainder;
            number=number/10;
        }
        if(numberKept==revNumber)
        {
            flag=true;
        }
        else
        {
            flag=false;
        }
        System.out.println(flag);
    }
}
