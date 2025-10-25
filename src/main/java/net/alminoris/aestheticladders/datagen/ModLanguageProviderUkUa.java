package net.alminoris.aestheticladders.datagen;

import net.alminoris.aestheticladders.AestheticLadders;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderUkUa extends LanguageProvider
{
    public ModLanguageProviderUkUa(PackOutput output)
    {
        super(output, AestheticLadders.MOD_ID, "uk_ua");
    }

    @Override
    public void addTranslations()
    {
        Map<String, String> woodenObjects = new LinkedHashMap<>();
        woodenObjects.put("_ladder", "драбина");

        Map<String, String> stoneObjects = new LinkedHashMap<>();
        stoneObjects.put("_stone_ladder", "драбина");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "Кам’яна %s");
        stoneMaterials.put("tuff", "Туфова %s");
        stoneMaterials.put("blackstone", "Чорнокам’яна %s");
        stoneMaterials.put("andesite", "Андезитова %s");
        stoneMaterials.put("diorite", "Діоритова %s");
        stoneMaterials.put("granite", "Гранітна %s");
        stoneMaterials.put("deepslate", "Глибосланцева %s");
        stoneMaterials.put("basalt_side", "Базальтова %s");
        stoneMaterials.put("quartz_block_bottom", "Кварцова %s");
        stoneMaterials.put("stone_bricks", "Кам’яноцегляна %s");
        stoneMaterials.put("bricks", "Цегляна %s");
        stoneMaterials.put("mud_bricks", "Глиноцегляна %s");
        stoneMaterials.put("sandstone", "Піщаникова %s");
        stoneMaterials.put("dolomite_block", "Доломітова %s");
        stoneMaterials.put("saltmarsh_block", "Солончакова %s");
        stoneMaterials.put("loessic_marl_block", "Лесово-мергельна %s");
        stoneMaterials.put("loamy_marl_block", "Суглинково-мергельна %s");
        stoneMaterials.put("fossil_marlstone_block", "Викопномергельна %s");
        stoneMaterials.put("limestone_block", "Вапнякова %s");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "Кипарисова %s");
        woodMaterials.put("thuja", "Туїна %s");
        woodMaterials.put("sequoia", "Секвойова %s");
        woodMaterials.put("mountain_hemlock", "Тсугова %s");
        woodMaterials.put("cryptomeria", "Криптомерієва %s");
        woodMaterials.put("yew", "Тисова %s");
        woodMaterials.put("larch", "Модринова %s");
        woodMaterials.put("olive", "Оливкова %s");
        woodMaterials.put("tamarisk", "Тамарискова %s");
        woodMaterials.put("western_serviceberry", "Іргова %s");
        woodMaterials.put("trembling_aspen", "Осикова %s");
        woodMaterials.put("cottonwood", "Тополева %s");
        woodMaterials.put("walnut", "Горіхова %s");
        woodMaterials.put("silver_maple", "Срібнокленова %s");
        woodMaterials.put("staghorn_sumac", "Сумахова %s");
        woodMaterials.put("silverberry", "Лохова %s");
        woodMaterials.put("willow", "Вербова %s");
        woodMaterials.put("poplar", "Тополева %s");
        woodMaterials.put("alder", "Вільхова %s");
        woodMaterials.put("aspen", "Осикова %s");
        woodMaterials.put("azalea", "Азалієва %s");
        woodMaterials.put("apple", "Яблунева %s");
        woodMaterials.put("scots_pine", "Соснова %s");
        woodMaterials.put("swamp_oak", "Болотнодубова %s");
        woodMaterials.put("aspen_nss", "Осикова %s");
        woodMaterials.put("cedar_nss", "Кедрова %s");
        woodMaterials.put("coconut_nss", "Кокосова %s");
        woodMaterials.put("cypress_nss", "Кипарисова %s");
        woodMaterials.put("fir_nss", "Ялицева %s");
        woodMaterials.put("ghaf_nss", "Гафова %s");
        woodMaterials.put("larch_nss", "Модринова %s");
        woodMaterials.put("mahogany_nss", "Махаґонова %s");
        woodMaterials.put("maple_nss", "Кленова %s");
        woodMaterials.put("olive_nss", "Оливкова %s");
        woodMaterials.put("palo_verde_nss", "Паловердова %s");
        woodMaterials.put("redwood_nss", "Секвойова %s");
        woodMaterials.put("saxaul_nss", "Саксаулова %s");
        woodMaterials.put("sugi_nss", "Суґієва %s");
        woodMaterials.put("willow_nss", "Вербова %s");
        woodMaterials.put("wisteria_nss", "Гліцинійна %s");
        woodMaterials.put("oak", "Дубова %s");
        woodMaterials.put("birch", "Березова %s");
        woodMaterials.put("spruce", "Ялинова %s");
        woodMaterials.put("jungle", "Тропічнодеревна %s");
        woodMaterials.put("acacia", "Акацієва %s");
        woodMaterials.put("dark_oak", "Темнодубова %s");
        woodMaterials.put("crimson", "Пурпурова %s");
        woodMaterials.put("warped", "Деформована %s");
        woodMaterials.put("mangrove", "Мангрова %s");
        woodMaterials.put("cherry", "Вишнева %s");
        woodMaterials.put("bamboo", "Бамбукова %s");
        woodMaterials.put("hazelnut", "Ліщинова %s");
        woodMaterials.put("hornbeam", "Грабова %s");
        woodMaterials.put("hawthorn", "Глодів %s");
        woodMaterials.put("quince", "Айвова %s");
        woodMaterials.put("plum", "Сливова %s");
        woodMaterials.put("mango", "Мангова %s");
        woodMaterials.put("fig", "Інжирова %s");
        woodMaterials.put("viburnum", "Калинова %s");
        woodMaterials.put("white_mulberry", "Шовковицева %s");
        woodMaterials.put("wild_cherry", "Черешнева %s");
        woodMaterials.put("bauhinia", "Баухінієва %s");
        woodMaterials.put("pine", "Соснова %s");
        woodMaterials.put("fir", "Ялицева %s");
        woodMaterials.put("cedar", "Кедрова %s");
        woodMaterials.put("araucaria", "Араукарієва %s");
        woodMaterials.put("juniper", "Ялівцева %s");

        Map<String, String> woodenItems = new LinkedHashMap<>();
        woodenItems.put("_stick", "паличка");

        for (Map.Entry<String, String> type : stoneObjects.entrySet())
        {
            for (Map.Entry<String, String> mat : stoneMaterials.entrySet())
            {
                String key = "block." + AestheticLadders.MOD_ID + "." + mat.getKey() + type.getKey();
                String value = String.format(mat.getValue(), type.getValue());
                add(key, value);
            }
        }


        for (Map.Entry<String, String> type : woodenObjects.entrySet())
        {
            for (Map.Entry<String, String> mat : woodMaterials.entrySet())
            {
                String key = "block." + AestheticLadders.MOD_ID + "." + mat.getKey() + type.getKey();
                String value = String.format(mat.getValue(), type.getValue());
                add(key, value);
            }
        }

        for (Map.Entry<String, String> type : woodenItems.entrySet())
        {
            for (Map.Entry<String, String> mat : woodMaterials.entrySet())
            {
                String key = "item." + AestheticLadders.MOD_ID + "." + mat.getKey() + type.getKey();
                String value = String.format(mat.getValue(), type.getValue());
                add(key, value);
            }
        }

        add("itemgroup.aladrstab","Aesthetic Ladders");
    }
}