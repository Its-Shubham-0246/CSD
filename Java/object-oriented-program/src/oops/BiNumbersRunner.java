package oops;

public class BiNumbersRunner {
	public static void main(String[] args) {
		BiNumbers Numbers = new BiNumbers(2, 3);
		System.out.println(Numbers.sum());
		System.out.println(Numbers.multiply());
		Numbers.doubl();
		System.out.println(Numbers.getN1());
		System.out.println(Numbers.getN2());
	}
}
