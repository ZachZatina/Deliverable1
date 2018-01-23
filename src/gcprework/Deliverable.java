/**
 * 
 */
package gcprework;

/**
 * @author Zachariah Zatina
 *
 */
import java.util.Scanner;

public class Deliverable {

	public static void main(String[] args) {
		// Variable list
		Scanner scnr = new Scanner(System.in);
		String numOne;
		String numTwo;
		Boolean areEqual = false;
		int lengthOne;
		int lengthTwo;
		int i;
		char A;
		char B;
		char C;
		char D;
		int sumOne;
		int sumTwo;
		int j;
		char cont = 'y';
		
		//statement to loop the application
		while (cont == 'y') {

			// Telling user what the program is for
			System.out.println(
					"Check if each corresponding place in the two numbers (ones, tens, hundreds, ...) sums to the same total");

			// section to store the two numbers in the String variables.
			System.out.print("Please enter the first number: ");
			numOne = scnr.next();

			System.out.print("Please enter the second number with the same amount of digits as the first number: ");
			numTwo = scnr.next();
			System.out.println("");

			// To find the length of each string to verify that each string is the same
			lengthOne = numOne.length();
			lengthTwo = numTwo.length();

			// if the two integers are not of equal length this will make program spit out
			// false.
			if (lengthOne != lengthTwo) {
				System.out.println("The two integers do not have the same amount of digits");
				areEqual = false;
			}
			/*
			 * The else statement executes the main code after verifying that the two digits
			 * the user inputs have the same number of places.
			 */
			else {
				for (i = 0; i < (lengthOne - 1); i++) {
					/*
					 * isolates the specific char at position 'i' of the string and records it to a
					 * char variable. It then adds the two numbers together using the ASCII values.
					 */
					A = numOne.charAt(i);
					B = numTwo.charAt(i);
					sumOne = A + B;

					/*
					 * Does the same as the section immediately previous this one, however it
					 * introduces a new variable 'j' this is equal to i + 1. This variable then
					 * represents the char following the 'i' char. They are then added and assigned
					 * to a second sum variable.
					 */
					j = i + 1;
					C = numOne.charAt(j);
					D = numTwo.charAt(j);
					sumTwo = C + D;

					// This validates to make sure there are only numerals in the string.
					if ((A - 48 < 0 || A - 48 > 9) || (B - 48 < 0 || B - 48 > 9) || (C - 48 < 0 || C - 48 > 9)
							|| (D - 48 < 0 || D - 48 > 9)) {
						System.out.println("One of the two numbers is not a valid number, please try again");
					} 
					else {
						/*
						 * The if/else statement tests whether the sum of the two numbers in the 'i'
						 * position is equal to the sum of the two numbers in the position following i.
						 * Causes a break in the loop if it ever finds that they are not equal.
						 */
						if (sumOne == sumTwo) {
							areEqual = true;
						} 
						else {
							areEqual = false;
							break;
						}
					}

				}
			}
			// The if/else statements to output true/false to the user.
			if (areEqual) {
				System.out.println("True");
			} 
			else {
				System.out.println("False");
			}

			System.out.print("Do you wish to try again? (y/n): ");
			cont = scnr.next().charAt(0);
			System.out.println("");
		}

		System.out.println("Goodbye!");

		return;
	}
}