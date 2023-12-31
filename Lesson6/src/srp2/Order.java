package srp2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Order {

    private String clientName;
    private String product;
    private int qnt;
    private int price;

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

    public void inputFromConsole(){
        clientName = promt("Client name: ");
        product = promt("Product: ");
        qnt = Integer.parseInt(promt("Quantity: "));
        price = Integer.parseInt(promt("Price: "));
    }

    public void saveToJson(){
        String fileName = "order.json";
        try (FileWriter writer = new FileWriter(fileName, false)){
            writer.write("{\n");
            writer.write("\"clientName\":\""+ clientName + "\", \n");
            writer.write("\"product\":\""+ product + "\", \n");
            writer.write("\"qnt\":"+qnt+",\n");
            writer.write("\"price\":"+price+"\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    private String promt(String message){
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
