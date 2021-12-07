package com.qa.calc;

import java.util.Scanner;

public class Menu {
	
	public void userCalc() {
		Calculator c = new Calculator();
		Scanner s = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		boolean waitingForInput = true;
		
		while(waitingForInput) {
			try {
				System.out.println("Enter two integers:");
				num1 = s.nextInt();
				num2 = s.nextInt();
				waitingForInput = false;
			} catch (Exception e) {
				System.out.println("\nERROR: Please enter an integer value!");
			}
		}
		
		do {
			waitingForInput = true;
			
			System.out.println("\nWhat calculation would you like to do? add, mul, sub, div are the only options.");
			String selection = s.next().toLowerCase();
			
			switch (selection) {
				case "add":
					System.out.println("\nResult = " + c.add(num1, num2));
					waitingForInput = false;
					break;
				case "mul":
					System.out.println("\nResult = " + c.mul(num1, num2));
					waitingForInput = false;
					break;
				case "sub":
					System.out.println("\nResult = " + c.sub(num1, num2));
					waitingForInput = false;
					break;
				case "div":
					System.out.println("\nResult = " + c.div(num1, num2));
					waitingForInput = false;
					break;
				default:
					System.out.println("You have entered an invalid operation. Try Again.");
			}
		} while (waitingForInput);
		
		s.close();
	}
}
