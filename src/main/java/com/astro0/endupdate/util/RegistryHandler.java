package com.astro0.endupdate.util;

import com.astro0.endupdate.EndUpdate;
import com.astro0.endupdate.items.ItemBase;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS =  DeferredRegister.create(ForgeRegistries.ITEMS, EndUpdate.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //Items

    public static final RegistryObject<Item> CHORUSITE_INGOT = ITEMS.register("chorusite_ingot", ItemBase::new);

}
