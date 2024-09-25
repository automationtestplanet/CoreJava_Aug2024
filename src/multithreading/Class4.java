package multithreading;

public class Class4 implements Runnable{

	public synchronized void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("This is Class4");
		}
	}
}
