// Fahrenheit to Celsius Table
// Send Feedback
// Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
// Note: You don't have to write the main function or take input. It has already been taken care of and you need to just print the integer value . Just write the code that prints Fahrenheit to Celsius table in the function itself.
// Input Format :
// 3 integers - S, E and W respectively
// Output Format :
// Fahrenheit to Celsius conversion table. One line for every Fahrenheit and Celsius Fahrenheit value. Fahrenheit value and its corresponding Celsius value should be separate by tab ("\t")

package LectureEIGHTFunctionAndScope;

import java.util.Scanner;

public class FarheniteToCelsiusTable {

    public static void printFahrenheitTable(int start, int end, int step)
    {
        while(start<=end)
		{
			int res=0;
			res=((start-32)*5)/9;
			System.out.println(start+" "+res);
			start=start+step;
		}
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int step=sc.nextInt();
		printFahrenheitTable(start,end,step); //we are passing the values to function declared above
    }
}
