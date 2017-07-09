/**
 * 
 */
package com.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sarvesh
 * 
 */
public class ComparatorTest {
	/*
	 * static { private sorted_withempid = new Comparator() {
	 * 
	 * public int compare(Object o1, Object o2) { String sa = (String) o1;
	 * String sb = (String) o2;
	 * 
	 * int v = sa.compareTo(sb);
	 * 
	 * return v;
	 * 
	 * // it can also return 0, and 1 } }; }
	 */

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
		System.out.println("---------------------------------------");

		Collections.sort(list, new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				if (o1 instanceof Employee && o2 instanceof Employee) {
					Employee s_1 = (Employee) o1;
					Employee s_2 = (Employee) o2;

					return s_1.compareTo(s_2);
				}
				return 0;
			}
		});
		for (Employee list1 : list) {
			System.out.println(list1.getEmp_ID() + " " + list1.getEmp_name()
					+ " " + list1.getSalary() + " " + list1.getDesignation());
		}
		System.out.println("---------------------------------------");

		Collections.sort(list, new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				if (o1 instanceof Employee && o2 instanceof Employee) {
					Employee s_1 = (Employee) o1;
					Employee s_2 = (Employee) o2;

					return s_1.getEmp_name().compareTo(s_2.getEmp_name());
				}
				return 0;
			}
		});

		for (Employee list1 : list) {
			System.out.println(list1.getEmp_ID() + " " + list1.getEmp_name()
					+ " " + list1.getSalary() + " " + list1.getDesignation());
		}
		System.out.println("---------------------------------------");

		Collections.sort(list, new Comparator<Employee>() {
			public int compare(Employee o1, Employee o2) {
				if (o1 instanceof Employee && o2 instanceof Employee) {
					Employee s_1 = (Employee) o1;
					Employee s_2 = (Employee) o2;
					if (s_1.getSalary() > s_2.getSalary()) {
						return 1;
					} else if (s_1.getSalary() < s_2.getSalary()) {
						return -1;
					}
					return 0;
				}
				return 0;
			}
		});
		
		for (Employee list1 : list) {
			System.out.println(list1.getEmp_ID() + " " + list1.getEmp_name()
					+ " " + list1.getSalary() + " " + list1.getDesignation());
		}

	}
}
