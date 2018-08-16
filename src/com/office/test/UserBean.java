package com.office.test;

public class UserBean {

	private int id;  
	private String naame;
	private String designation;
	private String salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNaame() {
		return naame;
	}
	public void setNaame(String naame) {
		this.naame = naame;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "UserBean [id=" + id + ", naame=" + naame + ", designation=" + designation + ", salary=" + salary + "]";
	}
	
	
}
