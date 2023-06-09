package sample;

public class FixedSalaryEmployee extends Employee{

    private double salary;

    public FixedSalaryEmployee(String firstName, String lastName, String surName, int age, double salary) {
        super(firstName, lastName, surName, age);
        this.salary = salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    @Override
    double countSalary() {
        return salary;
    }
}
