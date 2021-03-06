import java.text.DecimalFormat;
import java.util.Scanner;

class HomeWork2_13{
	public static void main(String[] args){
	/*2.13 (Financial application: compound value) 
	Suppose you save $100 each month into a savings account with the annual interest rate 5%. 
	Thus, the monthly interest rate is 0.05/12 = 0.00417. 
	After the first month, the value in the account becomes 100 * (1 + 0.00417) = 100.417 
	After the second month, the value in the account becomes (100 + 100.417) * (1 + 0.00417) = 201.252 
	After the third month, the value in the account becomes (100 + 201.252) * (1 + 0.00417) = 302.507 and so on. 
	Write a program that prompts the user to enter a monthly saving amount and displays the account value after the sixth month. 
	(In Exercise 5.30, you will use a loop to simplify the code and display the account value for any month.) 
	Enter the monthly saving amount: 100. After the sixth month, the account value is $608.81*/

/*
	double monthlyInterest = 0.05/12;
	double monthlySaving = 100;

	double monthOne = (monthlySaving *(1 + monthlyInterest));
	System.out.println(monthOne);

	double monthTwo = ((monthlySaving + monthOne)*(1 + monthlyInterest));
	System.out.println(monthTwo);

	double monthThree = ((monthlySaving + monthTwo)*(1 + monthlyInterest));
	System.out.println(monthThree);

	double monthFour = ((monthlySaving + monthThree)*(1 + monthlyInterest));
	System.out.println(monthFour);

	double monthFive = ((monthlySaving + monthFour)*(1 + monthlyInterest));
	System.out.println(monthFive);

	double monthSix = ((monthlySaving + monthFive)*(1 + monthlyInterest));
	System.out.println(monthSix);
*/

	Scanner input = new Scanner(System.in);
	DecimalFormat df = new DecimalFormat("####.###");

	double month = 1;
	double monthlyTotal = 0;
	double previousMonthlyTotal = 0;

	//Monyhly Input
	System.out.print("Amount deposited per month : ");
	double monthlyInput = input.nextDouble();

	//How much Interest
	System.out.print("Annual Interest Rate (in percentage) : ");
	double interestAmount = input.nextDouble();

	//How many months?
	System.out.print("How many months you want to calculate : ");
	double totalMonths = input.nextDouble();

	double interest = 1 + ((interestAmount/100)/12);

	//With a loop
	while(month <= totalMonths){
	monthlyTotal = (monthlyInput + previousMonthlyTotal) * interest;
	previousMonthlyTotal = monthlyTotal;
	System.out.println("Month " + month + " = $" + (df.format(monthlyTotal)));
	month ++;

	}
	}
}
