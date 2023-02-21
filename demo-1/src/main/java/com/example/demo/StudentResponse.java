package com.example.demo;

public class StudentResponse {
	private long id;
	
	private String firstname;
	private String lastname;
	public StudentResponse(long id,String firstname,String lastname)
	{
		this.setId(id);
		this.setFirstname(firstname);
		this.setLastname(lastname);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	

}
