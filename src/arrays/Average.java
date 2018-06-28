package arrays;

public class Average {
	
	public double averageFunc(int[] arr) {
		int sum = 0;
		double average;
		int i;
				
		for (i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		average = (double) sum / arr.length;
		return average;
	}
}
