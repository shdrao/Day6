package com.capgemini.question1.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.capgemini.question1.Car;
import com.capgemini.question1.CellPhone;
import com.capgemini.question1.Laptop;
import com.capgemini.question1.School;
import com.capgemini.question1.Television;


class CollectionTest {



	@Test
	void testLaptop() {
		ArrayList<Laptop> laptopCollection = new ArrayList<Laptop>();
		
		assertEquals(true, laptopCollection.add(new Laptop("Lenevo", "A7", "Widows 10 Home Basic", "i7 4 gen")));
		assertEquals(true, laptopCollection.add(new Laptop("Dell", "3542", "Linux Mint", "i3 4 gen")));
		assertEquals(true, laptopCollection.add(new Laptop("Apple", "Mac Air", "Machantosh", "i7 8 gen")));
		
		for (Laptop laptop : laptopCollection) {
			System.out.println(laptop.getCompany() + " " + laptop.getModel() + " " + laptop.getOperatingSystem() + " "+ laptop.getProcessor());
		}
		
	}
	
	@Test
	void testCar() {
		ArrayList<Car> carCollection = new ArrayList<Car>();
		
		assertEquals(true, carCollection.add(new Car("BMW", "C4", 2014, 256666)));
		assertEquals(true, carCollection.add(new Car("Audi", "gsa", 2016, 256666)));	
		assertEquals(true, carCollection.add(new Car("Maruthi", "sC4", 2018, 256666)));
		assertEquals(true, Car.itarateAllCars(carCollection));
		
	}
	
	@Test
	void testTelevision() {
		ArrayList<Television> televisionCollection = new ArrayList<Television>();
		
		assertEquals(true, televisionCollection.add(new Television("Sharp", "LCD", true, 256666)));
		assertEquals(true, televisionCollection.add(new Television("Audi", "LED", false, 256666)));	
		assertEquals(true, televisionCollection.add(new Television("Maruthi", "Plasma", false, 256666)));
		for (Television television : televisionCollection) {
			System.out.println(television.getCompany() + " " + television.getType() + " " + television.isEnabled3d() + " "+ television.getPrice());
		}
		
	}
	
	@Test
	void testCellPhone() {
		ArrayList<CellPhone> cellPhoneCollection = new ArrayList<CellPhone>();
		
		assertEquals(true, cellPhoneCollection.add(new CellPhone("Motp", "g4", "sakdgkasdhkj", "android", 56565)));
		assertEquals(true, cellPhoneCollection.add(new CellPhone("Samsung", "j7", "ssg", "android", 1234)));
		assertEquals(true, cellPhoneCollection.add(new CellPhone("iphone", "8", "awf", "windows", 990)));
		for (CellPhone cellPhone : cellPhoneCollection) {
			System.out.println(cellPhone.getCompany() + " " + cellPhone.getModel() + " " + cellPhone.getDescription() + " "+ cellPhone.getOperatingSystem()+ "  " + cellPhone.getPrice());
		}
		
	}
	
	@Test
	void testSchool() {
		ArrayList<School> schoolCollection = new ArrayList<School>();
		
		assertEquals(true, schoolCollection.add(new School("Govt", "bangalore", "north",6)));
		assertEquals(true, schoolCollection.add(new School("National", "mysore", "varuna",5)));
		assertEquals(true, schoolCollection.add(new School("public", "kolar", "gold",1)));
		for (School school : schoolCollection) {
			System.out.println(school.getName() + " " + school.getCity() + " " + school.getSchoolDistrict() + " "+ school.getGreateSchoolRanking());
		}
		
	}
}