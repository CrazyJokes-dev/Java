

public class Queue {
	private Person[] elements;
	private int size;
	
	
	public Queue() {
		elements = new Person[8];
	}
	
	public void printArray() {
		for(Person p : elements) {
			if(p != null)
				System.out.println(p.getName());
		}
	}
	
	public void enqueue(Person Person) {
		if(size >= elements.length) {
			Person[] tempArr = new Person[elements.length * 2];
			System.arraycopy(elements, 0, tempArr, 0, elements.length);
			elements = tempArr;
			
		}
		elements[size] = Person;
		size++;
	}
	
	public String dequeue() {
		Person p = elements[0];
		
		Person[] tempArr = new Person[elements.length];
		System.arraycopy(elements, 1, tempArr, 0, size);
		elements = tempArr;
		
		size--;
		return p.getName();
	}
	
	public boolean empty() {
		boolean empty = true;
		for(int i = 0; i<elements.length; i++) {
			if(elements[i] != null) {
				empty = false;
				break;
			}else if(elements[i] == null) {
				empty = true;
			}
		}
		
		return empty;
	}
	
	public int getSize() {
		return size;
	}
	
	public static void main(String[] args) {
		

	}

}

