package com.workintech.s14g4gulsu.products4sale;

public class Coke extends ProductForSale{

    private String brand;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Coke{" +
                "brand='" + brand + '\'' +
                '}';
    }

    public String showDetails() {
        return super.toString()+ getBrand() + " branded Coke " ;
    }

}
