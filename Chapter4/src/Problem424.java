
public class Problem424 {

	public static void main(String[] args) {
		String city1 = "Detriot";
		String city2 = "Atlanta";
		String city3 = "Los Angeles";
		String hold = " ";
		
		
		
		if (city1.compareTo(city2) > 0) {
			hold = city2;
			city2 = city1;
			city1 = hold;
		}
		if (city2.compareTo(city3) > 0) {
			hold = city3;
			city3 = city2;
			city2 = hold;
		} 
		if (city1.compareTo(city3) > 0) {
			hold = city3;
			city3 = city1;
			city1 = hold;
		}
		
		System.out.println("The three cities in alphabetical order are: " +city1+ " " +city2+ " " +city3);
	}

}
