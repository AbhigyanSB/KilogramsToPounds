/* This program will take an input from the user
 * in Kilograms and convert that into Pounds. */

//Import the Scanner class in Java.
import java.util.Scanner;

//Class to convert the Kilogram to Pound value.
public class KilogramsToPounds {

	//Main method.
	public static void main(String[] args) {
		
		//Create a Scanner object.
		Scanner input = new Scanner(System.in);
		
		//Ask for the user input in Kilogram.
		System.out.println("Please enter the Kilogram value, which needs to be converted to Pound: ");
		
		//Store the Kilogram value, provided by the user.
		double kilogramValue = input.nextDouble();
		
		//Calculate the Pound value with the given formula.
		double poundValue = (kilogramValue / 0.45359237);	//1 Pound = 0.45359237 Kilogram
		
		//Display the converted pound value.
		System.out.println("After conversion, the converted value in Pound is = " + poundValue + " Pounds");
		
		//Close the input.
		input.close();
		
	}	//Main() method.

}	//PoundsToKilograms class.
