// Return Array Sum
// Send Feedback
// Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.

// Sample Input 2:
// 2
// 5
// 1 2 3 4 5 
// 3
// 10 20 30 
// Sample Output 2:
// 15
// 60

package LectureEIGHTFunctionAndScope.Array;

import java.util.Scanner;

public class ReturnArraySum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please how many rounds you want to continue");
        int rounds=sc.nextInt();
        for(int j=0;j<rounds;j++)
        {
            System.out.println("please mention the size of the array");
            int n=sc.nextInt();
            int arr1[]=new int[n];
            int sum=0;
            for(int i=0;i<n;i++)
            {
              arr1[i]=sc.nextInt();
              sum=arr1[i]+sum;
            }
        System.out.println(sum);
        }
        
    }
}
