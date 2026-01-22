package oops;

public class BiNumbers {
	private int n1;
	private int n2;

	public BiNumbers(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}

	public int sum() {
		return this.n1 + this.n2;
	}

	public int multiply() {
		return this.n1 * this.n2;
	}

	public void doubl() {
		this.n1 *= 2;
		this.n2 *= 2;
	}

	public int getN1() {
		return this.n1;
	}

	public int getN2() {
		return this.n2;
	}
}
