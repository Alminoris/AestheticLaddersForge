package net.alminoris.aestheticladders.datagen;

import net.alminoris.aestheticladders.AestheticLadders;
import net.alminoris.aestheticladders.block.ModBlocks;
import net.alminoris.aestheticladders.util.helper.BlockSetsHelper;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModBlockTagProvider extends BlockTagsProvider
{
    public ModBlockTagProvider(DataGenerator output, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, AestheticLadders.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags()
    {
        for (String name : BlockSetsHelper.getWoods())
        {
            tag(BlockTags.CLIMBABLE)
                    .add(ModBlocks.WOODEN_LADDERS.get(name).get());
            tag(BlockTags.MINEABLE_WITH_AXE)
                    .add(ModBlocks.WOODEN_LADDERS.get(name).get());
        }

        for (String name : BlockSetsHelper.getStones())
        {
            tag(BlockTags.CLIMBABLE)
                    .add(ModBlocks.STONE_LADDERS.get(name).get());
            tag(BlockTags.MINEABLE_WITH_PICKAXE)
                    .add(ModBlocks.STONE_LADDERS.get(name).get());
        }
    }
}