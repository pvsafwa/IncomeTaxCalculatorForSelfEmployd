package com;

public class CalculateSlab2Tax {
	float salary;
	
	public void calculateSlab2Tax(float annualSalary) {
		
		salary = annualSalary;
		
		System.out.println("Congratulatons! You comes under tax Slab-2");
		float slab2Tax = (15000+(annualSalary - 600000) * 10/100);
		System.out.println("Your annual tax is " +slab2Tax);
		float slab2Cess = slab2Tax*4/100;
		System.out.println("Your annual heath and education cess is " +slab2Cess);
		float slab2Total = slab2Tax + slab2Cess;
		System.out.println("The final tax liability for the year is " +slab2Total);
	}


}
