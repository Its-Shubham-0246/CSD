package obect_oriented_programming_2;

public class BookRunner {
	public static void main(String[] args) {
		Book book = new Book(123, "Programming with java", "shubham");
		book.addReview(new Review(142, "Great Book", 5));
		book.addReview(new Review(165, "Assume", 5));
		System.out.println(book);
	}
}
