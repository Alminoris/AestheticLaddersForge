package net.alminoris.aestheticladders.util.helper;

import net.alminoris.aestheticladders.AestheticLadders;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ModJsonHelper
{
    public static void createBlockModel(String jsonContent, String name)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticLadders.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = name + ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("NAME", name);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createStonecuttingRecipe(String ingredientName, String outputName, String count)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/data/"+ AestheticLadders.MOD_ID+"/recipe/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = outputName + "_from_" + ingredientName.split(":")[1] + "_stonecutting.json";
        File modelFile = new File(directory, fileName);

        String jsonContent = ModJsonTemplates.STONECUTTING_RECIPE.replace("COUNT", count)
                .replace("INGREDIENT_NAME", ingredientName).replace("OUTPUT_NAME", outputName);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createBlockModel(String jsonContent, String name, String stoneBlock)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticLadders.MOD_ID+"/models/block/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = name + ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("NAME", stoneBlock);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static void createBlockstate(String jsonContent, String name)
    {
        String projectPath = System.getProperty("user.dir");

        String filePath = projectPath.replace("run-data", "src\\main\\resources") + "/assets/"+ AestheticLadders.MOD_ID+"/blockstates/";

        File directory = new File(filePath);
        if (!directory.exists())
            directory.mkdirs();

        String fileName = name + ".json";
        File modelFile = new File(directory, fileName);

        jsonContent = jsonContent.replace("NAME", name);

        try (FileWriter writer = new FileWriter(modelFile))
        {
            writer.write(jsonContent);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}