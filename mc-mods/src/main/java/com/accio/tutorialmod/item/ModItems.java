package com.accio.tutorialmod.item;

import com.accio.tutorialmod.TutorialMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;


public class ModItems {

    //i create a type <item>deferred register called ITEMS then i
    //assign a deferredRegister (create a new one) by giving him the type of register
    //and the mod_id so he can know which register is for which mod
    public static final DeferredRegister<Item> ITEMS=
            DeferredRegister.create(ForgeRegistries.ITEMS,TutorialMod.MOD_ID);

    //barebone item
    public static final RegistryObject<Item>BOULDER =ITEMS.register("boulder",
            ()->new Item(new Item.Properties()));





    //this is a method to call the event bus and register the ITEMS's register in it
    public static void register (IEventBus eventBus){
        ModItems.ITEMS.register(eventBus);
    }
}
