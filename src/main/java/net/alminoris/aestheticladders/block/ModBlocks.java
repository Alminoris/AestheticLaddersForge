package net.alminoris.aestheticladders.block;

import net.alminoris.aestheticladders.AestheticLadders;
import net.alminoris.aestheticladders.block.custom.StoneLadderBlock;
import net.alminoris.aestheticladders.item.ModItems;
import net.alminoris.aestheticladders.util.helper.BlockSetsHelper;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.LadderBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.function.Supplier;

public class ModBlocks
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AestheticLadders.MOD_ID);

    public static final Dictionary<String, RegistryObject<Block>> WOODEN_LADDERS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getWoods())
        {
            put(name, registerBlock(name+"_ladder", () -> new LadderBlock(BlockBehaviour.Properties.copy(Blocks.LADDER))));
        }
    }};

    public static final Dictionary<String, RegistryObject<Block>> STONE_LADDERS = new Hashtable<>()
    {{
        for(String name : BlockSetsHelper.getStones())
        {
            put(name, registerBlock(name+"_stone_ladder", StoneLadderBlock::new));
        }
    }};
    
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block)
    {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block)
    {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus)
    {
        BLOCKS.register(eventBus);
    }
}