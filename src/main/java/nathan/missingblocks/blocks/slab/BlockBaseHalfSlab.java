package nathan.missingblocks.blocks.slab;

import nathan.missingblocks.init.ItemInit;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSlab;

import java.util.Objects;

public class BlockBaseHalfSlab extends BlockBaseSlab {

    public BlockBaseHalfSlab(String name, Material material, MapColor mapColor, CreativeTabs creativeTab, float hardness, float resistance, SoundType sound, String toolClass, int level, BlockSlab half, BlockSlab doubleSlab) {
        super(name, material, mapColor, hardness, resistance, sound, toolClass, level, half);
        setCreativeTab(creativeTab);
        ItemInit.items.add(new ItemSlab(this, this, doubleSlab).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return this.getUnlocalizedName();
    }

    @Override
    public boolean isDouble() {
        return false;
    }
}
