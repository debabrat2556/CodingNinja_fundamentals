// Character Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// A
// BC
// CDE
// DEFG

package CodingNinja_fundamentals;

import java.util.Scanner;

public class CharacterPatter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter number of rows");
        int rows=sc.nextInt();

        for(int i=1;i<=rows;i++)
        {
            char AlphaCharacter='A';
            AlphaCharacter=(char)((int)AlphaCharacter+i-1); //in the second iteration
            //Alpha Character value will become  B
            //but because of the line above char "AlphaCharacter='A';" afain the value A now
            //but i value has increased to 2 now, "so A+2-1= i.e. B"


            for(int j=1;j<=i;j++)
            {
                System.out.print(AlphaCharacter+"");
                AlphaCharacter=(char)((int)AlphaCharacter+1); //This line is the key
                // System.out.println("value of alpha character"+AlphaCharacter);
            }
            System.out.println();
        }
    }
}
