// Binary to decimal
// Send Feedback
// Given a binary number as an integer N, convert it into decimal and print.

package LectureSEVENOperatorAndLoop.Assignment3;

import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int binaryNo=sc.nextInt();

        int decimal=0;
        int count=0;
        while(binaryNo!=0)
        {
            int remainder=binaryNo%10;
            decimal=(int)(decimal+remainder*(Math.pow(2, count)));
            binaryNo=binaryNo/10;
            count++;
        }
        System.out.println("the decimal value is ="+decimal);
    }
}
