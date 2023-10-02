package com.workintech.s14g4gulsu.products4sale;

public abstract class ProductForSale {
    private String type;
    private double price;
    private String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }
        public double getSalesPrice(int quantity) {
            return quantity*price;
        }

    @Override
    public String toString() {
        return "ProductForSale " +
                "type= " + type + ", price= " + price +
                ", description= " + description ;
    }
}

