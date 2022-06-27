package Question2;

import java.io.Serializable;

public class Employee implements Serializable{
	
	private int empId;
     private String name;
     private Address address;
     private String email;
     transient private String password;
     
     
	public Employee() {
	}

// Parameterized constructor================
	public Employee(int empId, String name, Address address, String email, String password) {
		this.empId = empId;
		this.name = name;
		this.address = address;
		this.email = email;
		this.password = password;
	}

//Getter and Setter=======================================
	public int getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "Student [empId=" + empId + ", name=" + name + ", address=" + address + ", email=" + email
				+ ", password=" + password + "]";
	}


	
	
}
