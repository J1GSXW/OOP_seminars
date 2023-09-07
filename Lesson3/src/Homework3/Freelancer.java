package Homework3;

public class Freelancer extends Employer{

    private int hoursWorked;


    public Freelancer(String name, String surName, double salary, int age, int hoursWorked) {
        super(name, surName, salary, age);
        this.hoursWorked = hoursWorked;
    }






    @Override
    public double calculateSalary() {
        return hoursWorked * salary;
    }


    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата(почасовая) %.2f; Возраст %d",
                surName, name, calculateSalary(), age);
    }
}
