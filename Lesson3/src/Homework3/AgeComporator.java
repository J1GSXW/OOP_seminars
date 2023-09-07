package Homework3;

import java.util.Comparator;

public class AgeComporator implements Comparator<Employer> {
    @Override
    public int compare(Employer o1, Employer o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}
