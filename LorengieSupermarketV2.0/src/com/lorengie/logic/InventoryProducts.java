/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lorengie.logic;

/**
 * Class inventory products
 * @author Asus
 */
public class InventoryProducts {
    private String productCode; /**Product code*/
    private int accountProduct; /**Account Product */
    private Product nameProduct; /**Name Product */
    private Product typeProduct; /**Type Product */
    private Product purchaseValueProduct; /**Purchase Product */
    private Product valueProductSales; /**Value product Sales */
    private Provider nameProvider; /**Name provider */
    private double totalValueInWarehouse; /**Total value in warehouse */
    
    
    /**
     * Default constructor
     */
    public InventoryProducts() {
    }
    
    /**
     * 
     * @param productCode Product code
     * @param accountProduct Account Product
     * @param nameProduct Name Product
     * @param typeProduct Type Product
     * @param purchaseValueProduct Purchase Product
     * @param valueProductSales Value product Sales
     * @param nameProvider Name provider
     * @param totalValueInWarehouse Total value in warehouse
     */
    public InventoryProducts(String productCode, int accountProduct, Product nameProduct, Product typeProduct, Product purchaseValueProduct, Product valueProductSales, Provider nameProvider, double totalValueInWarehouse) {
        this.productCode = productCode;
        this.accountProduct = accountProduct;
        this.nameProduct = nameProduct;
        this.typeProduct = typeProduct;
        this.purchaseValueProduct = purchaseValueProduct;
        this.valueProductSales = valueProductSales;
        this.nameProvider = nameProvider;
        this.totalValueInWarehouse = totalValueInWarehouse;
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
     * Get account code
     * @return account code
     */
    public int getAccountProduct() {
        return accountProduct;
    }
    /**
     * Set account product
     * @param accountProduct  account product
     */
    public void setAccountProduct(int accountProduct) {
        this.accountProduct = accountProduct;
    }
    /**
     * Get name product
     * @return nameProduct
     */
    public Product getNameProduct() {
        return nameProduct;
    }
    /**
     * Set name product
     * @param nameProduct name Product
     */
    public void setNameProduct(Product nameProduct) {
        this.nameProduct = nameProduct;
    }
    /**
     * Get type product
     * @return tyoe product
     */

    public Product getTypeProduct() {
        return typeProduct;
    }
    /**
     * Set tyoe product
     * @param typeProduct type product
     */
    public void setTypeProduct(Product typeProduct) {
        this.typeProduct = typeProduct;
    }
    /**
     * Get purchase value product
     * @return purchase value product
     */
    public Product getPurchaseValueProduct() {
        return purchaseValueProduct;
    }
    /**
     * Set purchase value product
     * @param purchaseValueProduct purchase value product
     */
    public void setPurchaseValueProduct(Product purchaseValueProduct) {
        this.purchaseValueProduct = purchaseValueProduct;
    }
    /**
     * Get value product sales
     * @return value product sales
     */
    public Product getValueProductSales() {
        return valueProductSales;
    }
    /**
     * Set value product sales
     * @param valueProductSales value product sales
     */
    public void setValueProductSales(Product valueProductSales) {
        this.valueProductSales = valueProductSales;
    }
    /**
     * Get name provider
     * @return name provider
     */
    public Provider getNameProvider() {
        return nameProvider;
    }
    /**
     * Set name provider
     * @param nameProvider name provider
     */
    public void setNameProvider(Provider nameProvider) {
        this.nameProvider = nameProvider;
    }
    /**
     * Get total value in warehouse
     * @return total value in warehouse
     */
    public double getTotalValueInWarehouse() {
        return totalValueInWarehouse;
    }
    /**
     * Set total value in warehouse
     * @param totalValueInWarehouse total value in warehouse
     */
    public void setTotalValueInWarehouse(double totalValueInWarehouse) {
        this.totalValueInWarehouse = totalValueInWarehouse;
    }
    /**
     * Total value in warehouse
     * @return total value in warehouse
     */
    
    public double TotalValueInWarehouse(){
        totalValueInWarehouse=purchaseValueProduct.getPurchaseValue()*accountProduct*getAccountProduct();
        return totalValueInWarehouse;
    }
    
    
    
}
