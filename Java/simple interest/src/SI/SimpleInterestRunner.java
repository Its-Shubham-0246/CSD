package SI;

import java.math.BigDecimal;

public class SimpleInterestRunner {
	public static void main(String[] args) {
		SimpleInterest calculator = new SimpleInterest("4500.00", "7.5");
		BigDecimal totalValue = calculator.totalValue(5);
		System.out.println(totalValue);
	}
}
