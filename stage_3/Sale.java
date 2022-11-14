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
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Sale {
    private String orderId;
    private LocalDateTime orderDate;
    private ArrayList<Product> products;
    public Sale(){
        products = new ArrayList<>();
    }

    public Sale(String orderId, LocalDateTime orderDate, ArrayList<Product> products) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.products = products;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public double totalPrice(){
        double result = 0.0;
        for(Product product:products){
            if(product.getPromotion()!=null){
                result = result+product.getQuantity()*product.getUnitPrice() *(1-product.getPromotion().getDiscountRate());
            }
            else{
                result = result+product.getQuantity()*product.getUnitPrice();
            }
        }
        return result;
    }
    public int numberOfItems(){
        return products.size();
    }
    public void addProduct(Product product){
        this.products.add(product);
    }

    public void showSaleInfo() {
        System.out.println("["+orderId+", "+orderDate+" ]");
        System.out.println("List of products");
        for(Product product:products){
            product.showProductInfo();
        }
    }
}
