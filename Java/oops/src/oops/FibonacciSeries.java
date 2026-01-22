package oops;

public class FibonacciSeries {
	int n;

	public FibonacciSeries(int n) {
		this.n = n;
	}

	public void printFibonacciSeries() {
		int a = 0, b = 1;
		System.out.printf("%d %d ", a, b);
		for (int i = 3; i <= n; i++) {
			int c = a + b;
			System.out.printf("%d ", c);
			a = b;
			b = c;
		}
	}
}
