package LoopsStatement;

import java.util.Scanner;
public class operationMenu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter number1: ");
		int number1 = scanner.nextInt();
		System.out.print("Enter number2: ");
		int number2 = scanner.nextInt();
		int choice;
		do {
			System.out.print("Choose Operation: ");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Result is " + (number1 + number2));
				break;
			case 2:
				System.out.println("Result is " + (number1 - number2));
				break;
			case 3:
				if (number2 == 0) {
					System.out.println("Divisio not Possible!");
				} else {
					System.out.println("Result is " + number1 / number2);
				}
				break;
			case 4:
				System.out.println("Result is " + (number1 * number2));
				break;
			case 5:
				System.out.println("Exit");
				break;
			default:
				System.out.println("Invalid Choice!");
				break;
			}
		} while (choice != 5);
	}
}
