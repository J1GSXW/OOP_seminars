package Homework3;

/**
 * Обычный работник (фул-тайм)
 */
public class Worker extends Employer{

    public Worker(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }



    @Override
    public double calculateSalary() {
        return salary;
    }


    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная заработная плата(фиксированная) %.2f; Возраст %d",
                surName, name, salary, age);
    }
}
