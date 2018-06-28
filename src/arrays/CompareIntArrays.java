package arrays;

import java.io.IOException;

public class CompareIntArrays {
	public int compareIntArraysLength() throws IOException {
		int[][] arrLengthValues = new int[2][];
		for(int i = 0; i < arrLengthValues.length; i++) {
			arrLengthValues[i] = new ArrayInit().intArrInit();			
		}	
		
		int [] a = arrLengthValues[0];
		int [] b = arrLengthValues[1];
		
		if (a.length > b.length) {
			return 1;
		} else if (a.length < b.length) {
			return -1;
		} else {
			return 0;
		}
	}
}
