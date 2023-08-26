package Lesson1;
/**
 * Товар
 */
public class Product {
    protected String name; //наименование
    protected String brand; // изготовитель
    protected double price; //стоимость

    public Product(){
        this("Noname");
    }

    public Product(String name){
        this(name, "Noname");
    }

    public Product(String name, String brand){
        this(name, brand, 100);
    }

    public Product(String name, String brand, double price){
        checkName(name);
        checkBrand(brand);
        checkPrice(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        checkName(name);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        checkBrand(brand);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        checkPrice(price);
    }

    private void checkName(String name){
        if (name == null || name.length() < 3)
            this.name = "Noname";
        else
            this.name = name;
    }
    private void checkBrand(String brand){
        if (brand == null || brand.length() < 3)
            this.brand = "Noname";
        else
            this.brand = brand;
    }
    private void checkPrice(double price){
        if(price < 100) {
            throw new RuntimeException("Некорректная цена товара");
        }
        this.price = price;
    }

    public String displayInfo(){
        return String.format("%s - %s - %.2f", name, brand, price);
    }
}
