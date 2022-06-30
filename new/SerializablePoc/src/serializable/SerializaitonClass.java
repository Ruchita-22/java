package serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializaitonClass {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.firstName = "Vivekanand";
		emp.lastName = "Gautam";
 
		try {
			FileOutputStream fileOut = new FileOutputStream("D:\\ducat.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(emp);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in D:\\ducat.txt file");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}
//  D:\\ducat.txt