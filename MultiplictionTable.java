// Multiplication Table

// Write a program to print multiplication table of n

package CodingNinja_fundamentals;

import java.util.Scanner;

public class MultiplictionTable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a value");
        
        //Please delete the above line

        int digit=sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            int result=digit*i;
            System.out.print(digit+" x "+i);
            System.out.print(" = "+result);
            System.out.println();
        }
    }
}
