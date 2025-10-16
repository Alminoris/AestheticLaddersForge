package net.alminoris.aestheticladders.datagen;

import net.alminoris.aestheticladders.AestheticLadders;
import net.alminoris.aestheticladders.block.ModBlocks;
import net.alminoris.aestheticladders.util.helper.BlockSetsHelper;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider
{
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper)
    {
        super(output, lookupProvider, AestheticLadders.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider)
    {
        for (String name : BlockSetsHelper.getWoods())
        {
            tag(BlockTags.CLIMBABLE)
                    .add(ModBlocks.WOODEN_LADDERS.get(name).get());
        }

        for (String name : BlockSetsHelper.getStones())
        {
            tag(BlockTags.CLIMBABLE)
                    .add(ModBlocks.STONE_LADDERS.get(name).get());
        }
    }
}
