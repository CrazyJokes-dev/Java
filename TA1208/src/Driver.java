

public class Driver {

	public static void main(String[] args) {
		Queue queue = new Queue();
		
		Person name1 = new Person("Max", "King");
		queue.enqueue(name1);
		
		queue.enqueue(new Person("Jason", "Mraz"));
		
		Person name3 = new Person("Carlos", "Enrique");
		queue.enqueue(name3);
		
		Person name4 = new Person("Mike", "Tyson");
		queue.enqueue(name4);
		
		Person name5 = new Person("Alex","Botox");
		queue.enqueue(name5);
		
		Person name6 = new Person("Avian", "Bird");
		queue.enqueue(name6);
		
		Person name7 = new Person("Mckenzie", "Jackson");
		queue.enqueue(name7);
		
		Person name8 = new Person("Tami", "Dice");
		queue.enqueue(name8);
		
		Person name9 = new Person("Dwayne", "Johnson");
		queue.enqueue(name9);
		
		Person name10 = new Person("Robert", "Downey");
		queue.enqueue(name10);
		
		queue.printArray();
		
		System.out.println("");
		int size = queue.getSize();
		for(int i = 0; i<size; i++) {
			System.out.println(queue.dequeue());
		}
		
		
	}

}
