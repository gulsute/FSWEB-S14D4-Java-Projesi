package com.workintech.s14g4gulsu.monster;

public class Werewolf extends Monster implements Bleedable{


    public Werewolf(String name, int hitPoint, double damage) {
        super(name, hitPoint, damage);
    }

    @Override
    public double attack() {
        return getDamage()+ bleed();
    }

    @Override
    public double bleed() {
        return getDamage() * 0.25;
    }
}
