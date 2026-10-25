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

        // Swords
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_WOODEN_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_STONE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_COPPER_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_IRON_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_GOLDEN_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_DIAMOND_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_NETHERITE_SWORD, ModelTemplates.FLAT_HANDHELD_ITEM);
        
        // Pickaxes
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_WOODEN_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_STONE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_COPPER_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_IRON_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_GOLDEN_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_DIAMOND_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_NETHERITE_PICKAXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        
        // Axes
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_WOODEN_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_STONE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_COPPER_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_IRON_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_GOLDEN_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_DIAMOND_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_NETHERITE_AXE, ModelTemplates.FLAT_HANDHELD_ITEM);

        // Shovels
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_WOODEN_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_STONE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_COPPER_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_IRON_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_GOLDEN_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_DIAMOND_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_NETHERITE_SHOVEL, ModelTemplates.FLAT_HANDHELD_ITEM);
        
        // Hoes
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_WOODEN_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_STONE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_COPPER_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_IRON_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
		itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_GOLDEN_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_DIAMOND_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerator.generateFlatItem(CompressionItems.COMPRESSED_NETHERITE_HOE, ModelTemplates.FLAT_HANDHELD_ITEM);
    }

    @Override
    public String getName() {
        return "CompressionModelProvider";
    }
}
