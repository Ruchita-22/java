package demo;

/**
 * @author ghuser
 *
 */
/**
 * @author ghuser
 *
 */
//POJO class
public class Student {
	String name;
	String domain;

	public Student(String name, String domain) {
		super();
		this.name = name;
		this.domain = domain;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getName() {
		return name;
	}

	public String getDomain() {
		return domain;
	}	
}
