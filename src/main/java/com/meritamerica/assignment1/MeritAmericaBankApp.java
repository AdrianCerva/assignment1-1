package com.meritamerica.assignment1;

import java.text.DecimalFormat;

public class MeritAmericaBankApp {
	
public static void main(String[] args) {
		
		AccountHolder tiny = new AccountHolder("Adrian", "Jesus", 
				"Cervantes", "XXX-XX-2222", 100.00, 1000.00);
		System.out.println("Name: " + tiny.firstName + " " + tiny.middleName + " " + tiny.lastName);
		System.out.println("SSN: " + " " + tiny.ssn);
		SavingsAccount check = new SavingsAccount(100.00);
		System.out.println("Checking Account Balance: $" + check.balance);
		System.out.println("Checking Account Interest Rate: " + check.interestRate);
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Checking Account Balance in 3 years: " + df.format(check.futureValue(3)));
		SavingsAccount money = new SavingsAccount(1000.00);
		System.out.println("Saving Account Balance: $" + money.balance);
		System.out.println("Saving Account Interest Rate: " + money.interestRate);
		DecimalFormat my = new DecimalFormat("0.00");
		System.out.println("Saving Account Balance in 3 years: " + my.format(money.futureValue(3)));
		
	}
	
}