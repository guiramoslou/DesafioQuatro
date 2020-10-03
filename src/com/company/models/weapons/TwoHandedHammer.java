package com.company.models.weapons;

import com.company.services.combat.rules.ImpactDamage;

public class TwoHandedHammer extends Weapon {

    public TwoHandedHammer() {
        this.damageType = new ImpactDamage();
    }
}
