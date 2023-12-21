package com;

public class CalculateSlab4Tax {
	
	float salary;
	
	public void calculateSlab4Tax(float annualSalary) {
		
			salary = annualSalary;
	
		System.out.println("Congratulatons! You comes under tax Slab-4");
	
		//Calculating taxes for Slab-4
		float slab4Tax = (15000+30000+(annualSalary - 900000) * 15/100);
		System.out.println("Your annual tax is " +slab4Tax);
	
		//Calculating health and education cess to be paid	
		float slab4Cess = slab4Tax*4/100;
		System.out.println("Your annual heath and education cess is " +slab4Cess);
	
		//Calculating the final tax liability (including Health and Education cess)
		float slab4Total = slab4Tax + slab4Cess;
		System.out.println("The final tax liability for the year is " +slab4Total);

}
}


