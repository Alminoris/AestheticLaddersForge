package net.alminoris.aestheticladders.item;

import net.alminoris.aestheticladders.AestheticLadders;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.fml.ModList;

import java.util.ArrayList;
import java.util.List;

public class ModItemGroups
{
    public static List<String> WF_WOOD_NAMES = List.of("olive", "tamarisk", "western_serviceberry", "trembling_aspen", "cottonwood");

    public static List<String> AN_WOOD_NAMES = List.of("hazelnut", "hornbeam", "hawthorn", "quince", "plum", "mango", "fig", "viburnum",
            "white_mulberry", "wild_cherry", "bauhinia", "pine", "fir", "cedar", "araucaria", "juniper",
            "bald_cypress", "thuja", "sequoia", "mountain_hemlock", "cryptomeria", "yew", "larch");

    public static List<String> EXTRA_STONES_WF = List.of("dolomite_block", "saltmarsh_block", "loessic_marl_block", "loamy_marl_block", "fossil_marlstone_block", "limestone_block");

    public static final CreativeModeTab ALADRS_TAB = new CreativeModeTab(AestheticLadders.MOD_ID + ".aladrstab")
    {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(Blocks.LADDER.asItem());
        }

        @Override
        public Component getDisplayName() {
            return Component.translatable("itemgroup.aladrstab");
        }
    };

    public static void registerModItemGroups()
    {
        WF_WOOD_NAMES = new ArrayList<>();

        AN_WOOD_NAMES = new ArrayList<>();

        EXTRA_STONES_WF = new ArrayList<>();

        if (ModList.get().isLoaded("arborealnature"))
        {
            AN_WOOD_NAMES = List.of("hazelnut", "hornbeam", "hawthorn", "quince", "plum", "mango", "fig", "viburnum",
                    "white_mulberry", "wild_cherry", "bauhinia", "pine", "fir", "cedar", "araucaria", "juniper");
        }
        if (ModList.get().isLoaded("wildfields"))
        {
            WF_WOOD_NAMES = List.of("olive", "tamarisk", "western_serviceberry");
            EXTRA_STONES_WF = List.of("dolomite_block", "saltmarsh_block", "loessic_marl_block", "loamy_marl_block", "fossil_marlstone_block");
        }
    }
}