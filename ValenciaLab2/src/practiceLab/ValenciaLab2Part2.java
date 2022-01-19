package practiceLab;
/*
 * Name: Estefan Valencia
 * Project description: The program finds the prime numbers(2 to 100) and finds the corresponding Mersenne prime
 * Course: COSC 211, Winter 2021
 * Lab#: 2, part 2
 * Due date: 02/02/21 @ 2:59pm
 */
import java.math.BigInteger;
import java.util.*;
public class ValenciaLab2Part2 {

	//is the number prime?
	public static boolean isPrime(BigInteger num) {
		if(num.compareTo(BigInteger.ONE) == 0 || num.compareTo(new BigInteger("2")) == 0) {
			return true;
		}
		
		// A number half as big as the original number
		BigInteger halfNum = num.divide(new BigInteger("2"));
		
		for(BigInteger divisor = new BigInteger("2"); divisor.compareTo(halfNum) <= 0; divisor = divisor.add(BigInteger.ONE)) {
			if(num.remainder(divisor).equals(BigInteger.ZERO)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		// display output heading
		System.out.println("Programmer: Estefan Valencia");
		System.out.println("Course:     COSC 211, Winter 2021");
		System.out.println("Lab#:       2, part 2");
		System.out.println("Due date:   2-2-2021 by 2:59pm");
		
		// display p and (2^p -1) along with the dashed line
		System.out.print("\np\t\t2^p - 1");
		System.out.print("\n--------------------------");
		
		// list the prime numbers
		for(int number = 2; number <= 100; number++)  {
			BigInteger TWO = new BigInteger("2");
			
			//do the math with (2^p - 1) if number is prime
			if(isPrime(new BigInteger(Integer.toString(number))) == true) {
				System.out.print("\n" +number+ "\t\t" + (TWO.pow(number)).subtract(BigInteger.ONE) );
			}
		}
		
	}

}
/**
 *  Desired output of program

Programmer: Estefan Valencia
Course:     COSC 211, Winter 2021
Lab#:       2, part 2
Due date:   2-2-2021 by 2:59pm

p		2^p - 1
--------------------------
2		3
3		7
5		31
7		127
11		2047
13		8191
17		131071
19		524287
23		8388607
29		536870911
31		2147483647
37		137438953471
41		2199023255551
43		8796093022207
47		140737488355327
53		9007199254740991
59		576460752303423487
61		2305843009213693951
67		147573952589676412927
71		2361183241434822606847
73		9444732965739290427391
79		604462909807314587353087
83		9671406556917033397649407
89		618970019642690137449562111
97		158456325028528675187087900671 

 */