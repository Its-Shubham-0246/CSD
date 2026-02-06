package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {
	public static void main (String[] args) throws IOException {
		Path pathToReadFile = Paths.get("./resources/data.txt");
		
//		List<String> lines = Files.readAllLines(pathToReadFile);
//		System.out.println(lines);
		
		Files.lines(pathToReadFile).map(String::toLowerCase).filter(s->s.contains("a")).forEach(System.out::println);
	}
}
