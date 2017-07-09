/**
 * 
 */
package com.comparable_comparator;

/**
 * @author Sarvesh
 * 
 *         This class is bean for employee
 * 
 */
public class Employee_Test implements IHuman, Comparable<Employee_Test> {
	private int emp_ID;
	private float salary;
	private String emp_name;
	private String designation;

	public Employee_Test() {

	}

	public Employee_Test(int emp_ID, float salary, String emp_name,
			String designation) {
		super();
		this.emp_ID = emp_ID;
		this.salary = salary;
		this.emp_name = emp_name;
		this.designation = designation;
	}

	public int getEmp_ID() {
		return emp_ID;
	}

	public void setEmp_ID(int emp_ID) {
		this.emp_ID = emp_ID;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Employee_Test o) {
		if (this.getEmp_ID() > o.getEmp_ID()) {
			return 1;

		} else if (this.getEmp_ID() < o.getEmp_ID()) {
			return -1;
		} else
			return 0;
	}
}
