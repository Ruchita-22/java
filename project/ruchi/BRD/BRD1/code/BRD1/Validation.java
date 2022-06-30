package BRD1;

public interface Validation {
	boolean dataValidation(String data,String dataType);
	boolean dataLength(String data,int length);
	boolean specialCharacter(String data);
	boolean domainValue(String data,String []validValue);
	boolean formatValidation(String data,String format);
	boolean emailValidation(String data);
}
