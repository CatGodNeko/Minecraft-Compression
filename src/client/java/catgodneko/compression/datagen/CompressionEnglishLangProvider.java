package catgodneko.compression.datagen;

import java.util.concurrent.CompletableFuture;

import catgodneko.compression.CompressionItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.HolderLookup.Provider;

public class CompressionEnglishLangProvider extends FabricLanguageProvider {
    public CompressionEnglishLangProvider(
        FabricDataOutput dataOutput,
        CompletableFuture<HolderLookup.Provider> registryLookup
    ) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(
        Provider registryLookup,
        TranslationBuilder translationBuilder
    ) {
        // Suspicious Substance Item in "en_us.json"
        translationBuilder.add(CompressionItems.SUSPICIOUS_SUBSTANCE,"Suspicious Substance");

        // Swords
        translationBuilder.add(CompressionItems.COMPRESSED_WOODEN_SWORD, "Compressed Wooden Sword");
        translationBuilder.add(CompressionItems.COMPRESSED_STONE_SWORD, "Compressed Stone Sword");
		translationBuilder.add(CompressionItems.COMPRESSED_COPPER_SWORD, "Compressed Copper Sword");
        translationBuilder.add(CompressionItems.COMPRESSED_IRON_SWORD, "Compressed Iron Sword");
		translationBuilder.add(CompressionItems.COMPRESSED_GOLDEN_SWORD, "Compressed Golden Sword");
        translationBuilder.add(CompressionItems.COMPRESSED_DIAMOND_SWORD, "Compressed Diamond Sword");
        translationBuilder.add(CompressionItems.COMPRESSED_NETHERITE_SWORD, "Compressed Netherite Sword");

        // Pickaxes
        translationBuilder.add(CompressionItems.COMPRESSED_WOODEN_PICKAXE, "Compressed Wooden Pickaxe");
        translationBuilder.add(CompressionItems.COMPRESSED_STONE_PICKAXE, "Compressed Stone Pickaxe");
		translationBuilder.add(CompressionItems.COMPRESSED_COPPER_PICKAXE, "Compressed Copper Pickaxe");
        translationBuilder.add(CompressionItems.COMPRESSED_IRON_PICKAXE, "Compressed Iron Pickaxe");
		translationBuilder.add(CompressionItems.COMPRESSED_GOLDEN_PICKAXE, "Compressed Golden Pickaxe");
        translationBuilder.add(CompressionItems.COMPRESSED_DIAMOND_PICKAXE, "Compressed Diamond Pickaxe");
        translationBuilder.add(CompressionItems.COMPRESSED_NETHERITE_PICKAXE, "Compressed Netherite Pickaxe");

        // Axes
        translationBuilder.add(CompressionItems.COMPRESSED_WOODEN_AXE, "Compressed Wooden Axe");
        translationBuilder.add(CompressionItems.COMPRESSED_STONE_AXE, "Compressed Stone Axe");
		translationBuilder.add(CompressionItems.COMPRESSED_COPPER_AXE, "Compressed Copper Axe");
        translationBuilder.add(CompressionItems.COMPRESSED_IRON_AXE, "Compressed Iron Axe");
		translationBuilder.add(CompressionItems.COMPRESSED_GOLDEN_AXE, "Compressed Golden Axe");
        translationBuilder.add(CompressionItems.COMPRESSED_DIAMOND_AXE, "Compressed Diamond Axe");
        translationBuilder.add(CompressionItems.COMPRESSED_NETHERITE_AXE, "Compressed Netherite Axe");

        // Shovels
        translationBuilder.add(CompressionItems.COMPRESSED_WOODEN_SHOVEL, "Compressed Wooden Shovel");
        translationBuilder.add(CompressionItems.COMPRESSED_STONE_SHOVEL, "Compressed Stone Shovel");
		translationBuilder.add(CompressionItems.COMPRESSED_COPPER_SHOVEL, "Compressed Copper Shovel");
        translationBuilder.add(CompressionItems.COMPRESSED_IRON_SHOVEL, "Compressed Iron Shovel");
		translationBuilder.add(CompressionItems.COMPRESSED_GOLDEN_SHOVEL, "Compressed Golden Shovel");
        translationBuilder.add(CompressionItems.COMPRESSED_DIAMOND_SHOVEL, "Compressed Diamond Shovel");
        translationBuilder.add(CompressionItems.COMPRESSED_NETHERITE_SHOVEL, "Compressed Netherite Shovel");

        // Hoes
        translationBuilder.add(CompressionItems.COMPRESSED_WOODEN_HOE, "Compressed Wooden Hoe");
        translationBuilder.add(CompressionItems.COMPRESSED_STONE_HOE, "Compressed Stone Hoe");
		translationBuilder.add(CompressionItems.COMPRESSED_COPPER_HOE, "Compressed Copper Hoe");
        translationBuilder.add(CompressionItems.COMPRESSED_IRON_HOE, "Compressed Iron Hoe");
		translationBuilder.add(CompressionItems.COMPRESSED_GOLDEN_HOE, "Compressed Golden Hoe");
        translationBuilder.add(CompressionItems.COMPRESSED_DIAMOND_HOE, "Compressed Diamond Hoe");
        translationBuilder.add(CompressionItems.COMPRESSED_NETHERITE_HOE, "Compressed Netherite Hoe");
    }
}