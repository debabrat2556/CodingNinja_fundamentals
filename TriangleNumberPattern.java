// Triangle Number Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// 1
// 22
// 333
// 4444



import java.util.Scanner;

public class TriangleNumberPattern {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int rows=sc.nextInt();
    for(int i=1;i<=rows;i++)
    {
        for(int j=1;j<=i;j++)
        {
            System.out.print(i+"");
        }
        System.out.println();
    }
}    
}
