/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lorengie.logic;

/**
 * Class Bill
 * @author Asus
 */
public class Bill {
    private int billCode; /**Bill code*/
    private String productname; /**Product name*/
    private int productCode; /**Product code*/
    private double salePrice; /**Sale price*/
    private String billDate; /**Bill date*/ 
    private String sellerName; /**Seller name*/

    /**
     * Default constructor
     */
    public Bill() {
    }
    
    /**
     * 
     * @param billCode Bill code
     * @param productname Product name
     * @param productCode Product code
     * @param salePrice Sale price
     * @param billDate Bill date
     * @param sellerName Seller name
     */
    public Bill(int billCode, String productname, int productCode, double salePrice, String billDate, String sellerName) {
        this.billCode = billCode;
        this.productname = productname;
        this.productCode = productCode;
        this.salePrice = salePrice;
        this.billDate = billDate;
        this.sellerName = sellerName;
    }

    /**
     * Get Bill code
     * @return Bill code
     */
    public int getBillCode() {
        return billCode;
    }
    /**
     * Set bill code
     * @param billCode Bill code
     */
    public void setBillCode(int billCode) {
        this.billCode = billCode;
    }
    /**
     * Get product name
     * @return product name
     */
    public String getProductname() {
        return productname;
    }
     /**
      * Set product name
      * @param productname product name
      */
    public void setProductname(String productname) {
        this.productname = productname;
    }
    /**
     * Get product code
     * @return product code
     */
    public int getProductCode() {
        return productCode;
    }
    /**
     * Set product code
     * @param productCode product code
     */
    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }
    /**
     * Get sale price
     * @return Sale price
     */
    public double getSalePrice() {
        return salePrice;
    }
    /**
     * Set sale price
     * @param salePrice sale price
     */
    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }
    /**
     * Get bill date
     * @return Bill date
     */
    public String getBillDate() {
        return billDate;
    }
    /**
     * Set bill date
     * @param billDate bill date
     */
    public void setBillDate(String billDate) {
        this.billDate = billDate;
    }
    /**
     * Get seller name
     * @return seller name
     */
    public String getSellerName() {
        return sellerName;
    }
    /**
     * Set seller name
     * @param sellerName seller name
     */
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
 
    
}
