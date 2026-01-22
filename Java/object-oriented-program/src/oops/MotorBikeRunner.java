package oops;

public class MotorBikeRunner {
	public static void main(String[] args) {
		MotorBike bugati = new MotorBike(1000);
		MotorBike honda = new MotorBike(2000);
		honda.setSpeed(50);
		int bugatiSpeed = bugati.getSpeed();
		bugatiSpeed += 100;
		bugati.setSpeed(bugatiSpeed);
		bugati.increaseSpeed(200);
		System.out.println(bugati.getSpeed());

	}
}

