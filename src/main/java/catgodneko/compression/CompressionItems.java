package catgodneko.compression;

import java.util.function.Function;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;

public class CompressionItems {

    public static final Item SUSPICIOUS_SUBSTANCE = register(
        "suspicious_substance", Item::new, new Item.Properties());

    // ===== Compressed tool materials =====

    public static final ToolMaterial COMPRESSED_WOOD = new ToolMaterial(
        BlockTags.INCORRECT_FOR_WOODEN_TOOL,
        59 * 9,
        2.0F,
        0.0F,
        15,
        ItemTags.WOODEN_TOOL_MATERIALS
    );

    public static final ToolMaterial COMPRESSED_STONE = new ToolMaterial(
        BlockTags.INCORRECT_FOR_STONE_TOOL,
        131 * 9,
        4.0F,
        1.0F,
        5,
        ItemTags.STONE_TOOL_MATERIALS
    );

    public static final ToolMaterial COMPRESSED_COPPER = new ToolMaterial(
        BlockTags.INCORRECT_FOR_COPPER_TOOL,
        190 * 9,
        5.0F,
        1.0F,
        13,
        ItemTags.COPPER_TOOL_MATERIALS
    );

    public static final ToolMaterial COMPRESSED_IRON = new ToolMaterial(
        BlockTags.INCORRECT_FOR_IRON_TOOL,
        250 * 9,
        6.0F,
        2.0F,
        14,
        ItemTags.IRON_TOOL_MATERIALS
    );

    public static final ToolMaterial COMPRESSED_GOLD = new ToolMaterial(
        BlockTags.INCORRECT_FOR_GOLD_TOOL,
        32 * 9,
        12.0F,
        0.0F,
        22,
        ItemTags.GOLD_TOOL_MATERIALS
    );

    public static final ToolMaterial COMPRESSED_DIAMOND = new ToolMaterial(
        BlockTags.INCORRECT_FOR_DIAMOND_TOOL,
        1561 * 9,
        8.0F,
        3.0F,
        10,
        ItemTags.DIAMOND_TOOL_MATERIALS
    );

    public static final ToolMaterial COMPRESSED_NETHERITE = new ToolMaterial(
        BlockTags.INCORRECT_FOR_NETHERITE_TOOL,
        2031 * 9,
        9.0F,
        4.0F,
        15,
        ItemTags.NETHERITE_TOOL_MATERIALS
    );

    // ===== Swords =====
    public static final Item COMPRESSED_WOODEN_SWORD = registerSword("compressed_wooden_sword", COMPRESSED_WOOD);
    public static final Item COMPRESSED_STONE_SWORD = registerSword("compressed_stone_sword", COMPRESSED_STONE);
    public static final Item COMPRESSED_COPPER_SWORD = registerSword("compressed_copper_sword", COMPRESSED_COPPER);
    public static final Item COMPRESSED_IRON_SWORD = registerSword("compressed_iron_sword", COMPRESSED_IRON);
    public static final Item COMPRESSED_GOLDEN_SWORD = registerSword("compressed_golden_sword", COMPRESSED_GOLD);
    public static final Item COMPRESSED_DIAMOND_SWORD = registerSword("compressed_diamond_sword", COMPRESSED_DIAMOND);
    public static final Item COMPRESSED_NETHERITE_SWORD = registerSword("compressed_netherite_sword", COMPRESSED_NETHERITE);

    // ===== Pickaxes =====
    public static final Item COMPRESSED_WOODEN_PICKAXE = registerPickaxe("compressed_wooden_pickaxe", COMPRESSED_WOOD);
    public static final Item COMPRESSED_STONE_PICKAXE = registerPickaxe("compressed_stone_pickaxe", COMPRESSED_STONE);
	public static final Item COMPRESSED_COPPER_PICKAXE = registerPickaxe("compressed_copper_pickaxe", COMPRESSED_COPPER);
    public static final Item COMPRESSED_IRON_PICKAXE = registerPickaxe("compressed_iron_pickaxe", COMPRESSED_IRON);
	public static final Item COMPRESSED_GOLDEN_PICKAXE = registerPickaxe("compressed_golden_pickaxe", COMPRESSED_GOLD);
    public static final Item COMPRESSED_DIAMOND_PICKAXE = registerPickaxe("compressed_diamond_pickaxe", COMPRESSED_DIAMOND);
    public static final Item COMPRESSED_NETHERITE_PICKAXE = registerPickaxe("compressed_netherite_pickaxe", COMPRESSED_NETHERITE);

    // ===== Axes =====
    public static final Item COMPRESSED_WOODEN_AXE = registerAxe("compressed_wooden_axe", COMPRESSED_WOOD);
    public static final Item COMPRESSED_STONE_AXE = registerAxe("compressed_stone_axe", COMPRESSED_STONE);
	public static final Item COMPRESSED_COPPER_AXE = registerAxe("compressed_copper_axe", COMPRESSED_COPPER);
    public static final Item COMPRESSED_IRON_AXE = registerAxe("compressed_iron_axe", COMPRESSED_IRON);
	public static final Item COMPRESSED_GOLDEN_AXE = registerAxe("compressed_golden_axe", COMPRESSED_GOLD);
    public static final Item COMPRESSED_DIAMOND_AXE = registerAxe("compressed_diamond_axe", COMPRESSED_DIAMOND);
    public static final Item COMPRESSED_NETHERITE_AXE = registerAxe("compressed_netherite_axe", COMPRESSED_NETHERITE);

    // ===== Shovels =====
    public static final Item COMPRESSED_WOODEN_SHOVEL = registerShovel("compressed_wooden_shovel", COMPRESSED_WOOD);
    public static final Item COMPRESSED_STONE_SHOVEL = registerShovel("compressed_stone_shovel", COMPRESSED_STONE);
	public static final Item COMPRESSED_COPPER_SHOVEL = registerShovel("compressed_copper_shovel", COMPRESSED_COPPER);
    public static final Item COMPRESSED_IRON_SHOVEL = registerShovel("compressed_iron_shovel", COMPRESSED_IRON);
	public static final Item COMPRESSED_GOLDEN_SHOVEL = registerShovel("compressed_golden_shovel", COMPRESSED_GOLD);
    public static final Item COMPRESSED_DIAMOND_SHOVEL = registerShovel("compressed_diamond_shovel", COMPRESSED_DIAMOND);
    public static final Item COMPRESSED_NETHERITE_SHOVEL = registerShovel("compressed_netherite_shovel", COMPRESSED_NETHERITE);

    // ===== Hoes =====
    public static final Item COMPRESSED_WOODEN_HOE = registerHoe("compressed_wooden_hoe", COMPRESSED_WOOD);
    public static final Item COMPRESSED_STONE_HOE = registerHoe("compressed_stone_hoe", COMPRESSED_STONE);
	public static final Item COMPRESSED_COPPER_HOE = registerHoe("compressed_copper_hoe", COMPRESSED_COPPER);
    public static final Item COMPRESSED_IRON_HOE = registerHoe("compressed_iron_hoe", COMPRESSED_IRON);
	public static final Item COMPRESSED_GOLDEN_HOE = registerHoe("compressed_golden_hoe", COMPRESSED_GOLD);
    public static final Item COMPRESSED_DIAMOND_HOE = registerHoe("compressed_diamond_hoe", COMPRESSED_DIAMOND);
    public static final Item COMPRESSED_NETHERITE_HOE = registerHoe("compressed_netherite_hoe", COMPRESSED_NETHERITE);

    // ===== Helper methods =====

	public static <T extends Item> T register(
        String name, Function<Item.Properties, T> itemFactory, 
        Item.Properties settings
    ) {
		// Create the item key.
		ResourceKey<Item> itemKey = ResourceKey.create(
            Registries.ITEM, Identifier.fromNamespaceAndPath(
                Compression.MOD_ID, name));

		// Create the item instance.
		T item = itemFactory.apply(settings.setId(itemKey));

		// Register the item.
		Registry.register(BuiltInRegistries.ITEM, itemKey, item);

		return item;
	}

    private static Item registerSword(String name, ToolMaterial material) {
        return register(
            name,
            Item::new,
            new Item.Properties().sword(material, 3.0F, -2.4F)
        );
    }

    private static Item registerPickaxe(String name, ToolMaterial material) {
        return register(
            name,
            Item::new,
            new Item.Properties().pickaxe(material, 1.0F, -2.8F)
        );
    }

    private static Item registerAxe(String name, ToolMaterial material) {
        return register(name,
            Item::new,
            new Item.Properties().axe(material, 6.0F, -3.1F)
        );
    }

    private static Item registerShovel(String name, ToolMaterial material) {
        return register(
            name,
            Item::new,
            new Item.Properties().shovel(material, 1.5F, -3.0F)
        );
    }

    private static Item registerHoe(String name, ToolMaterial material) {
        return register(
            name,
            Item::new,
            new Item.Properties().hoe(material, -2.0F, -1.0F)
        );
    }

    public static void initialize() {
        // Get the event for modifying entries in the ingredients group.
        // And register an event handler that adds our suspicious item to the ingredients group.
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS)
		    .register((itemGroup) -> itemGroup.accept(
                CompressionItems.SUSPICIOUS_SUBSTANCE)
            );

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COMBAT)
		    .register((itemGroup) -> {
                // Swords
                itemGroup.accept(COMPRESSED_WOODEN_SWORD);
                itemGroup.accept(COMPRESSED_STONE_SWORD);
                itemGroup.accept(COMPRESSED_COPPER_SWORD);
                itemGroup.accept(COMPRESSED_IRON_SWORD);
                itemGroup.accept(COMPRESSED_GOLDEN_SWORD);
                itemGroup.accept(COMPRESSED_DIAMOND_SWORD);
                itemGroup.accept(COMPRESSED_NETHERITE_SWORD);
            });

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES)
            .register((itemGroup) -> {
                // Pickaxes
                itemGroup.accept(COMPRESSED_WOODEN_PICKAXE);
                itemGroup.accept(COMPRESSED_WOODEN_AXE);
                itemGroup.accept(COMPRESSED_WOODEN_SHOVEL);
                itemGroup.accept(COMPRESSED_WOODEN_HOE);

                itemGroup.accept(COMPRESSED_STONE_PICKAXE);
                itemGroup.accept(COMPRESSED_STONE_AXE);
                itemGroup.accept(COMPRESSED_STONE_SHOVEL);
                itemGroup.accept(COMPRESSED_STONE_HOE);

                itemGroup.accept(COMPRESSED_COPPER_PICKAXE);
                itemGroup.accept(COMPRESSED_COPPER_AXE);
                itemGroup.accept(COMPRESSED_COPPER_SHOVEL);
                itemGroup.accept(COMPRESSED_COPPER_HOE);

                itemGroup.accept(COMPRESSED_IRON_PICKAXE);
                itemGroup.accept(COMPRESSED_IRON_AXE);
                itemGroup.accept(COMPRESSED_IRON_SHOVEL);
                itemGroup.accept(COMPRESSED_IRON_HOE);

                itemGroup.accept(COMPRESSED_GOLDEN_PICKAXE);
                itemGroup.accept(COMPRESSED_GOLDEN_AXE);
                itemGroup.accept(COMPRESSED_GOLDEN_SHOVEL);
                itemGroup.accept(COMPRESSED_GOLDEN_HOE);

                itemGroup.accept(COMPRESSED_DIAMOND_PICKAXE);
                itemGroup.accept(COMPRESSED_DIAMOND_AXE);
                itemGroup.accept(COMPRESSED_DIAMOND_SHOVEL);
                itemGroup.accept(COMPRESSED_DIAMOND_HOE);

                itemGroup.accept(COMPRESSED_NETHERITE_PICKAXE);
                itemGroup.accept(COMPRESSED_NETHERITE_AXE);
                itemGroup.accept(COMPRESSED_NETHERITE_SHOVEL);
                itemGroup.accept(COMPRESSED_NETHERITE_HOE);
            });
    }
}
