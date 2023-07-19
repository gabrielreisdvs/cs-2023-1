package org.example._04;

public class Employee {
    private Salary salary;

    public Employee(double yearlySalary, double awards) {
        this.salary = new Salary(yearlySalary, awards);
    }

    public double getYearlySalary() {
        return salary.getMonthlySalary() * 12;
    }

    public double getAwards() {
        return salary.getAwards();
    }
}
