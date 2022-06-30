package demo;

public class Demo {
	static {
		System.out.println("hello");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s=new Student("ruchita","java spring");
		System.out.println(s.getName()+" in "+s.getDomain()+" domain");
		
		
	}

}
