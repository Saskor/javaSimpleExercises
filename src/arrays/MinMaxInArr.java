package arrays;

public class MinMaxInArr {
	public int[] minMaxFunc(int[] arr) {
		int minMaxArr[] = new int [2];
		int min, max;
		min = max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		minMaxArr[0] = min;
		minMaxArr[1] = max;
		
		return minMaxArr;
	}
}
