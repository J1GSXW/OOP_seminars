package Lesson1;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Program {
    public static void main(String[] args) {
          Product product1 = new Product();
//        product1.name = "Product1";
//        product1.brand = "Brand1";
//        product1.price = 200;
//          System.out.println(product1.displayInfo());

        Product product2 = new Product("", "Brand2", 100);
//        System.out.println(product2.displayInfo());


        Product product3 = new Product("Product3");
//        product3.price = -100;
//        product3.name = "A";
//        System.out.println(product3.displayInfo());


        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Бутылка1", "ООО Молоко", 350, 1.5, 15);
//        System.out.println(bottleOfMilk1.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater("Бутылка c водой", "ООО Источник", 350, 1);
//        System.out.println(bottleOfWater1.displayInfo());

        BottleOfWater bottleOfWater2 = new BottleOfWater("Бутылка c водой", "ООО Источник", 150, 1.5);
//        System.out.println(bottleOfWater1.displayInfo());

        BottleOfWater bottleOfWater3 = new BottleOfWater("Бутылка c водой", "ООО Источник", 250, 2);
//        System.out.println(bottleOfWater1.displayInfo());


        List<Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);

        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWater = vendingMachine.getBottleOfWater("Бутылка c водой", 2);
        if (bottleOfWater != null){
            System.out.println("Вы получили: ");
            System.out.println(bottleOfWater.displayInfo());
        }
        else{
            System.out.println("Такой бутылки нет");
        }
    }
}