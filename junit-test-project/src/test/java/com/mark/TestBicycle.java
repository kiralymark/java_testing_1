package com.mark;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
//import org.mockito.Mock;
import org.mockito.Mockito;

public class TestBicycle {
	
	Bicycle bikeObject = null;
	
	DatabaseConnection dbConnection = Mockito.mock(DatabaseConnection.class);
	
	@Before
	public void init() {

		bikeObject = new Bicycle(dbConnection);

	}
	
	@Test
	public void testSum() {
		
		when(dbConnection.checkUserInput("gyula", "jelszo")).thenReturn(true);
		
		Integer expectedResult = 3;

		assertEquals(expectedResult, bikeObject.sum("gyula", "jelszo", 1, 1, 1));
		
		verify(dbConnection).checkUserInput("gyula", "jelszo");
		
	}

	
}
