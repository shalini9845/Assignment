import java.util.Scanner;
public class Calculate_Compound_Interest {
    public static double calculate_Compound_Interest(double principal,double monthly_Rate,int months)
    {
        double amount= principal * Math.pow(1 + monthly_Rate, months);
        double total_Interest= amount - principal;
        return total_Interest;
    }
    
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the principle amount");
        double principal=obj.nextDouble();
        System.out.println("enter the yearly rate of interest in (percentage)");
        double rate_Of_Interest=obj.nextDouble();
        double monthly_Rate=rate_Of_Interest/12/100;
        System.out.println("Enter the no. of months");
        int months=obj.nextInt();
        double total_Interest=calculate_Compound_Interest(principal, monthly_Rate, months);
        System.out.println("total interest earned  is "  +  total_Interest);
        obj.close();


    }
}
