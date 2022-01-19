/*
 * Name: Estefan Valencia
 * Project description: This program displays integers from any existing file that the user wants in ascending order
 * Course: COSC 211, Winter 2021
 * Lab#: 6
 * Due date: 03/16/21 @ 2:59pm
 */


import java.io.*;
import java.util.*;
public class ReadIntFromFile {
	private static boolean repeat = false;
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Programmer:\tEstefan Valencia");
		System.out.println("Course:\t\tCOSC 211, Winter 2021");
		System.out.println("Lab#:\t\t6");
		System.out.println("Due date:\t3-16-2021");
		
		do {
		
			//Ask user for name of file he wants to read from
			System.out.print("\nEnter an input file name: ");
			String fileName = input.nextLine();
			
			
			//create a File object inside of Scanner
			//Also make a try/catch loop
			try(Scanner file = new Scanner(new File(fileName))) {
				
				//Put the contents of file into an ArrayList to be sorted
				ArrayList<Integer> fileContents = new ArrayList<Integer>();
				while(file.hasNext()) {    //If file has another integer, then continue the loop
					fileContents.add(file.nextInt());    //Add the next integer in the file to the ArrayList
				}	
				
				//Sort the ArrayList contents
				Collections.sort(fileContents);
				
				//Print the contents by 5 on each line
				for(int i = 1; i < fileContents.size()+1; i++) {
					System.out.print(fileContents.get(i-1) + "\t");
					
					if(i % 5 == 0)
						System.out.println("\n");
				}
				
				repeat = false;
				file.close();
			}
			
			catch(FileNotFoundException ex) {
				System.out.println("Sorry but there isn't any file with the name you put in. Please try again.\n");
				repeat = true;
			}
		
			
			
		} while(repeat == true);   //Repeat if the code displayed the catch loop
		
		
	}

}
/** Desired Output

Programmer:	Estefan Valencia
Course:		COSC 211, Winter 2021
Lab#:		6
Due date:	3-16-2021

Enter an input file name: Lab6C.txt
Sorry but there isn't any file with the name you put in. Please try again.


Enter an input file name: Lab6CC.txt
Sorry but there isn't any file with the name you put in. Please try again.


Enter an input file name: Lab6A.txt
2	266	304	347	387	

447	499	531	574	581	

588	626	635	709	738	

757	948	


(SECOND RUN)
Programmer:	Estefan Valencia
Course:		COSC 211, Winter 2021
Lab#:		6
Due date:	3-16-2021

Enter an input file name: Lab6B.txt
1	205	223	350	354	

389	398	403	466	636	

661	668	702	724	767	

769	777	811	827	841	

895	

 */

