package Homework4;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        System.out.printf("Вес первой коробки с яблоками: %.2f\n", appleBox1.getWeight());

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruit(new Apple());
        appleBox2.addFruit(new Apple());
        System.out.printf("Вес второй коробки с яблоками: %.2f\n", appleBox2.getWeight());


        if (appleBox1.compare(appleBox2)){
            System.out.println("Ваши коробки равны");
        }
        else{
            System.out.println("Ваши коробки не равны");
        }

        appleBox1.replaceFruit(appleBox2);

        System.out.printf("Теперь вес первой коробки с яблоками: %.2f\n", appleBox1.getWeight());
        System.out.printf("Теперь вес второй коробки с яблоками: %.2f\n", appleBox2.getWeight());

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(new Orange());
        orangeBox1.addFruit(new Orange());
        System.out.printf("Вес первой коробки с апельсинами: %.2f\n", orangeBox1.getWeight());

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());
        orangeBox2.addFruit(new Orange());
        System.out.printf("Вес второй коробки с апельсинами: %.2f\n", orangeBox2.getWeight());


        if (orangeBox1.compare(orangeBox2)){
            System.out.println("Ваши коробки равны");
        }
        else{
            System.out.println("Ваши коробки не равны");
        }

        orangeBox2.replaceFruit(orangeBox1);
        System.out.printf("Теперь вес первой коробки с апельсинами: %.2f\n", orangeBox1.getWeight());
        System.out.printf("Теперь вес второй коробки с апельсинами: %.2f\n", orangeBox2.getWeight());
    }
}
