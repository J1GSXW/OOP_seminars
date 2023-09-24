package Homework6;

import java.io.FileWriter;
import java.io.IOException;

public class SaveOrder {

    //region Method
    public void saveToJson(){
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)){
            writer.write("{\n");
            writer.write("\"clientName\":\""+ order.clientName + "\", \n");
            writer.write("\"product\":\""+ order.product + "\", \n");
            writer.write("\"qnt\":"+order.qnt+",\n");
            writer.write("\"price\":"+order.price+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
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

    //region Constructor
    public SaveOrder(Order order) {
        this.order = order;
    }
    //endregion

    //region Private field
    private Order order;
    //endregion
}
