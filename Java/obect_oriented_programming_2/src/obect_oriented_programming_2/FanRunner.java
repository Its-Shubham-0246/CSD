package obect_oriented_programming_2;

public class FanRunner {
	public static void main(String[] args) {
		Fan fan = new Fan("Manufacturer1", 0.7643, "GREEN");
		fan.switchOn();
//		fan.setSpeed((byte) 4);
		System.out.println(fan);
	}
}
