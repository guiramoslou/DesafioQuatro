package com.company;

import com.company.models.enemies.Dummy;
import com.company.models.enemies.Enemy;
import com.company.models.hero.Hero;
import com.company.models.hero.Warrior;
import com.company.models.weapons.TwoHandedHammer;

public class Main {

    public static void main(String[] args) {
        Enemy dummy = new Dummy(10, 10);
        Hero hero = new Warrior(10, 10, new TwoHandedHammer());

        dummy.damageTaken(hero.Weapon.damageType.damageCausedToHitPoints(),
                hero.Weapon.damageType.damageCausedToArmorPoints());

        System.out.println(dummy.getArmorPoints());
        System.out.println(dummy.getHitPoints());
    }
}