// Write a program that asks the user for a number N and a choice C. And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).


//  If C is equal to -
//  1, then print the sum
//  2, then print the product
//  Any other number, then print '-1' (without the quotes)

// Sample Input 1 :
// 10
// 1
// Sample Output 1 :
// 55
// Sample Input 2 :
// 10
// 2
// Sample Output 2 :
// 3628800
// Sample Input 3 :
// 10
// 4
// Sample Output 3 :
// -1

package LectureSEVENOperatorAndLoop.Assignment3;  //as we are creating folder inside another folder
                                                    // so parent_folder_name.current_folder_name 
import java.util.Scanner;

public class SumOrProduct {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter a number");
    int number=sc.nextInt();
    System.out.println("please enter your choice");
    int choice=sc.nextInt();
    if(choice==1)
    {
        int sum=0;
        for(int i=1;i<=number;i++)
        {
            sum=sum+i;
        }
        System.out.println("the sum value of all the numbers uptill "+number+" is = "+sum);
    }
    else if(choice==2)
    {
        int mul=1;
        for(int i=1;i<=number;i++)
        {
            mul=mul*i;
        }
        System.out.println("the multiplication value of all the numbers uptill "+number+" is = "+mul);
    }
    else
    {
        System.out.println("-1");
    }
   } 
}

