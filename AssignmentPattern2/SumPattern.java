// Sum Pattern

// Write a program to print triangle of user defined integers sum.

// Sample Input 1 :
// 3
// Sample Output 1 :
// 1=1
// 1+2=3
// 1+2+3=6

package AssignmentPattern2;

import java.util.Scanner;

public class SumPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter row number");
        int rowCount=sc.nextInt();
        for(int i=1;i<=rowCount;i++)    //to run the outer loop or the rows 
        {
            int sum=0;                  //initializing sum with a value 0
            for(int j=1;j<=i;j++)       
            {
                sum=sum+j;              //will be calculating what could be the sum of all the j elemnts 
                                        //in a single row (note j represents all column elements)
                
                System.out.print(j);    //printing j, 
                if(j==i)
                {
                    break;
                }
                else
                {
                    System.out.print("+"); //this will run untill row and column number becomes equal
                }
            }
            System.out.print(" = "+sum);
            System.out.println();
        }
    }
}
