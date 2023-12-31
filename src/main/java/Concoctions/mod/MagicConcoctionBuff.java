package Concoctions.mod;

import necesse.engine.registries.BuffRegistry;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.BuffModifiers;
import necesse.entity.mobs.buffs.staticBuffs.Buff;

public class MagicConcoctionBuff extends Buff {

    public MagicConcoctionBuff() {
        canCancel = true;
        isVisible = true;
        shouldSave = true;

    }

    @Override
    public void init(ActiveBuff activeBuff) {
        BuffRegistry.getBuff("battlepotion").init(activeBuff);
        BuffRegistry.getBuff("speedpotion").init(activeBuff);
        BuffRegistry.getBuff("resistancepotion").init(activeBuff);
        BuffRegistry.getBuff("accuracypotion").init(activeBuff);
        BuffRegistry.getBuff("healthregenpotion").init(activeBuff);
        BuffRegistry.getBuff("attackspeedpotion").init(activeBuff);
        BuffRegistry.getBuff("wisdompotion").init(activeBuff);
        BuffRegistry.getBuff("manaregenpotion").init(activeBuff);
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
