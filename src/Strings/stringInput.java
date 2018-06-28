package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class stringInput {
	public static String stringInputFunc() throws IOException{
			String stringValue;
			BufferedReader in = new BufferedReader (new InputStreamReader(System.in));		
			while(true) {
				try {
					stringValue = in.readLine();
					if(stringValue.length() > 0) {
						break;
					}
					
				} catch (StringIndexOutOfBoundsException exc) {
					System.out.println("You are try to enter empty value, please enter some string.");
				}
			}
		return stringValue;
	}
}
