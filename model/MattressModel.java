package com.mattressapp.model;

/**
 * Represents a mattress and customer details in the application.
 * 
 * @author 23048585ManishDhakal
 */
public class MattressModel {
    private int productId;
    private String customerName;
    private String customerPhone;
    private String customerAddress;
    private short quantity;
    private String productName;
    private int productPrice;

    // Default constructor
    public MattressModel() {
    }

    // Parameterized constructor
    public MattressModel(int productId, String customerName, String customerPhone, String customerAddress,
            short quantity, String productName, int productPrice) {
        this.productId = productId;
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.quantity = quantity;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    // Getters and setters
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }
}