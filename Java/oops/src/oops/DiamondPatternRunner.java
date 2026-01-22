package oops;

import java.util.Scanner;
public class DiamondPatternRunner {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("Enter value of n: ");
		n = scanner.nextInt();
		DiamondPattern dp = new DiamondPattern(n);
		dp.printDiamondPattern();
	}
}
