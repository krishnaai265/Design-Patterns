package com.epam.ui;

import java.util.Scanner;

import com.epam.controller.GetPlanFactory;

public class GenerateBill {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter the name of plan for which the bill will be generated: ");
		String planName = userInput.nextLine();
		System.out.print("Enter the number of units for bill will be calculated: ");
		int units = userInput.nextInt();

		GetPlanFactory planFactory = new GetPlanFactory();

		Plan p = planFactory.getPlan(planName);

		System.out.print("Bill amount for " + planName + " of " + units + " units is: ");
		p.getRate();
		p.calculateBill(units);
	}
}
