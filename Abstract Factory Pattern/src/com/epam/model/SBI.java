package com.epam.model;
import com.epam.controller.Bank;

public class SBI implements Bank {
	private final String BNAME;

	public SBI() {
		BNAME = "SBI BANK";
	}

	public String getBankName() {
		return BNAME;
	}
}