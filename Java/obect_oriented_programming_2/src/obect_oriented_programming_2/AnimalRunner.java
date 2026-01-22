package obect_oriented_programming_2;

abstract class Animal {
	abstract void bark();
}

class Dog extends Animal {

	@Override
	void bark() {
		System.out.println("Bow Bow");

	}

}

class Cat extends Animal {

	@Override
	void bark() {
		System.out.println("Mew Mew");
		
	}

}

public class AnimalRunner {

	public static void main(String[] args) {
		Animal[] animal = { new Dog(), new Cat() };
		for (Animal object : animal) {
			object.bark();
		}
	}
}

