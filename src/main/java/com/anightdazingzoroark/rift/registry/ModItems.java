package com.anightdazingzoroark.rift.registry;

import com.anightdazingzoroark.rift.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    //thatch items
    public static final Item OAK_THATCH = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item BIRCH_THATCH = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item SPRUCE_THATCH = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item JUNGLE_THATCH = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item DARK_OAK_THATCH = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item ACACIA_THATCH = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item CRIMSON_THATCH = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item WARPED_THATCH = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    //tribute items
    public static final Item STEGOSAURUS_PLATE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item TYRANNOSAURUS_ARM = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item DODO_BEAK = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item TRICERATOPS_HORN = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item UTAHRAPTOR_CLAW = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item APATOSAURUS_VERTEBRAE = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item PARASAUROLOPHUS_HORN = new Item(new Item.Settings().group(ItemGroup.MATERIALS));
    public static final Item DIMETRODON_SAIL = new Item(new Item.Settings().group(ItemGroup.MATERIALS));

    public static void registerItems() {
        //thatch items
        Registry.register(Registry.ITEM, new Identifier(Items.MOD_ID, "oak_thatch"), OAK_THATCH);
        Registry.register(Registry.ITEM, new Identifier(Items.MOD_ID, "birch_thatch"), BIRCH_THATCH);
        Registry.register(Registry.ITEM, new Identifier(Items.MOD_ID, "spruce_thatch"), SPRUCE_THATCH);
        Registry.register(Registry.ITEM, new Identifier(Items.MOD_ID, "jungle_thatch"), JUNGLE_THATCH);
        Registry.register(Registry.ITEM, new Identifier(Items.MOD_ID, "dark_oak_thatch"), DARK_OAK_THATCH);
        Registry.register(Registry.ITEM, new Identifier(Items.MOD_ID, "acacia_thatch"), ACACIA_THATCH);
        Registry.register(Registry.ITEM, new Identifier(Items.MOD_ID, "crimson_thatch"), CRIMSON_THATCH);
        Registry.register(Registry.ITEM, new Identifier(Items.MOD_ID, "warped_thatch"), WARPED_THATCH);
        //tribute items
        Registry.register(Registry.ITEM, new Identifier(Items.MOD_ID, "stegosaurus_plate"), STEGOSAURUS_PLATE);
        Registry.register(Registry.ITEM, new Identifier(Items.MOD_ID, "tyrannosaurus_arm"), TYRANNOSAURUS_ARM);
        Registry.register(Registry.ITEM, new Identifier(Items.MOD_ID, "dodo_beak"), DODO_BEAK);
        Registry.register(Registry.ITEM, new Identifier(Items.MOD_ID, "triceratops_horn"), TRICERATOPS_HORN);
        Registry.register(Registry.ITEM, new Identifier(Items.MOD_ID, "utahraptor_claw"), UTAHRAPTOR_CLAW);
        Registry.register(Registry.ITEM, new Identifier(Items.MOD_ID, "apatosaurus_vertebrae"), APATOSAURUS_VERTEBRAE);
        Registry.register(Registry.ITEM, new Identifier(Items.MOD_ID, "parasaurolophus_horn"), PARASAUROLOPHUS_HORN);
        Registry.register(Registry.ITEM, new Identifier(Items.MOD_ID, "dimetrodon_sail"), DIMETRODON_SAIL);
    }
}
