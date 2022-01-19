package practiceLab;
/*
 * Name: Estefan Valencia
 * Project description: The program asks you to enter a sentence and returns the number of characters and words, the longest word,
 * 						and sorts the sentence
 * Course: COSC 211, Winter 2021
 * Lab#: 2, part 1
 * Due date: 02/02/21 @ 2:59pm
 */

import java.util.Arrays;
import java.util.Scanner;
public class ValenciaLab2Part1 {
	private static String doAgain;
	
	/**
	 * 
	 * @param str the line of text the user entered
	 * @return the length of the array
	 */
	public static int numOfWords(String str) {
		//split the sentence into an array
		String[] num = str.split("\\s");
		
		return num.length;
	}
	
	/**
	 * 
	 * @param str the line of text the user entered
	 * @return the longest word in the array
	 */
	public static String longestWord(String str) {
		// split the sentence into an array
		String[] numWords = str.split("\\s");
		String longest = "";
		
		// search the array for the longest word
		for(int i = 0; i<numWords.length; i++) {
			if(longest.length() < numWords[i].length())
				longest = numWords[i];
		}
		
		return longest;
	}

	/**
	 * 
	 * @param str the line of text the user entered
	 */
	public static void printWordsAscending(String str) {
		//split the sentence into an array
		String[] words = str.split("\\s");
		
		//sort the array into ascending order
		System.out.print("\nWords in ascending order: ");
		Arrays.sort(words); 
		for(String arr: words) {
			System.out.print(arr + " ");
		}
		
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// display output heading
		System.out.println("Programmer: Estefan Valencia");
		System.out.println("Course:     COSC 211, Winter 2021");
		System.out.println("Lab#:       2, part 1");
		System.out.println("Due date:   2-2-2021 by 2:59pm");
		
		
		do {
		// ask for a line of text to evaluate
		System.out.print("\nEnter a line of text: ");
		String text = input.nextLine();
		
		
		System.out.print("\nNumber of characters: " +text.length()); //get the length of the string
		System.out.print("\nNumber of words: " +numOfWords(text)); //get the length of the String array
		System.out.print("\nLongest word: " +longestWord(text)); //get the longest word in the String array
		printWordsAscending(text); // display the sorted String array
		
		// ask if you want to do it again
		System.out.print("\n\nDo it again, yes (or no)?");
		doAgain = input.nextLine();
		
		} while(doAgain.equalsIgnoreCase("yes"));
		
	}

}
/**
 * Desired output of the program:
    Programmer: Estefan Valencia
	Course:     COSC 211, Winter 2021
	Lab#:       2, part 1
	Due date:   2-2-2021 by 2:59pm
	
	Enter a line of text: Hello to all
	
	Number of characters: 12
	Number of words: 3
	Longest word: Hello
	Words in ascending order: Hello all to 
	
	Do it again, yes (or no)?Yes
	
	Enter a line of text: I like pumpkin pie a lot
	
	Number of characters: 24
	Number of words: 6
	Longest word: pumpkin
	Words in ascending order: I a like lot pie pumpkin 
	
	Do it again, yes (or no)?no
**/

