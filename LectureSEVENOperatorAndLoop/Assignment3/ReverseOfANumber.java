// Reverse of a number
// Send Feedback
// Write a program to generate the reverse of a given number N. Print the corresponding reverse number.
// Note : If a number has trailing zeros, then its reverse will not include them. For e.g., reverse of 10400 will be 401 instead of 00401.

package LectureSEVENOperatorAndLoop.Assignment3;

import java.util.Scanner;

public class ReverseOfANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a number");
        int number=sc.nextInt();                        //suppose the number is 10400
        int reverseNumber=0;
        while(number!=0)
        {
            int remainder=number%10;                    //for first iteration remainder is 0 so reverseNumber value is also 0
                                                        //for second iteration remainder is 0 so reverseNumber value is also 0
            reverseNumber=reverseNumber*10+remainder;   //for third iteration remainder becomes 4
                                                        //so reverseNumber=0*10+4 which is 4
            number=number/10;
        }
        System.out.print(reverseNumber);
    }
    
}
//for second iteration 
//remainder becomes 0 however in reverseNumber we have already 4
//so reverseNumber becomes=4*10+0 which equals to 40