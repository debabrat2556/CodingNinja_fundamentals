// Sum of even & odd

// Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits separately.


// Digits mean numbers, not places! That is, if the given integer is "132456", even digits are 2, 4, and 6, and odd digits are 1, 3, and 5.

package CodingNinja_fundamentals;

import java.util.Scanner;

public class sumOfEvnNDodd {
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number consisting of 5 to 6 digits");
    int number=sc.nextInt();
    int sum=0;
    int sum2=0;
    while(number>0)
    {
        int remainder=number%10;
        if(remainder%2==0){
            sum=sum+remainder;
        }
        else{
            sum2=sum2+remainder;
        }
        number=number/10;
    }
    System.out.println("sum of all even digits are: "+sum);
    System.out.println("sum of all odd digits are: "+sum2);
    }
}
