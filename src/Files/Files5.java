package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Files5 {
	public void changeFileFunc(String source, String dest) throws IOException  {
		String s;
		BufferedReader br = null;
		FileWriter fw = null;
		
		try {
			br = new BufferedReader(new FileReader(source));
			fw = new FileWriter(dest);
			while((s = br.readLine()) != null) {
				s = s.toUpperCase().replaceAll("  ", " ");
				fw.write(s);
			}
		} catch (IOException e) {
			System.out.println(e);
		} finally {
	    	br.close();
	    	fw.close();
	    }
		System.out.println("Modifing file is complete.");
	} 
}
