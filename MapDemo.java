import java.util.*;
public class MapDemo
{
	public static void main(String args[])
	{
		/*HashMap<Employee, String>  hm = new HashMap<Employee, String>();
		hm.put(new Employee(3,"Bharat",6000), "Administrator");
		hm.put(new Employee(1,"Sunil",6000), "All Rounder");
		hm.put(new GreatEmployee(4,"Deepak",8500),"Placement Incharge");
		hm.put(null,"Does Nothing");
		hm.put(new Employee(3,null,0),null);
		System.out.println(hm);*/
		//System.out.println("\n");



		/*Hashtable<Employee, String>  ht = new Hashtable<Employee, String>();
		ht.put(new Employee(3,"Bharat",6000), "Administrator");
		ht.put(new Employee(1,"Sunil",6000), "All Rounder");
		ht.put(new GreatEmployee(2,"Deepak",8500),"Placement Incharge");
		//ht.put(null,"Does Nothing");// NullPointerException
		//ht.put(new Employee(3,"Bharat",6000),null); //NullPointerException
		System.out.println(ht);
		System.out.println("\n");*/


		LinkedHashMap<Employee,String> lhm = new LinkedHashMap<Employee,String>();
		/*lhm.put(new Employee(3,"Bharat",6000), "Administrator");
		lhm.put(new Employee(1,"Sunil",6000), "All Rounder");
		lhm.put(new GreatEmployee(2,"Deepak",8500),"Placement Incharge");
		lhm.put(null,"Does Nothing");
		lhm.put(new Employee(3,"Bharat",6000),null);
		System.out.println(lhm);
		System.out.println("\n");
		String s = lhm.get(new Employee(1,null,0));
		System.out.println(s);
		System.out.println(lhm);*/
		//System.out.println("\n");

		/*TreeMap<Employee,String> tm = new TreeMap<Employee,String>();
		tm.put(new Employee(3,"Bharat",6000), "Administrator");
		tm.put(new Employee(1,"Sunil",6000), "All Rounder");
		tm.put(new GreatEmployee(2,"Deepak",8500),"Placement Incharge");
		//tm.put(null,"Does Nothing");// NullPointerException tries to call compareTo()
		tm.put(new Employee(3,"Bharat",6000),null);
		System.out.println(tm);
		System.out.println("\n");*/

		/*TreeMap<Employee,String> tm1 = new TreeMap<Employee,String>(new EmployeeComparator());
		tm1.put(new Employee(3,"Bharat",6000), "Administrator");
		tm1.put(new Employee(1,"Sunil",6000), "All Rounder");
		tm1.put(new GreatEmployee(2,"Deepak",8500),"Placement Incharge");
		//tm.put(null,"Does Nothing"); NullPointerException tries to call compareTo()
		tm1.put(new Employee(3,"Bharat",6000),null);
		System.out.println(tm1);
		System.out.println("\n");*/
	}
};