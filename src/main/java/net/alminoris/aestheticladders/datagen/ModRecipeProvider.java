package net.alminoris.aestheticladders.datagen;

import net.alminoris.aestheticladders.block.ModBlocks;
import net.alminoris.aestheticladders.item.ModItemGroups;
import net.alminoris.aestheticladders.item.ModItems;
import net.alminoris.aestheticladders.util.helper.BlockSetsHelper;
import net.alminoris.aestheticladders.util.helper.ModJsonHelper;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder
{
    public ModRecipeProvider(DataGenerator pOutput)
    {
        super(pOutput);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> recipeOutput)
    {
        for(String name : BlockSetsHelper.WOODS)
        {
            ShapedRecipeBuilder.shaped(ModItems.WOODEN_STICKS.get(name).get(), 4)
                    .define('#', ForgeRegistries.BLOCKS.getValue(ResourceLocation.withDefaultNamespace(name+"_planks")))
                    .pattern("# ")
                    .pattern(" #")
                    .unlockedBy(getHasName(ForgeRegistries.BLOCKS.getValue(ResourceLocation.withDefaultNamespace(name+"_planks"))),
                            has(ForgeRegistries.BLOCKS.getValue(ResourceLocation.withDefaultNamespace(name+"_planks"))))
                    .save(recipeOutput);

            ShapedRecipeBuilder.shaped(ModBlocks.WOODEN_LADDERS.get(name).get(), 3)
                    .define('#', ModItems.WOODEN_STICKS.get(name).get())
                    .pattern("# #")
                    .pattern("###")
                    .pattern("# #")
                    .unlockedBy(getHasName(ModItems.WOODEN_STICKS.get(name).get()), has(ModItems.WOODEN_STICKS.get(name).get()))
                    .save(recipeOutput);
        }

        for(String name : ModItemGroups.AN_WOOD_NAMES)
        {
            ShapedRecipeBuilder.shaped(ModBlocks.WOODEN_LADDERS.get(name).get(), 3)
                    .define('#', ModItems.WOODEN_STICKS.get(name).get())
                    .pattern("# #")
                    .pattern("###")
                    .pattern("# #")
                    .unlockedBy(getHasName(ModItems.WOODEN_STICKS.get(name).get()), has(ModItems.WOODEN_STICKS.get(name).get()))
                    .save(recipeOutput);
        }

        for(String name : ModItemGroups.WF_WOOD_NAMES)
        {
            ShapedRecipeBuilder.shaped(ModBlocks.WOODEN_LADDERS.get(name).get(), 3)
                    .define('#', ModItems.WOODEN_STICKS.get(name).get())
                    .pattern("# #")
                    .pattern("###")
                    .pattern("# #")
                    .unlockedBy(getHasName(ModItems.WOODEN_STICKS.get(name).get()), has(ModItems.WOODEN_STICKS.get(name).get()))
                    .save(recipeOutput);
        }

        for(String name : BlockSetsHelper.STONES)
        {
            Block block = ForgeRegistries.BLOCKS.getValue(ResourceLocation.withDefaultNamespace(name.equals("basalt_side") ? "basalt" :
                    (name.equals("quartz_block_bottom") ? "quartz_block" : name)));

            stonecutterResultFromBase(recipeOutput, ModBlocks.STONE_LADDERS.get(name).get(), block, 1);
        }

        for(String name : ModItemGroups.EXTRA_STONES_WF)
        {
            ModJsonHelper.createStonecuttingRecipe("wildfields:"+name,
                    ForgeRegistries.BLOCKS.getKey(ModBlocks.STONE_LADDERS.get(name).get()).getPath(), "1");
        }
    }
}