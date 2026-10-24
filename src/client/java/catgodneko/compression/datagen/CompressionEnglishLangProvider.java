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
        translationBuilder.add(
            CompressionItems.SUSPICIOUS_SUBSTANCE,
            "Suspicious Substance"
        );
    }
}