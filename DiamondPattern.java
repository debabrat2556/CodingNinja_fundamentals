// Code : Diamond of stars
// Send Feedback
// Print the following pattern for the given number of rows.
// Note: N is always odd.


// Pattern for N = 5
// ...*
// ..***
// .*****
// *******         lets assume this is the firsthalf(so will do code separetly for this section)
// .*****          lets assume this is the secondHalf(so will do code separetly for this section)
// ..***
// ...*


// The dots represent spaces

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter row number");
        int rowCount=sc.nextInt();
        int firstHalf=rowCount/2+1;
        int secondHalf=firstHalf-1;

        for(int i=0;i<firstHalf;i++)
        {
            for(int space=firstHalf-1;space>i;space--)
            {
                System.out.print(" ");
            }            
            for(int printStar=0;printStar<=i;printStar++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
