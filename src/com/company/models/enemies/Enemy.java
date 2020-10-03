package com.company.models.enemies;

public abstract class Enemy {
    protected int HitPoints;
    protected int ArmorPoints;

    public Enemy(int hitPoints, int armorPoints) {
        this.HitPoints = hitPoints;
        this.ArmorPoints = armorPoints;
    }

    public void damageTaken(int hitPointsDamage, int armorPointsDamage){
        this.HitPoints-= hitPointsDamage;
        this.ArmorPoints-= armorPointsDamage;
    }

    public int getHitPoints() {
        return HitPoints;
    }

    public int getArmorPoints() {
        return ArmorPoints;
    }
}