package Concoctions.mod;

import necesse.engine.registries.BuffRegistry;
import necesse.entity.mobs.buffs.ActiveBuff;
import necesse.entity.mobs.buffs.staticBuffs.Buff;

public class GreaterMagicConcoctionBuff extends Buff {

    public GreaterMagicConcoctionBuff() {
        canCancel = true;
        isVisible = true;
        shouldSave = true;

    }

    @Override
    public void init(ActiveBuff activeBuff) {
        BuffRegistry.getBuff("greaterbattlepotion").init(activeBuff);
        BuffRegistry.getBuff("greaterspeedpotion").init(activeBuff);
        BuffRegistry.getBuff("greaterresistancepotion").init(activeBuff);
        BuffRegistry.getBuff("greateraccuracypotion").init(activeBuff);
        BuffRegistry.getBuff("greaterhealthregenpotion").init(activeBuff);
        BuffRegistry.getBuff("greaterattackspeedpotion").init(activeBuff);
        BuffRegistry.getBuff("greatermanaregenpotion").init(activeBuff);
        BuffRegistry.getBuff("wisdompotion").init(activeBuff);
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
