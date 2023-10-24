// Code : Triangle of Numbers
// Send Feedback
// Print the following pattern for the given number of rows.
// Pattern for N = 4
// ...1
// ..232
// .34543
// 4567654


// The dots represent 

//For Hint check StarPattern.java

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter row number");
        int rowCount=sc.nextInt();
        for(int i=1;i<=rowCount;i++)
        {
            for(int space=rowCount;space>i;space--)
            {
                System.out.print(" "+" "); // please remove extra space, it looks line if number of row is greater than 5
            }
            int number1=i;
            for(int starRepetation=0;starRepetation<i;starRepetation++)
            {
                System.out.print(number1+" "); // please remove extra space
                number1++;
            }
            int number2=number1-2;
            for(int secondStar=1;secondStar<i;secondStar++)
            {
                System.out.print(number2+" "); // please remove extra space 
                number2--;
            }
            System.out.println();
        }
    }
}
