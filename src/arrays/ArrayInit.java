package arrays;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

public class ArrayInit {
	public int[] intArrInit() throws IOException {
		List<Integer> intList = new ArrayList<>();
		int[] intArr;
		int intValue;
		String stringValue;
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter values of array elems, for complete press 'q'.");
		
		while(true) {
			stringValue = in.readLine();			
			try {
				if(stringValue.length() == 0) {
					throw new StringIndexOutOfBoundsException();
				}
				intValue = Integer.parseInt(stringValue);
				intList.add(intValue);
			}
			catch (StringIndexOutOfBoundsException exc) {
				System.out.println("You are try to enter empty value, please enter an integer value.");
			}
			catch (NumberFormatException exc) {
				if (stringValue.length() == 1 & stringValue.charAt(0) == 'q') {
					if(intList.size() == 0) {
						System.out.println("Enter at least one elem of array");
						continue;
					} else {
						break;
					}
					
				}
				System.out.println("Enter an integer values not string");				
			}
			
		}		
		
		intArr = new int[intList.size()];
	    for (int i=0; i < intArr.length; i++)
	    {
	        intArr[i] = intList.get(i).intValue();
	    }
	    
	    return intArr;
		
	}
	
	public char[] charDigitsArrInit() throws IOException {
		List<Character> charList = new ArrayList<Character>();
		char[] charArr;
		char charValue;
		String stringValue;
		BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter some digits from 0 to 9, for complete press 'q'");
		
		
		while(true) {
			try {
				stringValue = in.readLine();			
				charValue = stringValue.charAt(0);
				
				if(stringValue.length() > 1) {
					System.out.println("Enter an integer value from 0 to 9 or 'q' for complete.");
				} else {
					if(charValue >= '0' & charValue <= '9') {
						charList.add(charValue);
					} else if(charValue == 'q') {
						if(charList.size() == 0) {
							System.out.println("Enter enter at least one elem of array");
						} else {
							break;
						}
					} else {
						System.out.println("Enter an integer value from 0 to 9 or 'q' for complete.");
					}
				}
			} catch (StringIndexOutOfBoundsException exc) {
				System.out.println("You are try to enter empty value, please enter integer value from 0 to 9 or 'q' for complete");
			}
			
		}		
		
		charArr = new char[charList.size()];
		
		for (int i=0; i < charArr.length; i++)
	    {
	        charArr[i] = charList.get(i);
	    }
		return charArr;
	}
	
}
