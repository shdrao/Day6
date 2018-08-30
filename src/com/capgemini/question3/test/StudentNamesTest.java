package com.capgemini.question3.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.question3.Student;

class StudentNamesTest {

	@Test
	void testStudentNames() {
		Student s1=new Student("XBCwewee");
		Student s2=new Student("DEFwer");
		Student s3=new Student("GHIwert");
		ArrayList<Student> studentCollection = new ArrayList<>();
		assertEquals(true, studentCollection.add(s1));
		assertEquals(true, studentCollection.add(s2));
		studentCollection.add(s3);
		assertEquals(3, studentCollection.size());
		
		assertEquals(s1, studentCollection.get(0));
		assertEquals(s2, studentCollection.get(1));
		assertEquals(s3, studentCollection.get(2));

		
		for (Student student : studentCollection) {
			System.out.println(student.getName());
		}
	}

}
