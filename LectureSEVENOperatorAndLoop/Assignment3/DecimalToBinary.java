// Decimal to Binary
// Send Feedback
// Given a decimal number (integer N), convert it into binary and print.
// Note: The given input number could be large, so the corresponding binary number can exceed the integer range. So you may want to take the answer as long for CPP and Java.
// Note for C++ coders: Do not use the inbuilt implementation of "pow" function. The implementation of that function is done for 'double's and it may fail when used for 'int's, 'long's, or 'long long's. Implement your own "pow" function to work for non-float data types.

package LectureSEVENOperatorAndLoop.Assignment3;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter number");
        int num=sc.nextInt();
        int binary=0;
        int count =0;
        while(num!=0)
        {
            int remainder=num%2;
            binary=(int)(binary+remainder*(Math.pow(10, count)));
            num=num/2;
            count++;
        }
        System.out.println(binary);

    }
}
