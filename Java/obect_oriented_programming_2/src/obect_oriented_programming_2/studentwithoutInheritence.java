package obect_oriented_programming_2;

public class studentwithoutInheritence {
	private String name;
	private String email;
	private int mobileNumber;

	private String collageName;
	private int year;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
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
	public studentwithoutInheritence(String name, String email, int mobileNumber) {
		this.name = name;
		this.email = email;
		this.mobileNumber = mobileNumber;
	}
}
