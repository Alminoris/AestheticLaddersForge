package net.alminoris.aestheticladders.datagen;

import net.alminoris.aestheticladders.AestheticLadders;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderEsEs extends LanguageProvider
{
    public ModLanguageProviderEsEs(DataGenerator output)
    {
        super(output, AestheticLadders.MOD_ID, "es_es");
    }

    @Override
    public void addTranslations()
    {
        Map<String, String> woodenObjects = new LinkedHashMap<>();
        woodenObjects.put("_ladder", "Escalera");

        Map<String, String> stoneObjects = new LinkedHashMap<>();
        stoneObjects.put("_stone_ladder", "Escalera");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "%s de piedra");
        stoneMaterials.put("tuff", "%s de toba");
        stoneMaterials.put("blackstone", "%s de piedra negra");
        stoneMaterials.put("andesite", "%s de andesita");
        stoneMaterials.put("diorite", "%s de diorita");
        stoneMaterials.put("granite", "%s de granito");
        stoneMaterials.put("deepslate", "%s de pizarra profunda");
        stoneMaterials.put("basalt_side", "%s de basalto");
        stoneMaterials.put("quartz_block_bottom", "%s de cuarzo");
        stoneMaterials.put("stone_bricks", "%s de ladrillos de piedra");
        stoneMaterials.put("bricks", "%s de ladrillo");
        stoneMaterials.put("mud_bricks", "%s de ladrillos de barro");
        stoneMaterials.put("sandstone", "%s de arenisca");
        stoneMaterials.put("dolomite_block", "%s de dolomita");
        stoneMaterials.put("saltmarsh_block", "%s de marisma salada");
        stoneMaterials.put("loessic_marl_block", "%s de marga loésica");
        stoneMaterials.put("loamy_marl_block", "%s de marga arcillosa");
        stoneMaterials.put("fossil_marlstone_block", "%s de marga fósil");
        stoneMaterials.put("limestone_block", "%s de piedra caliza");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "%s de ciprés calvo");
        woodMaterials.put("thuja", "%s de tuya");
        woodMaterials.put("sequoia", "%s de secuoya");
        woodMaterials.put("mountain_hemlock", "%s de cicuta de montaña");
        woodMaterials.put("cryptomeria", "%s de criptomeria");
        woodMaterials.put("yew", "%s de tejo");
        woodMaterials.put("larch", "%s de alerce");
        woodMaterials.put("olive", "%s de olivo");
        woodMaterials.put("tamarisk", "%s de tamarisco");
        woodMaterials.put("western_serviceberry", "%s de amelanchier occidental");
        woodMaterials.put("trembling_aspen", "%s de álamo temblón");
        woodMaterials.put("cottonwood", "%s de álamo");
        woodMaterials.put("walnut", "%s de nogal");
        woodMaterials.put("silver_maple", "%s de arce plateado");
        woodMaterials.put("staghorn_sumac", "%s de zumaque");
        woodMaterials.put("silverberry", "%s de eleagno");
        woodMaterials.put("willow", "%s de sauce");
        woodMaterials.put("poplar", "%s de álamo");
        woodMaterials.put("alder", "%s de aliso");
        woodMaterials.put("aspen", "%s de álamo temblón");
        woodMaterials.put("azalea", "%s de azalea");
        woodMaterials.put("apple", "%s de manzano");
        woodMaterials.put("scots_pine", "%s de pino silvestre");
        woodMaterials.put("swamp_oak", "%s de roble pantanoso");
        woodMaterials.put("aspen_nss", "%s de álamo temblón");
        woodMaterials.put("cedar_nss", "%s de cedro");
        woodMaterials.put("coconut_nss", "%s de cocotero");
        woodMaterials.put("cypress_nss", "%s de ciprés");
        woodMaterials.put("fir_nss", "%s de abeto");
        woodMaterials.put("ghaf_nss", "%s de ghaf");
        woodMaterials.put("larch_nss", "%s de alerce");
        woodMaterials.put("mahogany_nss", "%s de caoba");
        woodMaterials.put("maple_nss", "%s de arce");
        woodMaterials.put("olive_nss", "%s de olivo");
        woodMaterials.put("palo_verde_nss", "%s de palo verde");
        woodMaterials.put("redwood_nss", "%s de secuoya roja");
        woodMaterials.put("saxaul_nss", "%s de saxaul");
        woodMaterials.put("sugi_nss", "%s de sugi");
        woodMaterials.put("willow_nss", "%s de sauce");
        woodMaterials.put("wisteria_nss", "%s de glicina");
        woodMaterials.put("oak", "%s de roble");
        woodMaterials.put("birch", "%s de abedul");
        woodMaterials.put("spruce", "%s de abeto rojo");
        woodMaterials.put("jungle", "%s de madera tropical");
        woodMaterials.put("acacia", "%s de acacia");
        woodMaterials.put("dark_oak", "%s de roble oscuro");
        woodMaterials.put("crimson", "%s carmesí");
        woodMaterials.put("warped", "%s deformado");
        woodMaterials.put("mangrove", "%s de mangle");
        woodMaterials.put("cherry", "%s de cerezo");
        woodMaterials.put("bamboo", "%s de bambú");
        woodMaterials.put("hazelnut", "%s de avellano");
        woodMaterials.put("hornbeam", "%s de carpe");
        woodMaterials.put("hawthorn", "%s de espino");
        woodMaterials.put("quince", "%s de membrillo");
        woodMaterials.put("plum", "%s de ciruelo");
        woodMaterials.put("mango", "%s de mango");
        woodMaterials.put("fig", "%s de higuera");
        woodMaterials.put("viburnum", "%s de viburno");
        woodMaterials.put("white_mulberry", "%s de morera blanca");
        woodMaterials.put("wild_cherry", "%s de cerezo silvestre");
        woodMaterials.put("bauhinia", "%s de bauhinia");
        woodMaterials.put("pine", "%s de pino");
        woodMaterials.put("fir", "%s de abeto");
        woodMaterials.put("cedar", "%s de cedro");
        woodMaterials.put("araucaria", "%s de araucaria");
        woodMaterials.put("juniper", "%s de enebro");

        Map<String, String> woodenItems = new LinkedHashMap<>();
        woodenItems.put("_stick", "Palo");

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

        add("itemGroup.aestheticladders.aladrstab","Aesthetic Ladders");
    }
}