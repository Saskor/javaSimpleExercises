package Strings;

import java.io.IOException;

public class Strings5 {
	public int HexToDecFunc() throws IOException {
		String hexString;
		int decRep;
		System.out.println("Enter hex integer to convert it to dec representation.");
		hexString = stringInput.stringInputFunc();
		decRep = Integer.parseInt(hexString, 16 );
		return decRep;
	}
}
