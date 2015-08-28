package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone[] phones = {
				new IPhone("iPhone 6", "Apple", 700000),
				new Galaxy("Galaxy S6", "SAMSUNG", 650000)
		};
		
		for(SmartPhone phone : phones) {
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			phone.useSpecialFunction();
			phone.turnOff();
			
			System.out.println();
		}
		
		
	}

}
