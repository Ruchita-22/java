package multipleThread1;

public class Thread1 extends Thread {

	public Thread1(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 1; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(getName()+"dead");
		}
	}
}
