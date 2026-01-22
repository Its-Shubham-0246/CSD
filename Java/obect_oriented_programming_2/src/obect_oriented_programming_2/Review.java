package obect_oriented_programming_2;

public class Review {
	private int id;
	private String discription;
	private int rating;

	public Review(int id, String discription, int rating) {
		this.id = id;
		this.discription = discription;
		this.rating = rating;
	}

@Override
	public String toString() {
		return "id - " + id + " discription - " + discription + " rating - " + rating;
	}
}
