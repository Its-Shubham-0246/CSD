package oops;
import java.util.Scanner;

public class ArmstrongNumberRunner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.print("Enter Number: ");
		number = scanner.nextInt();
		ArmstrongNumber arm = new ArmstrongNumber(number);
		arm.checkArmstrong();
		scanner.close();
	}
}
