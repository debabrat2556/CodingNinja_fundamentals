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
            //Alpha Character value will become 


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