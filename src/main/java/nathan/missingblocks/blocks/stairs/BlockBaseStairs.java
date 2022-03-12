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
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

import java.util.Objects;

public class BlockBaseStairs extends BlockStairs {

    public BlockBaseStairs(String name, IBlockState modelState, CreativeTabs creativeTab, float hardness, float resistance, SoundType sound, String toolClass, int level) {
        super(modelState);
        setUnlocalizedName(MissingBlocks.MODID + "." + name);
        setRegistryName(name);
        setCreativeTab(creativeTab);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(sound);
        setHarvestLevel(toolClass, level);

        this.useNeighborBrightness = true;
        BlockInit.blocks.add(this);
        ItemInit.items.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
    }

    @Override
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        if (state.getBlock().equals(BlockInit.white_concrete_stairs)) {
            return MapColor.SNOW;
        } else if (state.getBlock().equals(BlockInit.orange_concrete_stairs)) {
            return MapColor.ADOBE;
        } else if (state.getBlock().equals(BlockInit.magenta_concrete_stairs)) {
            return MapColor.MAGENTA;
        } else if (state.getBlock().equals(BlockInit.light_blue_concrete_stairs)) {
            return MapColor.LIGHT_BLUE;
        } else if (state.getBlock().equals(BlockInit.yellow_concrete_stairs)) {
            return MapColor.YELLOW;
        } else if (state.getBlock().equals(BlockInit.lime_concrete_stairs)) {
            return MapColor.LIME;
        } else if (state.getBlock().equals(BlockInit.pink_concrete_stairs)) {
            return MapColor.PINK;
        } else if (state.getBlock().equals(BlockInit.gray_concrete_stairs)) {
            return MapColor.GRAY;
        } else if (state.getBlock().equals(BlockInit.light_gray_concrete_stairs)) {
            return MapColor.SILVER;
        } else if (state.getBlock().equals(BlockInit.cyan_concrete_stairs)) {
            return MapColor.CYAN;
        } else if (state.getBlock().equals(BlockInit.purple_concrete_stairs)) {
            return MapColor.PURPLE;
        } else if (state.getBlock().equals(BlockInit.blue_concrete_stairs)) {
            return MapColor.BLUE;
        } else if (state.getBlock().equals(BlockInit.brown_concrete_stairs)) {
            return MapColor.BROWN;
        } else if (state.getBlock().equals(BlockInit.green_concrete_stairs)) {
            return MapColor.GREEN;
        } else if (state.getBlock().equals(BlockInit.red_concrete_stairs)) {
            return MapColor.RED;
        } else if (state.getBlock().equals(BlockInit.black_concrete_stairs)) {
            return MapColor.BLACK;
        } else {
            throw new IllegalStateException("Unexpected value: " + state.getBlock());
        }
    }
}
