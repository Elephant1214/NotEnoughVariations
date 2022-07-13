package nathan.notenoughvariations.recipes;

import net.minecraft.init.Blocks;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import net.minecraftforge.registries.IForgeRegistryEntry;

import java.util.Objects;

public class StoneBrickStairsRecipe extends IForgeRegistryEntry.Impl<IRecipe> implements IRecipe {
    private final ItemStack output;

    public StoneBrickStairsRecipe(ItemStack output) {
        this.output = output;
    }

    public static IRecipe from(IRecipe recipe) {
        return new StoneBrickStairsRecipe(recipe.getRecipeOutput()).setRegistryName(Objects.requireNonNull(recipe.getRegistryName()));
    }

    @Override
    public boolean matches(InventoryCrafting inv, World worldIn) {
        return false;
    }

    @Override
    public ItemStack getCraftingResult(InventoryCrafting inv) {
        return new ItemStack(Item.getItemFromBlock(Blocks.STONE_BRICK_STAIRS), 4);
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
