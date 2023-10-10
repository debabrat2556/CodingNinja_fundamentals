package CodingNinja_fundamentals;

import java.util.Scanner;

public class sumOfEvnNDodd {
    public static void main(String[] args) {
    
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number consisting of 5 to 6 digits");
    int number=sc.nextInt();
    int sum=0;
    int sum2=0;
    while(number>0)
    {
        int remainder=number%10;
        if(remainder%2==0){
            sum=sum+remainder;
        }
        else{
            sum2=sum2+remainder;
        }
        number=number/10;
    }
    System.out.println("sum of all even digits are: "+sum);
    System.out.println("sum of all odd digits are: "+sum2);
    }
}
