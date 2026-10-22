package com.accio.tutorialmod.block;

import com.accio.tutorialmod.TutorialMod;
import com.accio.tutorialmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block>BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);

//a block with a few properties
    public static final RegistryObject<Block> RUNE_INSCRIBER=
            registerBlock("rune_inscriber",()-> new Block(BlockBehaviour.Properties.
                    of().strength(4f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.CHAIN)


            ));








    public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name,block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }


    public static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block){
        ModItems.ITEMS.register(name,()-> new BlockItem(block.get(),new Item.Properties()));
    }

    public static void register (IEventBus eventBus){
        ModBlocks.BLOCKS.register(eventBus);
    }
}
