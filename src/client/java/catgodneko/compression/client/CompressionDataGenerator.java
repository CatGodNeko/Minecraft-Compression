package catgodneko.compression.client;

import catgodneko.compression.datagen.CompressionEnglishLangProvider;
import catgodneko.compression.datagen.CompressionModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class CompressionDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(
		FabricDataGenerator fabricDataGenerator) 
	{
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();
		pack.addProvider(CompressionEnglishLangProvider::new);
		pack.addProvider(CompressionModelProvider::new);
	}
}
