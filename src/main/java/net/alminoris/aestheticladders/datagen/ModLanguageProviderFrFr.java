package net.alminoris.aestheticladders.datagen;

import net.alminoris.aestheticladders.AestheticLadders;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderFrFr extends LanguageProvider
{
    public ModLanguageProviderFrFr(DataGenerator output)
    {
        super(output, AestheticLadders.MOD_ID, "fr_fr");
    }

    @Override
    public void addTranslations()
    {
        Map<String, String> woodenObjects = new LinkedHashMap<>();
        woodenObjects.put("_ladder", "Échelle");

        Map<String, String> stoneObjects = new LinkedHashMap<>();
        stoneObjects.put("_stone_ladder", "Échelle");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "%s en pierre");
        stoneMaterials.put("tuff", "%s en tuf");
        stoneMaterials.put("blackstone", "%s en pierre noire");
        stoneMaterials.put("andesite", "%s en andésite");
        stoneMaterials.put("diorite", "%s en diorite");
        stoneMaterials.put("granite", "%s en granit");
        stoneMaterials.put("deepslate", "%s en ardoise profonde");
        stoneMaterials.put("basalt_side", "%s en basalte");
        stoneMaterials.put("quartz_block_bottom", "%s en quartz");
        stoneMaterials.put("stone_bricks", "%s en briques de pierre");
        stoneMaterials.put("bricks", "%s en brique");
        stoneMaterials.put("mud_bricks", "%s en briques de boue");
        stoneMaterials.put("sandstone", "%s en grès");
        stoneMaterials.put("dolomite_block", "%s en dolomie");
        stoneMaterials.put("saltmarsh_block", "%s en marais salé");
        stoneMaterials.put("loessic_marl_block", "%s en marne lœssique");
        stoneMaterials.put("loamy_marl_block", "%s en marne argileuse");
        stoneMaterials.put("fossil_marlstone_block", "%s en marne fossile");
        stoneMaterials.put("limestone_block", "%s en calcaire");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "%s en cyprès chauve");
        woodMaterials.put("thuja", "%s en thuya");
        woodMaterials.put("sequoia", "%s en séquoia");
        woodMaterials.put("mountain_hemlock", "%s en pruche de montagne");
        woodMaterials.put("cryptomeria", "%s en cryptoméria");
        woodMaterials.put("yew", "%s en if");
        woodMaterials.put("larch", "%s en mélèze");
        woodMaterials.put("olive", "%s en olivier");
        woodMaterials.put("tamarisk", "%s en tamaris");
        woodMaterials.put("western_serviceberry", "%s en amélanchier occidental");
        woodMaterials.put("trembling_aspen", "%s en tremble");
        woodMaterials.put("cottonwood", "%s en peuplier");
        woodMaterials.put("walnut", "%s en noyer");
        woodMaterials.put("silver_maple", "%s en érable argenté");
        woodMaterials.put("staghorn_sumac", "%s en sumac vinaigrier");
        woodMaterials.put("silverberry", "%s en chalef");
        woodMaterials.put("willow", "%s en saule");
        woodMaterials.put("poplar", "%s en peuplier");
        woodMaterials.put("alder", "%s en aulne");
        woodMaterials.put("aspen", "%s en tremble");
        woodMaterials.put("azalea", "%s en azalée");
        woodMaterials.put("apple", "%s en pommier");
        woodMaterials.put("scots_pine", "%s en pin sylvestre");
        woodMaterials.put("swamp_oak", "%s en chêne des marais");
        woodMaterials.put("aspen_nss", "%s en tremble");
        woodMaterials.put("cedar_nss", "%s en cèdre");
        woodMaterials.put("coconut_nss", "%s en cocotier");
        woodMaterials.put("cypress_nss", "%s en cyprès");
        woodMaterials.put("fir_nss", "%s en sapin");
        woodMaterials.put("ghaf_nss", "%s en ghaf");
        woodMaterials.put("larch_nss", "%s en mélèze");
        woodMaterials.put("mahogany_nss", "%s en acajou");
        woodMaterials.put("maple_nss", "%s en érable");
        woodMaterials.put("olive_nss", "%s en olivier");
        woodMaterials.put("palo_verde_nss", "%s en palo verde");
        woodMaterials.put("redwood_nss", "%s en séquoia rouge");
        woodMaterials.put("saxaul_nss", "%s en saxaoul");
        woodMaterials.put("sugi_nss", "%s en sugi");
        woodMaterials.put("willow_nss", "%s en saule");
        woodMaterials.put("wisteria_nss", "%s en glycine");
        woodMaterials.put("oak", "%s en chêne");
        woodMaterials.put("birch", "%s en bouleau");
        woodMaterials.put("spruce", "%s en épicéa");
        woodMaterials.put("jungle", "%s en bois tropical");
        woodMaterials.put("acacia", "%s en acacia");
        woodMaterials.put("dark_oak", "%s en chêne foncé");
        woodMaterials.put("crimson", "%s cramoisi");
        woodMaterials.put("warped", "%s déformé");
        woodMaterials.put("mangrove", "%s en palétuvier");
        woodMaterials.put("cherry", "%s en cerisier");
        woodMaterials.put("bamboo", "%s en bambou");
        woodMaterials.put("hazelnut", "%s en noisetier");
        woodMaterials.put("hornbeam", "%s en charme");
        woodMaterials.put("hawthorn", "%s en aubépine");
        woodMaterials.put("quince", "%s en cognassier");
        woodMaterials.put("plum", "%s en prunier");
        woodMaterials.put("mango", "%s en manguier");
        woodMaterials.put("fig", "%s en figuier");
        woodMaterials.put("viburnum", "%s en viorne");
        woodMaterials.put("white_mulberry", "%s en mûrier blanc");
        woodMaterials.put("wild_cherry", "%s en cerisier sauvage");
        woodMaterials.put("bauhinia", "%s en bauhinia");
        woodMaterials.put("pine", "%s en pin");
        woodMaterials.put("fir", "%s en sapin");
        woodMaterials.put("cedar", "%s en cèdre");
        woodMaterials.put("araucaria", "%s en araucaria");
        woodMaterials.put("juniper", "%s en genévrier");

        Map<String, String> woodenItems = new LinkedHashMap<>();
        woodenItems.put("_stick", "Bâton");


        for (Map.Entry<String, String> type : stoneObjects.entrySet())
        {
            for (Map.Entry<String, String> mat : stoneMaterials.entrySet())
            {
                String key = "block." + AestheticLadders.MOD_ID + "." + mat.getKey() + type.getKey();
                String value = String.format(type.getValue(), mat.getValue());
                add(key, value);
            }
        }

        for (Map.Entry<String, String> type : woodenObjects.entrySet())
        {
            for (Map.Entry<String, String> mat : woodMaterials.entrySet())
            {
                String key = "block." + AestheticLadders.MOD_ID + "." + mat.getKey() + type.getKey();
                String value = String.format(type.getValue(), mat.getValue());
                add(key, value);
            }
        }

        for (Map.Entry<String, String> type : woodenItems.entrySet())
        {
            for (Map.Entry<String, String> mat : woodMaterials.entrySet())
            {
                String key = "item." + AestheticLadders.MOD_ID + "." + mat.getKey() + type.getKey();
                String value = String.format(type.getValue(), mat.getValue());
                add(key, value);
            }
        }

        add("itemgroup.aladrstab","Aesthetic Ladders");
    }
}