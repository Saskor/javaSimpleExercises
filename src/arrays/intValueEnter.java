package arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class intValueEnter {
	public int intValueInit() throws IOException {
		int intValue = 0;
		boolean intFlag = true;
		String stringValue;
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter an integer value.");
		
		do {
			stringValue = in.readLine();			
			try {
				if(stringValue.length() == 0) {
					throw new StringIndexOutOfBoundsException();
				}
				intValue = Integer.parseInt(stringValue);
				
				
			}
			catch (StringIndexOutOfBoundsException exc) {
				System.out.println("You are try to enter empty value, please enter an integer value.");
			}
			catch (NumberFormatException exc) {
				System.out.println("Enter an integer value not string");
				intFlag = false;
				
			}
		} while(stringValue.length() < 1 | (stringValue.length() > 0 & intFlag == false ));
		return intValue;
	}
}
