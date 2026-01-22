package obect_oriented_programming_2;

public class CustomerRunner {
	public static void main(String[] args) {
		Address address = new Address("mahmoodpur", "Gorakhpur", "273211");
		Customer customer = new Customer("Shubham", address);
		System.out.println(customer);
		System.out.println(address);
	}

}
