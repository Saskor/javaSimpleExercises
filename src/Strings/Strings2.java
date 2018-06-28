package Strings;

import java.io.IOException;

public class Strings2 {
	public void indexOfSubstringFunc() throws IOException {
		String stringValue;
		CharSequence substringValue;
		boolean substringContain;
		System.out.println("Enter some string.");
		stringValue = stringInput.stringInputFunc();
		System.out.println("Enter some substring for search.");
		substringValue = stringInput.stringInputFunc();
		
		substringContain = stringValue.contains(substringValue);
		if(substringContain) {
			System.out.println("The string " + "\""+stringValue+"\"" + " contain the substring " + "\""+substringValue+"\"");
		} else {
			System.out.println("The string " + "\""+stringValue+"\"" + " have not contain the substring " + "\""+substringValue+"\"");
		}
	}
}
