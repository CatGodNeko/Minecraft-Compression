package catgodneko.compression.datagen;

import catgodneko.compression.CompressionItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class CompressionModelProvider extends FabricModelProvider {
    public CompressionModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
        // No blocks yet.
    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerator) {
        // Generates BOTH:
        //   assets/example-mod/models/item/suspicious_substance.json
        //   assets/example-mod/items/suspicious_substance.json
        itemModelGenerator.generateFlatItem(
            CompressionItems.SUSPICIOUS_SUBSTANCE,
            ModelTemplates.FLAT_ITEM
        );
    }

    @Override
    public String getName() {
        return "ExampleModModelProvider";
    }
}
