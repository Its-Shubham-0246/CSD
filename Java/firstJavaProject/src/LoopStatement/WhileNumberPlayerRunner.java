package LoopStatement;

import java.util.Scanner;
public class WhileNumberPlayerRunner {
public static void main(String[] args) {
	WhileNumberPlayer player=new WhileNumberPlayer(30);
	player.printSquareUptoLimit();
	player.printCubeUptoLimit();
	Scanner scanner = new Scanner(System.in);
	int number;
	do {
		System.out.print("Enter a number: ");
		number = scanner.nextInt();
		if (number >= 0) {
		System.out.println("Cube is " + (number * number * number));
		}
	} while (number >= 0);
	System.out.println("Thank You! Have Fun.");
}

}