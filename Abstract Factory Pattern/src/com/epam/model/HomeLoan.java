package com.epam.model;
import com.epam.controller.Loan;

public class HomeLoan extends Loan {
	public void getInterestRate(double r) {
		rate = r;
	}
}