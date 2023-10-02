package com.workintech.s14g4gulsu.monster;

public class Troll extends Monster{
    public Troll(String name, int hitPoint, double damage) {
        super(name, hitPoint, damage);
    }

    @Override
    public double attack() {
        return getDamage();
    }
}
