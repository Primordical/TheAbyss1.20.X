package net.primordical.abyssmod.item;

import net.primordical.abyssmod.AbyssMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AbyssMod.MODID);

    public static final RegistryObject<CreativeModeTab> TUTORIAL_TAB = CREATIVE_MODE_TABS.register("abyss_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.DARKSTONE.get()))
                    .title(Component.translatable("creativetab.abyss_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.DARKSTONE.get());


                        pOutput.accept(Items.DIAMOND);


                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}