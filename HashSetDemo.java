import java.util.*;

public class HashSetDemo
{
	public static void main(String args[])
	{
		/*HashSet<Employee> set = new HashSet<Employee>();
		set.add(new Employee(1,"sunil",6000));
		set.add(new Employee(1,"sunil",6000));
		set.add(new Employee(3,"Bharat",6000));
		set.add(new Employee(2,"Deepak",8500));
		System.out.println(set.size());
		Iterator<Employee> it = set.iterator();
		while(it.hasNext())
		{
			Employee emp = it.next();
			System.out.println(emp);
		}
		System.out.println(set);*/

		/*LinkedHashSet<Employee> set1 = new LinkedHashSet<Employee>();
		set1.add(new Employee(1,"sunil",6000));
		set1.add(new Employee(1,"sunil",6000));
		set1.add(new Employee(3,"Bharat",6000));
		set1.add(new GreatEmployee(2,"Deepak",8500));
		System.out.println(set1.contains(new Employee(1,"sunil",6000)));
		set1.add(null);
		set1.add(null);
		System.out.println(set1.size());
		Iterator<Employee> it1 = set1.iterator();
		while(it1.hasNext())
		{
			Employee emp = it1.next();
			System.out.println(emp);
		}
		System.out.println(set1);*/
		
		/*TreeSet<Employee> set2 = new TreeSet<Employee>();
		set2.add(new Employee(1,"sunil",6000));
		set2.add(new Employee(1,"sunil",6000));
		set2.add(new Employee(3,"Bharat",6000));
		set2.add(new Employee(2,"Deepak",8500));
		System.out.println(set2.size());
		System.out.println(set2.contains(new Employee(1,"sunil",6000)));
		System.out.println(set2.size());
		Iterator<Employee> it2 = set2.iterator();
		while(it2.hasNext())
		{
			Employee emp = it2.next();
			System.out.println(emp);
		}
		System.out.println(set2);*/


		TreeSet<Employee> set3 = new TreeSet<Employee>(new EmployeeComparator());
		set3.add(new Employee(1,"sunil",6000));
		set3.add(new Employee(1,"sunil",7000));
		set3.add(new Employee(3,"Bharat",6000));
		set3.add(new Employee(2,"Deepak",8500));
		//System.out.println(set3.contains(new Employee(0,null,7000)));
		set3.remove(new Employee(0,null,7000));
		System.out.println(set3.size());
		System.out.println(set3);
		
	}

};
