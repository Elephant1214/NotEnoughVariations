package nathan.notenoughvariations;

import com.google.common.collect.Lists;
import nathan.notenoughvariations.init.BlockInit;
import nathan.notenoughvariations.proxy.CommonProxy;
import nathan.notenoughvariations.recipes.StoneBrickStairsRecipe;
import nathan.notenoughvariations.tabs.NevTab;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.registries.ForgeRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Objects;

@Mod(
        modid = NotEnoughVariations.MODID,
        name = NotEnoughVariations.NAME,
        version = NotEnoughVariations.VERSION
)
public class NotEnoughVariations {

    public static final String MODID = "nev";
    public static final String NAME = "Not Enough Variations";
    public static final String VERSION = "0.3.0";

    public static final CreativeTabs NOT_ENOUGH_VARIANTS = new NevTab(MODID + ".not_enough_variations");

    @SidedProxy(
            clientSide = "nathan.notenoughvariations.proxy.ClientProxy",
            serverSide = "nathan.notenoughvariations.proxy.ServerProxy"
    )
    public static CommonProxy proxy;

    //@Mod.Instance
    //public static tile.MissingBlocks instance;
    //
    public static Logger logger = LogManager.getLogger(NotEnoughVariations.MODID);

    @Mod.EventHandler
    public static void preInit(FMLPreInitializationEvent event) {
        removeVanillaRecipes();
    }

    @Mod.EventHandler
    public static void init(FMLInitializationEvent event) {
        for (Block block : BlockInit.BLOCKS) {
            if (block.getDefaultState().getMaterial().equals(Blocks.WOOL.getDefaultState().getMaterial())) {
                Blocks.FIRE.setFireInfo(block, 30, 60);
            }
        }
    }

    @Mod.EventHandler
    public static void postInit(FMLPostInitializationEvent event) {
        if (Loader.isModLoaded("missingblocks")) {
            logger.warn("Found version 0.1.x of this mod, not removing it might cause issues.");
        }
    }

    public static void removeVanillaRecipes() {
        ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>) ForgeRegistries.RECIPES;
        ArrayList<IRecipe> recipes = Lists.newArrayList(recipeRegistry.getValuesCollection());

        for (IRecipe recipe : recipes) {
            if (Objects.requireNonNull(recipe.getRegistryName()).toString().equals("minecraft:stone_brick_stairs")) {
                logger.info("Replacing the vanilla stone brick stairs recipe with the recipe from this mod...");
                recipeRegistry.remove(recipe.getRegistryName());
                recipeRegistry.register(StoneBrickStairsRecipe.from(recipe));
            } else if (Objects.requireNonNull(recipe.getRegistryName()).toString().equals("minecraft:stone_brick_slab")) {
                logger.info("Replacing the vanilla stone bricks slab recipe with the recipe from this mod...");
                recipeRegistry.remove(recipe.getRegistryName());
                recipeRegistry.register(StoneBrickStairsRecipe.from(recipe));
            }
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
