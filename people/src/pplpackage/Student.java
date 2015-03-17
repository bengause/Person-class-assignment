package pplpackage;

public class Student extends Person{
	
	private String classStatus;
	
	public Student(){
	}
	
	public Student(String classStatus){
		this.classStatus = classStatus;
	}
	
	public Student(String name, String address, String phoneNumber, 
			String email, String classStatus){
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		this.classStatus = classStatus;
	}
	
	public String getClassStatus(){
		return classStatus;
	}
	
	public final void setClassStatus(String classStatus){
		this.classStatus = classStatus;
	}
	
	public String toString(){
		return "Name: " + getName() + "\nAddress: " + getAddress() + "\nPhone number: " + 
	getPhoneNumber() + "\nEmail: " + getEmail() + "\nClass Status: " + classStatus;
	}
}

