package lemon_juice.black_lotus.creativetab;

import lemon_juice.black_lotus.BlackLotus;
import lemon_juice.black_lotus.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BlackLotus.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BLACK_LOTUS_TAB = CREATIVE_MODE_TABS.register("black_lotus", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.black_lotus"))
            .icon(() -> new ItemStack(ModBlocks.BLACK_LOTUS.get()))
            .build());

    public static void registerTabs(BuildCreativeModeTabContentsEvent event) {
        if (event.getTab() == BLACK_LOTUS_TAB.get()) {
            event.accept(ModBlocks.BLACK_LOTUS.get());
        }
    }

    /******************************** Registry ********************************/
    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
