package net.alminoris.aestheticladders;

import com.mojang.logging.LogUtils;
import net.alminoris.aestheticladders.block.ModBlocks;
import net.alminoris.aestheticladders.item.ModItemGroups;
import net.alminoris.aestheticladders.item.ModItems;
import net.alminoris.aestheticladders.util.helper.BlockSetsHelper;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import static net.alminoris.aestheticladders.util.helper.BlockSetsHelper.EXTRA_WOODS_AN;
import static net.alminoris.aestheticladders.util.helper.BlockSetsHelper.EXTRA_WOODS_WF;

@Mod(AestheticLadders.MOD_ID)
public class AestheticLadders
{
    public static final String MOD_ID = "aestheticladders";
    private static final Logger LOGGER = LogUtils.getLogger();

    public AestheticLadders(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();

        modEventBus.addListener(this::commonSetup);


        ModItems.register(modEventBus);

        ModBlocks.register(modEventBus);

        MinecraftForge.EVENT_BUS.register(this);

        modEventBus.addListener(this::addCreative);

        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    private void addCreative(CreativeModeTabEvent.BuildContents entries)
    {
        if (entries.getTab() == ModItemGroups.ALADRS_TAB)
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
        }
    }


    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            event.enqueueWork(() ->
            {
                for (String name : BlockSetsHelper.getWoods())
                {
                    ItemBlockRenderTypes.setRenderLayer(ModBlocks.WOODEN_LADDERS.get(name).get(), RenderType.cutout());
                }
            });
        }
    }
}