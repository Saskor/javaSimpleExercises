package arrays;

class MinDistanceInArrException  extends Exception{
	int arrLength;
	MinDistanceInArrException(int[] arr) {
		arrLength = arr.length;
	}
	
	public String toString() {
		return "For calculate min distance, arr must have at lest two elems, now arr have " + arrLength + " elems.";
	}
}
