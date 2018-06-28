package arrays;

public class MultTable {
	private int arr[][];
		
	public void createMultTable(int capacity) {
		arr = new int[capacity][capacity];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				arr[i][j] = (i+1) * (j+1);
				System.out.print(arr[i][j] + "\t");
				if (j + 1 == capacity) {
					System.out.println("\n");
				}
			}
			
		}
		
		
	}
}
