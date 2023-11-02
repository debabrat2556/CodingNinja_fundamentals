package HackerRankAndOther;

import java.util.Scanner;

public class UnderstandingDoubleandMathClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double meal_amount=sc.nextDouble();
        int tip=sc.nextInt();
        int tax=sc.nextInt();
        solve(meal_amount, tip, tax);
    }
    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
        double meal=meal_cost;
        double tip=(tip_percent*meal)/100;
        
        System.out.println(tip);
        
        double tax=(meal*tax_percent)/100;
        int sum=(int)((Math.round(meal+tip+tax)));

        //we can describe the above partlike this
        (meal+tip+tax)=this will result a double value 
        however (int)(meal+tip+tax) will result int value and the decimal value will be ignored
        so to avoid that we have added the Math.round(value) which gives the round off value 
        for (meal+tip+tax)
        
        System.out.println(sum);
        }
}
