package oops;

public class Weeks {
	String[] days;

	public Weeks(String... days) {
		this.days = days;
	}

	public String longestString() {
		int index = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < days.length; i++) {
			if (days[i].length() > max) {
				max = days[i].length();
				index = i;
			}
		}
		return days[index];

	}

	public void printDays() {
		for (String day : days) {
			System.out.print(day + ",");
		}
	}
}
