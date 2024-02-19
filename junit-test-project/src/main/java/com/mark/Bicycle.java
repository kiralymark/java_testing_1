package com.mark;

public class Bicycle {
	
	DatabaseConnection dbConnection;
	
	public Bicycle(DatabaseConnection dbConnectionInput) {

		this.dbConnection = dbConnectionInput;
		
		
	}
	
	public Integer sum(String nameInput, String passwordInput, int firstNumber, int secondNumber, int thirdNumber) {

		boolean isUserInDB = dbConnection.checkUserInput(nameInput, passwordInput);
		
		if (isUserInDB) {
			return firstNumber+secondNumber+thirdNumber;
			
		} else {
			return null;
			
		}
		

	}

}
