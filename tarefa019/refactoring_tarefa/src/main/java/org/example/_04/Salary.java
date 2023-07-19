package org.example._04;

public class Salary {
    private double monthlySalary;
    private double awards;

    public Salary(double yearlySalary, double awards) {
        this.awards = awards;
        this.monthlySalary = calculateMonthlySalary(yearlySalary);
    }

    private double calculateMonthlySalary(double yearlySalary) {
        return (yearlySalary + awards) / 12;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public double getAwards() {
        return awards;
    }
}

