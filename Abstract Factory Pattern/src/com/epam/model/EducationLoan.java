package com.epam.model;
import com.epam.controller.Loan;

public class EducationLoan extends Loan {
	public void getInterestRate(double r) {
		rate = r;
	}
}