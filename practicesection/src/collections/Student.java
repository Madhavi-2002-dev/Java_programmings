package collections;

import java.sql.Date;

public class Student {
	private String name;
	private int id;
	private double marks;
	private String department;
	private String dateOfBirth;
	public Student(String name, int id, double marks, String department, String dateOfBirth) {
		super();
		this.name = name;
		this.id = id;
		this.marks = marks;
		this.department = department;
		this.dateOfBirth = dateOfBirth;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", marks=" + marks + ", department=" + department
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
	

}
