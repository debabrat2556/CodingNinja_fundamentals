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
    char InterestingAlpha=(char)((int)'A'+rowCount-1); //charcter value is converted to E now
    for(int i=1;i<=rowCount;i++)
    {
        char InterestingAlpha2=InterestingAlpha; // storing value of Interesting Alpha to a different character variable
        for(int j=0;j<i;j++)
        {
            System.out.print(InterestingAlpha2); //printing what's in InterestingAlpha2
            InterestingAlpha2=(char)((int)InterestingAlpha2+1); //updating InterestingAlpha2 by 1 so if InterestingAlpha2 is E now the value is F
        }
        
        InterestingAlpha=(char)((int)InterestingAlpha-1); //If we properly check InterestingAlpha still has the value 'E' so 'E'-1=D
                                                          //So for the next round the value passed is under InterestingAlpha is 'D'
        
        System.out.println();    //adding line space
    }
}    
}
