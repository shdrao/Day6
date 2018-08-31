package com.capgemini.question6.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;

class MapTest {

	

		@Test
		void testStudentsFruits() {
			Map<String, ArrayList<String>> favorites = new HashMap<>();
			
			String[] fruits = new String[] {"Mango", "Jackfruit", "Orange"};
			favorites.put("ABC", new ArrayList<String>(Arrays.asList(fruits)));
		
			fruits = new String[] {"Watermelon", "Sapota", "Tomato"};
			favorites.put("XYZ", new ArrayList<String>(Arrays.asList(fruits)));
			
			for(Map.Entry<String, ArrayList<String>> entry : favorites.entrySet()) {
				System.out.println("Key = " + entry.getKey() +
	                    ", Value = " + entry.getValue());
			}
			
			//assertArrayEquals(new String {Watermelon,  Sapota, Tomato},(favorites.get("XYZ"));
			
			
			
			
		}

	}