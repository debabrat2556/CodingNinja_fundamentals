package LectureEIGHTFunctionAndScope;

import java.util.Scanner;

public class FibonacciNumber {
    
    public static boolean checkMember(int n)        //function receives num in n
    {
        if(n<=0)
        {
            return false;
        }
        int sum=0;
        int i=1;
        int j=1;
        while(sum<=n)
        {
            sum=i+j;
            i=j;
            j=sum;
            if(sum==n)
            {
                return true; 
            }
        }
        return false;           //in general the function returns a false value if the above conditions
                                //does nogt satisfies
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter a value to check if it belongs to fibonacci series");
        int num=sc.nextInt();                   //taking input
        boolean result=checkMember(num);        //passing the input(num) to function
        System.out.println(result);
    }
}
