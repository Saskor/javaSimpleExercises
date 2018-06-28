package Strings;

import java.io.IOException;

import arrays.intValueEnter;

public class Strings1 {
	public char returnCharFromStringByIndex() throws IOException {
		int index;
		String stringValue;
		System.out.println("Enter some string");
		stringValue = stringInput.stringInputFunc();
		System.out.println("Enter some index within the string " + "\"" + stringValue + "\"" +" from 0 to " + (stringValue.length() - 1));
		
		while(true) {
			index = new intValueEnter().intValueInit();
			if (index < 0 | index > (stringValue.length() - 1)) {
				System.out.println("Enter some index from 0 to " + (stringValue.length() - 1));
			}
			if(index >= 0 & index <= (stringValue.length() - 1)){
				break;
			}
		}
		char i = stringValue.charAt(index);
		return i;
	}
}
