package net.alminoris.aestheticladders.datagen;

import net.alminoris.aestheticladders.AestheticLadders;
import net.alminoris.aestheticladders.block.ModBlocks;
import net.alminoris.aestheticladders.item.ModItemGroups;
import net.alminoris.aestheticladders.util.helper.BlockSetsHelper;
import net.alminoris.aestheticladders.util.helper.ModJsonHelper;
import net.alminoris.aestheticladders.util.helper.ModJsonTemplates;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider
{
    public ModBlockStateProvider(DataGenerator output, ExistingFileHelper exFileHelper)
    {
        super(output, AestheticLadders.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels()
    {
        for(String name : BlockSetsHelper.getWoods())
        {
            ModJsonHelper.createBlockModel(ModJsonTemplates.LADDER_BLOCK_MODEL, name+"_ladder");
            ModJsonHelper.createBlockstate(ModJsonTemplates.WOODEN_LADDER_BLOCKSTATE_TEMPLATE, name+"_ladder");
        }

        for(String name : BlockSetsHelper.STONES)
        {
            ModJsonHelper.createBlockModel(ModJsonTemplates.STONE_LADDER_BLOCK_MODEL, name+"_stone_ladder", "minecraft:block/"+name);
            ModJsonHelper.createBlockModel(ModJsonTemplates.STONE_MOSSED_LADDER_BLOCK_MODEL, name+"_stone_ladder_mossed", "minecraft:block/"+name);
            ModJsonHelper.createBlockstate(ModJsonTemplates.STONE_LADDER_BLOCKSTATE_TEMPLATE, name+"_stone_ladder");
            blockItem(ModBlocks.STONE_LADDERS.get(name), "block/"+name+"_stone_ladder");
        }

        for(String name : ModItemGroups.EXTRA_STONES_WF)
        {
            ModJsonHelper.createBlockModel(ModJsonTemplates.STONE_LADDER_BLOCK_MODEL, name+"_stone_ladder", "aestheticladders:block/"+name);
            ModJsonHelper.createBlockModel(ModJsonTemplates.STONE_MOSSED_LADDER_BLOCK_MODEL, name+"_stone_ladder_mossed", "aestheticladders:block/"+name);
            ModJsonHelper.createBlockstate(ModJsonTemplates.STONE_LADDER_BLOCKSTATE_TEMPLATE, name+"_stone_ladder");
            blockItem(ModBlocks.STONE_LADDERS.get(name), "block/"+name+"_stone_ladder");
        }
    }

    private void blockItem(RegistryObject<? extends Block> blockRegistryObject, String name)
    {
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("aestheticladders:" + name));
    }
}