package com;

public class CalculateSlab5Tax {
    double salary;

    public void calculateSlab5Tax(double annualSalary) {
        salary = annualSalary;

        final double SLAB_5_START = 1500000;
        final double SLAB_5_MIDDLE = 5000000;
        final double SLAB_5_TAX_RATE = 30.0;
        final double CESS_RATE = 0.04;

        double slab5Tax = 15000 + 30000 + 45000 + 60000 + ((annualSalary - SLAB_5_START) * SLAB_5_TAX_RATE / 100);
        System.out.println("Your annual tax is " + slab5Tax);

        double slab5Cess = slab5Tax * CESS_RATE;
        System.out.println("Your annual health and education cess is " + slab5Cess);

        double surCharge = 0.0;

        if (annualSalary > SLAB_5_MIDDLE && annualSalary < 10000000) {
            System.out.println("Since your annual salary is more than 50 lakhs, you have to pay a surcharge of 10% of the tax.");
            surCharge = slab5Tax * 0.10;
        } else if (annualSalary > 10000000) {
            System.out.println("Since your annual salary is more than 1 Crore, you have to pay a surcharge of 15% of the tax.");
            surCharge = slab5Tax * 0.15;
        }

        System.out.println("Your surcharge payable is " + surCharge);

        double slab5Total = slab5Tax + slab5Cess + surCharge;
        System.out.println("The final tax liability for the year is " + slab5Total);
    }
}
