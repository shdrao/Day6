package com.capgemini.question4.test;

import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.question3.Student;

class StudentTest {

	@Test
	void testStudentNames() {
		Student s1 = new Student("GHI");
		Student s2 = new Student("ABC");
		Student s3 = new Student("DEF");
		
		TreeSet<Student> studentCollection = new TreeSet<>();

		studentCollection.add(s1);
		studentCollection.add(s2);
		studentCollection.add(s3);

		for (Student student : studentCollection) {
			System.out.println(student.getName());
		}
	}
}