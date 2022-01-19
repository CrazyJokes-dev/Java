/*
 * Name: Estefan Valencia
 * Project description: This program functions as a very basic calculator
 * Course: COSC 211, Winter 2021
 * Lab#: 5
 * Due date: 03/2/21 @ 2:59pm
 */

import java.util.Scanner;
public class calculator {
	private static String doAgain;
	private static String operation = "f"; //I had to initialize this variable
	
	
	/**
	 * 
	 * @param input - The operator and number that the user typed in
	 * @param preResult - The result from the previous operation
	 * @return
	 * @throws UnknownOperatorException - If you get a operation that is not +,-,*,/, or %
	 */
	public static double calculate(String input, double preResult) throws UnknownOperatorException {
		String trimmed = input.trim();
		String operator = trimmed.substring(0, 1);
		
		// If operator equals a empty space
		if(input.equals("")) {
			throw new UnknownOperatorException("Please enter an operation next time.");
		}
		
		//If operator isn't a known operator then throw UnknownOperatorException
		if(!operator.equals("+") && !operator.equals("*") && !operator.equals("-") && !operator.equals("/") && !operator.equals("%")) {  
			throw new UnknownOperatorException("Unknown operator detected.");
		}
		
		// Variable that removes all the unwanted extra space
		double num = Double.parseDouble(trimmed.substring(1));
		
		//If double isn't a number
		if(Double.isNaN(num))
			throw new NumberFormatException(num + "is not a number.");
		
		//If operator equals +,-,*,/, or % perform the following operations
		
		if(operator.equals("+")) {
			System.out.println("result " + operator + " " + num + " = " + (preResult + num));
			return preResult + num;
		
		} else if(operator.equals("*")) {
			System.out.println("result " + operator + " " + num + " = " + (preResult * num));
			return preResult * num;
		
		} else if(operator.equals("-")) {
			System.out.println("result " + operator + " " + num + " = " + (preResult - num));
			return preResult - num;
		
		} else if(operator.equals("/")) {
			System.out.println("result " + operator + " " + num + " = " + (preResult / num));
			return preResult / num;
		
		} else if(operator.equals("%")) {
			System.out.println("result " + operator + " " + num + " = " + (preResult % num));
			return preResult % num;
		}
		return -8989.0; //It will return -8989.0 if anything went wrong in the code
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Programmer:\tEstefan Valencia");
		System.out.println("Course:\t\tCOSC 211, Winter 2021");
		System.out.println("Lab#:\t\t5");
		System.out.println("Due date:\t3-2-2021");
		
		
		System.out.println("\nCalculator is on.");
		
		
		double result = 0;
		//The first try/catch is for the first operation like when the user wants to do this again.
		//After the first try/catch it goes down to another while loop which is for the rest of the user inputs
		//or until the user types "r"
		do {
			try {
				System.out.println("Result = 0.0");
				operation = input.nextLine();
				
				result = calculate(operation, 0);
				System.out.println("Updated result = " + result); 
				
			} catch (UnknownOperatorException e) {	
				System.out.println(operation.trim().substring(0, 1) + " is not an operator.");
				
			} catch (NumberFormatException e) {
				System.out.println("\"" + operation.trim().substring(1).trim() + "\" is not a number");
	
			}
			
			do {
				try {
					operation = input.nextLine();
					//If the user types r, to prevent from the catch output from popping up, just break
					if(operation.trim().substring(0, 1).equalsIgnoreCase("r"))
						break;
					
					//Calculate the new result and display the updated result
					result = calculate(operation, result);
					System.out.println("Updated result = " + result); 
					
				} catch (UnknownOperatorException e) {
					System.out.println(operation.trim().substring(0, 1) + " is not an operator.");
					
				} catch (NumberFormatException e) {
					System.out.println("\"" + operation.trim().substring(1).trim() + "\" is not a number");
		
				}
				
				
			}while(!operation.equalsIgnoreCase("r"));
			
			System.out.println("final result = " +result);
			
			//if you want to do this again, just type in y
			System.out.println("Again? (y/n)");
			doAgain = input.nextLine();
			
		}while(doAgain.equalsIgnoreCase("y"));
	}

}

/** Desired Output
		Programmer:	Estefan Valencia
		Course:		COSC 211, Winter 2021
		Lab#:		5
		Due date:	3-2-2021
		
		Calculator is on.
		Result = 0.0
		+3
		result + 3.0 = 3.0
		Updated result = 3.0
		-5
		result - 5.0 = -2.0
		Updated result = -2.0
		*        7
		result * 7.0 = -14.0
		Updated result = -14.0
		  /      5
		result / 5.0 = -2.8
		Updated result = -2.8
		r
		final result = -2.8
		Again? (y/n)
		y
		Result = 0.0
		+ 20.0
		result + 20.0 = 20.0
		Updated result = 20.0
		a 3
		a is not an operator.
		 *   2
		result * 2.0 = 40.0
		Updated result = 40.0
		- bad
		"bad" is not a number
		-  7
		result - 7.0 = 33.0
		Updated result = 33.0
		*  2
		result * 2.0 = 66.0
		Updated result = 66.0
		%   4
		result % 4.0 = 2.0
		Updated result = 2.0
		*+3
		result * 3.0 = 6.0
		Updated result = 6.0
		**3
		"*3" is not a number
		R
		final result = 6.0
		Again? (y/n)
		N
**/
