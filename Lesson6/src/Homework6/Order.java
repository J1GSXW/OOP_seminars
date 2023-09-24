package Homework6;

public class Order {
    protected String clientName;
    protected String product;
    protected int qnt;
    protected int price;

    public Order(){
    }

    public Order(String clientName, String product, int qnt, int price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Заказ: " +
                "Имя клиента - " + clientName +
                ", продукт - " + product +
                ", количество - " + qnt +
                ", цена - " + price;
    }
}
