package Homework3;

/**
 * Работник
 */
public abstract class Employer implements Comparable<Employer> {
    /**
     * Имя
     */
    protected String name;
    /**
     * Фамилия
     */
    protected String surName;
    /**
     * Ставка заработной платы
     */
    protected double salary;

    /**
     *Возраст
     */
    protected int age;

    public abstract double calculateSalary();

    public Employer(String name, String surName, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d", surName, name, age);
    }

    @Override
    public int compareTo(Employer o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        else
            return surNameRes;
    }
}
