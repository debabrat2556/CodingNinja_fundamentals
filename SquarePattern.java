// Code : Square Pattern

// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 4444
// 4444
// 4444
// 4444

package CodingNinja_fundamentals;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter how many rows you want to print");
        int N=sc.nextInt();
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                System.out.print(N);
            }
            System.out.println();
        }
    }
}
