
public class PreTest {
	
	/* Question 1:
	 * Given an input array of integer number (can be represented by 32 bits),
	 * write code to find maximum number and return its index;
	 * if there is more than one number exist, return the largest index. 
	 */
	static int question1(int[] arr) {
		int index = -1;
		int max = arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>=max) {
				max = arr[i];
				index = i;
			}
		}
		return index;
	}
	
	/* Question 2:
	 * Given an input array that have been sorted with ascending order,
	 * write code to find if a target number eist in the array,
	 * and return its index if exist, return -1 if not;
	 * if there is more than one number exist, return the smallest index.
	 * (note: time complexity should be less than O(n))
	 */
	static int question2(int target, int[] arr) {
		return binarySearch(arr, arr[0], arr[arr.length-1], target);
	}
	
	/* Question 3:
	 * Given a target number, and find if there are two different
	 * numbers in integer array that the sum equals the target.
	 */
	static boolean question3(int target, int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					if(arr[i]+arr[j]==target) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	// Binary search used in question 2
	static int binarySearch(int[] array, int start, int end, int value) {
		if(end>=start) {
			int mid = (start+end)/2;
			if(array[mid]==value)
				return mid;
            if(array[mid]>value)
            	return binarySearch(array, start, mid-1, value);
            return binarySearch(array, mid+1, end, value);
		}
        return -1;
	}
}
