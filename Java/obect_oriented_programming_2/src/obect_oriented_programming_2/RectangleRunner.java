package obect_oriented_programming_2;

public class RectangleRunner {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(6, 9);
		System.out.println("Lenght of the retangle is " + rectangle.lengthOfRectangle());
		System.out.println("Breadth of the rectangle is " + rectangle.breadthOfRectangle());
		System.out.println("Area of the rectangle is " + rectangle.areaOfRectangle());
		System.out.println("Perimeter of the rectangle is " + rectangle.perimeterOfRectangle());
		rectangle.changeLength(2);
		System.out.println("Lenght of the retangle is " + rectangle.lengthOfRectangle());
		System.out.println("Breadth of the rectangle is " + rectangle.breadthOfRectangle());
		System.out.println("Area of the rectangle is " + rectangle.areaOfRectangle());
		System.out.println("Perimeter of the rectangle is " + rectangle.perimeterOfRectangle());
		rectangle.changeBreadth(9);
		System.out.println("Lenght of the retangle is " + rectangle.lengthOfRectangle());
		System.out.println("Breadth of the rectangle is " + rectangle.breadthOfRectangle());
		System.out.println("Area of the rectangle is " + rectangle.areaOfRectangle());
		System.out.println("Perimeter of the rectangle is " + rectangle.perimeterOfRectangle());
		rectangle.changeDimensionsOfRectangle(1, 2);
		System.out.println("Lenght of the retangle is " + rectangle.lengthOfRectangle());
		System.out.println("Breadth of the rectangle is " + rectangle.breadthOfRectangle());
		System.out.println("Area of the rectangle is " + rectangle.areaOfRectangle());
		System.out.println("Perimeter of the rectangle is " + rectangle.perimeterOfRectangle());
		System.out.println(rectangle);
	}
}
