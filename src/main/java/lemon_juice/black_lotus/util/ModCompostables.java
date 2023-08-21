package lemon_juice.black_lotus.util;

import lemon_juice.black_lotus.block.ModBlocks;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;

import static net.minecraft.world.level.block.ComposterBlock.COMPOSTABLES;

public class ModCompostables {

    public static void setup(final FMLCommonSetupEvent event) {
        add(0.65F, ModBlocks.BLACK_LOTUS.get());
    }

    public static void add(float quantity, ItemLike itemLike) {
        COMPOSTABLES.put(itemLike.asItem(), quantity);
    }
}
