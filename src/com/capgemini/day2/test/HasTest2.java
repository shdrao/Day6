package com.capgemini.day2.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

import org.junit.jupiter.api.Test;

import com.capgemini.question1.Car;
import com.capgemini.question1.CellPhone;
import com.capgemini.question1.Laptop;
import com.capgemini.question1.School;
import com.capgemini.question1.Television;

class HasTest2 {

	@Test
	void testLaptop() {
		HashSet<Laptop> laptopCollection = new HashSet<>();

		assertEquals(true, laptopCollection.add(new Laptop("Lenevo", "A7", "Widows 10 Home Basic", "i7 4 gen")));
		assertEquals(false, laptopCollection.add(new Laptop("Lenevo", "A7", "Widows 10 Home Basic", "i7 4 gen")));
		assertEquals(true, laptopCollection.add(new Laptop("Dell", "3542", "Linux Mint", "i3 4 gen")));
		assertEquals(true, laptopCollection.add(new Laptop("Apple", "Mac Air", "Machantosh", "i7 8 gen")));

		for (Laptop laptop : laptopCollection) {
			System.out.println(laptop);
		}

	}

	@Test
	void testCar() {
		HashSet<Car> carCollection = new HashSet<>();

		assertEquals(true, carCollection.add(new Car("BMW", "C4", 2014, 256666)));
		assertEquals(true, carCollection.add(new Car("Audi", "gsa", 2016, 256666)));
		assertEquals(true, carCollection.add(new Car("Maruthi", "sC4", 2018, 256666)));
		assertEquals(false, carCollection.add(new Car("Maruthi", "sC4", 2018, 256666)));

		for (Car car : carCollection) {
			System.out.println(car);
		}

	}

	@Test
	void testCellPhone() {

		HashSet<CellPhone> cellPhoneCollection = new HashSet<>();

		assertEquals(true, cellPhoneCollection.add(new CellPhone("Motp", "g4", "sakdgkasdhkj", "android", 56565)));
		assertEquals(true, cellPhoneCollection.add(new CellPhone("Samsung", "S5", "sakdgkasdhkj", "windows", 56565)));
		assertEquals(false, cellPhoneCollection.add(new CellPhone("Samsung", "S5", "sakdgkasdhkj", "windows", 56565)));
		assertEquals(true, cellPhoneCollection.add(new CellPhone("Redmi", "note5", "sakdgkasdhkj", "linux", 56565)));

		for (CellPhone cellPhone : cellPhoneCollection) {
			System.out.println(cellPhone);
		}

	}

	@Test
	void testSchool() {
		HashSet<School> schoolCollection = new HashSet<>();

		assertEquals(true, schoolCollection.add(new School("Gibb", "Kumta", "karwar", 6)));
		assertEquals(true, schoolCollection.add(new School("Nirmala", "Honnavar", "Up", 5)));
		assertEquals(false, schoolCollection.add(new School("Nirmala", "Honnavar", "Up", 5)));
		assertEquals(true, schoolCollection.add(new School("DPS", "ranchi", "Zarkhand", 1)));
		
		for (School school : schoolCollection) {
			System.out.println(school);
		}

	}

	@Test
	void testTelevision() {
		HashSet<Television> televisionCollection = new HashSet<>();

		assertEquals(true, televisionCollection.add(new Television("Sharp", "LCD", true, 256666)));
		assertEquals(true, televisionCollection.add(new Television("Sony", "LED", false, 2556666)));
		assertEquals(false, televisionCollection.add(new Television("Sony", "LED", false, 2556666)));
		assertEquals(true, televisionCollection.add(new Television("MI", "Plasma", false, 2566666)));

		for (Television television : televisionCollection) {
			System.out.println(television);
		}

	}

}