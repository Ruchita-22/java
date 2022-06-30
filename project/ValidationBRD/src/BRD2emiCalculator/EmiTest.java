package BRD2emiCalculator;

import java.util.Scanner;

public class EmiTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the principal amount");
		double princial=scanner.nextDouble();
		System.out.println("Enter the rate of interest in percent");
		double rate=scanner.nextDouble();
		System.out.println("Enter the time for loan in year");
		double time=scanner.nextDouble();
		System.out.println("Enter the number of installment in year");
		double frequency=scanner.nextDouble();
		Emicalculator emicalculator=new Emicalculator(princial,rate,time,frequency);
		System.out.println(emicalculator.getInstallment());
		System.out.println(emicalculator.getSchedule());

	}

}
