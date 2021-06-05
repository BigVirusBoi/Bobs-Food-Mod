package me.bigvirusboi.foodmod.data.client;

import me.bigvirusboi.foodmod.FoodMod;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    private final ModelFile ITEM_GENERATED = getExistingFile(mcLoc("item/generated"));

    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, FoodMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        buildItem("honeyed_apple");
    }



    private void buildItem(String name) {
        buildItem(ITEM_GENERATED, name);
    }

    private void buildItem(ModelFile model, String name) {
        getBuilder(name).parent(model).texture("layer0", "item/" + name);
    }
}
