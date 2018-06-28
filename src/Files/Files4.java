package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Files4 {
	public void splitFileFunc(String source, String dest30, String dest70) throws IOException  {
		File sourcePath = new File(source);
		File destPath30 = new File(dest30);
		File destPath70 = new File(dest70);
		long sourceLength = sourcePath.length();
		long destLength30 = sourceLength * 3 / 10;
		int length;
		FileInputStream sourceInputStream = null;
		FileOutputStream dest30_OutputStream = null;
		FileOutputStream dest70_OutputStream = null;
		try {
			sourceInputStream = new FileInputStream(sourcePath);
			dest30_OutputStream = new FileOutputStream(destPath30);
			dest70_OutputStream = new FileOutputStream(destPath70);
	        byte[] buffer = new byte[1];
	        long iterate = 0;
	        while ((length = sourceInputStream.read(buffer)) > 0) {
	        	if(iterate <= destLength30) {
	        		dest30_OutputStream.write(buffer, 0, length);
	        	} else {
	        		dest70_OutputStream.write(buffer, 0, length);
	        	}
	        	iterate++;
	        }
	    } finally {
	    	sourceInputStream.close();
	    	dest30_OutputStream.close();
	    	dest70_OutputStream.close();
	    }
		System.out.println("Spliting file is complete.");
	}
}
