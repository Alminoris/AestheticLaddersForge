package net.alminoris.aestheticladders.datagen;

import net.alminoris.aestheticladders.AestheticLadders;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.LinkedHashMap;
import java.util.Map;

public class ModLanguageProviderRuRu extends LanguageProvider
{
    public ModLanguageProviderRuRu(DataGenerator output)
    {
        super(output, AestheticLadders.MOD_ID, "ru_ru");
    }

    @Override
    public void addTranslations()
    {
        Map<String, String> woodenObjects = new LinkedHashMap<>();
        woodenObjects.put("_ladder", "лестница");

        Map<String, String> stoneObjects = new LinkedHashMap<>();
        stoneObjects.put("_stone_ladder", "лестница");

        Map<String, String> stoneMaterials = new LinkedHashMap<>();
        stoneMaterials.put("stone", "Каменная %s");
        stoneMaterials.put("tuff", "Туфовая %s");
        stoneMaterials.put("blackstone", "Чернокаменная %s");
        stoneMaterials.put("andesite", "Андезитовая %s");
        stoneMaterials.put("diorite", "Диоритовая %s");
        stoneMaterials.put("granite", "Гранитная %s");
        stoneMaterials.put("deepslate", "Глубинносланцевая %s");
        stoneMaterials.put("basalt_side", "Базальтовая %s");
        stoneMaterials.put("quartz_block_bottom", "Кварцевая %s");
        stoneMaterials.put("stone_bricks", "Каменно-кирпичная %s");
        stoneMaterials.put("bricks", "Кирпичная %s");
        stoneMaterials.put("mud_bricks", "Глиняно-кирпичная %s");
        stoneMaterials.put("sandstone", "Песчаниковая %s");
        stoneMaterials.put("dolomite_block", "Доломитовая %s");
        stoneMaterials.put("saltmarsh_block", "Солончаковая %s");
        stoneMaterials.put("loessic_marl_block", "Лёссово-мергелевая %s");
        stoneMaterials.put("loamy_marl_block", "Суглинисто-мергелевая %s");
        stoneMaterials.put("fossil_marlstone_block", "Ископаемо-мергелевая %s");
        stoneMaterials.put("limestone_block", "Известняковая %s");

        Map<String, String> woodMaterials = new LinkedHashMap<>();
        woodMaterials.put("bald_cypress", "Кипарисовая %s");
        woodMaterials.put("thuja", "Туевaя %s");
        woodMaterials.put("sequoia", "Секвойная %s");
        woodMaterials.put("mountain_hemlock", "Тсуговая %s");
        woodMaterials.put("cryptomeria", "Криптомериевая %s");
        woodMaterials.put("yew", "Тисовая %s");
        woodMaterials.put("larch", "Лиственничная %s");
        woodMaterials.put("olive", "Оливковая %s");
        woodMaterials.put("tamarisk", "Тамарисковая %s");
        woodMaterials.put("western_serviceberry", "Ирговая %s");
        woodMaterials.put("trembling_aspen", "Осиновая %s");
        woodMaterials.put("cottonwood", "Тополевая %s");
        woodMaterials.put("walnut", "Ореховая %s");
        woodMaterials.put("silver_maple", "Серебристокленовая %s");
        woodMaterials.put("staghorn_sumac", "Сумаховая %s");
        woodMaterials.put("silverberry", "Лоховая %s");
        woodMaterials.put("willow", "Ивовая %s");
        woodMaterials.put("poplar", "Тополевая %s");
        woodMaterials.put("alder", "Ольховая %s");
        woodMaterials.put("aspen", "Осиновая %s");
        woodMaterials.put("azalea", "Азалиевая %s");
        woodMaterials.put("apple", "Яблоневая %s");
        woodMaterials.put("scots_pine", "Сосновая %s");
        woodMaterials.put("swamp_oak", "Болотнодубовая %s");
        woodMaterials.put("aspen_nss", "Осиновая %s");
        woodMaterials.put("cedar_nss", "Кедровая %s");
        woodMaterials.put("coconut_nss", "Кокосовая %s");
        woodMaterials.put("cypress_nss", "Кипарисовая %s");
        woodMaterials.put("fir_nss", "Пихтовая %s");
        woodMaterials.put("ghaf_nss", "Гафовая %s");
        woodMaterials.put("larch_nss", "Лиственничная %s");
        woodMaterials.put("mahogany_nss", "Махагоновая %s");
        woodMaterials.put("maple_nss", "Кленовая %s");
        woodMaterials.put("olive_nss", "Оливковая %s");
        woodMaterials.put("palo_verde_nss", "Паловердовая %s");
        woodMaterials.put("redwood_nss", "Секвойная %s");
        woodMaterials.put("saxaul_nss", "Саксауловая %s");
        woodMaterials.put("sugi_nss", "Сугиевая %s");
        woodMaterials.put("willow_nss", "Ивовая %s");
        woodMaterials.put("wisteria_nss", "Глициниевaя %s");
        woodMaterials.put("oak", "Дубовая %s");
        woodMaterials.put("birch", "Берёзовая %s");
        woodMaterials.put("spruce", "Еловая %s");
        woodMaterials.put("jungle", "Тропическодревесная %s");
        woodMaterials.put("acacia", "Акациевая %s");
        woodMaterials.put("dark_oak", "Тёмнодубовая %s");
        woodMaterials.put("crimson", "Багровая %s");
        woodMaterials.put("warped", "Искажённая %s");
        woodMaterials.put("mangrove", "Мангровая %s");
        woodMaterials.put("cherry", "Вишнёвая %s");
        woodMaterials.put("bamboo", "Бамбуковая %s");
        woodMaterials.put("hazelnut", "Фундуковая %s");
        woodMaterials.put("hornbeam", "Грабовая %s");
        woodMaterials.put("hawthorn", "Боярышниковая %s");
        woodMaterials.put("quince", "Айвовая %s");
        woodMaterials.put("plum", "Сливовая %s");
        woodMaterials.put("mango", "Мангова %s");
        woodMaterials.put("fig", "Инжировая %s");
        woodMaterials.put("viburnum", "Калиновая %s");
        woodMaterials.put("white_mulberry", "Шёлковичная %s");
        woodMaterials.put("wild_cherry", "Черешневая %s");
        woodMaterials.put("bauhinia", "Баухиниевая %s");
        woodMaterials.put("pine", "Сосновая %s");
        woodMaterials.put("fir", "Пихтовая %s");
        woodMaterials.put("cedar", "Кедровая %s");
        woodMaterials.put("araucaria", "Араукариевая %s");
        woodMaterials.put("juniper", "Можжевеловая %s");

        Map<String, String> woodenItems = new LinkedHashMap<>();
        woodenItems.put("_stick", "палочка");

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