package Concoctions.mod;


import necesse.inventory.item.placeableItem.consumableItem.potionConsumableItem.SimplePotionItem;

public class MeleeConcoctionPotion extends SimplePotionItem {

    public MeleeConcoctionPotion() {
        super(50, Rarity.RARE, "meleeconcoctionbuff", 300, "meleeconcoctiontip");
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
        this.overridePotion(  "minionpotion");
        this.overridePotion(  "rangedconcoction");
        this.overridePotion(  "meleeconcoction");
        this.overridePotion(  "magicconcoction");
        this.overridePotion(  "summonconcoction");
    }

}
