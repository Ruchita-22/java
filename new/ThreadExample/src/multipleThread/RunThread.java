package multipleThread;

public class RunThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 thread1=new Thread1("Thread1");
		Thread2 thread2=new Thread2("Thread2");
		Thread3 thread3=new Thread3("Thread3");
		thread1.start();
		thread2.start();
		thread3.start();
		for (int i = 1; i < 15; i++) {
			System.out.println(Thread.currentThread().getName());
			
		}

	}

}
