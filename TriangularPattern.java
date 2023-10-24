// Triangular Star Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// *
// **
// ***
// ****



import java.util.Scanner;

public class TriangularPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter number of rows");
        int rows=sc.nextInt(); 
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
