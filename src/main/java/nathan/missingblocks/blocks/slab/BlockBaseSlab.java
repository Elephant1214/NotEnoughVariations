package nathan.missingblocks.blocks.slab;

import nathan.missingblocks.MissingBlocks;
import nathan.missingblocks.init.BlockInit;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;

import java.util.Random;

public abstract class BlockBaseSlab extends BlockSlab {

    private final Block half;
    public static final PropertyEnum<Variant> VARIANT = PropertyEnum.create("variant", Variant.class);

    public BlockBaseSlab(String name, Material material, MapColor mapColor, float hardness, float resistance, SoundType sound, String toolClass, int level, BlockSlab half) {
        super(material, mapColor);
        setUnlocalizedName(MissingBlocks.MODID + "." + name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(sound);
        setHarvestLevel(toolClass, level);
        this.useNeighborBrightness = !this.isDouble();

        IBlockState blockState = this.getBlockState().getBaseState().withProperty(VARIANT, Variant.DEFAULT);
        if (!this.isDouble()) {
            blockState = blockState.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
        }

        this.half = half;
        this.setDefaultState(blockState);
        BlockInit.blocks.add(this);
    }

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        if (state.getBlock().equals(BlockInit.white_concrete_slab) || state.getBlock().equals(BlockInit.white_concrete_double_slab)) {
            return new ItemStack(Item.getItemFromBlock(BlockInit.white_concrete_slab));
        } else if (state.getBlock().equals(BlockInit.orange_concrete_slab) || state.getBlock().equals(BlockInit.orange_concrete_double_slab)) {
            return new ItemStack(Item.getItemFromBlock(BlockInit.orange_concrete_slab));
        } else if (state.getBlock().equals(BlockInit.magenta_concrete_slab) || state.getBlock().equals(BlockInit.magenta_concrete_double_slab)) {
            return new ItemStack(Item.getItemFromBlock(BlockInit.magenta_concrete_slab));
        } else if (state.getBlock().equals(BlockInit.light_blue_concrete_slab) || state.getBlock().equals(BlockInit.light_blue_concrete_double_slab)) {
            return new ItemStack(Item.getItemFromBlock(BlockInit.light_blue_concrete_slab));
        } else if (state.getBlock().equals(BlockInit.yellow_concrete_slab) || state.getBlock().equals(BlockInit.yellow_concrete_double_slab)) {
            return new ItemStack(Item.getItemFromBlock(BlockInit.yellow_concrete_slab));
        } else if (state.getBlock().equals(BlockInit.lime_concrete_slab) || state.getBlock().equals(BlockInit.lime_concrete_double_slab)) {
            return new ItemStack(Item.getItemFromBlock(BlockInit.lime_concrete_slab));
        } else if (state.getBlock().equals(BlockInit.pink_concrete_slab) || state.getBlock().equals(BlockInit.pink_concrete_double_slab)) {
            return new ItemStack(Item.getItemFromBlock(BlockInit.pink_concrete_slab));
        } else if (state.getBlock().equals(BlockInit.gray_concrete_slab) || state.getBlock().equals(BlockInit.gray_concrete_double_slab)) {
            return new ItemStack(Item.getItemFromBlock(BlockInit.gray_concrete_slab));
        } else if (state.getBlock().equals(BlockInit.light_gray_concrete_slab) || state.getBlock().equals(BlockInit.light_gray_concrete_double_slab)) {
            return new ItemStack(Item.getItemFromBlock(BlockInit.light_gray_concrete_slab));
        } else if (state.getBlock().equals(BlockInit.cyan_concrete_slab) || state.getBlock().equals(BlockInit.cyan_concrete_double_slab)) {
            return new ItemStack(Item.getItemFromBlock(BlockInit.cyan_concrete_slab));
        } else if (state.getBlock().equals(BlockInit.purple_concrete_slab) || state.getBlock().equals(BlockInit.purple_concrete_double_slab)) {
            return new ItemStack(Item.getItemFromBlock(BlockInit.purple_concrete_slab));
        } else if (state.getBlock().equals(BlockInit.blue_concrete_slab) || state.getBlock().equals(BlockInit.blue_concrete_double_slab)) {
            return new ItemStack(Item.getItemFromBlock(BlockInit.blue_concrete_slab));
        } else if (state.getBlock().equals(BlockInit.brown_concrete_slab) || state.getBlock().equals(BlockInit.brown_concrete_double_slab)) {
            return new ItemStack(Item.getItemFromBlock(BlockInit.brown_concrete_slab));
        } else if (state.getBlock().equals(BlockInit.green_concrete_slab) || state.getBlock().equals(BlockInit.green_concrete_double_slab)) {
            return new ItemStack(Item.getItemFromBlock(BlockInit.green_concrete_slab));
        } else if (state.getBlock().equals(BlockInit.red_concrete_slab) || state.getBlock().equals(BlockInit.red_concrete_double_slab)) {
            return new ItemStack(Item.getItemFromBlock(BlockInit.red_concrete_slab));
        } else if (state.getBlock().equals(BlockInit.black_concrete_slab) || state.getBlock().equals(BlockInit.black_concrete_double_slab)) {
            return new ItemStack(Item.getItemFromBlock(BlockInit.black_concrete_slab));
        } else {
            throw new IllegalStateException("Unexpected value: " + state.getBlock());
        }
    }

    @Override
    public IBlockState getStateFromMeta(int meta) {
        IBlockState blockState = this.getDefaultState().withProperty(VARIANT, Variant.DEFAULT);
        if (!this.isDouble()) {
            blockState = blockState.withProperty(HALF, (meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);
        }

        return blockState;
    }

    @Override
    public int getMetaFromState(IBlockState state) {
        int meta = 0;
        if (!this.isDouble() && state.getValue(HALF) == EnumBlockHalf.TOP) {
            meta |= 8;
        }
        return meta;
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return this.isDouble() ? new BlockStateContainer(this, VARIANT) : new BlockStateContainer(this, HALF, VARIANT);
    }

    @Override
    public String getUnlocalizedName() {
        return super.getUnlocalizedName();
    }

    @Override
    public IProperty<?> getVariantProperty() {
        return VARIANT;
    }

    @Override
    public Comparable<?> getTypeForItem(ItemStack stack) {
        return Variant.DEFAULT;
    }

    public enum Variant implements IStringSerializable {
        DEFAULT;

        @Override
        public String getName() {
            return "default";
        }
    }
}
