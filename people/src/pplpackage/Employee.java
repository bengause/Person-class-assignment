package pplpackage;

public class Employee extends Person {
	
	private String office;
	private int salary;
	private String dateHired;
	
	
	public Employee(){
		
	}
	
	public Employee(String office, int salary, String dateHired){
		this.salary = salary;
		this.office = office;
		this.dateHired = dateHired;
	}
	
	public Employee(String name, String address, String phoneNumber, String email, 
			String office, int salary, String dateHired){
		setName(name);
		setAddress(address);
		setPhoneNumber(phoneNumber);
		setEmail(email);
		this.salary = salary;
		this.office = office;
		this.dateHired = dateHired;
	}
	
	public String getOffice(){
		return office;
	}
	
	public int getSalary(){
		return salary;
	}
	
	public String getDateHired(){
		return dateHired;
	}
	
	public void setOffice(String office){
		this.office = office;
	}
	
	public void setSalary(int salary){
		this.salary = salary;
	}
	
	public void setDateHired(String dateHired){
		this.dateHired = dateHired;
	}
	
	public String toString(){
		return "Name: " + getName() + "\nAddress: " + getAddress() + "\nPhone number: " + 
	getPhoneNumber() + "\nEmail: " + getEmail() + "\nOffice: " + office + "\nSalary: $" +
				salary + "\nDate Hired: " + dateHired;
		
	}
	
}