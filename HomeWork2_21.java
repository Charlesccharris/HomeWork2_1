import java.lang.Math;
import java.util.Scanner;
import java.text.DecimalFormat;

class HomeWork2_21{
	/*2.21 (Financial application: calculate future investment value) 
	Write a program that reads in investment amount, annual interest rate, and number of years, 
	and displays the future investment value using the following formula: 
	futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)numberOfYears*12 
	For example, if you enter amount 1000, annual interest rate 3.25%, and number of years 1, the future investment value is 1032.98. 
	Here is a sample run: Enter investment amount: 1000.56 Enter annual interest rate in percentage: 4.25 Enter number of years: 1 Accumulated value is $1043.92*/


	//To get the input for the investment amount
  	double investmentAmount = 1000;
	System.out.print("Initial Investment Amount : " + investmentAmount);
	

	//To get the input for the annual interest rate
  	double annualInterestRate = 3.25;
	System.out.println("Annual Interest Rate (in percentage): " + annualInterestRate);
	

	//To get how long the investment is for	
  	double numberOfYears = 1;
	System.out.println("Number of Years : " + numberOfYears);


	double monthlyInterestRate = annualInterestRate/12/100;

	double monthlyInterest = 1 + monthlyInterestRate;

	double years = numberOfYears*12;

	double yearlyRate = Math.pow(monthlyInterest, years);

	double futureInvestmentValue = investmentAmount * yearlyRate;

	//To output the results of the calculations
	System.out.println("With an initial investment of $" + investmentAmount + " and an annual interest rate of "
	+ annualInterestRate + "% for " + numberOfYears + " year(s), the future investment value is $" + futureInvestmentValue);

	}
}
