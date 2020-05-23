package com.grimmauld.createpizzaaddon.setup;

import com.grimmauld.createpizzaaddon.registrate.ObjectRegisterer;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;

public class ModBlocks extends ObjectRegisterer {

    public static final BlockEntry<Block> SOME_BLOCK = REGISTRATE.block("test_block", Block::new)
            .properties(p -> Block.Properties.from(Blocks.REDSTONE_LAMP))
            .defaultLang()
            .simpleItem()
            .register();
}