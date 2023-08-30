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
        ItemRegistry.registerItem("rangedconcoction", new RangedConcoctionPotion(), 110, true);
        ItemRegistry.registerItem("magicconcoction", new MagicConcoctionPotion(), 110, true);
        ItemRegistry.registerItem("summonconcoction", new SummonConcoctionPotion(), 110, true);
        ItemRegistry.registerItem("meleeconcoction", new MeleeConcoctionPotion(), 110, true);
        ItemRegistry.registerItem("greaterrangedconcoction", new GreaterRangedConcoctionPotion(), 110, true);
        ItemRegistry.registerItem("greatermagicconcoction", new GreaterMagicConcoctionPotion(), 110, true);
        ItemRegistry.registerItem("greatersummonconcoction", new GreaterSummonConcoctionPotion(), 110, true);
        ItemRegistry.registerItem("greatermeleeconcoction", new GreaterMeleeConcoctionPotion(), 110, true);

        BuffRegistry.registerBuff("omniconcoctionbuff", new OmniConcoctionBuff());
        ItemRegistry.registerItem("omniconcoction", new OmniConcoctionPotion(), 110, true);
        BuffRegistry.registerBuff("greateromniconcoctionbuff", new GreaterOmniConcoctionBuff());
        ItemRegistry.registerItem("greateromniconcoction", new GreaterOmniConcoctionPotion(), 110, true);
        BuffRegistry.registerBuff("rangedconcoctionbuff", new RangedConcoctionBuff());
        BuffRegistry.registerBuff("magicconcoctionbuff", new MagicConcoctionBuff());
        BuffRegistry.registerBuff("summonconcoctionbuff", new SummonConcoctionBuff());
        BuffRegistry.registerBuff("meleeconcoctionbuff", new MeleeConcoctionBuff());
        BuffRegistry.registerBuff("greaterrangedconcoctionbuff", new GreaterRangedConcoctionBuff());
        BuffRegistry.registerBuff("greatermagicconcoctionbuff", new GreaterMagicConcoctionBuff());
        BuffRegistry.registerBuff("greatersummonconcoctionbuff", new GreaterSummonConcoctionBuff());
        BuffRegistry.registerBuff("greatermeleeconcoctionbuff", new GreaterMeleeConcoctionBuff());

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

            Recipes.registerModRecipe(new Recipe(
                    "greaterrangedconcoction",
                    1,
                    RecipeTechRegistry.ALCHEMY,
                    new Ingredient[]{
                            new Ingredient("rangerpotion", 1),
                            new Ingredient("greaterbattlepotion", 1),
                            new Ingredient("greaterspeedpotion", 1),
                            new Ingredient("greaterhealthregenpotion", 1),
                            new Ingredient("greaterattackspeedpotion", 1),
                            new Ingredient("greaterresistancepotion", 1),
                            new Ingredient("greateraccuracypotion", 1),
                            new Ingredient("alchemyshard", 3)


                    }
            ).showAfter("summonconcoction"));

            Recipes.registerModRecipe(new Recipe(
                    "greatermeleeconcoction",
                    1,
                    RecipeTechRegistry.ALCHEMY,
                    new Ingredient[]{
                            new Ingredient("strengthpotion", 1),
                            new Ingredient("greaterbattlepotion", 1),
                            new Ingredient("greaterspeedpotion", 1),
                            new Ingredient("greaterhealthregenpotion", 1),
                            new Ingredient("greaterattackspeedpotion", 1),
                            new Ingredient("greaterresistancepotion", 1),
                            new Ingredient("greateraccuracypotion", 1),
                            new Ingredient("alchemyshard", 3)


                    }
            ).showAfter("greaterrangedconcoction"));
            Recipes.registerModRecipe(new Recipe(
                    "greatersummonconcoction",
                    1,
                    RecipeTechRegistry.ALCHEMY,
                    new Ingredient[]{
                            new Ingredient("minionpotion", 1),
                            new Ingredient("greaterbattlepotion", 1),
                            new Ingredient("greaterspeedpotion", 1),
                            new Ingredient("greaterhealthregenpotion", 1),
                            new Ingredient("greaterattackspeedpotion", 1),
                            new Ingredient("greaterresistancepotion", 1),
                            new Ingredient("greateraccuracypotion", 1),
                            new Ingredient("alchemyshard", 3)


                    }
            ).showAfter("greatermeleeconcoction"));
            Recipes.registerModRecipe(new Recipe(
                    "greatermagicconcoction",
                    1,
                    RecipeTechRegistry.ALCHEMY,
                    new Ingredient[]{
                            new Ingredient("wisdompotion", 1),
                            new Ingredient("greaterbattlepotion", 1),
                            new Ingredient("greaterspeedpotion", 1),
                            new Ingredient("greaterhealthregenpotion", 1),
                            new Ingredient("greaterattackspeedpotion", 1),
                            new Ingredient("greaterresistancepotion", 1),
                            new Ingredient("greateraccuracypotion", 1),
                            new Ingredient("greatermanaregenpotion",1),
                            new Ingredient("alchemyshard", 3)
                    }
            ).showAfter("greatersummonconcoction"));

        Recipes.registerModRecipe(new Recipe(
                "omniconcoction",
                1,
                RecipeTechRegistry.ALCHEMY,
                new Ingredient[]{
                        new Ingredient("battlepotion", 1),
                        new Ingredient("speedpotion", 1),
                        new Ingredient("healthregenpotion", 1),
                        new Ingredient("attackspeedpotion", 1),
                        new Ingredient("resistancepotion", 1),
                        new Ingredient("accuracypotion", 1),
                        new Ingredient("manaregenpotion",1),
                        new Ingredient("rangerpotion",1),
                        new Ingredient("minionpotion",1),
                        new Ingredient("wisdompotion", 1),
                        new Ingredient("strengthpotion", 1),
                        new Ingredient("goldore", 3)
                }
        ).showAfter("greatermagicconcoction"));

        Recipes.registerModRecipe(new Recipe(
                "greateromniconcoction",
                1,
                RecipeTechRegistry.ALCHEMY,
                new Ingredient[]{
                        new Ingredient("greaterbattlepotion", 1),
                        new Ingredient("greaterspeedpotion", 1),
                        new Ingredient("greaterhealthregenpotion", 1),
                        new Ingredient("greaterattackspeedpotion", 1),
                        new Ingredient("greaterresistancepotion", 1),
                        new Ingredient("greateraccuracypotion", 1),
                        new Ingredient("greatermanaregenpotion",1),
                        new Ingredient("rangerpotion",1),
                        new Ingredient("minionpotion",1),
                        new Ingredient("wisdompotion", 1),
                        new Ingredient("strengthpotion", 1),
                        new Ingredient("alchemyshard", 3)
                }
        ).showAfter("greatermagicconcoction"));



    }

}
