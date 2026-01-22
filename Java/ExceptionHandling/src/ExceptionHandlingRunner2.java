public class ExceptionHandlingRunner2 {
	public static void main(String[] args) {
		System.out.println("main");
		extracted();
	}

	private static void extracted() {
		System.out.println("extrated");
		extracted1();
	}

	private static void extracted1() {
		try {
//			String str = null;
//			str.length();
			int[] arr = new int[2];
			int x = arr[5];
			System.out.println("extracted1");
		} catch (IndexOutOfBoundsException e) {
			System.out.println("IndexOutOfBoundsException");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
