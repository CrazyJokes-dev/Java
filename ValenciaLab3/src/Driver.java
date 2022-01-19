/*
 * Name: Estefan Valencia
 * Project description: The program asks you to enter text for 2 Email Objects and 2 File Objects then displays which of them
 * 						has the keyword "Java" in them
 * Course: COSC 211, Winter 2021
 * Lab#: 3
 * Due date: 02/09/21 @ 2:59pm
 */


import java.util.Scanner;
public class Driver {

	public static boolean contains(Document doc, String target) {
		if(doc.toString().indexOf(target, 0) >= 0)
			return true;
		else
			return false;
		}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Programmer:\tEstefan Valencia");
		System.out.println("Course:\t\tCOSC 211, Winter 2021");
		System.out.println("Lab#:\t\t3");
		System.out.println("Due date:\t2-9-2021");
		
		
		////Set the sender, recipient, title, and message for Email 1
		System.out.print("\nSender: ");
		String eSender1 = input.nextLine();
		
		
		System.out.print("Recipient: ");
		String eRecipient1 = input.nextLine();
		
		
		System.out.print("Title: ");
		String eTitle1 = input.nextLine();
		
		
		System.out.print("message: ");
		String eMessage1 = input.nextLine();
		
		//Create the first Email object
		Email e1 = new Email(eSender1, eRecipient1, eTitle1, eMessage1);
		e1.setSender(eSender1);
		e1.setRecipient(eRecipient1);
		e1.setTitle(eTitle1);
		
		
		
		
		////Set the sender, recipient, title, and message for Email 2
		System.out.print("\nSender: ");
		String eSender2 = input.nextLine();
		
		
		System.out.print("Recipient: ");
		String eRecipient2 = input.nextLine();
		
		
		System.out.print("Title: ");
		String eTitle2 = input.nextLine();
		
		
		System.out.print("message: ");
		String eMessage2 = input.nextLine();
		
		//Create the 2nd Email object
		Email e2 = new Email(eSender2, eRecipient2, eTitle2, eMessage2);
		e2.setSender(eSender2);
		e2.setRecipient(eRecipient2);
		e2.setTitle(eTitle2);
		
		
		
		////set the File contents for File Object 1
		System.out.print("\n\nPathname: ");
		String pathname1 = input.nextLine();
		
		System.out.print("File contents: ");
		String fileContents1 = input.nextLine();
		
		File f1 = new File(pathname1, fileContents1);
		f1.setPathname(pathname1);
		
		
		
		////set the File contents for File Object 2
		System.out.print("\nPathname: ");
		String pathname2 = input.nextLine();
		
		System.out.print("File contents: ");
		String fileContents2 = input.nextLine();
		
		File f2 = new File(pathname2, fileContents2);
		f2.setPathname(pathname2);
		
		
		
		System.out.println("\n\nWhich object contains Java?");
		
		//check each object for the word "Java"
		if(contains(e1, "Java")) 
			System.out.println("e1");
		
		if(contains(e2, "Java"))
			System.out.println("e2");
		
		if(contains(f1, "Java"))
			System.out.println("f1");
		
		if(contains(f2, "Java"))
			System.out.println("f2");
		
	}

}
/**
 * Desired output of the program:
    Programmer:	Estefan Valencia
	Course:		COSC 211, Winter 2021
	Lab#:		3
	Due date:	2-9-2021
	
	Sender: Tom
	Recipient: Edward
	Title: something awesome
	message: Yo, I just saw the coolest thing just now bro.
	
	Sender: Speedy
	Recipient: Gonzales
	Title: races
	message: This Java message is about running refrigerator races
	
	Pathname: input.txt
	File contents: Use Scanner to read from a Java text file
	
	Pathname: run.txt
	File contents: the name of participants in the last 10 refrigerator races
	
	Which object contains Java?
	e2
	f1
**/
