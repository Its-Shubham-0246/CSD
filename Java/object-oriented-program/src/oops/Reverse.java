package oops;

public class Reverse {
	int number;

	public Reverse(int number) {
		this.number = number;
	}

	public int reverseNumber() {
		int sum = 0, temp = number;
		while (temp != 0) {
			int rem = temp % 10;
			sum = sum * 10 + rem;
			temp /= 10;
		}
		return sum;
	}
}
