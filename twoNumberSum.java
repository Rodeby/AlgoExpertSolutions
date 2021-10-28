import java.util.*;

class Program {
public static int[] twoNumberSum(int[] array, int targetSum) {
	    // Write your code here.
			Arrays.sort(array);
			int[] array2 = new int[array.length];
			int count = 0;
			for(int i = 0; i < array.length; i++) {
				int number = targetSum- array[i];
				
				if(Arrays.binarySearch(array, i+1, array.length, number) > 0) {
					array2[count] = array[i];
					count++;
					array2[count] = number;
					count++;
				}				
			}
			int[] solution = new int[count];
			
			for(int i = 0; i < count;i++) {
				solution[i] = array2[i];
			}
	
	    return solution;
	  }
}
