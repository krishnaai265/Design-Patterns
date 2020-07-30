package com.epam.controller;
import com.epam.model.HDFC;
import com.epam.model.ICICI;
import com.epam.model.SBI;
import com.epam.ui.AbstractFactory;

class BankFactory extends AbstractFactory {
	public Bank getBank(String bank) {
		if (bank == null) {
			return null;
		}
		if (bank.equalsIgnoreCase("HDFC")) {
			return new HDFC();
		} else if (bank.equalsIgnoreCase("ICICI")) {
			return new ICICI();
		} else if (bank.equalsIgnoreCase("SBI")) {
			return new SBI();
		}
		return null;
	}

	public Loan getLoan(String loan) {
		return null;
	}
}