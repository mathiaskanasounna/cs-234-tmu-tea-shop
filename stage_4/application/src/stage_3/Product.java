
/*
*
 *   Name:
 *      - Mathias K.
 *      - Theodoro L.
 *   Date: 11/13/2022
 *   Title: Project Stage 3
 *   Class: CS-234
 *
 * */
package stage_4.application.src.stage_3;

import stage_3.Promotion;

public class Product {
    private String distributor;
    private String productId;
    private String productName;
    private double unitPrice;
    private int quantity;
    private Promotion promotion;

    public Product() {
    }

    public Product(String distributor, String productId, String productName, double unitPrice, int quantity, Promotion promotion) {
        this.distributor = distributor;
        this.productId = productId;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.promotion = promotion;
    }

    public String getDistributor() {
        return distributor;
    }

    public void setDistributor(String distributor) {
        this.distributor = distributor;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public String printProduct(){
        return  this.productId;
    }

    public void showProductInfo() {
        System.out.println("["+productId+", "+productName+", "+unitPrice+", "+quantity+", "+distributor+" ]");
    }
}
