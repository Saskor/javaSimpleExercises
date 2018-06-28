package Files;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Files2 {
	public void textFilesSearch(String directory) {
		List<String> textFiles = new ArrayList<String>();
		File dir = new File(directory);
		for(File file: dir.listFiles()) {
			if(file.getName().endsWith(".txt")) {
				textFiles.add(file.getName());
			}
		}
		Iterator<String> textFilesIterator = textFiles.iterator();
		while(textFilesIterator.hasNext()) {
			System.out.println(textFilesIterator.next());
		}
	}
}
