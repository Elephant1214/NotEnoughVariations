package nathan.missingblocks.tabs;

import nathan.missingblocks.init.BlockInit;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class MissingBlocksTab extends CreativeTabs {

    protected List<ItemStack> icons = new ArrayList<>(16);

    public MissingBlocksTab(String label) {
        super(label);
        //this.setBackgroundImageName("background.png");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(Item.getItemFromBlock(BlockInit.white_concrete_stairs));
    }
}
