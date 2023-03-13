package nathan.notenoughvariations.blocks.slab;

import nathan.notenoughvariations.init.ItemInit;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemSlab;

import javax.annotation.Nonnull;
import java.util.Objects;
import java.util.Random;

import static nathan.notenoughvariations.NotEnoughVariations.NOT_ENOUGH_VARIATIONS;

public class BlockBaseHalfSlab extends BlockBaseSlab {
    public BlockBaseHalfSlab(String name, IBlockState blockState, MapColor mapColor, float hardness, float resistance, SoundType soundType, String toolClass, int level, boolean canProvidePower, BlockBaseDoubleSlab doubleVariant) {
        super(name, blockState, mapColor, hardness, resistance, soundType, toolClass, level, canProvidePower);
        setCreativeTab(NOT_ENOUGH_VARIATIONS);
        ItemInit.ITEMS.add(new ItemSlab(this, this, doubleVariant).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Nonnull
    @Override
    public String getUnlocalizedName(int meta) {
        return this.getUnlocalizedName();
    }

    @Override
    public boolean isDouble() {
        return false;
    }

    @Override
    public int quantityDropped(@Nonnull Random random) {
        return 1;
    }
}
