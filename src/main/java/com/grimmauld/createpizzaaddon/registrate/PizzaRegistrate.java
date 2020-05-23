package com.grimmauld.createpizzaaddon.registrate;

import com.tterrag.registrate.AbstractRegistrate;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

public class PizzaRegistrate extends AbstractRegistrate<PizzaRegistrate> {

    public static PizzaRegistrate create(String modid) {
        return new PizzaRegistrate(modid).registerEventListeners(FMLJavaModLoadingContext.get().getModEventBus());
    }

    public PizzaRegistrate(String modid) {
        super(modid);
    }
}