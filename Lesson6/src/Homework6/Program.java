package Homework6;

public class Program {
    public static void main(String[] args) {
        Order order = new Order();
        InputOrder inputOrder = new InputOrder(order);
        inputOrder.inputFromConsole();
        SaveOrder saveOrder = new SaveOrder(order);
        saveOrder.saveToJson();

        System.out.println(order);
    }
}
