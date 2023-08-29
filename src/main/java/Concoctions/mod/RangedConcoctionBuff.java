package Concoctions.mod;

import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.Buff;

public class RangedConcoctionBuff extends Buff {

    public RangedConcoctionBuff() {
        canCancel = true;
        isVisible = true;
        shouldSave = true;
    }

    @Override
    public void init(ActiveBuff activeBuff) {
        // Apply modifiers here
        activeBuff.setModifier(BuffModifiers.SPEED,10f);
        activeBuff.setModifier(BuffModifiers.ARMOR_FLAT,8);
        activeBuff.setModifier(BuffModifiers.CRIT_CHANCE,0.1f);
        activeBuff.setModifier(BuffModifiers.COMBAT_REGEN_FLAT, 0.5F);
        activeBuff.setModifier(BuffModifiers.ATTACK_SPEED, 0.15F);
        activeBuff.setModifier(BuffModifiers.ALL_DAMAGE, 0.1F);
        activeBuff.setModifier(BuffModifiers.RANGED_DAMAGE, 0.1F);
        activeBuff.setModifier(BuffModifiers.CRIT_CHANCE, 0.1F);

    }

    @Override
    public void serverTick(ActiveBuff buff) {
        // You can do server ticks here
    }

    @Override
    public void clientTick(ActiveBuff buff) {
        // You can do client ticks here, like adding particles to buff.owner
    }

}
