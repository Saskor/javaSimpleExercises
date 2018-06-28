package arrays;

public class SumCharArray {
	public long sumFunc(char[] arr) {
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int item = Character.getNumericValue(arr[i]);
			sum += item; 
		}
		
		return sum;
	}
	public long sumFunc2(char[] arr) {
		long sum = 0;
		for (int i = 0; i < arr.length; i++) {
			int item = arr[i] - 48;
			sum += item; 
		}
		
		return sum;
	}
}
