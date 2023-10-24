// Square Root (Integral)
// Send Feedback
// Given a number N, find its square root. You need to find and print only the integral part of square root of N.
// For eg. if number given is 18, answer is 4.

package LectureSEVENOperatorAndLoop.Assignment3;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("please enter a number"); 
      int num=sc.nextInt(); 
      int squareRoot=(int)Math.sqrt(num);
      System.out.println(squareRoot);
    }
}
