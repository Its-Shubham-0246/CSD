//extends Thread
// implements Runnable

//New
//Runnable
//Running
//Blocked/Waiting
//Terminated/Dead
class Task1 extends Thread {
	@Override
	public void run() { // SIGNATURE
		System.out.println("Task1 started");
		for (int i = 101; i <= 199; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask1 done");
	}
}

class Task2 implements Runnable {
	@Override
	public void run() {
		for (int i = 201; i <= 299; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask2 done");
	}
}

public class ThreadBasicsRunner {
	public static void main(String[] args) throws InterruptedException {
		Task1 task1 = new Task1();
		task1.start();
		task1.yield();
		Task2 task2 = new Task2();
		Thread t2Thread = new Thread(task2);
		t2Thread.start();
		t2Thread.setPriority(5);
		// wait for task1 to complete
		task1.join();
		t2Thread.join();
		for (int i = 301; i <= 399; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\nTask3 done");
		System.out.println("Main done");
	}
}
