package arrays;

import java.util.Arrays;

public class MaxStream {
	public int maxStreamFunc(int[] arr) {
		return Arrays.stream(arr).max().getAsInt();
	}
}
