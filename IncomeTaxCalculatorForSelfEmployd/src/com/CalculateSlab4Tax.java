package com;

public class CalculateSlab4Tax {
	float salary;
	public void calculateSlab4Tax(float annualSalary) {
		salary = annualSalary;
	
	System.out.println("Congratulatons! You comes under tax Slab-3");
	float slab3Tax = (15000+30000+(annualSalary - 900000) * 15/100);
	System.out.println("Your annual tax is " +slab3Tax);
	float slab3Cess = slab3Tax*4/100;
	System.out.println("Your annual heath and education cess is " +slab3Cess);
	float slab3Total = slab3Tax + slab3Cess;
	System.out.println("The final tax liability for the year is " +slab3Total);

}
}
