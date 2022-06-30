package BRD1;

import java.util.Scanner;

public class ValidationTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ValidationDemo validationDemo=new ValidationDemo();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the email");
		String str=scanner.next();	
		System.out.println(validationDemo.emailValidation(str));
		System.out.println("Enter the data to check for special character");
		 str=scanner.next();	
		System.out.println(validationDemo.specialCharacter(str));
		System.out.println("Enter the data to check length");
		 str=scanner.next();
		System.out.println("Enter the length");
		int length=scanner.nextInt();
		System.out.println(validationDemo.dataLength(str,length));
		System.out.println("Enter the day data");
		 str=scanner.next();
		String []validValues={"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURADAY"};
		System.out.println(validationDemo.domainValue(str, validValues));
		System.out.println("Enter the date to check for format");
		 str=scanner.next();
		System.out.println("Enter the format");
		String format=scanner.next();
		System.out.println(validationDemo.formatValidation(str, format));
		
		System.out.println("Enter the data you need to check for data type");
		 str=scanner.next();
		System.out.println("Enter the data type");
		String str1=scanner.next();
	
		System.out.println(validationDemo.dataValidation(str, str1));
		
		System.out.println("Enter the date");
		 str=scanner.next();
		System.out.println(validationDemo.formatValidation(str,"dd-mm-yyyy"));
		
	}

}
