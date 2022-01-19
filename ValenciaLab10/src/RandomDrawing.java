/*
 * Name: Estefan Valencia
 * Project description: This program makes a generic class and one generic method and proceeds to add and remove elements from 
 * 						an ArrayList of type T and displays them randomly to the user and asks the user if they want it to display again
 * Course: COSC 211, Winter 2021
 * Lab#: 10
 * Due date: 04/20/21 @ 2:59pm
 */

import java.util.ArrayList;
import java.util.Scanner;

public class RandomDrawing<T> implements Cloneable {
	private ArrayList<T> box = new ArrayList<T>();
	private static String doAgain;
	
	public void add(T one) {
		box.add(one);
	}
	
	public boolean isEmpty() {
		
		if(box.isEmpty() == true)
			return true;
		else
			return false;
		
	}
	
	public T drawItem() {
		if(box.isEmpty() == true)
			return null;
		
		int randomInt = (int)(Math.random() * (box.size()-1));
		T ob = box.get(randomInt);
		
		box.remove(randomInt);
		
		return ob;
		
	}
	
	public String toString() {
		//Initialize the String variable so we can add to it later
		String concat = "";
		
		for(int i = 0; i < box.size(); i++) {
			concat += box.get(i) + " "; //add the contents of the box
		}
		return concat;
	}
	
	@SuppressWarnings("unchecked")
	public Object clone() throws CloneNotSupportedException {
		
		//do a deep copy of the object
		RandomDrawing<T> rdClone = (RandomDrawing<T>)super.clone();
		
		rdClone.box = (ArrayList<T>)(box.clone());
		
		return rdClone;
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner input = new Scanner(System.in);
		
		RandomDrawing<String> rdString = new RandomDrawing<String>();
		RandomDrawing<Integer> rdInteger = new RandomDrawing<Integer>();
		
 		System.out.println("Programmer:        Estefan Valencia");
 		System.out.println("Course:            COSC 211, Winter 2021");
 		System.out.println("Lab:           	   10");
 		System.out.println("Due date:          4-20-21\n");
 		
 		//add elements to the string box
		rdString.add("Nancy");
		rdString.add("Cathy");
		rdString.add("Tom");
		rdString.add("David");
		rdString.add("Anna");
		rdString.add("Adam");
		
		//add elements to the integer box
		rdInteger.add(35);
		rdInteger.add(12);
		rdInteger.add(100);
		rdInteger.add(10);
		rdInteger.add(72);
 		
		//Display the contents of the box
 		System.out.print("Contents of the string box (toString method):\n");
		System.out.print(rdString.toString() + "\n\n");
			
		System.out.print("Contents of the integer box (toString method):\n");
		System.out.print(rdInteger.toString() + "\n\n");
			
 		do {
 			//clone both the String and Integer object
 			RandomDrawing<String> rdStrClone = (RandomDrawing<String>) rdString.clone();
 			RandomDrawing<Integer> rdIntClone = (RandomDrawing<Integer>) rdInteger.clone();
 			
 			//draw the elements of the string
 			System.out.print("Drawings of the string box:\n");
			System.out.print(rdStrClone.drawItem() + " ");
			System.out.print(rdStrClone.drawItem() + " ");
			System.out.print(rdStrClone.drawItem() + " ");
			System.out.print(rdStrClone.drawItem() + " ");
			System.out.print(rdStrClone.drawItem() + " ");
			System.out.print(rdStrClone.drawItem() + "\n\n");
			
			//draw the elements of the integer
			System.out.print("Drawings of the integer box:\n");
			System.out.print(rdIntClone.drawItem() + " ");
			System.out.print(rdIntClone.drawItem() + " ");
			System.out.print(rdIntClone.drawItem() + " ");
			System.out.print(rdIntClone.drawItem() + " ");
			System.out.print(rdIntClone.drawItem() + "\n\n");
			
			//ask user if they want to do it again
			System.out.print("Do it again, yes (or no)? ");
			doAgain = input.next();
			System.out.print("\n");
			
 		} while(doAgain.equalsIgnoreCase("yes"));
	}

}
/** Desired Output

Programmer:        Estefan Valencia
Course:            COSC 211, Winter 2021
Lab:           	   10
Due date:          4-20-21

Contents of the string box (toString method):
Nancy Cathy Tom David Anna Adam 

Contents of the integer box (toString method):
35 12 100 10 72 

Drawings of the string box:
Anna Cathy Nancy David Tom Adam

Drawings of the integer box:
35 12 10 100 72

Do it again, yes (or no)? yes

Drawings of the string box:
Cathy Tom David Anna Nancy Adam

Drawings of the integer box:
10 12 100 35 72

Do it again, yes (or no)? yes

Drawings of the string box:
Cathy Nancy David Anna Tom Adam

Drawings of the integer box:
12 100 10 35 72

Do it again, yes (or no)? no


 */ 
