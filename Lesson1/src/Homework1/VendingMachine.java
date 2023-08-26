package Homework1;

import java.util.List;

public class VendingMachine {
    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                BottleOfWater bottleOfWater = (BottleOfWater) product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume) {
                    return bottleOfWater;
                }
            }
        }
        return null;
    }

    public Cookie getCookie(String name, int quantity){
        for (Product product: products) {
            if (product instanceof Cookie) {
                Cookie cookie = (Cookie) product;
                if (cookie.getName().equals(name) && cookie.getQuantity() == quantity){
                    return cookie;
                }
            }
        }
        return null;
    }
}
