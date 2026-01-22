package SI;

import java.math.BigDecimal;
public class SimpleInterest {
	private BigDecimal principal;
	private BigDecimal rate;

	public SimpleInterest(String principal, String rate) {
		this.principal = new BigDecimal(principal);
		this.rate = new BigDecimal(rate);
	}

	public BigDecimal totalValue(int noOfYears) {
		return this.principal.add(
				this.principal.multiply(this.rate.multiply(new BigDecimal(noOfYears).divide(new BigDecimal(100)))));
	}
}
