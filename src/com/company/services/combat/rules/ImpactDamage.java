package com.company.services.combat.rules;

import com.company.services.combat.rules.DamageType;

public class ImpactDamage implements DamageType {


    @Override
    public int damageCausedToHitPoints() {
        return 1;
    }

    @Override
    public int damageCausedToArmorPoints() {
        return 3;
    }
}
