/*
 * Name: Estefan Valencia
 * Project description: This program asks the user for a whole number and returns all the odd numbers starting from that number all the way to 0			
 * Course: COSC 211, Winter 2021
 * Lab#: 8, Part 2
 * Due date: 04/06/21 @ 2:59pm
 */

import java.util.*;
public class displayOddNumbers {
	private static String doAgain = "no";
	
	
	public static void printOdds(int num) { 
		
		// if the first number is even, then only subtract one
		if(num % 2 == 0) {
			num -= 1;
		}
		
		// As long as the number is above or equal to 1,
		// print the number, subtract 2 from it, and execute the method again
		if(num >= 1) {
			System.out.print(num + " ");
			num -= 2;
			printOdds(num);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Programmer:\tEstefan Valencia");
		System.out.println("Course:\t\tCOSC 211, Winter 2021");
		System.out.println("Lab#:\t\t8, Part 2");
		System.out.println("Due date:\t4-6-2021");
		
		
		do {
			// ask user for a whole number
			System.out.print("\nEnter a whole number: ");
			int wholeNum = input.nextInt();
			
			printOdds(wholeNum);
			
			// ask user if they want to do it again
			System.out.print("\nWould you like to do it again (yes/no)? ");
			doAgain = input.next();
			
		}while(doAgain.equalsIgnoreCase("yes"));
			
	}

}

/**  DESIRED OUTPUT


Programmer:	Estefan Valencia
Course:		COSC 211, Winter 2021
Lab#:		8, Part 2
Due date:	4-6-2021

Enter a whole number: 10
9 7 5 3 1 
Would you like to do it again (yes/no)? yes

Enter a whole number: 33
33 31 29 27 25 23 21 19 17 15 13 11 9 7 5 3 1 
Would you like to do it again (yes/no)? NO
	
	
	
 **/ 
