package com.capgemini.question3;

import java.util.Objects;

public class Student implements Comparable<Student> {

	private String name;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);

	}

	@Override
	public int compareTo(Student o) {
		return this.name.compareTo(o.name);
	}

	

}
