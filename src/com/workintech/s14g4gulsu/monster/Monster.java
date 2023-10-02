package com.workintech.s14g4gulsu.monster;

public abstract class Monster {
    private String name;
    private int hitPoint;
    private double damage;

    public Monster(String name, int hitPoint, double damage) {
        this.name = name;
        this.hitPoint = hitPoint;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getHitPoint() {
        return hitPoint;
    }

    public double getDamage() {
        return damage;
    }

    public abstract double attack();
}
