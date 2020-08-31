import java.util.Scanner;


class HomeWork2_1{
	public static void main(String[] args){
		/*2.1 (Convert Celsius to Fahrenheit) 
		Write a program that reads a Celsius degree in a double value from the console, 
		then converts it to Fahrenheit and displays the result. 
		The formula for the conversion is as follows: fahrenheit = (9 / 5) * celsius + 32 
		Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8. 
		Here is a sample run:Enter a degree in Celsius: 43. 43 Celsius is 109.4 Fahrenheit.*/


		Scanner input = new Scanner(System.in);

		//Celsius input
		System.out.print("Enter a number for Celsius: ");
		double celsius = input.nextDouble();

		//Fahrenheit output
		double fahrenheit = (9.0/5.0) * celsius + 32;
		System.out.println(celsius + " degrees Celsius is " + fahrenheit + " degrees Fahrenheit");


	}
}
