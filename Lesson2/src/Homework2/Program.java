package Homework2;

public class Program {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Васька", 20),
                new Cat("Барсик", 10),
                new Cat("Мурзик", 15),
                new Cat("Снежок",25),
                new Cat("Пушок", 5),
        };

        Plate plate = new Plate();
        plate.addFood(60);

        for (Cat cat:cats) {
            cat.eat(plate);
        }

        System.out.println();

        for (Cat cat:cats){
            if (cat.isSatiety()){
                System.out.println(cat.getName() + " наелся");
            }
            else {
                System.out.println(cat.getName() + " остался голодным");
            }
        }
    }
}
