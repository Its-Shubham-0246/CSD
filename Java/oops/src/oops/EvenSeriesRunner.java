package oops;

import java.util.Scanner;
public class EvenSeriesRunner {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.print("Enter value of n: ");
		n = scanner.nextInt();
		EvenSeries es = new EvenSeries(n);
		es.printEvenSeries();
	}
}
