package obect_oriented_programming_2;

public class Rectangle {
	private int length;
	private int breadth;

	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int lengthOfRectangle() {
		return length;
	}

	public int breadthOfRectangle() {
		return breadth;
	}

	public int areaOfRectangle() {
		return length * breadth;
	}

	public int perimeterOfRectangle() {
		return 2 * (length + breadth);
	}

	public void changeLength(int length) {
		this.length = length;
	}

	public void changeBreadth(int breadth) {
		this.breadth = breadth;
	}

	public void changeDimensionsOfRectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return String.format("length - %d ,breadth - %d ,area - %d ,perimeter - %d", length, breadth, length * breadth,
				2 * (length + breadth));
	}
}
