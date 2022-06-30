package multipleThread;

public class Thread3 extends Thread{

	public Thread3(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		for (int i = 1; i < 5; i++) {
			System.out.println(getName());
			
		}
	}
}
