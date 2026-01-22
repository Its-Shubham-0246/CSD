package obect_oriented_programming_2;

public class Student extends Person {

	private String collageName;
	private int year;

	public Student(String name, String email, String mobileNumber, String collageName) {
		super(name, email, mobileNumber);
		this.collageName = collageName;
	}

	public String getCollageName() {
		return collageName;
	}

	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
