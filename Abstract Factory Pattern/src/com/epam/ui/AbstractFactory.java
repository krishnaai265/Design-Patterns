package com.epam.ui;
import com.epam.controller.Bank;
import com.epam.controller.Loan;

public abstract class AbstractFactory {
	public abstract Bank getBank(String bank);
	public abstract Loan getLoan(String loan);
}