package com.grimmauld.createpizzaaddon.registrate;

import com.grimmauld.createpizzaaddon.CreatePizzaAddon;
import com.grimmauld.createpizzaaddon.setup.ModSetup;


import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.tags.TagCollection;
import net.minecraft.util.ResourceLocation;

public abstract class ObjectRegisterer {
    protected static final PizzaRegistrate REGISTRATE = CreatePizzaAddon.getRegistrate().itemGroup(() -> ModSetup.pizzaGroup);

    protected static Tag<Block> forgeBlockTag(String name) {
        return forgeTag(BlockTags.getCollection(), name);
    }

    protected static Tag<Item> forgeItemTag(String name) {
        return forgeTag(ItemTags.getCollection(), name);
    }

    protected static <T> Tag<T> forgeTag(TagCollection<T> collection, String name) {
        return tag(collection, "forge", name);
    }

    protected static <T> Tag<T> tag(TagCollection<T> collection, String domain, String name) {
        return collection.getOrCreate(new ResourceLocation(domain, name));
    }
}
