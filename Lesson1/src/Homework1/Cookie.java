package Homework1;

public class Cookie extends Product{
    private int quantity;
    private double weight;

    public Cookie(String name, String brand, double price, int quantity, double weight){
        super(name, brand, price);
        this.quantity = quantity;
        this.weight = weight;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public String displayInfo() {
        return String.format("[Печенье] %s - %s - %.2f - %d - w: %.2f", name, brand, price, quantity, weight);
    }
}
