// Mirror Image Number Pattern
// Send Feedback
// Print the following pattern for the given N number of rows.
// Pattern for N = 4
// ...1
// ..12
// .123
// 1234
// The dots represent spaces

import java.util.Scanner;

public class MirrorImageNumberPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter number of rows");
        int rowCount=sc.nextInt();
        for(int i=1;i<=rowCount;i++) 
        {
            for(int space=rowCount;space>i;space--)
            {
                System.out.print(" ");
            }
            int number=1;
            for(int j=0;j<i;j++)
            {
                System.out.print(number);
                number=number+1;
            }
            System.out.println();
        }
        
    }
}
