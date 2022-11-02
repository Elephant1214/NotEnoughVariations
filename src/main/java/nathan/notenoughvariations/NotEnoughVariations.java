package nathan.notenoughvariations;

import com.google.common.collect.Lists;
import nathan.notenoughvariations.init.BlockInit;
import nathan.notenoughvariations.proxy.CommonProxy;
import nathan.notenoughvariations.recipes.StoneBrickStairsRecipe;
import nathan.notenoughvariations.tabs.NevTab;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
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
    public static final String VERSION = "0.3.2";
    public static final Logger LOGGER = LogManager.getLogger(NotEnoughVariations.MODID);
    public static final CreativeTabs NOT_ENOUGH_VARIATIONS = new NevTab(MODID + ".not_enough_variations");
    @SidedProxy(clientSide = "nathan.notenoughvariations.proxy.ClientProxy", serverSide = "nathan.notenoughvariations.proxy.ServerProxy")
    public static CommonProxy proxy;

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

    public static void removeVanillaRecipes() {
        ForgeRegistry<IRecipe> recipeRegistry = (ForgeRegistry<IRecipe>) ForgeRegistries.RECIPES;
        ArrayList<IRecipe> recipes = Lists.newArrayList(recipeRegistry.getValuesCollection());

        for (IRecipe recipe : recipes) {
            if (Objects.requireNonNull(recipe.getRegistryName()).toString().equals("minecraft:stone_brick_stairs")) {
                LOGGER.info("Replacing the vanilla stone brick stairs recipe with the recipe from this mod...");
                recipeRegistry.remove(recipe.getRegistryName());
                recipeRegistry.register(StoneBrickStairsRecipe.from(recipe));
            } else if (Objects.requireNonNull(recipe.getRegistryName()).toString().equals("minecraft:stone_brick_slab")) {
                LOGGER.info("Replacing the vanilla stone bricks slab recipe with the recipe from this mod...");
                recipeRegistry.remove(recipe.getRegistryName());
                recipeRegistry.register(StoneBrickStairsRecipe.from(recipe));
            }
        }
    }
}
