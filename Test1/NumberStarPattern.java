// Number Star pattern 1
// Send Feedback
// Print the following pattern for given number of rows.
// Input format :
// Integer N (Total number of rows)
// Output Format :
// Pattern in N lines
// Sample Input :
//    5
// Sample Output :
//  5432*
//  543*1
//  54*21
//  5*321
//  *4321

package Test1;

import java.util.Scanner;

public class NumberStarPattern {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter row number");
    int rowCount=sc.nextInt();
    int count=1;
    for(int i=0;i<rowCount;i++)
        {
            for(int j=rowCount;j>=1;j--) //this loop is being used to print 54321 for each row
            {
                if(j==count) //count is 1 as of now and j is 5, but when
                             //j becomes 1 then the if condition will satisfy
                {
                    System.out.print("*"); 
                }
                else
                {
                    System.out.print(j); //otherwise this will only run
                }
            }
            count++;
            System.out.println();
        }
    }
}
