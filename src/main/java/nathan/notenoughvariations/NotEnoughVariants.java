package nathan.notenoughvariations;

import nathan.notenoughvariations.init.BlockInit;
import nathan.notenoughvariations.proxy.CommonProxy;
import nathan.notenoughvariations.tabs.NevTab;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = NotEnoughVariants.MODID,
        name = NotEnoughVariants.NAME,
        version = NotEnoughVariants.VERSION
)
public class NotEnoughVariants {

    public static final String MODID = "nev";
    public static final String NAME = "Not Enough Variations";
    public static final String VERSION = "0.2.1";

    public static final CreativeTabs NOT_ENOUGH_VARIANTS = new NevTab(MODID + ".not_enough_variations");

    @SidedProxy(
            clientSide = "nathan.notenoughvariations.proxy.ClientProxy",
            serverSide = "nathan.notenoughvariations.proxy.ServerProxy"
    )
    public static CommonProxy proxy;
	
    public static Logger logger = LogManager.getLogger(NotEnoughVariants.MODID);

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        for (Block block : BlockInit.blocks) {
            if (block.getDefaultState().getMaterial().equals(Blocks.WOOL.getDefaultState().getMaterial())) {
                Blocks.FIRE.setFireInfo(block, 30, 60);
            }
        }
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        if (Loader.isModLoaded("missingblocks")) {
            logger.error("Found version 0.1.x of this mod, not removing it WILL cause issues.");
        }
    }

    @SubscribeEvent
    public static void remapBlocks(RegistryEvent.MissingMappings<Block> event) {
        for (RegistryEvent.MissingMappings.Mapping<Block> block : event.getAllMappings()) {
            if (block.getTarget().getUnlocalizedName().contains("tile.missingblocks")) {
                switch (block.getTarget().getUnlocalizedName()) {
                    case "tile.missingblocks.white_concrete_stairs":
                        block.remap(BlockInit.white_concrete_stairs);
                        break;
                    case "tile.missingblocks.orange_concrete_stairs":
                        block.remap(BlockInit.orange_concrete_stairs);
                        break;
                    case "tile.missingblocks.magenta_concrete_stairs":
                        block.remap(BlockInit.magenta_concrete_stairs);
                        break;
                    case "tile.missingblocks.light_blue_concrete_stairs":
                        block.remap(BlockInit.light_blue_concrete_stairs);
                        break;
                    case "tile.missingblocks.yellow_concrete_stairs":
                        block.remap(BlockInit.yellow_concrete_stairs);
                        break;
                    case "tile.missingblocks.lime_concrete_stairs":
                        block.remap(BlockInit.lime_concrete_stairs);
                        break;
                    case "tile.missingblocks.pink_concrete_stairs":
                        block.remap(BlockInit.pink_concrete_stairs);
                        break;
                    case "tile.missingblocks.gray_concrete_stairs":
                        block.remap(BlockInit.gray_concrete_stairs);
                        break;
                    case "tile.missingblocks.light_gray_concrete_stairs":
                        block.remap(BlockInit.light_gray_concrete_stairs);
                        break;
                    case "tile.missingblocks.cyan_concrete_stairs":
                        block.remap(BlockInit.cyan_concrete_stairs);
                        break;
                    case "tile.missingblocks.purple_concrete_stairs":
                        block.remap(BlockInit.purple_concrete_stairs);
                        break;
                    case "tile.missingblocks.blue_concrete_stairs":
                        block.remap(BlockInit.blue_concrete_stairs);
                        break;
                    case "tile.missingblocks.brown_concrete_stairs":
                        block.remap(BlockInit.brown_concrete_stairs);
                        break;
                    case "tile.missingblocks.green_concrete_stairs":
                        block.remap(BlockInit.green_concrete_stairs);
                        break;
                    case "tile.missingblocks.red_concrete_stairs":
                        block.remap(BlockInit.red_concrete_stairs);
                        break;
                    case "tile.missingblocks.black_concrete_stairs":
                        block.remap(BlockInit.black_concrete_stairs);
                        break;
                    case "tile.missingblocks.white_concrete_double_slab":
                        block.remap(BlockInit.white_concrete_double_slab);
                        break;
                    case "tile.missingblocks.white_concrete_slab":
                        block.remap(BlockInit.white_concrete_slab);
                        break;
                    case "tile.missingblocks.orange_concrete_double_slab":
                        block.remap(BlockInit.orange_concrete_double_slab);
                        break;
                    case "tile.missingblocks.orange_concrete_slab":
                        block.remap(BlockInit.orange_concrete_slab);
                        break;
                    case "tile.missingblocks.magenta_concrete_double_slab":
                        block.remap(BlockInit.magenta_concrete_double_slab);
                        break;
                    case "tile.missingblocks.magenta_concrete_slab":
                        block.remap(BlockInit.magenta_concrete_slab);
                        break;
                    case "tile.missingblocks.light_blue_concrete_double_slab":
                        block.remap(BlockInit.light_blue_concrete_double_slab);
                        break;
                    case "tile.missingblocks.light_blue_concrete_slab":
                        block.remap(BlockInit.light_blue_concrete_slab);
                        break;
                    case "tile.missingblocks.yellow_concrete_double_slab":
                        block.remap(BlockInit.yellow_concrete_double_slab);
                        break;
                    case "tile.missingblocks.yellow_concrete_slab":
                        block.remap(BlockInit.yellow_concrete_slab);
                        break;
                    case "tile.missingblocks.lime_concrete_double_slab":
                        block.remap(BlockInit.lime_concrete_double_slab);
                        break;
                    case "tile.missingblocks.lime_concrete_slab":
                        block.remap(BlockInit.lime_concrete_slab);
                        break;
                    case "tile.missingblocks.pink_concrete_double_slab":
                        block.remap(BlockInit.pink_concrete_double_slab);
                        break;
                    case "tile.missingblocks.pink_concrete_slab":
                        block.remap(BlockInit.pink_concrete_slab);
                        break;
                    case "tile.missingblocks.gray_concrete_double_slab":
                        block.remap(BlockInit.gray_concrete_double_slab);
                        break;
                    case "tile.missingblocks.gray_concrete_slab":
                        block.remap(BlockInit.gray_concrete_slab);
                        break;
                    case "tile.missingblocks.light_gray_concrete_double_slab":
                        block.remap(BlockInit.light_gray_concrete_double_slab);
                        break;
                    case "tile.missingblocks.light_gray_concrete_slab":
                        block.remap(BlockInit.light_gray_concrete_slab);
                        break;
                    case "tile.missingblocks.cyan_concrete_double_slab":
                        block.remap(BlockInit.cyan_concrete_double_slab);
                        break;
                    case "tile.missingblocks.cyan_concrete_slab":
                        block.remap(BlockInit.cyan_concrete_slab);
                        break;
                    case "tile.missingblocks.purple_concrete_double_slab":
                        block.remap(BlockInit.purple_concrete_double_slab);
                        break;
                    case "tile.missingblocks.purple_concrete_slab":
                        block.remap(BlockInit.purple_concrete_slab);
                        break;
                    case "tile.missingblocks.blue_concrete_double_slab":
                        block.remap(BlockInit.blue_concrete_double_slab);
                        break;
                    case "tile.missingblocks.blue_concrete_slab":
                        block.remap(BlockInit.blue_concrete_slab);
                        break;
                    case "tile.missingblocks.brown_concrete_double_slab":
                        block.remap(BlockInit.brown_concrete_double_slab);
                        break;
                    case "tile.missingblocks.brown_concrete_slab":
                        block.remap(BlockInit.brown_concrete_slab);
                        break;
                    case "tile.missingblocks.green_concrete_double_slab":
                        block.remap(BlockInit.green_concrete_double_slab);
                        break;
                    case "tile.missingblocks.green_concrete_slab":
                        block.remap(BlockInit.green_concrete_slab);
                        break;
                    case "tile.missingblocks.red_concrete_double_slab":
                        block.remap(BlockInit.red_concrete_double_slab);
                        break;
                    case "tile.missingblocks.red_concrete_slab":
                        block.remap(BlockInit.red_concrete_slab);
                        break;
                    case "tile.missingblocks.black_concrete_double_slab":
                        block.remap(BlockInit.black_concrete_double_slab);
                        break;
                    case "tile.missingblocks.black_concrete_slab":
                        block.remap(BlockInit.black_concrete_slab);
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + block.getTarget().getUnlocalizedName());
                }
            }
        }
    }

    @SubscribeEvent
    public static void remapItems(RegistryEvent.MissingMappings<Item> event) {
        for (RegistryEvent.MissingMappings.Mapping<Item> item : event.getAllMappings()) {
            if (item.getTarget().getUnlocalizedName().contains("item.missingblocks")) {
                switch (item.getTarget().getUnlocalizedName()) {
                    case "tile.missingblocks.white_concrete_stairs":
                        item.remap(Item.getItemFromBlock(BlockInit.white_concrete_stairs));
                        break;
                    case "tile.missingblocks.orange_concrete_stairs":
                        item.remap(Item.getItemFromBlock(BlockInit.orange_concrete_stairs));
                        break;
                    case "tile.missingblocks.magenta_concrete_stairs":
                        item.remap(Item.getItemFromBlock(BlockInit.magenta_concrete_stairs));
                        break;
                    case "tile.missingblocks.light_blue_concrete_stairs":
                        item.remap(Item.getItemFromBlock(BlockInit.light_blue_concrete_stairs));
                        break;
                    case "tile.missingblocks.yellow_concrete_stairs":
                        item.remap(Item.getItemFromBlock(BlockInit.yellow_concrete_stairs));
                        break;
                    case "tile.missingblocks.lime_concrete_stairs":
                        item.remap(Item.getItemFromBlock(BlockInit.lime_concrete_stairs));
                        break;
                    case "tile.missingblocks.pink_concrete_stairs":
                        item.remap(Item.getItemFromBlock(BlockInit.pink_concrete_stairs));
                        break;
                    case "tile.missingblocks.gray_concrete_stairs":
                        item.remap(Item.getItemFromBlock(BlockInit.gray_concrete_stairs));
                        break;
                    case "tile.missingblocks.light_gray_concrete_stairs":
                        item.remap(Item.getItemFromBlock(BlockInit.light_gray_concrete_stairs));
                        break;
                    case "tile.missingblocks.cyan_concrete_stairs":
                        item.remap(Item.getItemFromBlock(BlockInit.cyan_concrete_stairs));
                        break;
                    case "tile.missingblocks.purple_concrete_stairs":
                        item.remap(Item.getItemFromBlock(BlockInit.purple_concrete_stairs));
                        break;
                    case "tile.missingblocks.blue_concrete_stairs":
                        item.remap(Item.getItemFromBlock(BlockInit.blue_concrete_stairs));
                        break;
                    case "tile.missingblocks.brown_concrete_stairs":
                        item.remap(Item.getItemFromBlock(BlockInit.brown_concrete_stairs));
                        break;
                    case "tile.missingblocks.green_concrete_stairs":
                        item.remap(Item.getItemFromBlock(BlockInit.green_concrete_stairs));
                        break;
                    case "tile.missingblocks.red_concrete_stairs":
                        item.remap(Item.getItemFromBlock(BlockInit.red_concrete_stairs));
                        break;
                    case "tile.missingblocks.black_concrete_stairs":
                        item.remap(Item.getItemFromBlock(BlockInit.black_concrete_stairs));
                        break;
                    case "tile.missingblocks.white_concrete_double_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.white_concrete_double_slab));
                        break;
                    case "tile.missingblocks.white_concrete_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.white_concrete_slab));
                        break;
                    case "tile.missingblocks.orange_concrete_double_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.orange_concrete_double_slab));
                        break;
                    case "tile.missingblocks.orange_concrete_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.orange_concrete_slab));
                        break;
                    case "tile.missingblocks.magenta_concrete_double_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.magenta_concrete_double_slab));
                        break;
                    case "tile.missingblocks.magenta_concrete_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.magenta_concrete_slab));
                        break;
                    case "tile.missingblocks.light_blue_concrete_double_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.light_blue_concrete_double_slab));
                        break;
                    case "tile.missingblocks.light_blue_concrete_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.light_blue_concrete_slab));
                        break;
                    case "tile.missingblocks.yellow_concrete_double_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.yellow_concrete_double_slab));
                        break;
                    case "tile.missingblocks.yellow_concrete_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.yellow_concrete_slab));
                        break;
                    case "tile.missingblocks.lime_concrete_double_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.lime_concrete_double_slab));
                        break;
                    case "tile.missingblocks.lime_concrete_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.lime_concrete_slab));
                        break;
                    case "tile.missingblocks.pink_concrete_double_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.pink_concrete_double_slab));
                        break;
                    case "tile.missingblocks.pink_concrete_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.pink_concrete_slab));
                        break;
                    case "tile.missingblocks.gray_concrete_double_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.gray_concrete_double_slab));
                        break;
                    case "tile.missingblocks.gray_concrete_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.gray_concrete_slab));
                        break;
                    case "tile.missingblocks.light_gray_concrete_double_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.light_gray_concrete_double_slab));
                        break;
                    case "tile.missingblocks.light_gray_concrete_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.light_gray_concrete_slab));
                        break;
                    case "tile.missingblocks.cyan_concrete_double_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.cyan_concrete_double_slab));
                        break;
                    case "tile.missingblocks.cyan_concrete_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.cyan_concrete_slab));
                        break;
                    case "tile.missingblocks.purple_concrete_double_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.purple_concrete_double_slab));
                        break;
                    case "tile.missingblocks.purple_concrete_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.purple_concrete_slab));
                        break;
                    case "tile.missingblocks.blue_concrete_double_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.blue_concrete_double_slab));
                        break;
                    case "tile.missingblocks.blue_concrete_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.blue_concrete_slab));
                        break;
                    case "tile.missingblocks.brown_concrete_double_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.brown_concrete_double_slab));
                        break;
                    case "tile.missingblocks.brown_concrete_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.brown_concrete_slab));
                        break;
                    case "tile.missingblocks.green_concrete_double_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.green_concrete_double_slab));
                        break;
                    case "tile.missingblocks.green_concrete_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.green_concrete_slab));
                        break;
                    case "tile.missingblocks.red_concrete_double_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.red_concrete_double_slab));
                        break;
                    case "tile.missingblocks.red_concrete_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.red_concrete_slab));
                        break;
                    case "tile.missingblocks.black_concrete_double_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.black_concrete_double_slab));
                        break;
                    case "tile.missingblocks.black_concrete_slab":
                        item.remap(Item.getItemFromBlock(BlockInit.black_concrete_slab));
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + item.getTarget().getUnlocalizedName());
                }
            }
        }
    }

}
