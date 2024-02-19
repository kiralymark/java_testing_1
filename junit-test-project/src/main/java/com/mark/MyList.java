package com.mark;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class MyList {
		
	private ArrayList<String> people = new ArrayList<String>();
	
	public void add(String personA) {
		people.add(personA);
		
	}
	
	public void remove(String personR) {
		
		if( !(people.contains(personR)) ) {
			throw new NoSuchElementException();
			
		} else {
		people.remove(personR);
		
		} 
		
	}
	
	public int size() {

		return people.size();
		
	}
	
	public boolean isEmpty() {
		
		return people.isEmpty();
		
	}
	
	public void removeAll() {
		people.clear();
		
	}
	

}
