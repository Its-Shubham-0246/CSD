package oops;

import java.util.Scanner;
public class ReverseRunner {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int number;
		System.out.print("Enter Number: ");
		number = scanner.nextInt();
		Reverse reverse = new Reverse(number);
		System.out.println("Reverse is " + reverse.reverseNumber());
	}
}
