package com.capgemini.question5.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.HashSet;
import java.util.TreeSet;

import org.junit.jupiter.api.Test;

import com.capgemini.question1.Car;

class CarTest {

	@Test
	void testCars() {
		TreeSet<Car> carCollection = new TreeSet<>();

		assertEquals(true, carCollection.add(new Car("BMW", "C4", 2014, 256666)));
		assertEquals(true, carCollection.add(new Car("Audi", "gsa", 2016, 256666)));
		assertEquals(true, carCollection.add(new Car("Maruthi", "sC4", 2018, 256666)));
		

		for (Car car : carCollection) {
			System.out.println(car);
		}
	
	
	
	}
}