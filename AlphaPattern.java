// Alpha Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 3
//  A
//  BB
//  CCC

package CodingNinja_fundamentals;

import java.util.Scanner;

public class AlphaPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char AlphaCharacter='A';
        System.out.println("please enter number of rows");
        int rows=sc.nextInt();

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(AlphaCharacter+"");
            }
            AlphaCharacter=(char)((int)AlphaCharacter+1); //This line is the key

            System.out.println();
        }

    }
}
