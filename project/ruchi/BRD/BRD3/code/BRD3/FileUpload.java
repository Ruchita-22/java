package BRD3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileUpload {
	ValidationFile validationFile;
	public void fileReadMethod(String str)throws IOException {
		// TODO Auto-generated method stub
		String fileName=str;
		FileReader fileReader=new FileReader(fileName);
		BufferedReader bufferedReader=new BufferedReader(fileReader);
		String checkData;
		
		while((checkData=bufferedReader.readLine())!=null){
			String []input=checkData.split("~");
			String []tokens=new String[16];
			for (int i = 0; i <16; i++) {
				if(i<input.length){
					tokens[i]=input[i];
					System.out.println((i+1)+")"+tokens[i]);
					//this.generateErrorFile((i+1)+")"+tokens[i]);
				}
				else{
					tokens[i]=null;
					System.out.println((i+1)+")"+tokens[i]);
					//this.generateErrorFile((i+1)+")"+tokens[i]);
				}
				
				
				
			}
			validationFile=new ValidationFile(tokens[0], tokens[1], tokens[2], tokens[3], tokens[4], tokens[5], tokens[6], tokens[7], tokens[8], tokens[9], tokens[10], tokens[11], tokens[12], tokens[13], tokens[14], tokens[15]);
			validationFile.validate();
		}
		System.out.println("file read successfully");
		bufferedReader.close();
		fileReader.close();
	}
	
	public void generateErrorFile(String str) throws IOException{
		String fileName="E:\\JavaProg\\data\\brd3\\TestCases\\error.txt";
        OutputStreamWriter writer = new OutputStreamWriter(
              new FileOutputStream(fileName, true), "UTF-8");
        BufferedWriter fbw = new BufferedWriter(writer);
        fbw.write(str);
        fbw.newLine();
        fbw.flush();
        fbw.close();
        //System.out.println("File write successfully");
   
	}
	
	

}
