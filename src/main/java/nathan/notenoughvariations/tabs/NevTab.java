package nathan.notenoughvariations.tabs;

import nathan.notenoughvariations.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class NevTab extends CreativeTabs {
    public NevTab(String label) {
        super(label);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(BlockInit.white_concrete_stairs));
    }
}
