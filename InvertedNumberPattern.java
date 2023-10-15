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
        for(int i=1;i<=rowCount;i++) 
        {

            for(int j=rowCount;j>=i;j--)
            {
                System.out.print(number);
            }
                
                number=number-1;
            System.out.println();
        }
        
    }
}

