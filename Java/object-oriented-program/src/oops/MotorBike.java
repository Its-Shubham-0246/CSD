package oops;

public class MotorBike {
	private int speed;

	MotorBike(int speed) {
		this.speed = speed;
	}
	public void setSpeed(int speed) {
		if (speed >= 0) {
			this.speed = speed;
		}
	}

	public void increaseSpeed(int howMuch) {
		this.speed = this.speed + howMuch;
	}
	public int getSpeed() {
		return speed;
	}
}
