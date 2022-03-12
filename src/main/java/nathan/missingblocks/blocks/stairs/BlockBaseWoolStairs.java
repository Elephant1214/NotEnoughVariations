package nathan.missingblocks.blocks.stairs;

import nathan.missingblocks.MissingBlocks;
import nathan.missingblocks.init.BlockInit;
import nathan.missingblocks.init.ItemInit;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IShearable;

import javax.annotation.Nonnull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class BlockBaseWoolStairs extends BlockStairs implements IShearable {

    public BlockBaseWoolStairs(String name, IBlockState modelState, CreativeTabs creativeTab, float hardness, float resistance, SoundType sound) {
        super(modelState);
        setUnlocalizedName(MissingBlocks.MODID + "." + name);
        setRegistryName(name);
        setCreativeTab(creativeTab);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(sound);

        this.useNeighborBrightness = true;
        BlockInit.blocks.add(this);
        ItemInit.items.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Override
    public boolean isShearable(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos) {
        return true;
    }

    @Nonnull
    @Override
    public List<ItemStack> onSheared(@Nonnull ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
        List<ItemStack> drops = new ArrayList<>();
        drops.add(new ItemStack(item.getItem()));
        return drops;
    }

    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        if (state.getBlock().equals(BlockInit.white_wool_stairs)) {
            return MapColor.SNOW;
        } else {
            throw new IllegalStateException("Unexpected value: " + state.getBlock());
        }
    }
}
