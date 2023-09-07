package Homework3;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employer> {


    @Override
    public int compare(Employer o1, Employer o2) {

        return Double.compare(o1.calculateSalary(), o2.calculateSalary());

//        return o1.calculateSalary() == o2.calculateSalary() ? 0 :
//                o1.calculateSalary() > o2.calculateSalary() ? 1 : -1;

    }
}