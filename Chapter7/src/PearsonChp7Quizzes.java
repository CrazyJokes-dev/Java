
public class PearsonChp7Quizzes {

	public static void main(String[] args) {
		
		/** REVERSING A LOOP **/
		/*
		int[] a = {1, 2, 3, 4, 5};
		int temp;
		int k;
		
		for(int i = 0; i<a.length/2 ;i++) {
			temp = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = temp;
		}
		
		for(int i = 0; i<a.length ;i++) {
			System.out.print(a[i] + " ");
		}
		*/
		
		/** Finding the largest value in an array **/
		/*
		mostTickets = parkingTickets[0];
		for(k=0; k<parkingTickets.length; k++) {
    		if(parkingTickets[k] > mostTickets) {
        			mostTickets = parkingTickets[k];
        			
    		}
		}	
		*/
		
		/** Getting the sum of all numbers in an array **/
		/*
		total = 0;
		for(int i=0; i<x.length; i++) {
    		total += x[i];
		} 
		*/
		
		/** write code that assigns true to isAMember if the value of memberID can be found in currentMembers **/
		/* My Answer 
		isAMember = false;
		for(k = 0; k<currentMembers.length; k++) {
    		if(currentMembers[k] == memberID)
        		isAMember = true;
		}
		*/
		
		/* The OFFICIAL Answer
		
	    // Test if memberID matches a currentMembers[k]. 
	    // In the case of match, the loop exits and k < currentMembers.length.
	    // In the case of no match, k is currentMembers.length 
	    // when the loop exits.
	    for (k = 0; k < currentMembers.length 
	          && memberID != currentMembers[k]; k++);
	    isAMember = k < currentMembers.length;
		*/
		
		/** Write some code that assigns true to "duplicates" if there are two adjacent elements in the array that have the same value **/
		/* My answer 
		duplicates = false;

		for(k = 1; k<zipcodeList.length; k++) {
    		if(zipcodeList[k-1] == zipcodeList[k])
        		duplicates = true;
		}
		*/
		
		/* The OFFICIAL Answer
		duplicates = false;
    	for (k = 0; !duplicates && k < zipcodeList.length - 1; k++)
      		if (zipcodeList[k] == zipcodeList[k + 1])
        		duplicates = true;
		*/
		
		/** Write some code that assigns true to duplicates if any two elements in the array have the same value **/
		/* My answer
		duplicates = false;

		for(k = 0; k<zipcodeList.length; k++) {
    		for(j = 0; j<zipcodeList.length; j++) {
        		if(zipcodeList[k] == zipcodeList[j] && k != j)
            		duplicates = true;
        
    		}
		}
		*/
		
		/* The OFFICIAL Answer
		duplicates = false;
    	for (j = 0; !duplicates && j<zipcodeList.length - 1; j++)
      		for (k = j + 1; !duplicates && k < zipcodeList.length; k++)
        		if (zipcodeList[k] == zipcodeList[j])
          			duplicates = true;
		*/
		
	}

}
