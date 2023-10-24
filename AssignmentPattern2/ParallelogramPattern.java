// Parallelogram Pattern
// Send Feedback
// Write a program to print parallelogram pattern for the given N number of rows.
// For N = 4
// ****
//  ****
//   ****
//    ****
// The dots represent spaces.

package AssignmentPattern2;

import java.util.Scanner;
public class ParallelogramPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter row number");
        int rowCount=sc.nextInt();
        for(int i=0;i<rowCount;i++) // to process the rows 0 to rowCount-1
        {
            for(int space=1;space<=i;space++) //for the first iteration it does not satisfy as i value is 0
                                                //for the second iteration when i becomes 1
                                                //and space is also 1 it will print space
            {
                System.out.print(" ");
            }
            for(int j=0;j<rowCount;j++)     //for printing the stars
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
