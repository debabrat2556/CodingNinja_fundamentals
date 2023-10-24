// Odd Square
// Send Feedback
// Write a program to print the pattern for the given N number of rows.
// For N = 4
// 1357
// 3571
// 5713
// 7135

package AssignmentPattern2;

import java.util.Scanner;

public class OddSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter row number");
        int rowCount=sc.nextInt();

        int maxValue=2*rowCount-1;      //gettin the highest value a row can have
        for(int i=1;i<=rowCount;i++)
        {
            int printValue=2*i-1;       //this is required cause for every row the starting value is different
                                        // as we can see for the first row its 1
                                        // for the second row its 3 (2*rowValue-1 which is 2*2-1)

            for(int j=1;j<=rowCount;j++)    //for column also the higest column number = highest row number
            {
                if(printValue<=maxValue)  //this condition applies till printValue is lesser or equal to maxValue
                {
                    System.out.print(printValue+" ");
                    printValue=printValue+2;
                }
                else{                        //this condition applies when printValue is greater than maxValue
                    printValue=1;               //resetting the printValue to 1
                    System.out.print(printValue+" ");   //printing the value of printValue
                    printValue=printValue+2;            //increasing the value by 2
                                                        //otherwise when printValue moves to the upper if loop
                                                        //it will again print the same value
                }
            }
            System.out.println();                   //line break
        }
    }
}
