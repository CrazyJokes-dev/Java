/*
 * Name: Estefan Valencia
 * Project description: This program allows you to put in a file name and write a specified number of integers to that file
 * Course: COSC 211, Winter 2021
 * Lab#: 6
 * Due date: 03/16/21 @ 2:59pm
 */


import java.io.*;
import java.util.*;
public class fileWriteInt {
	private static String doAgain ="no";

	public static void main(String[] args) throws FileNotFoundException {
		Scanner input = new Scanner(System.in);
		System.out.println("Programmer:\tEstefan Valencia");
		System.out.println("Course:\t\tCOSC 211, Winter 2021");
		System.out.println("Lab#:\t\t6");
		System.out.println("Due date:\t3-16-2021");
		
		//Declare PrintWriter object outside of loop so I can actually close the object and not have it break
		PrintWriter fout = null;
		
		do {
			//Ask for the file name
			System.out.print("\nEnter an output file name: ");
			String fileName = input.next();
			fout = new PrintWriter(fileName);
			
			//Ask user for the amount of numbers that will be written into the file
			System.out.print("How many numbers to write in the file? ");
			int amountNum = input.nextInt();
			
			//create the Random object
			Random rand = new Random();
			
			//Write the requested amount of random numbers into the file
			for(int i = 1; i < amountNum+1; i++) {
				fout.print((rand.nextInt(1000) + 1) + "\t");
				
				//if "i" is divisible by 5 then create a new line
				if(i % 5 == 0)
					fout.print("\n");
			}
			
			//Ask if they want to do it again
			System.out.print("\nDo it again, yes (or no)? ");
			doAgain = input.next();
			
			fout.flush();
			
			
		}while(doAgain.equalsIgnoreCase("yes"));
		
		fout.close();
	}

}
/** Desired Output
	
Programmer:	Estefan Valencia
Course:		COSC 211, Winter 2021
Lab#:		6
Due date:	3-16-2021
	
Enter an output file name: Lab6A.txt
How many numbers to write in the file? 17

Do it again, yes (or no)? YES
	
Enter an output file name: Lab6B.txt
How many numbers to write in the file? 21

Do it again, yes (or no)? nO

 */
/*  THE CONTENTS OF EACH DATA FILE  


Lab6A.txt
266	581	574	948	588	
757	447	531	2	304	
387	709	347	626	635	
738	499	

Lab6B.txt
767	205	724	827	702	
777	636	354	466	668	
1	811	841	350	389	
769	403	398	895	223	
661	


 */
