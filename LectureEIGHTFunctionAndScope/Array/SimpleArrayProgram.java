package LectureEIGHTFunctionAndScope.Array;

import java.util.Scanner;

public class SimpleArrayProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();                     //to decide the size of the array
        int arr1[]=new int[n];                  //array are defined with square brackets
                                                //on the right hand side new int[n] means
                                                //we are creating a new array of datatype int which has a size n
        
        //the below for loop is required as we need to enter 1 value at a time also, 
        //array starts from the 0th position
        for(int i=0;i<n;i++)
        {
            arr1[i]=sc.nextInt();
        }
        
        //the same logic is applied here while printing, printing single value
         for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]+" ");
        }
    }
}
