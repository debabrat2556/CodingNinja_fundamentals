// Star Pattern
// Send Feedback
// Print the following pattern
// Pattern for N = 4
// ...*              ...*
// ..***     =       ..**        +       *
// .*****            .***                **
// *******           ****                ***

//understand the above pattern first (******THIS IS THE HINT*****)

// Hint
// As taught in the video, you just have to modify the code so that instead of printing numbers, it should output stars ('*').

import java.util.Scanner;
public class StarPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter row number");
        int rowCount=sc.nextInt();
        for(int i=0;i<rowCount;i++) // outer layer for row increment
        {
            for(int space=rowCount-1;space>i;space--) //loop to add the space
            {
                System.out.print(" ");
            }
            for(int starRepetation=0;starRepetation<=i;starRepetation++) //loop to print the left section (see above)
            {
                System.out.print("*");
            }
            for(int secondStar=0;secondStar<i;secondStar++) //loop for the right hand side triangle
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
