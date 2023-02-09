package application;

import entities.BusinessAcount;

public class Main {

	public static void main(String[] args) {
		BusinessAcount ba = new BusinessAcount(12345, "Vini", 1000.0, 5000.0);
		ba.getBalance();
	}

}
