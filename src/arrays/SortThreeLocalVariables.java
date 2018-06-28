package arrays;

public class SortThreeLocalVariables {
	public void sortThreeLocalVariablesFunc(int a,int b, int c) {
		int temp;
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		if (b > c) {
			temp = b;
			b = c;
			c = temp;
		}
		if (a > b) {
			temp = a;
			a = b;
			b = temp;
		}
		System.out.println("a = " + a + ", b = " + b + ", c = " + c);

	}
}
