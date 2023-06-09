package sample;

public abstract class Employee {

    protected String lastName;
    protected String firstName;
    protected String surName;
    protected int age;

    public int getAge() {
        return age;
    }

    public Employee(String firstName, String lastName, String surName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.age = age;
    }
    public String getFullName() {
        return String.format("%s %s %s", firstName, lastName, surName);
    }
    abstract double countSalary ();

    @Override
    public String toString() {
        return String.format("%30s %5d %8.2f",getFullName(),age,countSalary());
    }
}
