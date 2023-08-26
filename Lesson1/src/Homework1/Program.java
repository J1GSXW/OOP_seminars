package Homework1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        BottleOfMilk bottleOfMilk1 = new BottleOfMilk("Бутылка1", "ООО Молоко", 350, 1.5, 15);
        BottleOfWater bottleOfWater1 = new BottleOfWater("Бутылка c водой", "ООО Источник", 350, 1);
        BottleOfWater bottleOfWater2 = new BottleOfWater("Бутылка c водой", "ООО Источник", 150, 1.5);
        BottleOfWater bottleOfWater3 = new BottleOfWater("Бутылка c водой", "ООО Источник", 250, 2);
        Cookie cookie1 = new Cookie("Орео", "ООО Печенье", 100, 10, 75);
        Cookie cookie2 = new Cookie("Орео", "ООО Печенье", 125, 15, 100);
        Cookie cookie3 = new Cookie("Орео", "ООО Печенье", 150, 20, 125);
        Cookie cookie4 = new Cookie("Орео", "ООО Печенье", 175, 25, 150);
        Cookie cookie5 = new Cookie("Орео", "ООО Печенье", 200, 30, 175);
        Cookie cookie6 = new Cookie("Орео", "ООО Печенье", 225, 35, 200);

        List<Product> products = new ArrayList<>();
        products.add(bottleOfMilk1);
        products.add(bottleOfWater1);
        products.add(bottleOfWater2);
        products.add(bottleOfWater3);
        products.add(cookie1);
        products.add(cookie2);
        products.add(cookie3);
        products.add(cookie4);
        products.add(cookie5);
        products.add(cookie6);
        VendingMachine vendingMachine = new VendingMachine(products);
        Cookie cookie = vendingMachine.getCookie("Орео", 20);
        if (cookie != null){
            System.out.println("Вы получили: ");
            System.out.println(cookie.displayInfo());
        }
        else{
            System.out.println("Такого печенья нет");
        }
    }
}