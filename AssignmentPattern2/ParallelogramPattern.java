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
        for(int i=0;i<rowCount;i++)
        {
            for(int space=1;space<=i;space++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<rowCount;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
