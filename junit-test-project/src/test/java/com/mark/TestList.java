package com.mark;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestList {
	
	private MyList testPeople = new MyList();
	
	@Before
	public void init() {
		
		testPeople.add("Gyula");
		testPeople.add("Anna");

	}
	
	@Test
	public void testSize() {
		
		assertEquals("Méret ellenőrzés", 2, testPeople.size());
		
	}

	@Test
	public void testIsEmpty() {

		assertFalse(testPeople.isEmpty());

		assertEquals("Ellenőrzés hogy Üres:", false, testPeople.isEmpty());
		
	}
	
	@Test
	public void testAdd() {
		// 
		testPeople.add("János");						
		assertEquals("Hozzáadás ellenőrzés", 3, testPeople.size());
		
	}

	@Test(expected = NoSuchElementException.class)
	public void testRemove() {
		
		testPeople.remove("Károly");
		
	}
	
	@Test
	public void testRemoveAll() {
		testPeople.removeAll();						
		assertTrue(testPeople.isEmpty());
		
	}
	
	@After
	public void destroy() {
		testPeople.removeAll();
		
	}

}
