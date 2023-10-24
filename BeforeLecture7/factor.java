// Factors

// Write a program that takes a number as input and prints all its factors except 1 and the number itself.. If the number has only two factors (1 and the number itself), then the program should print -1



import java.util.Scanner;

public class factor {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("please enter a number");
    int n=sc.nextInt();
		int i=2;
		boolean isPrime=true;
		while(i<n-1 && n>=2)
		{
			if(n%i==0)
			{
				System.out.print(i+" ");
				isPrime=false;
			}
			i++;
		}
		if(isPrime || n==2)
		{
			System.out.println("-1");
		}
}    
}
