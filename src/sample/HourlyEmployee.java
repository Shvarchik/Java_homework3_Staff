package sample;

public class HourlyEmployee extends Employee{

    private int hourlyRate;
    public HourlyEmployee(String firstName, String lastName, String surName, int age, int hourlyRate) {
        super(firstName, lastName, surName, age);
        this.hourlyRate = hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {

        this.hourlyRate = hourlyRate;
    }

    @Override
    double countSalary() {
        return (20.8*8*hourlyRate);
    }
}
