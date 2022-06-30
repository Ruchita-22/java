package BRD3;

import java.io.IOException;

//import BRD1.ValidationDemo;

public class ValidationFile implements Validation1 {

	//private String customerId;
	private String customerCode;
	private String customerName;
	private String customerAdd1;
	private String customerAdd2;
	private String customerPinCode;
	private String email;
	private String contactNumber;
	private String primaryContactNumber;
	private String recordStatus;
	private String activeInactiveFlag;
	private String createDate;
	private String createdBy;
	private String modifiedDate;
	private String modifiedBy;
	private String authorizedDate;
	private String authorizedBy;
	
	ValidationDemo validationDemo=new ValidationDemo();
	FileUpload fileUpload=new FileUpload();
	
	public ValidationFile( String customerCode,
			String customerName, String customerAdd1, String customerAdd2,
			String customerPinCode, String email, String contactNumber,
			String primaryContactNumber, String recordStatus,
			String activeInactiveFlag, String createDate, String createdBy,
			String modifiedDate, String modifiedBy, String authorizedDate,
			String authorizedBy) {
		super();
		//this.customerId = customerId;
		this.customerCode = customerCode;
		this.customerName = customerName;
		this.customerAdd1 = customerAdd1;
		this.customerAdd2 = customerAdd2;
		this.customerPinCode = customerPinCode;
		this.email = email;
		this.contactNumber = contactNumber;
		this.primaryContactNumber = primaryContactNumber;
		this.recordStatus = recordStatus;
		this.activeInactiveFlag = activeInactiveFlag;
		this.createDate = createDate;
		this.createdBy = createdBy;
		this.modifiedDate = modifiedDate;
		this.modifiedBy = modifiedBy;
		this.authorizedDate = authorizedDate;
		this.authorizedBy = authorizedBy;
	}
	public void validate()throws IOException {
		 //checkCustomerId();
		 checkCustomerCode();
		 checkCustomerName();
		 checkCustomerAdd1();
		 checkCustomerAdd2();
		 checkCustomerPincode();
		 checkEmail();
		 checkContactNumber();
		 checkPrimaryContactPerson();
		 checkRecordStatus();
		 checkActiveInactiveFlag();
		 checkCreatedDate();
		 checkCreatedBy();
		 checkModifiedDate();
		 checkModifiedBy();
		 checkAuthorizedDate();
		 checkAuthorizedBy();
	}
//	public void checkCustomerId() {
//		// TODO Auto-generated method stub
//		boolean temp=validationDemo.dataLength(customerId, 10);
//		//boolean temp1=validationDemo.
//		//need updation
//	}
	public void checkCustomerCode() {
		// TODO Auto-generated method stub
		if(customerCode!=null){
			boolean temp=validationDemo.dataLength(customerCode, 10);
			if(temp==false){
				try {
					fileUpload.generateErrorFile(customerCode);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public void checkCustomerName() {
		// TODO Auto-generated method stub
		if(customerName!=null){
			boolean temp=validationDemo.dataLength(customerName, 30);
			boolean temp1=validationDemo.specialCharacter(customerName);
			if((temp==false)||(temp1==false)){
				try {
					fileUpload.generateErrorFile(customerName);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
	public void checkCustomerAdd1() {
		// TODO Auto-generated method stub
		if(customerAdd1!=null){
			boolean temp=validationDemo.dataLength(customerAdd1, 100);
			if(temp==false){
				try {
					fileUpload.generateErrorFile(customerAdd1);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		
	}
	public void checkCustomerAdd2() {
		// TODO Auto-generated method stub
		if(customerAdd2!=null){
			boolean temp=validationDemo.dataLength(customerAdd2, 100);
			if(temp==false){
				try {
					fileUpload.generateErrorFile(customerAdd2);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

	}
	public void checkCustomerPincode() {
		// TODO Auto-generated method stub
		boolean temp=validationDemo.dataLength(customerPinCode, 6);
		if(temp==true){
			if(customerPinCode.length()==6){
				temp=temp;
			}
			else{
				temp=false;
			}
		}
		if(temp==false){
			try {
				fileUpload.generateErrorFile(customerPinCode);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void checkEmail() {
		// TODO Auto-generated method stub
		if(email!=null){
			boolean temp=validationDemo.dataLength(email, 100);
			boolean temp1=validationDemo.emailValidation(email);
			if((temp==false)||(temp1==false)){
				try {
					fileUpload.generateErrorFile(email);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	public void checkContactNumber() {
		// TODO Auto-generated method stub
		if(contactNumber!=null){
			boolean temp=validationDemo.dataLength(contactNumber, 20);
			if(temp==false){
				try {
					fileUpload.generateErrorFile(contactNumber);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
	
	public void checkPrimaryContactPerson() {
		// TODO Auto-generated method stub
		if(primaryContactNumber!=null){
			boolean temp=validationDemo.dataLength(primaryContactNumber, 100);
			if(temp==false){
				try {
					fileUpload.generateErrorFile(primaryContactNumber);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	public void checkRecordStatus() {
		// TODO Auto-generated method stub
		if(recordStatus!=null){
			boolean temp=validationDemo.dataLength(recordStatus, 1);
			String []validValues={"N","M","D","A","R"};
			boolean temp1=validationDemo.domainValue(recordStatus, validValues);
			if((temp==false)||(temp1==false)){
				try {
					fileUpload.generateErrorFile(recordStatus);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	public void checkActiveInactiveFlag() {
		
		// TODO Auto-generated method stub
		if(activeInactiveFlag!=null){
			boolean temp=validationDemo.dataLength(activeInactiveFlag, 1);
			String []validValues={"A","I"};
			boolean temp1=validationDemo.domainValue(activeInactiveFlag, validValues);
			if((temp==false)||(temp1==false)){
				try {
					fileUpload.generateErrorFile(activeInactiveFlag);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	public void checkCreatedDate() {
		// TODO Auto-generated method stub
		
	}
	public void checkCreatedBy() {
		// TODO Auto-generated method stub
		if(createdBy!=null){
			boolean temp=validationDemo.dataLength(createdBy, 30);
			if(temp==false){
				try {
					fileUpload.generateErrorFile(createdBy);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
	public void checkModifiedDate() {
		// TODO Auto-generated method stub
		
	}
	public void checkModifiedBy() {
		// TODO Auto-generated method stub
		if(modifiedBy!=null){
			boolean temp=validationDemo.dataLength(modifiedBy, 30);
			if(temp==false){
				try {
					fileUpload.generateErrorFile(modifiedBy);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	public void checkAuthorizedDate() {
		// TODO Auto-generated method stub
		
	}
	public void checkAuthorizedBy() {
		// TODO Auto-generated method stub
		if(authorizedBy!=null){
			boolean temp=validationDemo.dataLength(authorizedBy, 30);
			if(temp==false){
				try {
					fileUpload.generateErrorFile(authorizedBy);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	
	
}
