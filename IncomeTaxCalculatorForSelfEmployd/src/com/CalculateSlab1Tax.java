package com;

public class CalculateSlab1Tax {
	float salary;
	
	
	public void calculateSlab1Tax(float annualSalary) {
		
	salary = annualSalary;
	
	System.out.println("Congratulatons! You comes under tax Slab-1");
	float slab1Tax = (annualSalary - 300000) * 5/100;
	System.out.println("Your annual tax is " +slab1Tax);
	float slab1Cess = slab1Tax*4/100;
	System.out.println("Your annual heath and education cess is " +slab1Cess);
	float slab1Total = slab1Tax + slab1Cess;
	System.out.println("The final tax liability for the year is " +slab1Total);
	
	}

}
