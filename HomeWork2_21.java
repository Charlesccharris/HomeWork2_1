import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

class HomeWork2_21{
	public static void main(String[] args){
	/*2.21 (Financial application: calculate future investment value) 
	Write a program that reads in investment amount, annual interest rate, and number of years, 
	and displays the future investment value using the following formula: 
	futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)numberOfYears*12 
	For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value is 1032.98. 
	Here is a sample run: Enter investment amount: 1000.56 Enter annual interest rate in percentage: 4.25 Enter number of years: 1 Accumulated value is $1043.92*/

	Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("######.##");

	//To get the input for the investment amount
	System.out.print("Initial Investment Amount : ");
	double investmentAmount = input.nextDouble();

	//To get the input for the annual interest rate
	System.out.print("Annual Interest Rate (in percentage): ");
	double annualInterestRate = input.nextDouble();

	//To get how long the investment is for
	System.out.print("Number of Years : ");
	double numberOfYears = input.nextDouble();

	double monthlyInterestRate = annualInterestRate/12/100;

	double monthlyInterest = 1 + monthlyInterestRate;

	double years = numberOfYears*12;

	double yearlyRate = Math.pow(monthlyInterest, years);

	double futureInvestmentValue = investmentAmount * yearlyRate;

	//To output the results of the calculations
	System.out.println("With an initial investment of $" + investmentAmount + " and an annual interest rate of "
	+ annualInterestRate + "% for " + numberOfYears + " year(s), the future investment value is $" + (df.format(futureInvestmentValue)));

	}
}
