package Homework6;

import java.util.Scanner;

public class InputOrder {

    //region Methods
    private String promt(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }

    public void inputFromConsole(){
        order.clientName = promt("Client name: ");
        order.product = promt("Product: ");
        order.qnt = Integer.parseInt(promt("Quantity: "));
        order.price = Integer.parseInt(promt("Price: "));
    }
    //endregion

    //region Private field
    private Order order;
    //endregion

    //region Constructor
    public InputOrder(Order order) {
        this.order = order;
    }
    //endregion

    //region Getter and Setter
    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    //endregion
}
