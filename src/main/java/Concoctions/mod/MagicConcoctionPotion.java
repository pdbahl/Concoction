package Concoctions.mod;


import necesse.inventory.item.placeableItem.consumableItem.potionConsumableItem.SimplePotionItem;

public class MagicConcoctionPotion extends SimplePotionItem {

    public MagicConcoctionPotion() {
        super(50, Rarity.RARE, "rangedconcoctionbuff", 300, "rangedconcoctiontip");
        this.overridePotion("battlepotion");
        this.overridePotion("battlepotion");
        this.overridePotion("speedpotion");
        this.overridePotion("healthregenpotin");
        this.overridePotion("attackspeedpotin");
        this.overridePotion("resistancepotion");
        this.overridePotion("accuracypotion");
        this.overridePotion("greaterbattlepotion");
        this.overridePotion("greaterbattlepotion");
        this.overridePotion("greaterspeedpotion");
        this.overridePotion("greaterhealthregenpotion");
        this.overridePotion("greaterattackspeedpotion");
        this.overridePotion("greaterresistancepotion");
        this.overridePotion("greateraccuracypotion");
        this.overridePotion("strengthpotion");
        this.overridePotion("rangerpotion");
        this.overridePotion( "wisdompotion");
        this.overridePotion(  "minionpotion");
    }

}
