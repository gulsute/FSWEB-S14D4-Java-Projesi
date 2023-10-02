package com.workintech.s14g4gulsu.monster;

public class Spider extends Monster implements Poisonable{
    public Spider(String name, int hitPoint, double damage) {
        super(name, hitPoint, damage);
    }

    @Override
    public double attack() {
        return getDamage() + poison();
    }

    @Override
    public double poison() {
        return getDamage() * 0.3;
    }
}
