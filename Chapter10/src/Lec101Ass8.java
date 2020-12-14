import java.util.Scanner;

public class Lec101Ass8 {
	
	public static int findMax(int[] arr, int size) {
		int max = arr[0];
		for(int num : arr) {
			if(num > max) {
				max = num;
			}
			
		}
		
		return max;
	}
	
	
    public static void main (String args[]) {
    	/*
    	Scanner kbd = new Scanner (System.in);
        int[] x = new int[5];  
        int[] y = new int[5];
       
       
        System.out.println("Enter 5 pairs of ints and we will tell you if they are equivalent:");
       
        for (int i = 0; i<5; i++) {
            x[i] = kbd.nextInt();
            y[i] = kbd.nextInt();
        }

        boolean equiv;
        equiv = true;
        for(int i = 0; i<x.length; i++) {
        	if(x[i] == y[i]) {
        		equiv = true;
        	}else {
        		equiv = false;
        		break;
        	}	
        }
       
       
        System.out.print(equiv);
        */
    }
}