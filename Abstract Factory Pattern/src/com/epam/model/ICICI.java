package com.epam.model;
import com.epam.controller.Bank;

public class ICICI implements Bank {
	private final String BNAME;

	public ICICI() {
		BNAME = "ICICI BANK";
	}

	public String getBankName() {
		return BNAME;

	}
}