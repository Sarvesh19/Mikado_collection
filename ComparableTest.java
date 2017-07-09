/**
 * 
 */
package com.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * @author Sarvesh Yadav
 * 
 *         This class for Comparable Test
 */
public class ComparableTest {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<Employee>();
		Employee employee1 = new Employee();
		Employee employee2 = new Employee();
		Employee employee3 = new Employee();
		Employee employee4 = new Employee();

		employee1.setEmp_ID(11);
		employee1.setEmp_name("Sarvesh Yadav");
		employee1.setSalary(1520.00f);
		employee1.setDesignation("Software Engineer");

		employee2.setEmp_ID(5);
		employee2.setEmp_name("Parth Yadav");
		employee2.setSalary(2520.00f);
		employee2.setDesignation("Sr. Software Engineer");

		employee3.setEmp_ID(29);
		employee3.setEmp_name("Kamlesh Yadav");
		employee3.setSalary(3520.00f);
		employee3.setDesignation("Software Engineer Trainee");

		employee4.setEmp_ID(12);
		employee4.setEmp_name("Parvesh Yadav");
		employee4.setSalary(5520.00f);
		employee4.setDesignation("Associate Software Engineer");

		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);

		Collections.sort(list);

		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getEmp_ID());
			Employee iterate = it.next();
			System.out.println(iterate.getEmp_ID() + " "
					+ iterate.getEmp_name() + " " + iterate.getSalary() + " "
					+ iterate.getDesignation());

			// proper output use this only
			// System.out.println(iterate.getEmp_ID()
			// +" "+iterate.getEmp_name()+" "+iterate.getSalary()+" "+iterate.getDesignation()
			// );

		}

	}
}
