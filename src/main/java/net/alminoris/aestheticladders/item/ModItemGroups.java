package net.alminoris.aestheticladders.item;

import net.alminoris.aestheticladders.AestheticLadders;
import net.alminoris.aestheticladders.block.ModBlocks;
import net.alminoris.aestheticladders.util.helper.BlockSetsHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static net.alminoris.aestheticladders.util.helper.BlockSetsHelper.EXTRA_WOODS_AN;
import static net.alminoris.aestheticladders.util.helper.BlockSetsHelper.EXTRA_WOODS_WF;

@Mod.EventBusSubscriber(modid = AestheticLadders.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItemGroups
{
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AestheticLadders.MOD_ID);

    public static final RegistryObject<CreativeModeTab> ALADRS_TAB = CREATIVE_MODE_TABS.register("aladrstab", () -> CreativeModeTab.builder()
            .withTabsBefore(CreativeModeTabs.COMBAT)
            .icon(Blocks.LADDER.asItem()::getDefaultInstance)
            .title(Component.translatable("itemgroup.aladrstab"))
            .displayItems((parameters, entries) ->
            {
                for(String name : BlockSetsHelper.STONES)
                    entries.accept(ModBlocks.STONE_LADDERS.get(name).get());

                for(String name : BlockSetsHelper.WOODS)
                    entries.accept(ModBlocks.WOODEN_LADDERS.get(name).get());

                for(String name : BlockSetsHelper.WOODS)
                    entries.accept(ModItems.WOODEN_STICKS.get(name).get());

                if (ModList.get().isLoaded("arborealnature"))
                {
                    for(String name : EXTRA_WOODS_AN)
                    {
                        entries.accept(ModBlocks.WOODEN_LADDERS.get(name).get());
                    }
                    for(String name : EXTRA_WOODS_AN)
                    {
                        entries.accept(ModItems.WOODEN_STICKS.get(name).get());
                    }
                }
                if (ModList.get().isLoaded("wildfields"))
                {
                    for(String name : BlockSetsHelper.EXTRA_STONES_WF)
                        entries.accept(ModBlocks.STONE_LADDERS.get(name).get());

                    for(String name : EXTRA_WOODS_WF)
                    {
                        entries.accept(ModBlocks.WOODEN_LADDERS.get(name).get());
                    }
                    for(String name : EXTRA_WOODS_WF)
                    {
                        entries.accept(ModItems.WOODEN_STICKS.get(name).get());
                    }
                }
            }).build());

    public static void register(IEventBus eventBus)
    {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}