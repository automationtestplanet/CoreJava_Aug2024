package multithreading;

public class MultithreadingExample {

	public static void main(String[] args) {
		Class1 class1 = new Class1();
		Class2 class2 = new Class2();

//		class1.start();
//		class2.start();

		Class3 class3 = new Class3();
		Class4 class4 = new Class4();

		Thread thread1 = new Thread(class3);
		Thread thread2 = new Thread(class4);
//		
//		thread1.start();
//		thread2.start();

		Thread thread3 = new Thread(class3);
		Thread thread4 = new Thread(class3);

		thread3.start();
		thread4.start();

	}

}
