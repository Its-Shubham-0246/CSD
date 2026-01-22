package oops;

public class ArmstrongNumber {

	private int number;

	public ArmstrongNumber(int number) {
		this.number = number;
	}

	public int digits() {
		int digit = 0;
		int temp = this.number;
		while (temp != 0) {
			digit++;
			temp /= 10;
		}
		return digit;
	}

	public void checkArmstrong() {
		int sum = 0, digit = digits();
		int temp = this.number;
		while (temp != 0) {
			int rem = temp % 10;
			sum = sum + (int) Math.pow(rem, digit);
			temp /= 10;
		}
		if (sum == this.number) {
			System.out.println("Armstrong Number");
		} else {
			System.out.println("Not an Armstrong Number");
		}

	}
}
