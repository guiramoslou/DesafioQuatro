package com.company.services.combat.rules;

import com.company.services.combat.rules.DamageType;

public class PunctureDamage implements DamageType {


    @Override
    public int damageCausedToHitPoints() {
        return 3;
    }

    @Override
    public int damageCausedToArmorPoints() {
        return 1;
    }
}
