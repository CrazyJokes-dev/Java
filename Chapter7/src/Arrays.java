import java.util.Random;

public class Arrays {

	public static void changeArray(int[] arr) {
		arr[0] = 1000;
	}
	
	public static void printArray(int[] arr) {
		for(int el : arr)
			System.out.print(el + " ");
		System.out.println();
	}
	
	public static void copyArray(int[] arr, int increaseTimesX) {
		int[] copy = new int[arr.length];
	}
	
	public static void main(String[] args) {
		
		int[] array = new int[5];
		array[0] = 8;
		array[1] = 11;
		array[2] = 5;
		
		System.out.println(array[0]);
		array[3] = 7;
		array[4] = 1;
		
		array[2] = 9;
		
		//for()
		
		char[] randomChars = new char[10];
		Random r = new Random();
		
		
		for(int i = 0; i<randomChars.length; i++) {
			char randomChar = (char) (Math.random()* 26);
			randomChars[i] = randomChar;
		}
		
		System.out.println("random chars:");
		for(char ch : randomChars)
			System.out.println(ch);
		//System.out.println("ASCII code for a is " + (int)'a');
		
		changeArray(array);
		printArray(array);
		
		int[] quickArr = {5, 2, -1, 55};
		
		int[] copyOfQuickArr = new int[quickArr.length];
		
		for(int i=0; i<quickArr.length; i++)
			copyOfQuickArr[i] = quickArr[i];
		printArray(copyOfQuickArr);
		
		copyOfQuickArr[0] = 22;
		boolean same = true;
		
		for(int i = 0; i<quickArr.length; i++)
			if(quickArr[i] != copyOfQuickArr[i]) {
				same = false;
				break;
			}
		System.out.println("same = " + same);
		
		String arg0 = args[0];
		String arg1 = args[1];
		System.out.println("args are: " + arg0 + " " + arg1);
		
	}

}
