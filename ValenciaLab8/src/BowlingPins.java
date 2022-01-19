/*
 * Name: Estefan Valencia
 * Project description: This program asks user for the number of rows in a pyramid and displays the pyramid in "*" 
 							and the total number of "*" in the pyramid
 							
 * Course: COSC 211, Winter 2021
 * Lab#: 8, Part 1
 * Due date: 04/06/21 @ 2:59pm
 */

import java.util.*;
public class BowlingPins {
	private static int numPins = 0;
	private static String doAgain = "no";
	
	
	// This function will add the row number to the variable "numPins"
	// since the row number is how much pins is in that row
	public static int NumberOfPins(int rows) {
		
		//when the "rows" variable hits 0, return 0
		if(rows > 0) {
			numPins += rows;
			return NumberOfPins(rows-1);  //decrease the initial rows by 1
		} else {
			return 0;  
		}
		
	}
	
	public static void print(int rows) {
		print(rows, 0);
	}
	
	//This function will display the pyramid of * based on how many rows
	private static void print(int rows , int blanks) {
		if(rows > 0) {  //when "rows" hits 0, the pyramid is done and don't do recursion any more
			
			// Print a blank for how many rows left to print
			for(int i = 0; i < rows; i++) {   
				System.out.print(" ");
			}
			
			// Next, print '*' for how many asterisks in each row starting from the first
			for(int i = 0; i < blanks; i++) {
				System.out.print("* ");
			}
			System.out.print("*\n");
			
			print(rows - 1, blanks + 1); // decrease number of rows left by 1, and increase the number of asterisks to print by 1
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Programmer:\tEstefan Valencia");
		System.out.println("Course:\t\tCOSC 211, Winter 2021");
		System.out.println("Lab#:\t\t8, Part 1");
		System.out.println("Due date:\t4-6-2021");
		
		do {
			System.out.print("\nEnter the number of rows in the pyramid: ");
			int numRows = input.nextInt();
			
			//display the pyramid
			print(numRows);  
			
			//determine how many pins there are and display result
			NumberOfPins(numRows);  
			System.out.println("\nNumber of pins in a pyramid with " +numRows+ " rows is: " +numPins);
			
			// ask user if they want to do it again
			System.out.print("Would you like to do it again (yes/no)? ");
			doAgain = input.next();
			
			//clear the "numPins" variable since you don't want the previous run's results with the next run's results
			numPins = 0;
			
		}while(doAgain.equalsIgnoreCase("yes"));
	}

}
/**  DESIRED OUTPUT



Programmer:	Estefan Valencia
Course:		COSC 211, Winter 2021
Lab#:		8 Part 1
Due date:	4-6-2021

Enter the number of rows in the pyramid: 5
     *
    * *
   * * *
  * * * *
 * * * * *

Number of pins in a pyramid with 5 rows is: 15
Would you like to do it again (yes/no)? yes

Enter the number of rows in the pyramid: 7
       *
      * *
     * * *
    * * * *
   * * * * *
  * * * * * *
 * * * * * * *

Number of pins in a pyramid with 7 rows is: 28
Would you like to do it again (yes/no)? nO
	
	
	
 **/ 