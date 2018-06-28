package arrays;

import java.util.Arrays;

import Files.*;
import Strings.*;

public class ArraysDemo {

	public static void main(String[] args) 
		throws java.io.IOException {
			int groupChoice, choice;
			
			do {
				System.out.println("Choose a group of tasks.");
				System.out.println("1 Arrays and sorts");
				System.out.println("2 Strings");
				System.out.println("3 Files");
								
								
				groupChoice = new intValueEnter().intValueInit();
				if(groupChoice < 1) {
					System.out.println("Enter a positive integer value of menu item.");
				}
				
								
			} while(groupChoice < 1);
			
			switch(groupChoice) {
			case 1:
				do {
					System.out.println("Arrays and sorts");
					System.out.println("1 1.1 Sum elems of char arr");
					System.out.println("2 1.2 Smilest dif between two neighboring elems in int arr");
					System.out.println("3 1.3 Create mult table");
					System.out.println("4 1.4 Average in int arr");
					System.out.println("5 1.5 Average in arr Stream");
					
					System.out.println("6 2.1 Sort three local variables");
					System.out.println("7 2.2 Min and max elems in int arr");
					System.out.println("8 2.3 Max in arr Stream");
					System.out.println("9 2.4 Quick sort array.");
					System.out.println("10 2.5 Compare two arrays length");				
									
					choice = new intValueEnter().intValueInit();
					if(choice < 1) {
						System.out.println("Enter a positive integer value of menu item.");
					}					
									
				} while (choice < 1);
				
				switch(choice) {
				case 1:
					System.out.println(new SumCharArray().sumFunc(new ArrayInit().charDigitsArrInit()));
					break;
				case 2:
					int index = new SmallestDistanceInArr().SmallestDistanceCalc(new ArrayInit().intArrInit());
					if(index >= 0) {
						System.out.println(index);
					}
					break;
				case 3:
					new MultTable().createMultTable(new intValueEnter().intValueInit());				
					break;
				case 4:
					System.out.println(new Average().averageFunc(new ArrayInit().intArrInit()));
					break;
				case 5:
					System.out.println(new AverageStream().averageStreamFunc(new ArrayInit().intArrInit()));				
					break;
				case 6:
					int a = new intValueEnter().intValueInit();
					int b = new intValueEnter().intValueInit();
					int c = new intValueEnter().intValueInit();
					new SortThreeLocalVariables().sortThreeLocalVariablesFunc(a,b, c);				
					break;
				case 7:
					int[] minMaxArr = new MinMaxInArr().minMaxFunc(new ArrayInit().intArrInit());
					System.out.println("Min val in arr = " + minMaxArr[0] + ", and max val = " + minMaxArr[1]);
					break;
				case 8:
					System.out.println(new MaxStream().maxStreamFunc(new ArrayInit().intArrInit()));				
					break;
				case 9:
					int[] qSortArr = new ArrayInit().intArrInit();
					QuickSortArr.qsort(qSortArr);
					System.out.println(Arrays.toString(qSortArr));				
					break;
				case 10:
					System.out.println(new CompareIntArrays().compareIntArraysLength());				
					break;
				}
				
				break;
			case 2:
				do {
					System.out.println("Strings");
					System.out.println("1 Char from string by index");
					System.out.println("2 Search substring");
					System.out.println("3 Initials from full name");
					System.out.println("4 Anagram checker");
					System.out.println("5 Hex to dec");
														
					choice = new intValueEnter().intValueInit();
					if(choice < 1) {
						System.out.println("Enter a positive integer value of menu item.");
					}					
									
				} while (choice < 1);
				
				switch(choice) {
				case 1:
					System.out.println(new Strings1().returnCharFromStringByIndex());
					break;
				case 2:
					new Strings2().indexOfSubstringFunc();
					break;
				case 3:
					System.out.println(new Strings3().Initials());
					break;
				case 4:
					System.out.println(new Strings4().anagrammChecker());
					break;
				case 5:
					System.out.println(new Strings5().HexToDecFunc());
					break;
				}
				break;
			case 3:
				do {
					System.out.println("Files");
					System.out.println("1 Reverse lines");
					System.out.println("2 Print a list of files in folder");
					System.out.println("3 Copy file to file");
					System.out.println("4 Split file to 30% and 70%");
					System.out.println("5 Edit the file");
														
					choice = new intValueEnter().intValueInit();
					if(choice < 1) {
						System.out.println("Enter a positive integer value of menu item.");
					}					
									
				} while (choice < 1);
				
				switch(choice) {
				case 1:
					System.out.println(new Files1().reverseFileFunc());
					break;
				case 2:
					new Files2().textFilesSearch("C:\\templates\\Java\\src\\Files");
					break;
				case 3:
					new Files3().copyFileFunc("C:\\templates\\Java\\src\\Files\\Help.txt", "C:\\templates\\Java\\src\\Files\\Help3.txt");
					break;
				case 4:
					new Files4().splitFileFunc("C:\\templates\\Java\\src\\Files\\Help.txt", "C:\\templates\\Java\\src\\Files\\Help5.txt", "C:\\templates\\Java\\src\\Files\\Help6.txt");
					break;
				case 5:
					new Files5().changeFileFunc("C:\\templates\\Java\\src\\Files\\Help.txt", "C:\\templates\\Java\\src\\Files\\Help7.txt");
					break;
				}			
				break;
			}
			
			
			
			
		
		/*SumCharArray a = new SumCharArray();
		System.out.println(a.sumFunc());
		System.out.println(a.sumFunc2());
		
		SmallestDistanceInArr b = new SmallestDistanceInArr(10);
		b.fillArr();
		System.out.println(b.SmallestDistanceCalc());
		System.out.println(b.SmallestDistanceCalc());
		
		MultTable c = new MultTable();
		c.createMultTable(10);
				
		System.out.println("\n");
		MinMaxInArr e = new MinMaxInArr(10);
		int narr[] = e.minMaxFunc();
		System.out.println(Arrays.toString(narr));*/
	}
	
}
