
public class ReverseMethod {
	
	/** MY ANSWER **/
	/*public static boolean isReverse(int[] arr1, int[] arr2) {
		boolean result = true;
		
		//for(int i = 0; i<arr1.length/2; i++) {
		//	int temp = arr1[i];
		//	arr1[i] = arr1[arr1.length-i-1];
		//	arr1[arr1.length-i-1] = temp;
	    //}
		
		for(int i = 0; i<arr1.length; i++) {
			if(arr1[i] != arr2[arr2.length-1-i]) {
				result = false;
				break;
			} else {
				result = true;
			}
		}
		return result;
	}
	*/
	/** The Official Answer **/
    public static boolean isReverse(int a[], int b[]) {
        int k = 0;
        for (; k < a.length && a[k] == b[a.length - 1 - k]; k++);
        return k == a.length;
      }
	
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4, 5};
		int[] b = {5, 3, 3, 2, 1};
		
		
		System.out.println(isReverse(a, b));

	}

}
