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

        //This is the first half of diamond

        for(int i=0;i<firstHalf;i++) //outer loop to run the rows
        {
            for(int space=firstHalf-1;space>i;space--) //firsthalf value is say 3 so space=2 and i is 0
                                                       //so space printed will be 2 
            {
                System.out.print(" ");
            }            
            for(int printStar=0;printStar<=i;printStar++) // we need exactly the same number of star as
                                                            //as the row number
            {
                System.out.print("*");
            }
            System.out.print(" ");                      // we have added this line just to showcase 
                                                            //how the program works

            for(int secondStar=0;secondStar<i;secondStar++) //i is at 0 for the first instance
                                                            // and we are also initializing secondStar at 0
                                                            // so for first row no output
                                                            //but for second iteration seconStar=0
                                                                                // and i=1
                                                                                //secondStar<i so condition satisfies
            {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();               //added this line to discriminate between two halves
        
        // The bottom lines of code is for the second half of the diamond
        for(int i=1;i<=secondHalf;i++) //the outer layer for rows to move
        {
            for(int space=1;space<=i;space++)   //we require equal number of space as of row count
            {
                System.out.print(" ");
            }            
            for(int star1=secondHalf;star1>i;star1--)
            {
                System.out.print("*");
            }
            System.out.print(" ");
            for(int star2=secondHalf;star2>=i;star2--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
