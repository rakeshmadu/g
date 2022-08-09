package com.bridgelabz.stockaccountmanagement;

public class Stocks {

    private String shareName;
    private double sharePrice;
    private double shareCount;

    //Generating getters and setters

    public String getShareName() {
        return shareName;
    }

    public void setShareName(String shareName) {
        this.shareName = shareName;
    }

    public double getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(double sharePrice) {
        if (sharePrice < 0.0) {
            System.out.println("Price Cannot Be Zero");
        } else {
            this.sharePrice = sharePrice;
        }
    }

    public double getShareCount() {
        return shareCount;
    }

    public void setShareCount(double shareCount) {
        if (shareCount < 0.0) {
            System.out.println("Share Cannot Be Zero");
        } else {
            this.shareCount = shareCount;
        }
    }


@Override
    public String toString() {
        return "Stocks [shareName=" + shareName + ", sharePrice=" + sharePrice + ", shareCount=" + shareCount + "]";
 }
}
