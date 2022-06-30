package BRD1;

import java.util.regex.Pattern;

public class ValidationDemo implements Validation{

	public boolean dataValidation(String data, String dataType) {
		try{
            double isNum = Double.parseDouble(data);
            if(isNum == Math.floor(isNum)) {
                System.out.println("Input is Integer");
                if(isNum>-32768&& isNum<32767){
                	System.out.println("Input is Short");
                }
            }else {
                System.out.println("Input is Double");
            }
        } catch(Exception e) {
            if(data.toCharArray().length == 1) {
                System.out.println("Input is Character");
            }else {
                System.out.println("Input is String");
            }
        }
		return true;
	}
	public boolean dataLength(String data, int length) {
		// TODO Auto-generated method stub
		
		if(data.length()>length){
			System.err.println("Error: Length of field should be less then "+length);
			return false;
		}
		else{
			return true;		
		}
		
	}

	public boolean specialCharacter(String data) {
		// TODO Auto-generated method stub
		String regex="\\w{1,}\\W{1,}\\w{0,}";
		boolean b=Pattern.compile(regex).matcher(data).matches();
		System.out.println(b);
		if(b==true){
			System.err.println("Error: Enter the valid data. Data should not contain special character @,$,#,^,&,*,(");
			return false;
		}
		else{	
			return true;
		}
	}

	public boolean domainValue(String data, String[] validValues) {
		// TODO Auto-generated method stub
		for (int i=0;i<validValues.length;i++) {
			if(data.equalsIgnoreCase(validValues[i])){
				return true;
			}	
		}
		System.out.println("Error: Enter the valid data from domain {SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURADAY}");
		return false;
	}

	public boolean formatValidation(String data, String format) {
		String []tokens=format.split("-");
		String dataPattern="";
		for (int i = 0; i < tokens.length; i++) {
			if(i!=0){
				dataPattern+="-";
			}
			if(tokens[i].equalsIgnoreCase("dd")){
				dataPattern+="(0?[1-9]{1}|[12]{1}[0-9]{1}|[3]{1}[01]{1})";
			}
			if(tokens[i].equalsIgnoreCase("mm")){
				dataPattern+="(0?[1-9]{1}|[1]{1}[012]{1})";
			}
			if (tokens[i].equalsIgnoreCase("yyyy")) {
				dataPattern+="(19|20){1}\\d{1}\\d{1}";
				
			}		
		}	
		return Pattern.compile(dataPattern).matcher(data).matches();	
	}

	public boolean emailValidation(String data) {
		// TODO Auto-generated method stub
		String regex="[a-zA-Z0-9_]{1,}[a-zA-Z0-9_.]{1,}@{1}\\w{1,}[.]{1}\\w{1,}";
		boolean b=Pattern.compile(regex).matcher(data).matches();
		if(b==true){
			return true;
		}
		else{
			System.err.println("Error: Enter the valid email of format abc@xy.com");
			return false;
		}
		
	}

}
