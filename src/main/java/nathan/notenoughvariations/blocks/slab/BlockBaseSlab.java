package nathan.notenoughvariations.blocks.slab;

import nathan.notenoughvariations.NotEnoughVariations;
import nathan.notenoughvariations.init.BlockInit;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.Random;

@SuppressWarnings("deprecation")
public abstract class BlockBaseSlab extends BlockSlab {
    protected static final PropertyEnum<Variant> VARIANT = PropertyEnum.create("variant", Variant.class);
    protected final MapColor mapColor;
    protected final boolean shearable;
    protected final boolean canProvidePower;

    public BlockBaseSlab(String name, IBlockState blockState, MapColor mapColor, float hardness, float resistance, SoundType sound, String toolClass, int level, boolean canProvidePower) {
        super(blockState.getMaterial(), mapColor);
        setUnlocalizedName(NotEnoughVariations.MODID + "." + name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(sound);
        this.mapColor = mapColor;
        this.useNeighborBrightness = !this.isDouble();
        this.canProvidePower = canProvidePower;
        if (!"shears".equals(toolClass)) {
            setHarvestLevel(toolClass, level);
            this.shearable = false;
        } else {
            this.shearable = true;
        }

        IBlockState slabHalf = this.getBlockState().getBaseState().withProperty(VARIANT, Variant.DEFAULT);
        if (!this.isDouble()) {
            slabHalf = slabHalf.withProperty(HALF, EnumBlockHalf.BOTTOM);
        }
        this.setDefaultState(slabHalf);

        BlockInit.BLOCKS.add(this);
    }

    @Override
    public float getPlayerRelativeBlockHardness(@Nonnull IBlockState state, @Nonnull EntityPlayer player, @Nonnull World worldIn, @Nonnull BlockPos pos) {
        float relativeHardness = super.getPlayerRelativeBlockHardness(state, player, worldIn, pos);
        if (this.shearable && player.getHeldItemMainhand().getItem() instanceof ItemShears) {
            if (EnchantmentHelper.getEfficiencyModifier(player) != 0) {
                return relativeHardness * 6 * EnchantmentHelper.getEfficiencyModifier(player);
            } else {
                return relativeHardness * 6;
            }
        } else {
            return relativeHardness;
        }
    }

    @Nonnull
    @Override
    public Item getItemDropped(@Nullable IBlockState state, @Nullable Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }

    @Nonnull
    @Override
    public ItemStack getPickBlock(@Nonnull IBlockState state, @Nonnull RayTraceResult target, @Nonnull World world, @Nonnull BlockPos pos, @Nonnull EntityPlayer player) {
        return new ItemStack(this.getItemDropped(state.withProperty(HALF, EnumBlockHalf.BOTTOM), null, 0));
    }

    @Nonnull
    @Override
    public IBlockState getStateFromMeta(int meta) {
        IBlockState blockState = this.getDefaultState().withProperty(VARIANT, Variant.DEFAULT);
        if (!this.isDouble()) {
            blockState = blockState.withProperty(HALF, (meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);
        }

        return blockState;
    }

    @Override
    public int getMetaFromState(@Nonnull IBlockState state) {
        int meta = 0;
        if (!this.isDouble() && state.getValue(HALF) == EnumBlockHalf.TOP) {
            meta |= 8;
        }

        return meta;
    }

    @Nonnull
    @Override
    protected BlockStateContainer createBlockState() {
        return this.isDouble() ? new BlockStateContainer(this, VARIANT) : new BlockStateContainer(this, HALF, VARIANT);
    }

    @Override
    public boolean canProvidePower(@Nonnull IBlockState state) {
        return this.canProvidePower;
    }

    @Override
    public int getWeakPower(@Nonnull IBlockState blockState, @Nonnull IBlockAccess blockAccess, @Nonnull BlockPos pos, @Nonnull EnumFacing side) {
        return this.canProvidePower ? 15 : super.getWeakPower(blockState, blockAccess, pos, side);
    }

    @Nonnull
    @Override
    public MapColor getMapColor(@Nonnull IBlockState state, @Nonnull IBlockAccess worldIn, @Nonnull BlockPos pos) {
        return this.mapColor;
    }

    @Nonnull
    @Override
    public String getUnlocalizedName() {
        return super.getUnlocalizedName();
    }

    @Nonnull
    @Override
    public IProperty<?> getVariantProperty() {
        return VARIANT;
    }

    @Nonnull
    @Override
    public Comparable<?> getTypeForItem(@Nonnull ItemStack stack) {
        return Variant.DEFAULT;
    }

    protected enum Variant implements IStringSerializable {
        DEFAULT;

        @Nonnull
        @Override
        public String getName() {
            return "default";
        }
    }
}
