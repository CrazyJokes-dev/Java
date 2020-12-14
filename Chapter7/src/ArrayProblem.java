
public class ArrayProblem {
	
	public static void printArray(int[] arr) {
		for (int i : arr)
			System.out.print(i + " ");
		System.out.println();
	}
	
	public static void printCharArray(char[] arr) {
		for (char i : arr)
			System.out.print(i + " ");
		System.out.println();
	}
	
	public static int[] count0ccur(char[] input) {
		int[] output = new int[26];
		
		for(char i: input) {
			int n = (int) i;
			output[n-97] += 1;
		}
		
		return output;
		
	}
	
	public static void main(String[] args) {
		//char randomLetter = (char)(97 + Math.random()*27);
		char[] input = new char[(int)(Math.random()*10)];
		
		for(int i=0; i < input.length; i++) {
			input[i] = (char)(97+Math.random()*26);
		}
		
		printCharArray(input);
		printArray(count0ccur(input));
		
		//System.out.println((char)(122));
	}

}
