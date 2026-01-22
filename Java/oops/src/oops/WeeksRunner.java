package oops;

public class WeeksRunner {
	public static void main(String[] args) {
		Weeks week = new Weeks("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday Saturday",
				"Saturday");
		System.out.println(week.longestString());
		week.printDays();
	}
}
