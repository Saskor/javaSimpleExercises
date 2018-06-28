package arrays;

public class min_max_in_arr {
	private int min;
	private int max;	
	
	public void min_max(int[] arr) {
		min = max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > arr[i-1]) {
				max = arr[i];
			}
			if (arr[i] < arr[i-1]) {
				min = arr[i];
			}
			System.out.println(min + " " + max);
		}
	}
	
}
