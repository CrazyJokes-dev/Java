package TA1201;

public class Driver {
	
	public static void printStudents(Student[] sArr) {
		for(int i = 0; i<sArr.length; i++) {
			if(sArr[i] != null) {
				System.out.print(sArr[i].getName() + " ");
				sArr[i].getAddress().printMembers();
			} else {
				break;
			}	
		}	
	}

	public static void main(String[] args) {
		Student[] arr = new Student[10];
		
		address maxAddress = new address("574 Troll Ct.", "Brighton", 43117, "USA");
		arr[0] = new Student("Max", maxAddress);
		
		arr[1] = new Student("Karen", new address("208 Line Dr", "South Lyon", 48178, "USA"));
		
		address maryAddress = new address("8970 Vegas St.", "Las Angeles", 37423, "USA");
		arr[2] = new Student("Mary", maryAddress);
		
		arr[3] = new Student("Joe", new address("839 Circle Ct.", "New York City", 47589));
		
		arr[4] = new Student("Susan", new address("728 Farmington Rd.", "Livonia"));
		
		arr[5] = new Student("Alex", new address("1934 Mother St."));
		
		printStudents(arr);
		
	}

}
