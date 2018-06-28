package arrays;

public class QuickSortArr {
	static void qsort(int arr[]) {
		qs(arr,0,arr.length-1);
	}
	private static void qs(int[] arr, int left, int right) {
		int internalLeft, internalRight, pivot, temp;
		internalLeft = left;
		internalRight = right;
		pivot = arr[(left + right) / 2];
		
		do {
			while((arr[internalLeft] < pivot) && (internalLeft < right)) {
				internalLeft++;
			}
			while((arr[internalRight] > pivot) && (internalRight > left)) {
				internalRight--;
			}
			if(internalLeft <= internalRight) {
				temp = arr[internalLeft];
				arr[internalLeft] = arr[internalRight];
				arr[internalRight] = temp;
				internalLeft++; internalRight--;
			}
		} while(internalLeft <= internalRight);
		
		if(left < internalRight) qs(arr, left, internalRight);
		if(internalLeft < right) qs(arr, internalLeft, right);
	}
}
