package nathan.notenoughvariations.recipe;

import net.minecraft.init.Blocks;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;
import net.minecraftforge.registries.IForgeRegistryEntry;

import javax.annotation.Nonnull;
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
    public boolean matches(@Nonnull InventoryCrafting inv, @Nonnull World worldIn) {
        return false;
    }

    @Nonnull
    @Override
    public ItemStack getCraftingResult(@Nonnull InventoryCrafting inv) {
        return new ItemStack(Item.getItemFromBlock(Blocks.STONE_BRICK_STAIRS), 4);
    }

    @Override
    public boolean canFit(int width, int height) {
        return false;
    }

    @Nonnull
    @Override
    public ItemStack getRecipeOutput() {
        return output;
    }
}
