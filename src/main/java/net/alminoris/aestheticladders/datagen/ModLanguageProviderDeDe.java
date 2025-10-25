package net.alminoris.aestheticladders.datagen;

import net.alminoris.aestheticladders.AestheticLadders;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderDeDe extends LanguageProvider
{
    public ModLanguageProviderDeDe(DataGenerator output)
    {
        super(output, AestheticLadders.MOD_ID, "de_de");
    }

    @Override
    public void addTranslations()
    {
        Map<String, String> woodenObjects = new LinkedHashMap<>();
        woodenObjects.put("_ladder", "Leiter");

        Map<String, String> stoneObjects = new LinkedHashMap<>();
        stoneObjects.put("_stone_ladder", "Leiter");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "%s aus Stein");
        stoneMaterials.put("tuff", "%s aus Tuff");
        stoneMaterials.put("blackstone", "%s aus Schwarzstein");
        stoneMaterials.put("andesite", "%s aus Andesit");
        stoneMaterials.put("diorite", "%s aus Diorit");
        stoneMaterials.put("granite", "%s aus Granit");
        stoneMaterials.put("deepslate", "%s aus Tiefenschiefer");
        stoneMaterials.put("basalt_side", "%s aus Basalt");
        stoneMaterials.put("quartz_block_bottom", "%s aus Quarz");
        stoneMaterials.put("stone_bricks", "%s aus Steinziegeln");
        stoneMaterials.put("bricks", "%s aus Ziegeln");
        stoneMaterials.put("mud_bricks", "%s aus Lehmziegeln");
        stoneMaterials.put("sandstone", "%s aus Sandstein");
        stoneMaterials.put("dolomite_block", "%s aus Dolomit");
        stoneMaterials.put("saltmarsh_block", "%s aus Salzsumpfstein");
        stoneMaterials.put("loessic_marl_block", "%s aus Lössmergel");
        stoneMaterials.put("loamy_marl_block", "%s aus Lehmergel");
        stoneMaterials.put("fossil_marlstone_block", "%s aus fossilem Mergelstein");
        stoneMaterials.put("limestone_block", "%s aus Kalkstein");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "%s aus Sumpfzypresse");
        woodMaterials.put("thuja", "%s aus Thuja");
        woodMaterials.put("sequoia", "%s aus Mammutbaum");
        woodMaterials.put("mountain_hemlock", "%s aus Berg-Hemlocktanne");
        woodMaterials.put("cryptomeria", "%s aus Sicheltanne");
        woodMaterials.put("yew", "%s aus Eibe");
        woodMaterials.put("larch", "%s aus Lärche");
        woodMaterials.put("olive", "%s aus Olivenholz");
        woodMaterials.put("tamarisk", "%s aus Tamariske");
        woodMaterials.put("western_serviceberry", "%s aus Felsenbirne");
        woodMaterials.put("trembling_aspen", "%s aus Zitterpappel");
        woodMaterials.put("cottonwood", "%s aus Pappel");
        woodMaterials.put("walnut", "%s aus Walnuss");
        woodMaterials.put("silver_maple", "%s aus Silberahorn");
        woodMaterials.put("staghorn_sumac", "%s aus Essigbaum");
        woodMaterials.put("silverberry", "%s aus Ölweide");
        woodMaterials.put("willow", "%s aus Weide");
        woodMaterials.put("poplar", "%s aus Pappel");
        woodMaterials.put("alder", "%s aus Erle");
        woodMaterials.put("aspen", "%s aus Espe");
        woodMaterials.put("azalea", "%s aus Azalee");
        woodMaterials.put("apple", "%s aus Apfelbaum");
        woodMaterials.put("scots_pine", "%s aus Kiefer");
        woodMaterials.put("swamp_oak", "%s aus Sumpfeiche");
        woodMaterials.put("aspen_nss", "%s aus Espe");
        woodMaterials.put("cedar_nss", "%s aus Zeder");
        woodMaterials.put("coconut_nss", "%s aus Kokospalme");
        woodMaterials.put("cypress_nss", "%s aus Zypresse");
        woodMaterials.put("fir_nss", "%s aus Tanne");
        woodMaterials.put("ghaf_nss", "%s aus Ghafbaum");
        woodMaterials.put("larch_nss", "%s aus Lärche");
        woodMaterials.put("mahogany_nss", "%s aus Mahagoni");
        woodMaterials.put("maple_nss", "%s aus Ahorn");
        woodMaterials.put("olive_nss", "%s aus Olivenholz");
        woodMaterials.put("palo_verde_nss", "%s aus Palo Verde");
        woodMaterials.put("redwood_nss", "%s aus Mammutbaum");
        woodMaterials.put("saxaul_nss", "%s aus Saxaul");
        woodMaterials.put("sugi_nss", "%s aus Japanischer Zeder");
        woodMaterials.put("willow_nss", "%s aus Weide");
        woodMaterials.put("wisteria_nss", "%s aus Glyzinie");
        woodMaterials.put("oak", "%s aus Eiche");
        woodMaterials.put("birch", "%s aus Birke");
        woodMaterials.put("spruce", "%s aus Fichte");
        woodMaterials.put("jungle", "%s aus Tropenholz");
        woodMaterials.put("acacia", "%s aus Akazie");
        woodMaterials.put("dark_oak", "%s aus Schwarzeichenholz");
        woodMaterials.put("crimson", "%s aus Karmesinholz");
        woodMaterials.put("warped", "%s aus Wirrholz");
        woodMaterials.put("mangrove", "%s aus Mangrove");
        woodMaterials.put("cherry", "%s aus Kirschbaum");
        woodMaterials.put("bamboo", "%s aus Bambus");
        woodMaterials.put("hazelnut", "%s aus Haselnuss");
        woodMaterials.put("hornbeam", "%s aus Hainbuche");
        woodMaterials.put("hawthorn", "%s aus Weißdorn");
        woodMaterials.put("quince", "%s aus Quitte");
        woodMaterials.put("plum", "%s aus Pflaume");
        woodMaterials.put("mango", "%s aus Mango");
        woodMaterials.put("fig", "%s aus Feige");
        woodMaterials.put("viburnum", "%s aus Schneeball");
        woodMaterials.put("white_mulberry", "%s aus Maulbeere");
        woodMaterials.put("wild_cherry", "%s aus Wildkirsche");
        woodMaterials.put("bauhinia", "%s aus Bauhinie");
        woodMaterials.put("pine", "%s aus Kiefer");
        woodMaterials.put("fir", "%s aus Tanne");
        woodMaterials.put("cedar", "%s aus Zeder");
        woodMaterials.put("araucaria", "%s aus Araukarie");
        woodMaterials.put("juniper", "%s aus Wacholder");

        Map<String, String> woodenItems = new LinkedHashMap<>();
        woodenItems.put("_stick", "Stab");

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