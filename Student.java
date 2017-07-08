package com.comparable_comparator;

class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Student o) {
		return this.getName().compareTo(o.getName());
//		if (this.getAge() > o.getAge()) {
//			return 1;
//		} else if (this.getAge() < o.getAge()) {
//			return -1;
//		}
//		return 0;
	}

}
