import java.util.Scanner;
public class Exercise06_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("﻿Enter time in milliseconds: ");
		long timeInserted = input.nextLong();
		
		System.out.println(convertMillis(timeInserted));
	}
	
	public static String convertMillis(long millis) {
		//In order to find the time, we have to go from smallest to largest
		// Which means we must find seconds first and go on from there
		
		int seconds = (int) (millis / 1000);
			
		int minutes = (int) (seconds / 60);
		seconds -= (minutes*60);
		
		
		
			
		int hours = (int) (minutes / 60);
		minutes -= (hours*60);
			
		
		
		//System.out.println(seconds);
		//System.out.println(minutes);
		//System.out.println(hours);
		
		return hours+ ":" +minutes+ ":" +seconds;
	}
}
