/**
 *   Name:
 *      - Mathias K.
 *      - Theodoro L.
 *   Date: 11/13/2022
 *   Title: Project Stage 3
 *   Class: CS-234
 *
 * */
package stage_4.application.src.stage_3;

import java.time.LocalDate;
import java.util.Date;

public class Promotion {

    private String promotionID;
    private LocalDate startDate;
    private LocalDate endDate;
    private String promotionDescription;
    private String couponCode;
    private double discountRate;

    public Promotion() {
    }

    public Promotion(String promotionID, LocalDate startDate, LocalDate endDate, String promotionDescription, String couponCode, double discountRate) {
        this.promotionID = promotionID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.promotionDescription = promotionDescription;
        this.couponCode = couponCode;
        this.discountRate = discountRate;
    }

    public String getPromotionID() {
        return promotionID;
    }

    public void setPromotionID(String promotionID) {
        this.promotionID = promotionID;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public String getPromotionDescription() {
        return promotionDescription;
    }

    public void setPromotionDescription(String promotionDescription) {
        this.promotionDescription = promotionDescription;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    public void showPromotionInfo(){
        System.out.println("["+promotionID+", "+couponCode+", "+discountRate+", "+promotionDescription+" ]");
    }
}
