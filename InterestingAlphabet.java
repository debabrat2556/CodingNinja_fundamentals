// Interesting Alphabets
// Send Feedback
// Print the following pattern for the given number of rows.
// Pattern for N = 5
// E
// DE
// CDE
// BCDE
// ABCDE

import java.util.Scanner;
public class InterestingAlphabet {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Please enter row number");
    int rowCount=sc.nextInt();
    char InterestingAlpha=(char)((int)'A'+rowCount-1); 
    for(int i=1;i<=rowCount;i++)
    {
        char InterestingAlpha2=InterestingAlpha;
        for(int j=0;j<i;j++)
        {
            System.out.print(InterestingAlpha2);
            InterestingAlpha2=(char)((int)InterestingAlpha2+1);
        }
        
        InterestingAlpha=(char)((int)InterestingAlpha-1);
        
        System.out.println();
    }
}    
}
