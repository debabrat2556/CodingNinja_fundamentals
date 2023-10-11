// Find power of a number

// Write a program to find x to the power n (i.e. x^n). Take x and n from the user. You need to print the answer.
// Note : For this question, you can assume that 0 raised to the power of 0 is 1

package CodingNinja_fundamentals;

import java.util.Scanner;

public class FindPowerOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter a number");
        int number=sc.nextInt();   

        System.out.println("please enter the for the number");
        int power=sc.nextInt();
        int result=(int)Math.pow(number, power);
        System.out.println(result);
    }
}
