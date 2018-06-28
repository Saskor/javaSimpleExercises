package arrays;

public class SmallestDistanceInArr {
	public int SmallestDistanceCalc(int[] arr) {
		try {
			if(arr.length < 2) {			
				throw new MinDistanceInArrException(arr);
			}
		} catch (MinDistanceInArrException e) {
			System.out.println(e);
			return -1;
		}
		int dif = 0;
		int minDistace;
		int index = 0;
		minDistace = arr[1] - arr[0];
		for (int i = 2; i < arr.length; i++) {
			dif = arr[i] - arr[i-1];
			if (dif > 0 & dif <= minDistace) {
				minDistace = dif;
				index = i-1;
			}
		}
		
		return index;
	}
	
}
