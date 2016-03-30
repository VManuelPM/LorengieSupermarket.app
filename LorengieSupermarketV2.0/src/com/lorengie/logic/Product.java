/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lorengie.logic;

/**
 * Class product
 * @author Asus
 */
public class Product {
    private String productCode; /**Product code*/
    private String kindOfProduct; /**Kind of product*/
    private String nameProducto; /**Product name*/
    private double purchaseValue; /**Purchase value*/
    
    /**
     * Default constructor
     */
    public Product() {
    }
    /**
     * 
     * @param productCode Product code
     * @param kindOfProduct Kind of product
     * @param NameProducto Product name
     * @param purchaseValue Purchase value
     */
    public Product(String productCode, String kindOfProduct, String NameProducto, double purchaseValue) {
        this.productCode = productCode;
        this.kindOfProduct = kindOfProduct;
        this.nameProducto = NameProducto;
        this.purchaseValue = purchaseValue;
    }
    /**
     * Get product code
     * @return product code
     */
    public String getProductCode() {
        return productCode;
    }
    /**
     * Set product code
     * @param productCode product code
     */
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    /**
     * Get kind of product
     * @return kind of product
     */
    public String getKindOfProduct() {
        return kindOfProduct;
    }
    /**
     * Set kind of product
     * @param kindOfProduct kind of product
     */
    public void setKindOfProduct(String kindOfProduct) {
        this.kindOfProduct = kindOfProduct;
    }
    /**
     * Get product name
     * @return product name
     */
    public String getNameProducto() {
        return nameProducto;
    }
    /**
     * Set product name
     * @param NameProducto product name
     */

    public void setNameProducto(String NameProducto) {
        this.nameProducto = NameProducto;
    }
    /**
     * Get purchase value
     * @return purchase value
     */
    public double getPurchaseValue() {
        return purchaseValue;
    }   
    /**
     * Set purchase value
     * @param purchaseValue purchase value
     */
    public void setPurchaseValue(double purchaseValue) {
        this.purchaseValue = purchaseValue;
    }
    
    
    
}
