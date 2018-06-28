package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Files1 {
	public String reverseFileFunc() throws IOException {
		LinkedList<String> revList = new LinkedList<>(); 
		String s;
		
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\templates\\Java\\src\\Files\\Help.txt")))
		{
			while((s = br.readLine()) != null) {
				revList.addFirst(s);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		
		try (FileWriter fw = new FileWriter("C:\\templates\\Java\\src\\Files\\Help2.txt"))
		{
			for (int i = 0; i < revList.size(); i++) {
				s = revList.get(i) + "\r\n";
				fw.write(s);
			}
		
		} catch (IOException e) {
			System.out.println(e);
		}
		
		return "complete";
	}
}
