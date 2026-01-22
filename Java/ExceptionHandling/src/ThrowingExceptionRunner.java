
class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount other) {
		if (!this.currency.equals(other.currency)) {
			throw new RuntimeException("Currency not Match");
		}
		this.amount += other.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}
public class ThrowingExceptionRunner {
	public static void main(String[] args) {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);
	}
}
