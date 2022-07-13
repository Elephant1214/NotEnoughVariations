package nathan.notenoughvariations.blocks;

import nathan.notenoughvariations.NotEnoughVariations;
import nathan.notenoughvariations.init.BlockInit;
import nathan.notenoughvariations.init.ItemInit;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;

import java.util.Objects;

public class BlockBase extends Block {
    public BlockBase(String name, Material material, CreativeTabs creativeTab, float hardness, float resistance, SoundType sound, String toolClass, int level) {
        super(material);
        setUnlocalizedName(NotEnoughVariations.MODID + "." + name);
        setRegistryName(name);
        setCreativeTab(creativeTab);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(sound);
        setHarvestLevel(toolClass, level);

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }
}
