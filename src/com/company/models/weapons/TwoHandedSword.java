package com.company.models.weapons;

import com.company.services.combat.rules.SlashDamage;

public class TwoHandedSword extends Weapon {

    public TwoHandedSword() {
        this.damageType = new SlashDamage();
    }
}
