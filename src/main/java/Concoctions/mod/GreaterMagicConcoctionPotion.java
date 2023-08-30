package Concoctions.mod;

import necesse.inventory.item.Item;
import necesse.inventory.item.placeableItem.consumableItem.potionConsumableItem.SimplePotionItem;

public class GreaterMagicConcoctionPotion extends SimplePotionItem {

    public GreaterMagicConcoctionPotion() {
        super(50, Rarity.RARE, "greatermagicconcoctionbuff", 300, "greatermagicconcoctiontip");
        this.overridePotion("battlepotion");
        this.overridePotion("battlepotion");
        this.overridePotion("speedpotion");
        this.overridePotion("healthregenpotion");
        this.overridePotion("attackspeedpotion");
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
        this.overridePotion(  "rangedconcoction");
        this.overridePotion(  "meleeconcoction");
        this.overridePotion(  "magicconcoction");
        this.overridePotion(  "summonconcoction");
        this.overridePotion(  "greaterrangedconcoction");
        this.overridePotion(  "greatermeleeconcoction");
        this.overridePotion(  "greatermagicconcoction");
        this.overridePotion(  "greatersummonconcoction");
    }
}
