package Bank;

public class Person implements PersonalData{
    private final String fio;
    private final String inn;

    public Person(String fio, String inn) {
        this.fio = fio;
        this.inn = inn;
    }

    public String getFio() {
        return fio;
    }

    @Override
    public String getInn() {
        return null;
    }

    @Override
    public String toString() {
        return String.format("ИНН: %s; ФИО: %s", inn, fio);
    }
}
