package me.bigvirusboi.foodmod.data.client;

import me.bigvirusboi.foodmod.FoodMod;
import me.bigvirusboi.foodmod.init.ItemInit;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    private final ModelFile ITEM_GENERATED = getExistingFile(mcLoc("item/generated"));
    private final ModelFile ITEM_HANDHELD = getExistingFile(mcLoc("item/handheld"));

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, FoodMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (String name : ItemInit.NEEDS_MODELS) {
            buildItem(name);
        }
        buildItem(ITEM_HANDHELD, "knife");
    }



    private void buildItem(String name) {
        buildItem(ITEM_GENERATED, name);
    }

    private void buildItem(ModelFile model, String name) {
        getBuilder(name).parent(model).texture("layer0", "item/" + name);
    }
}
