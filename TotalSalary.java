// TOTAL SALARY

// Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -

//     totalSalary = basic + hra + da + allow – pf

// where :
// hra   = 20% of basic
// da    = 50% of basic
// allow = 1700 if grade = ‘A’
// allow = 1500 if grade = ‘B’
// allow = 1300 if grade = ‘C' or any other character
// pf    = 11% of basic.
 
package CodingNinja_fundamentals;

import java.util.Scanner;

public class TotalSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		double basic=sc.nextInt();
		//System.out.println("please enter your grade");
		String ch=sc.next();
		char grade=ch.charAt(0);
		double hra, da, pf, allow, totalSalary = 0;
		hra=basic*20/100;
		da=basic*50/100;
		pf=basic*11/100;
		while(totalSalary>=0 && totalSalary<=1000)
		{
			if(grade=='A')
			{
				allow=1700;
				totalSalary=basic+hra+da+allow-pf ;
				System.out.println(Math.round(totalSalary));
			}
			else if(grade=='B')
			{
				allow=1500;
				totalSalary=basic+hra+da+allow-pf ;
				System.out.println(Math.round(totalSalary));
			}
			else
			{
				allow=1300;
				totalSalary=basic+hra+da+allow-pf ;
				System.out.println(Math.round(totalSalary));
			}

		}
    }
}
