package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class AverageStream {
	public double averageStreamFunc(int[] arr) {
		
		return Arrays.stream(arr).average().getAsDouble();
	}
}
