package craftabletraps;

import necesse.engine.modLoader.annotations.ModEntry;
import necesse.inventory.recipe.Ingredient;
import necesse.inventory.recipe.Recipe;
import necesse.inventory.recipe.Recipes;
import necesse.engine.registries.*;


@ModEntry
public class craftabletraps_loadmod 
{

    public void init() 
	{
        System.out.println("Craftable Traps Loaded");
        System.out.println("I hope so, at least...");
    }

    public void postInit() 
	{

        // Add recipes
        // Example item recipe, crafted in inventory for 2 iron bars

        Recipes.registerModRecipe(new Recipe(
                "woodarrowtrap",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("stonearrow", 10),
                        new Ingredient("anylog", 10)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "stonearrowtrap",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("stonearrow", 10),
                        new Ingredient("stone", 10)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "stoneflametrap",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("firearrow", 10),
                        new Ingredient("stone", 10)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "sandstonearrowtrap",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("stonearrow", 10),
                        new Ingredient("sandstone", 10)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "sandstoneflametrap",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("firearrow", 10),
                        new Ingredient("sandstone", 10)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "snowstonearrowtrap",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("stonearrow", 10),
                        new Ingredient("snowstone", 10)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "swampstonearrowtrap",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("stonearrow", 10),
                        new Ingredient("swampstone", 10)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "swampstoneflametrap",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("firearrow", 10),
                        new Ingredient("swampstone", 10)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "deepstonearrowtrap",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("stonearrow", 10),
                        new Ingredient("deepstone", 10)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "deepstoneflametrap",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("firearrow", 10),
                        new Ingredient("deepstone", 10)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "obsidianarrowtrap",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("stonearrow", 10),
                        new Ingredient("obsidian", 10)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "obsidianflametrap",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("firearrow", 10),
                        new Ingredient("obsidian", 10)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "deepsandstonearrowtrap",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("stonearrow", 10),
                        new Ingredient("deepsandstone", 10)
                }
        ));
        Recipes.registerModRecipe(new Recipe(
                "deepsandstoneflametrap",
                1,
                RecipeTechRegistry.WORKSTATION,
                new Ingredient[]{
                        new Ingredient("firearrow", 10),
                        new Ingredient("deepsandstone", 10)
                }
        ));
    }

}
