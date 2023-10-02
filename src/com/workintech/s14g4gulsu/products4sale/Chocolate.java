package com.workintech.s14g4gulsu.products4sale;

public class Chocolate  extends ProductForSale{

    private String color;
    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Chocolate{" +
                "color='" + color + '\'' +
                '}';
    }

    public String showDetails() {
        return super.toString()+ " with " + getColor() + " chocolate ";
    }
}
