package nathan.notenoughvariations.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import net.minecraftforge.registries.IForgeRegistryEntry;

import java.util.Objects;

public class StoneBricksSlabRecipe extends IForgeRegistryEntry.Impl<IRecipe> implements IRecipe {
    private final ItemStack output;

    public StoneBricksSlabRecipe(ItemStack output) {
        this.output = output;
    }

    public static IRecipe from(IRecipe recipe) {
        return new StoneBricksSlabRecipe(recipe.getRecipeOutput()).setRegistryName(Objects.requireNonNull(recipe.getRegistryName()));
    }

    @Override
    public boolean matches(InventoryCrafting inv, World worldIn) {
        return false;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting inv) {
        return new ItemStack(Item.getItemFromBlock(Blocks.STONE_SLAB), 6, 5);
    }

    @Override
    public boolean canFit(int width, int height) {
        return false;
    }

    @Override
    public ItemStack getRecipeOutput() {
        return output;
    }
}
