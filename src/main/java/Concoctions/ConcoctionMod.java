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
        BuffRegistry.registerBuff("magicconcoctionbuff", new MagicConcoctionBuff());
        ItemRegistry.registerItem("magicconcoction", new MagicConcoctionPotion(), 110, true);
        BuffRegistry.registerBuff("summonconcoctionbuff", new SummonConcoctionBuff());
        ItemRegistry.registerItem("summonconcoction", new SummonConcoctionPotion(), 110, true);
        BuffRegistry.registerBuff("meleeconcoctionbuff", new MeleeConcoctionBuff());
        ItemRegistry.registerItem("meleeconcoction", new MeleeConcoctionPotion(), 110, true);

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
                        new Ingredient("goldore", 3)


                }
        ).showAfter("minionpotion"));

        Recipes.registerModRecipe(new Recipe(
                "meleeconcoction",
                1,
                RecipeTechRegistry.ALCHEMY,
                new Ingredient[]{
                        new Ingredient("strengthpotion", 1),
                        new Ingredient("battlepotion", 1),
                        new Ingredient("speedpotion", 1),
                        new Ingredient("healthregenpotion", 1),
                        new Ingredient("attackspeedpotion", 1),
                        new Ingredient("resistancepotion", 1),
                        new Ingredient("accuracypotion", 1),
                        new Ingredient("goldore", 3)


                }
        ).showAfter("rangedconcoction"));
        Recipes.registerModRecipe(new Recipe(
                "summonconcoction",
                1,
                RecipeTechRegistry.ALCHEMY,
                new Ingredient[]{
                        new Ingredient("minionpotion", 1),
                        new Ingredient("battlepotion", 1),
                        new Ingredient("speedpotion", 1),
                        new Ingredient("healthregenpotion", 1),
                        new Ingredient("attackspeedpotion", 1),
                        new Ingredient("resistancepotion", 1),
                        new Ingredient("accuracypotion", 1),
                        new Ingredient("goldore", 3)


                }
        ).showAfter("meleeconcoction"));
        Recipes.registerModRecipe(new Recipe(
                "magicconcoction",
                1,
                RecipeTechRegistry.ALCHEMY,
                new Ingredient[]{
                        new Ingredient("wisdompotion", 1),
                        new Ingredient("battlepotion", 1),
                        new Ingredient("speedpotion", 1),
                        new Ingredient("healthregenpotion", 1),
                        new Ingredient("attackspeedpotion", 1),
                        new Ingredient("resistancepotion", 1),
                        new Ingredient("accuracypotion", 1),
                        new Ingredient("goldore", 3)


                }
        ).showAfter("summonconcoction"));
    }

}
