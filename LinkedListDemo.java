import java.util.*;

public class LinkedListDemo
{
	public static void main(String args[])
	{
		LinkedList<Employee> employees = new LinkedList<Employee>();
		employees.add(new Employee(1,"Sunil",6000));
		employees.add(new Employee(2,"Deepak",8500));
		System.out.println(employees.indexOf(new Employee(1,null,0)));
		employees.addFirst(new Employee(3,"Bharat",6000));
		System.out.println(employees.indexOf(new Employee(1,null,0)));
		System.out.println(employees.indexOf(new GreatEmployee(3,null,0)));
	}
};