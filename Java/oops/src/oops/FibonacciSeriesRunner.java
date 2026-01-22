package oops;

import java.util.Scanner;
public class FibonacciSeriesRunner {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("Enter value of n: ");
		n = scanner.nextInt();
		FibonacciSeries fs = new FibonacciSeries(n);
		fs.printFibonacciSeries();
	}
}
