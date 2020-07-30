package com.epam.model;
import com.epam.controller.Loan;

public class BussinessLoan extends Loan {
	public void getInterestRate(double r) {
		rate = r;
	}
}