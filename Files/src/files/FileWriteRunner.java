package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {
	public static void main(String[] args) throws IOException {
		Path FileToRead = Paths.get("./resources/write-lines.txt");
		List<String> list = List.of("Shubham","Maurya","Shivam","Sarvesh");
		Files.write(FileToRead,list);
	}
}
