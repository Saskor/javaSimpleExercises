package Files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Files3 {
	public void copyFileFunc(String source, String dest) throws IOException {
		File sourcePath = new File(source);
		File destPath = new File(dest);
		Files.copy(sourcePath.toPath(), destPath.toPath());
	}
}
