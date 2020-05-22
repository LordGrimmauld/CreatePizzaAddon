package com.grimmauld.createpizzaaddon.setup;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class ModSetup {
	public static ItemGroup itemGroup = new ItemGroup("createpizzaaddon") {
		@Override
		public ItemStack createIcon() {
			return new ItemStack(Items.COOKED_BEEF); // FIXME add pizza item here
		}
	};
	
	public void init() {
	}
}
