package nathan.notenoughvariations.tab;

import nathan.notenoughvariations.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import javax.annotation.Nonnull;

public class NevTab extends CreativeTabs {
    public NevTab(String label) {
        super(label);
    }

    /**
     * Returns the icon as an item stack for the mod's creative tab
     */
    @Nonnull
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(BlockInit.white_concrete_stairs));
    }
}
