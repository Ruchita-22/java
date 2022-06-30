package BRD3;

import java.io.IOException;
import java.util.Scanner;

public class FileUploadTest {
	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the path of file you want to read");
		String str=scanner.next();
		FileUpload fileUpload=new FileUpload();
		fileUpload.fileReadMethod(str);
		//fileUpload.generateErrorFile();
	}
}



/*
 * Steps to run
 * change the error file path in the code
 * and then run
 * 
 * to run the code it will ask for the source file path
 * 
 * 				 E:\JavaProg\data\brd3\TestCases\File1.txt
 */
