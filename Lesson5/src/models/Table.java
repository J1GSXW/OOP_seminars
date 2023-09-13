package models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {

    private static int counter;

    private final int no;

    private final Collection<Resevation> resevations = new ArrayList<>();

    public Collection<Resevation> getResevations() {
        return resevations;
    }

    public int getNo() {
        return no;
    }

    {
        no = ++counter;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Столик №%d", no);
    }
}