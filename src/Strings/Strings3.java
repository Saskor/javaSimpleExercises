package Strings;

import java.io.IOException;

public class Strings3 {
	public String Initials() throws IOException {
		String firstName, lastName, surName, firstIni, lastIni, initials;
		String[] surIni;
	
		System.out.println("Enter your firstname.");
		firstName = stringInput.stringInputFunc();
		firstIni = firstName.substring(0,1).toUpperCase();
		System.out.println("Enter your lastname.");
		lastName = stringInput.stringInputFunc();
		lastIni = lastName.substring(0,1).toUpperCase();
		System.out.println("Enter your surname.");
		surName = stringInput.stringInputFunc();
		surIni = surName.split("-");
		initials = firstIni + ". " + lastIni + ". " + surIni[0].substring(0,1).toUpperCase() + ".";
		if(surIni.length > 1) {
			for (int i = 1; i < surIni.length; i++) {
				initials += " - " + surIni[i].substring(0,1).toUpperCase() + ".";
			}	
		}
		
		return initials;
		
	}
}
