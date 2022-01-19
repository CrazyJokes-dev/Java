/*
 * Name: Estefan Valencia
 * Project description: This program asks you to enter 10 integers and tells you the sum of those integers and
 * 						removes any duplicates that the user entered
 * Course: COSC 211, Winter 2021
 * Lab#: 4
 * Due date: 02/16/21 @ 2:59pm
 */

import java.util.*;
public class lab4 {
	private static boolean doAgain;
	
	/**
	 * 
	 * @param list - Enter an array list
	 * 
	 * print the array that was provided
	 */
	public static void printArray(ArrayList<Integer> list) {
		for(Integer elm: list)
			System.out.print(elm+ " ");
	}
	
	/**
	 * 
	 * @param list - Enter an array list
	 * @return the sum of all the integers added up
	 */
	public static int sum(ArrayList<Integer> list) {
		int sum = 0;
		for(Integer elm: list)
			sum += elm;
		
		return sum;
	}
	
	/**
	 * 
	 * @param list - Enter an array list
	 * 
	 * remove any duplicate numbers in the array list
	 */
	public static void removeDuplicate(ArrayList<Integer> list) {
		for(int i = 0; i<list.size(); i++) {
			for(int k = 0; k<list.size(); k++) {
				if(list.get(i) == list.get(k) && k != i) {
					list.remove(k);
				}	
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Programmer:\tEstefan Valencia");
		System.out.println("Course:\t\tCOSC 211, Winter 2021");
		System.out.println("Lab#:\t\t4");
		System.out.println("Due date:\t2-16-2021");
		
		
		do {
		// Enter the 10 integers
		System.out.print("\nEnter 10 Integers: ");
		ArrayList<Integer> listInt = new ArrayList<>();
		for(int i = 0; i<10; i++)
			listInt.add(input.nextInt());
		
		// Gives you the sum of all 10 integers added up
		System.out.print("sum of 10 Integers: " +sum(listInt));
		
		//Gives you the array without any duplicate numbers
		System.out.print("\nThe Distinct Integers Are: ");
		removeDuplicate(listInt);
		printArray(listInt);
		
		System.out.print("\n\nDo it again, yes (or no)? ");
		String repeat = input.next();
		//if user answers yes, then repeat the loop
		if(repeat.equalsIgnoreCase("yes"))
			doAgain = true;
		else
			doAgain = false;
		}while(doAgain == true);
		
	}
	
	
}
/** Desired Output
		Programmer:	Estefan Valencia
		Course:		COSC 211, Winter 2021
		Lab#:		4
		Due date:	2-16-2021
		
		Enter 10 Integers: 18 5 7 18 6 5 6 18 10 5
		sum of 10 Integers: 98
		The Distinct Integers Are: 18 5 7 6 10 
		
		Do it again, yes (or no)? YES
		
		Enter 10 Integers: 8 15 7 18 7 5 6 8 8 100
		sum of 10 Integers: 182
		The Distinct Integers Are: 15 7 18 5 6 8 100 
		
		Do it again, yes (or no)? no
**/