package nathan.notenoughvariations.blocks.slab;

import nathan.notenoughvariations.init.ItemInit;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSlab;

import java.util.Objects;
import java.util.Random;

public class BlockBaseHalfSlab extends BlockBaseSlab {
    public BlockBaseHalfSlab(String name, Material material, MapColor mapColor, CreativeTabs creativeTab, float hardness, float resistance, SoundType sound, String toolClass, int level, BlockBaseDoubleSlab doubleVariant) {
        super(name, material, mapColor, hardness, resistance, sound, toolClass, level);
        setCreativeTab(creativeTab);
        ItemInit.ITEMS.add(new ItemSlab(this, this, doubleVariant).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return this.getUnlocalizedName();
    }

    @Override
    public boolean isDouble() {
        return false;
    }

    @Override
    public int quantityDropped(Random random) {
        return 1;
    }
}
