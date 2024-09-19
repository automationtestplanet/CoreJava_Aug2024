package multithreading;

public class Class2 extends Thread{

	public void run() {
		for (int i = 1; i <= 20; i++) {
			System.out.println("This is Class2");
		}
	}
}
