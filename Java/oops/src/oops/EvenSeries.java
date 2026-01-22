package oops;

public class EvenSeries {
	int n;

	public EvenSeries(int n) {
		this.n = n;
	}

	public void printEvenSeries() {
		for (int i = 2; i <= n; i += 2) {
			System.out.printf("%d ", i);
		}
	}
}
