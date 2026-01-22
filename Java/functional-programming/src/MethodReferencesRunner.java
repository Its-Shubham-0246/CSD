import java.util.List;

public class MethodReferencesRunner {
	public static void main(String[] args) {
		List.of("Ant", "Bat", "Cat", "Dog", "Elephant").stream().map(String::length).forEach(System.out::println);
	}
}
