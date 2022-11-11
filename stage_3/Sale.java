/**
 *   Name:
 *      - Mathias K.
 *      - Theodoro L.
 *   Date: 11/13/2022
 *   Title: Project Stage 3
 *   Class: CS-234
 *
 * */
package stage_3;
import java.util.ArrayList;

public class Sale {
    private String orderId;
    private String orderDate;
    private Arraylist<String> products;
    public Sale(){
        this.products = new ArrayList<>();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }
    public void getProducts(product){

    }
    public int totalPrice(){

    }
    public int numberOfItems(){
        return products.size;
    }

}
