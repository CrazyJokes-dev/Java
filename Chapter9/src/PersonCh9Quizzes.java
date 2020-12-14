
public class PersonCh9Quizzes {

	public static void main(String[] args) {
		//Write the definition of a class Simple//
		/* 
		public class Simple {
		   
		}
		*/
		
		//Write the definitions of two classes Day and Night. Both classes have no constructors, methods or instance variables
		/*
		class Day{}
		class Night{}
		*/
		
		//Write a class named Acc1 containing no constructors, methods, or instance variables
		/* 
		public class Acc1 {}
		*/
		
		//You are given a class named Clock that has one int instance variable called hours. Write a constructor with no parameters for the class Clock.
		/*
		public Clock() {
		hours = 12
		}
		*/
		
		//Write a constructor for the class Clock that takes three parameters -- an int , a boolean , and another int 
		/*
		public Clock (int hours, boolean isTicking, int diff){
			this.hours = hours;
			this.isTicking = isTicking;
			this.diff = new Integer (diff);
		}
		*/
		
		//Write a constructor that takes a reference to an existing Clock object as a parameter and copies that object's instance variables to the object being created.
		/*
		public Clock(Clock c) {
			hours = c.hours;
			isTicking = c.isTicking;
		}
		*/
		
		//Declare a reference variable of type File named myFile
		/*
		File myFile;
		*/
		
		//Declare a variable named myMenu suitable for holding references to Menu objects
		/*
		Menu myMenu;
		*/
	}

}
