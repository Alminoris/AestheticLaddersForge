package net.alminoris.aestheticladders.datagen;

import net.alminoris.aestheticladders.AestheticLadders;
import net.alminoris.aestheticladders.util.helper.BlockSetsHelper;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ModLanguageProviderEnUs extends LanguageProvider
{
    public ModLanguageProviderEnUs(PackOutput output)
    {
        super(output, AestheticLadders.MOD_ID, "en_us");
    }

    @Override
    public void addTranslations()
    {
        for (Block block : ForgeRegistries.BLOCKS)
        {
            ResourceLocation id = ForgeRegistries.BLOCKS.getKey(block);
            String path = id.getPath();

            String[] parts = path.split("_");

            String displayName = Arrays.stream(parts)
                    .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                    .collect(Collectors.joining(" "));

            displayName = displayName.replace(" Nss", "");

            add("block." + AestheticLadders.MOD_ID + "." + path, displayName);
        }

        for (Item item : ForgeRegistries.ITEMS)
        {
            ResourceLocation id = ForgeRegistries.ITEMS.getKey(item);
            String path = id.getPath();

            String[] parts = path.split("_");

            String displayName = Arrays.stream(parts)
                    .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                    .collect(Collectors.joining(" "));

            add("item." + AestheticLadders.MOD_ID + "." + path, displayName);
        }

        add("itemgroup.aladrstab","Aesthetic Ladders");
    }
}