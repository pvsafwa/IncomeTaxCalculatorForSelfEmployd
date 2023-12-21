package com;
import java.util.Scanner;

public class TaxCalC {
	public static float annualSalary;
	public static String continuePrompt;

	public static void main(String[] args) {
				
		Scanner inputKey = new Scanner(System.in);
		System.out.println("Please Enter your name");
		String name = inputKey.next();
		System.out.println("Hello " +name+"!");
		do {
		System.out.println("Please Enter your annual salary");
		Scanner inputSalary = new Scanner(System.in);
		annualSalary = inputSalary.nextFloat();
			
		if (annualSalary > 300000 && annualSalary < 600000) {
			CalculateSlab1Tax slab1Tax = new CalculateSlab1Tax();
			slab1Tax.calculateSlab1Tax(annualSalary);
		}
		
		else if(annualSalary > 300000 && annualSalary < 900000) {
			CalculateSlab2Tax slab2Tax = new CalculateSlab2Tax();
			slab2Tax.calculateSlab2Tax(annualSalary);		
		}
		
		else if(annualSalary > 300000 && annualSalary < 1200000) {
			CalculateSlab3Tax slab3Tax = new CalculateSlab3Tax();
			slab3Tax.calculateSlab3Tax(annualSalary);
		}
		
		else if(annualSalary > 300000 && annualSalary < 1500000) {
			CalculateSlab4Tax slab4Tax = new CalculateSlab4Tax();
			slab4Tax.calculateSlab4Tax(annualSalary);
		}
		
		else if(annualSalary > 1500000) {
			CalculateSlab5Tax slab5Tax = new CalculateSlab5Tax();
			slab5Tax.calculateSlab5Tax(annualSalary);	
			
		}
		else
			System.out.println("You don't have to pay any income taxes");
		
		System.out.println("Do you want to continue ? (y/n)");
		
			continuePrompt = inputKey.next();
			if (continuePrompt.equals("n"))
			{
				System.out.println("Program Terminated!");
				System.exit(0);
			}
			
			
		}
		while (continuePrompt.equalsIgnoreCase("y"));
		
	}

}
