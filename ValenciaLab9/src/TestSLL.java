/*
 * Name: Estefan Valencia
 * Project description: This program has asks the user for which option they would like to use and calls the method
 * Course: COSC 211, Winter 2021
 * Lab#: 9
 * Due date: 04/13/21 @ 2:59pm
 */


import java.io.*;
import java.util.*;

public class TestSLL {
	private static SinglyLinkedList list = new SinglyLinkedList();
    private static Scanner keyboard = new Scanner (System.in);

	/**
	 * Creates a list, then repeatedly prints the menu and does what
	 * the user asks until they quit.
	 */
    public static void main(String[] args)throws IOException{
    	heading();
        printMenu();
        int choice = keyboard.nextInt();
        while (choice != 0){
           dispatch(choice);
           printMenu();
           choice = keyboard.nextInt();
        }
    }


	/**
	 * Does what the menu item calls for.
	 */
    public static void dispatch(int choice)throws IOException
    {
        int newVal;
        switch(choice){
            case 0:
                System.out.println("Bye!");
                break;

            case 1:    //add to the front
                System.out.print("Enter an integer to add to the front: ");
                newVal = keyboard.nextInt();
                list.addFirst(newVal);
                break;

            case 2:  //remove from the front
                if (list.removeFirst())
                  System.out.println("First value is removed");
                break;

            case 3:  //print
                list.print();
                break;
                
            case 4:  //add to the end
            	System.out.print("Enter integer to add to the end: ");
                newVal = keyboard.nextInt();
                list.addLast(newVal);
                break;
                
            case 5:  //search the list
            	System.out.print("Enter the target value: ");
                newVal = keyboard.nextInt();
                if (list.find(newVal))
                	System.out.println(newVal + " is in the list");
                else
                	System.out.println(newVal + " is not in the list");
                break;
            
            case 6: // print size of list
            	System.out.println(list.size());
            	break;
                
            case 7:
            	System.out.println(list.toString());
            	break;
            	
            case 8:
            	list.removeLast();
            	break;
            	
            case 9:
            	System.out.print("Increment by how many: ");
            	newVal = keyboard.nextInt();
            	list.increment(newVal);
            	break;
            	
            case 10:
            	list.printBackward();
            	break;
            	
            case 11:
            	System.out.println(list.average());
            	break;
            	
            default:
                System.out.println("Sorry, invalid choice");
            }
    }

	/**
	 *  Prints the user's choices
	 */
    public static void printMenu()
    {
        System.out.println("\n   Menu   ");
        System.out.println("   ====");
        System.out.println("0: Quit");
        System.out.println("1: Add an integer to the front of the list");
        System.out.println("2: Remove an integer from the front of the list");
        System.out.println("3: Print the list");
        System.out.println("4: Add an integer to the end of the list");
        System.out.println("5: Search for a value in the list");
        System.out.println("6: Print the size of the list");
        System.out.println("7: Print the list in a string");
        System.out.println("8: Remove the last");
        System.out.println("9: Increment each element of the list");
        System.out.println("10: Print the list backwards");
        System.out.println("11: Get average of list");
        
        System.out.print("\nEnter your choice: ");
    }
    
    /**
	 *  Prints the output heading
	 */
 	public static void heading() {
 		System.out.println("Programmer:        Estefan Valencia");
 		System.out.println("Course:            COSC 211, Winter 2021");
 		System.out.println("Lab:           	   9");
 		System.out.println("Due date:          4-13-21\n");
 	}

}
/** desired output
Programmer:        Estefan Valencia
Course:            COSC 211, Winter 2021
Lab:			   9
Due date:          4-13-21


   Menu   
   ====
0: Quit
1: Add an integer to the front of the list
2: Remove an integer from the front of the list
3: Print the list
4: Add an integer to the end of the list
5: Search for a value in the list
6: Print the size of the list
7: Print the list in a string
8: Remove the last
9: Increment each element of the list
10: Print the list backwards

Enter your choice: 6
0

   Menu   
   ====
0: Quit
1: Add an integer to the front of the list
2: Remove an integer from the front of the list
3: Print the list
4: Add an integer to the end of the list
5: Search for a value in the list
6: Print the size of the list
7: Print the list in a string
8: Remove the last
9: Increment each element of the list
10: Print the list backwards

Enter your choice: 1
Enter an integer to add to the front: 12

   Menu   
   ====
0: Quit
1: Add an integer to the front of the list
2: Remove an integer from the front of the list
3: Print the list
4: Add an integer to the end of the list
5: Search for a value in the list
6: Print the size of the list
7: Print the list in a string
8: Remove the last
9: Increment each element of the list
10: Print the list backwards

Enter your choice: 1
Enter an integer to add to the front: 20

   Menu   
   ====
0: Quit
1: Add an integer to the front of the list
2: Remove an integer from the front of the list
3: Print the list
4: Add an integer to the end of the list
5: Search for a value in the list
6: Print the size of the list
7: Print the list in a string
8: Remove the last
9: Increment each element of the list
10: Print the list backwards

Enter your choice: 3
20  12  
   Menu   
   ====
0: Quit
1: Add an integer to the front of the list
2: Remove an integer from the front of the list
3: Print the list
4: Add an integer to the end of the list
5: Search for a value in the list
6: Print the size of the list
7: Print the list in a string
8: Remove the last
9: Increment each element of the list
10: Print the list backwards

Enter your choice: 10
12  20  
   Menu   
   ====
0: Quit
1: Add an integer to the front of the list
2: Remove an integer from the front of the list
3: Print the list
4: Add an integer to the end of the list
5: Search for a value in the list
6: Print the size of the list
7: Print the list in a string
8: Remove the last
9: Increment each element of the list
10: Print the list backwards

Enter your choice: 1
Enter an integer to add to the front: 100

   Menu   
   ====
0: Quit
1: Add an integer to the front of the list
2: Remove an integer from the front of the list
3: Print the list
4: Add an integer to the end of the list
5: Search for a value in the list
6: Print the size of the list
7: Print the list in a string
8: Remove the last
9: Increment each element of the list
10: Print the list backwards

Enter your choice: 7
[100, 20, 12]

   Menu   
   ====
0: Quit
1: Add an integer to the front of the list
2: Remove an integer from the front of the list
3: Print the list
4: Add an integer to the end of the list
5: Search for a value in the list
6: Print the size of the list
7: Print the list in a string
8: Remove the last
9: Increment each element of the list
10: Print the list backwards

Enter your choice: 8

   Menu   
   ====
0: Quit
1: Add an integer to the front of the list
2: Remove an integer from the front of the list
3: Print the list
4: Add an integer to the end of the list
5: Search for a value in the list
6: Print the size of the list
7: Print the list in a string
8: Remove the last
9: Increment each element of the list
10: Print the list backwards

Enter your choice: 7
[100, 20]

   Menu   
   ====
0: Quit
1: Add an integer to the front of the list
2: Remove an integer from the front of the list
3: Print the list
4: Add an integer to the end of the list
5: Search for a value in the list
6: Print the size of the list
7: Print the list in a string
8: Remove the last
9: Increment each element of the list
10: Print the list backwards

Enter your choice: 9
Increment by how many: 10

   Menu   
   ====
0: Quit
1: Add an integer to the front of the list
2: Remove an integer from the front of the list
3: Print the list
4: Add an integer to the end of the list
5: Search for a value in the list
6: Print the size of the list
7: Print the list in a string
8: Remove the last
9: Increment each element of the list
10: Print the list backwards

Enter your choice: 7
[110, 30]

   Menu   
   ====
0: Quit
1: Add an integer to the front of the list
2: Remove an integer from the front of the list
3: Print the list
4: Add an integer to the end of the list
5: Search for a value in the list
6: Print the size of the list
7: Print the list in a string
8: Remove the last
9: Increment each element of the list
10: Print the list backwards

Enter your choice: 0

 
 */ 
