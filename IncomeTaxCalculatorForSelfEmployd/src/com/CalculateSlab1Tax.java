package com;

public class CalculateSlab1Tax {
	float salary;
	
	
	public void calculateSlab1Tax(float annualSalary) {
		
		salary = annualSalary;
	
	System.out.println("Congratulatons! You comes under tax Slab-1");
	
	//Calculating taxes for Slab-1
	float slab1Tax = (annualSalary - 300000) * 5/100;
	System.out.println("Your annual tax is " +slab1Tax);
	
	//Calculating health and education cess to be paid
	float slab1Cess = slab1Tax*4/100;
	System.out.println("Your annual heath and education cess is " +slab1Cess);
	
	//Calculating the final tax liability (including Health and Education cess)
	float slab1Total = slab1Tax + slab1Cess;
	System.out.println("The final tax liability for the year is " +slab1Total);
	
	}

}
