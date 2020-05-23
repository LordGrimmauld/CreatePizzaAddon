package com.grimmauld.createpizzaaddon.setup;

import com.grimmauld.createpizzaaddon.registrate.ObjectRegisterer;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.minecraft.item.Item;



public class ModItems extends ObjectRegisterer {

    public static final ItemEntry<Item> SOME_ITEM = REGISTRATE.item("item_name", Item::new).lang("My new Example Item").register();

    public static void register() {/* Just here so the class is loaded and stuff is registered */}
}
