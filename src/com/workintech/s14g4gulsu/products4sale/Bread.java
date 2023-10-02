package com.workintech.s14g4gulsu.products4sale;

public class Bread extends ProductForSale {

    private String mainGrain;
    public Bread(String type, double price, String description) {
        super(type, price, description);
    }

    public String getMainGrain() {
        return mainGrain;
    }

    @Override
    public String toString() {
        return "Bread{" +
                "mainGrain='" + mainGrain + '\'' +
                '}';
    }

    public String showDetails() {
        return super.toString()+ " Bread main grain: " + getMainGrain();
     }
}
