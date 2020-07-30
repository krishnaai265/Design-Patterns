package com.epam.ui;
import java.io.*;
import java.util.Scanner;

import com.epam.controller.Bank;
import com.epam.controller.FactoryCreator;
import com.epam.controller.Loan;

class AbstractFactoryPatternExample {

	public static void main(String args[]) throws IOException {
		
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the name of Bank from where you want to take loan amount: ");
		String bankName = userInput.nextLine();
		System.out.print("\n");
		System.out.print("Enter the type of loan you want to take, like home loan or bussiness loan or education loan : ");
		String loanName = userInput.nextLine();
		AbstractFactory bankFactory = FactoryCreator.getFactory("Bank");
		Bank b = bankFactory.getBank(bankName);

		System.out.print("\n");
		System.out.print("Enter the interest rate for " + b.getBankName() + ": ");
		double rate = userInput.nextDouble();
		System.out.print("\n");
		System.out.print("Enter the loan amount you want to take: ");
		double loanAmount = userInput.nextDouble();
		System.out.print("\n");
		System.out.print("Enter the number of years to pay your entire loan amount: ");
		int years = userInput.nextInt();
		System.out.print("\n");
		System.out.println("you are taking the loan from " + b.getBankName());
		AbstractFactory loanFactory = FactoryCreator.getFactory("Loan");
		Loan l = loanFactory.getLoan(loanName);
		l.getInterestRate(rate);
		l.calculateLoanPayment(loanAmount, years);

	}

}
