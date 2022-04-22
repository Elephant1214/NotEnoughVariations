package nathan.notenoughvariations.util.handlers;

import nathan.notenoughvariations.NotEnoughVariations;
import nathan.notenoughvariations.init.BlockInit;
import nathan.notenoughvariations.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class RegistryHandler {

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(ItemInit.items.toArray(new Item[0]));
    }

    @SubscribeEvent
    public static void onBlockRegister(RegistryEvent.Register<Block> event) {
        event.getRegistry().registerAll(BlockInit.blocks.toArray(new Block[0]));
    }

    @SubscribeEvent
    public static void onModelRegister(ModelRegistryEvent event) {
        for (Item item : ItemInit.items) {
            NotEnoughVariations.proxy.registerItemRenderer(item, 0, "inventory");
        }

        for (Block block : BlockInit.blocks) {
            NotEnoughVariations.proxy.registerItemRenderer(Item.getItemFromBlock(block), 0, "inventory");
        }
    }
}
