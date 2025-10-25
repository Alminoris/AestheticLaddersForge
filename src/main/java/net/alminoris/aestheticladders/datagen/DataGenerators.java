package net.alminoris.aestheticladders.datagen;

import net.alminoris.aestheticladders.AestheticLadders;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = AestheticLadders.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators
{
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event)
    {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(event.includeServer(), new ModLootTableProvider(generator));
        generator.addProvider(event.includeServer(), new ModRecipeProvider(generator));

        BlockTagsProvider blockTagsProvider = new ModBlockTagProvider(generator, existingFileHelper);
        generator.addProvider(event.includeServer(), blockTagsProvider);

        generator.addProvider(event.includeClient(), new ModBlockStateProvider(generator, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModItemModelProvider(generator, existingFileHelper));
        generator.addProvider(event.includeClient(), new ModLanguageProviderEnUs(generator));
        generator.addProvider(event.includeClient(), new ModLanguageProviderDeDe(generator));
        generator.addProvider(event.includeClient(), new ModLanguageProviderEsEs(generator));
        generator.addProvider(event.includeClient(), new ModLanguageProviderFrFr(generator));
        generator.addProvider(event.includeClient(), new ModLanguageProviderRuRu(generator));
        generator.addProvider(event.includeClient(), new ModLanguageProviderUkUa(generator));
    }
}