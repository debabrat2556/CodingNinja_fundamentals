// Code : Inverted Number Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 4444
// 333
// 22
// 1

import java.util.Scanner;

public class InvertedNumberPattern {
public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("please enter number of rows");
        int rowCount=sc.nextInt();
        int number=rowCount;
        for(int i=1;i<=rowCount;i++) // this loop will run for all the rows, 
        {

            for(int j=rowCount;j>=i;j--) //this loop will run for repetation, for first itereation
                                          // j=rowCount i.e j=4(say) and i value for first iteration is 1 so this loop will run till j=i or j>i
            {
                System.out.print(number);        // what needs to be printed (for first iteration only 4 is reqiored) 
                                                 // So 4 needs to be printed a totatl of 4 times
            }
                
                number=number-1;
            System.out.println();
        }
        
    }
}

