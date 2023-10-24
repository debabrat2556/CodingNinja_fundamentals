// Terms of AP
// Send Feedback
// Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.

// Sample Input 1 :
// 10
// Sample Output 1 :
// 5 11 14 17 23 26 29 35 38 41

package LectureSEVENOperatorAndLoop.Assignment3;

import java.util.Scanner;

public class TermsOfAP {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many numbers you want");
        int number=sc.nextInt();
        int numberForSeries=1;  //to initialize the series 
        for(int i=1;i<=number;)         // this loop is working as a counter only 
                                        //so that this loop runs only for given number of times(according to number)
        {
            int series=3*numberForSeries+2; //the first number 
            if(series%4!=0)                 //condition that the number should not be divisible by 4
            {
                System.out.print(series+" ");
                i++;                            //if we find any value which is not divisble by 4 then only
                                                //we will be increamenting the counter
            }
            numberForSeries++;              //to get the next number in the series
        }
    }
}
