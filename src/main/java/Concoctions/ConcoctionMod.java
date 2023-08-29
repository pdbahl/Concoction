package Concoctions;

import Concoctions.mod.*;
import necesse.engine.modLoader.annotations.ModEntry;
import necesse.engine.registries.*;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;

@ModEntry
public class ConcoctionMod {

    public void init() {
        System.out.println("Hello world from my example mod!");

        BuffRegistry.registerBuff("rangedconcoctionbuff", new RangedConcoctionBuff());
        ItemRegistry.registerItem("rangedconcoction", new RangedConcoctionPotion(), 110, true);

    }

    public void postInit() {
        Recipes.registerModRecipe(new Recipe(
                "rangedconcoction",
                1,
                RecipeTechRegistry.ALCHEMY,
                new Ingredient[]{
                        new Ingredient("rangerpotion", 1),
                        new Ingredient("battlepotion", 1),
                        new Ingredient("speedpotion", 1),
                        new Ingredient("healthregenpotion", 1),
                        new Ingredient("attackspeedpotion", 1),
                        new Ingredient("resistancepotion", 1),
                        new Ingredient("accuracypotion", 1),
                        new Ingredient("alchemyshard", 3),


                }
        ).showAfter("minionpotion"));
    }

}
