/*
 * Name: Estefan Valencia
 * Project description: This program has methods for whichever option the user picks in the TestSLL.java program
 * Course: COSC 211, Winter 2021
 * Lab#: 9
 * Due date: 04/13/21 @ 2:59pm
 */
public class SinglyLinkedList {
	// data members
		private Node head;
		private int count = 0;
		
		// constructor
		public SinglyLinkedList() {
			head = null;
		}
		
		// add a node at the beginning of the linked list
		public void addFirst (int value) {
			head = new Node (value,head);
		}
		
	/*
		// remove the first node from the list 
		// this method assumes the node class is not an inner class
		public boolean removeFirst () {
			// is list empty?
			if (head == null)
				return false;
			head = head.getNext();
			return true;
			
		}
	*/
   
		// remove the first node from the list (inner Node class)
		public boolean removeFirst () {
			// is list empty?
			if (head == null)
				return false;
			head = head.next;
			return true;
			
		}		
			
		
		// add to the end of list
	/*
		public void addLast (int value) {
			
			// is list empty
			if (head == null)
				addFirst(value);
			else {
				Node current = head;
				while (current.getNext() != null) 
					current = current.getNext();
				current.setNext( new Node(value));
			}
			
		}
	*/
			
		// add to the end of list (inner Node class)
		public void addLast (int value) {
			
			// is list empty
			if (head == null)
				addFirst(value);
			else {
				Node current = head;
				while (current.next != null) 
					current = current.next;
				current.next = new Node(value);
			}
			
		}
		
	
	/*
		// output the list
		public void print () {
			Node current = head;
			while (current != null) {
				// grab the value and print it
				System.out.print(current.getData() + "  ");
				
				// advance to the next node
				current = current.getNext();
			}
		}
	*/
		
		// output the list (inner Node class)
		public void print () {
			Node current = head;
			while (current != null) {
				// grab the value and print it
				System.out.print(current.data + "  ");
				
				// advance to the next node
				current = current.next;
			}
		}
		
	
	/*
		// search the list for a target value. Return true
		// if target is in the list, and false otherwise
		public boolean find (int target) {
			Node current = head;
			while (current != null) {
				if (current.getData() == target)
					return true;
				current = current.getNext();
			}
			return false;
		}	
	*/	
		
		// search the list for a target value. Return true
		// if target is in the list, and false otherwise (inner Node class)
		public boolean find (int target) {
			Node current = head;
			while (current != null) {
				if (current.data == target)
					return true;
				current = current.next;
			}
			return false;
		}
		
		
		public int size() {
			Node current = head;
			//make variable to count how many times it goes through
			int count = 0;
			while (current != null) {
				//increment the count variable
				count++;
				// advance to the next node
				current = current.next;
			}		
			
			return count;
		}
		
		public String toString() {
			Node current = head;
			String list1 = "[";
			int count = 0;
			
			while (current != null) {
				count++;
				// if there is only one int in the list or if you've reached the end of the list, add the data in the current node
				// else add the current data in the node followed by a comma
				if(size() == 1 || count == size())
					list1 += current.data;
				else
					list1 += current.data + ", ";
				// advance to the next node
				current = current.next;
				
			}
			
			return list1 + "]";
		}
		
		public boolean removeLast() {
			Node current = head;
			
			//if the head has no int, return false
			if (head == null)
				return false;
			
			//if there is no int in the next node, return false
			if (head.next == null)
				return false;
			
			//while the node after the next node isn't null, advance to the next node
			while(current.next.next != null)
				current = current.next;
			
			// then make the node after the next node null
			current.next = null;
			
			
			return true;
		}
		
		
		public void increment (int n) {
			Node current = head;
			
			//add n to the current node while it isn't null
			while(current != null) {
				current.data += n;
				
				// advance to the next node
				current = current.next;
			}
			
			
		}
		
		public void printBackward() {
			Node current = head;
			int index = size();
			
			// decrease index by the amount of times
			// we have gone through this method
			if(count != 0) {
				for(int i = 0; i<count; i++) {
					index -= 1;
				}
			}
			
			// go to the next node by how big the size of the list is
			if(index != 0) {
				for(int i = 1; i<index; i++) {
					current = current.next;
				}
			}
			
			
			
			if(index > 0 && current != null) {
				// increase the amount of times this method has been ran by 1
				count++;
				
				// print the current data
				System.out.print(current.data + "  ");
				
				//recursively call the method
				printBackward();
			}
			
		}
		
		public String average() {
			Node current = head;
			double avg = 0;
			int count = 0;
			if(head == null) {
			  return "Empty";
			}
			while(current != null) {
			  count += 1;
			  avg += current.data;
			  
			  current = current.next;
			}
			avg = avg/count;
			avg = Math.round(avg * 100.0)/100.0;
			return "avg: " + avg;
		}
		
		
		/**
		* Title: Node (Node.java)
		* Description: Defines a class that represents a Node 
		* 
		* @author COSC 211, Winter '21
		* @version 3-30-21
		*/
		
		 private static class Node {      // static means can't access the data members of outer class
			private int data;
			private Node next;
			
			// constructors
			public Node (int item) {
				this (item, null);
			}
			
			public Node (int item, Node link) {
				data = item;
				next = link;
			}
			
			
			public String toString() {
				return ""+ data;
			}
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
