package obect_oriented_programming_2;

interface Flyable {
	public void fly();
}

class Bird implements Flyable {
	@Override
	public void fly() {
		System.out.println("With Wings");
	}
}

class Aeroplane implements Flyable {

	@Override
	public void fly() {
		System.out.println("By Fuel");
	}

}
public interface FlyableRunner {
	public static void main(String[] args) {
		Flyable[] flyingObjects = { new Bird(), new Aeroplane() };
		for (Flyable object : flyingObjects) {
			object.fly();
		}
	}
}
