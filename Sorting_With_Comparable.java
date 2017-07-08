package com.comparable_comparator;

import java.util.*;
import java.io.*;

/*Comparable lets a class implement its own comparison:

 it's in the same class (it is often an advantage)
 there can be only one implementation (so you can't use that if you want two different cases)
 By comparison, Comparator is an external comparison:

 it is typically in a unique instance (either in the same class or in another place)
 you name each implementation with the way you want to sort things
 you can provide comparators for classes that you do not control
 the implementation is usable even if the first object is null*/

/*Implementing Comparable means "I can compare myself with another object." This is typically useful when there's a single natural default comparison.

 Implementing Comparator means "I can compare two other objects." This is typically useful when there are multiple ways of comparing two instances of a type - e.g. you could compare people by age, name etc.*/

class NameComparator implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		return s1.name.compareTo(s2.name);
	}
}

class AgeComparator implements Comparator<Student> {
	public int compare(Student o1, Student o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;

		if (s1.age == s2.age)
			return 0;
		else if (s1.age > s2.age)
			return 1;
		else
			return -1;
	}
}

public class Sorting_With_Comparable {

	public static void main(String args[]) {
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		Collections.sort(al);
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("Sorting by Name...");

		Collections.sort(al, new NameComparator());
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

		System.out.println("sorting by age...");

		Collections.sort(al, new AgeComparator());
		for (Student st : al) {
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}
	}
}
