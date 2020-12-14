
public class Problem425 {

	public static void main(String[] args) {
		char a = (char)('A' + Math.random()*26);
		char b = (char)('A' + Math.random()*26);
		char c = (char)('A' + Math.random()*26);
		
		int w = (int) (Math.random()*10);
		int x = (int) (Math.random()*10);
		int y = (int) (Math.random()*10);
		int z = (int) (Math.random()*10);
		
		System.out.println("Your random vehicle plate number is: " +a+b+c+w+x+y+z);

	}

}
