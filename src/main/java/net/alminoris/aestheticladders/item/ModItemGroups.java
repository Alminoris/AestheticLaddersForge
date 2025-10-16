package net.alminoris.aestheticladders.item;

import net.alminoris.aestheticladders.AestheticLadders;
import net.alminoris.aestheticladders.block.ModBlocks;
import net.alminoris.aestheticladders.util.helper.BlockSetsHelper;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import static net.alminoris.aestheticladders.util.helper.BlockSetsHelper.EXTRA_WOODS_AN;
import static net.alminoris.aestheticladders.util.helper.BlockSetsHelper.EXTRA_WOODS_WF;

@Mod.EventBusSubscriber(modid = AestheticLadders.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItemGroups
{
    public static CreativeModeTab ALADRS_TAB;

    @SubscribeEvent
    public static void registerCreativeModeTabs(CreativeModeTabEvent.Register event)
    {
        ALADRS_TAB = event.registerCreativeModeTab(ResourceLocation.fromNamespaceAndPath(AestheticLadders.MOD_ID, "aladrstab"),
                builder -> builder.icon(() -> new ItemStack(Blocks.LADDER.asItem()))
                        .title(Component.translatable("itemgroup.aladrstab")));
    }
}