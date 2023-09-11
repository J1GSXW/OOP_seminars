package Bank;

public class Program {
    public static void main(String[] args) {

        Entity entity = new Entity("ООО Рога и копыта", "12223221");
        DebetAccount<Entity> entityDebetAccount1 = new DebetAccount<>(entity, 2000000);

        Person person1 = new Person("Клиент", "2222211113");

        CreditAccount<Person> creditAccount1 = new CreditAccount<>(person1, 305);

        Transaction<Account<?>> transaction = new Transaction<>(entityDebetAccount1, creditAccount1, 30000);
        transaction.execute();

    }
}
