 public class Employee implements Comparable<Employee>  
{

	private int id;
	private String name;
	private double salary;
	
	public Employee() {

	}
	public Employee(final int id,final String name,final double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public void setId(final int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(final String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSalary(final double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public String toString() {
		return id+" "+name+" "+salary;
	}
	public boolean equals(Object o) {
		
		if(o instanceof Employee)
		{
			return ((Employee)o).getId() == id;
		}
		else
		{
			return false;
		}
	}
	public int hashCode() {
		return id;
	}
	public int compareTo(Employee emp) {
		
		if(emp.getId() > id)
			return -1;
		else if (emp.getId() == id)
			return 0;
		else
			return 1;
	}

};