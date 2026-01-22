import java.util.Scanner;

public class FinallyRunner {
	public static void main(String[] args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			int[] numbers = { 12, 2, 43, 45 };
			int number = numbers[9];
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (sc != null) {
				sc.close();
				System.out.println("Closed");
			}
		}
	}
}
