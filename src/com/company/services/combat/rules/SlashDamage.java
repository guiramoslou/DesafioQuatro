package com.company.services.combat.rules;

import com.company.services.combat.rules.DamageType;

public class SlashDamage implements DamageType {

    @Override
    public int damageCausedToHitPoints() {
        return 2;
    }

    @Override
    public int damageCausedToArmorPoints() {
        return 2;
    }
}
