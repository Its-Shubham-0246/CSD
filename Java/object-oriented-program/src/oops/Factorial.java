package oops;

public class Factorial {
	int number;

	public Factorial(int number) {
		this.number = number;
	}

	public int factorialIs() {
		int fact = 1;
		for (int i = 1; i <= this.number; i++) {
			fact *= i;
		}
		return fact;
	}

}
