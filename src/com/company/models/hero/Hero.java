package com.company.models.hero;

import com.company.models.weapons.Weapon;

public abstract class Hero {
    protected int HitPoints;
    protected int ArmorPoints;
    public Weapon Weapon = new Weapon() {
    };

    public Hero(int hitPoints, int armorPoints, Weapon weapon) {
        this.HitPoints = hitPoints;
        this.ArmorPoints = armorPoints;
        this.Weapon = weapon;
    }

    public int getHitPoints() {
        return HitPoints;
    }

    public int getArmorPoints() {
        return ArmorPoints;
    }
}
