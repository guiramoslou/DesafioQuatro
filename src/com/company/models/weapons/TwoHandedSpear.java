package com.company.models.weapons;

import com.company.services.combat.rules.PunctureDamage;

public class TwoHandedSpear extends Weapon {
    public TwoHandedSpear() {
        this.damageType = new PunctureDamage();
    }
}
