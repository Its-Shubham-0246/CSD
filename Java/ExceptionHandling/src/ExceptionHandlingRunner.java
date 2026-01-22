public class ExceptionHandlingRunner {
	public static void main(String[] args) {
		System.out.println("main");
		extracted();
	}

	private static void extracted() {
		System.out.println("extrated");
		extracted1();
	}

	private static void extracted1() {
		String str = null;
		System.out.println("extracted1");
		str.length();
	}
}
