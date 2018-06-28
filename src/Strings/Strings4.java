package Strings;

import java.io.IOException;
import java.util.Arrays;
import java.util.Objects;

public class Strings4 {
	public boolean anagrammChecker() throws IOException {
		boolean anagrammFlag;
		String[] stringFirstArr, stringSecondArr;
		String stringFirst, stringSecond;
		
		System.out.println("Enter first string.");
		stringFirstArr = stringInput.stringInputFunc()
				.toLowerCase()
				.replaceAll("\\s+","")
				.split("");
		Arrays.sort(stringFirstArr);
		stringFirst = String.join("", stringFirstArr);
		
		System.out.println("Enter second string to anagram checking.");
		stringSecondArr = stringInput.stringInputFunc()
				.toLowerCase()
				.replaceAll("\\s+","")
				.split("");
		Arrays.sort(stringSecondArr);
		stringSecond = String.join("", stringSecondArr);
		
		if (Objects.equals(stringFirst, stringSecond)) {
			anagrammFlag = true;
		} else {
			anagrammFlag = false;
		}
		return anagrammFlag;
	}
}
