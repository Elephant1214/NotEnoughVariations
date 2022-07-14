package nathan.notenoughvariations.blocks.slab;

import nathan.notenoughvariations.NotEnoughVariations;
import nathan.notenoughvariations.init.BlockInit;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Random;

public abstract class BlockBaseSlab extends BlockSlab {
    public static final PropertyEnum<Variant> VARIANT = PropertyEnum.create("variant", Variant.class);
    public final boolean shearable;

    public BlockBaseSlab(String name, Material material, MapColor mapColor, float hardness, float resistance, SoundType sound, String toolClass, int level, boolean shearable) {
        super(material, mapColor);
        setUnlocalizedName(NotEnoughVariations.MODID + "." + name);
        setRegistryName(name);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(sound);
        setHarvestLevel(toolClass, level);
        this.useNeighborBrightness = !this.isDouble();
        this.shearable = shearable;

        IBlockState blockState = this.getBlockState().getBaseState().withProperty(VARIANT, Variant.DEFAULT);
        if (!this.isDouble()) {
            blockState = blockState.withProperty(HALF, EnumBlockHalf.BOTTOM);
        }

        this.setDefaultState(blockState);
        BlockInit.BLOCKS.add(this);
    }

    @Override
    public float getPlayerRelativeBlockHardness(IBlockState state, EntityPlayer player, World worldIn, BlockPos pos) {
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

    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        return Item.getItemFromBlock(this);
    }

    @Override
    public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
        return new ItemStack(this.getItemDropped(state, new Random(),0));
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
    public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos) {
        if (state.getBlock().getUnlocalizedName().toLowerCase().contains("white")) {
            return MapColor.SNOW;
        } else if (state.getBlock().getUnlocalizedName().toLowerCase().contains("orange")) {
            return MapColor.ADOBE;
        } else if (state.getBlock().getUnlocalizedName().toLowerCase().contains("magenta")) {
            return MapColor.MAGENTA;
        } else if (state.getBlock().getUnlocalizedName().toLowerCase().contains("light_blue")) {
            return MapColor.LIGHT_BLUE;
        } else if (state.getBlock().getUnlocalizedName().toLowerCase().contains("yellow")) {
            return MapColor.YELLOW;
        } else if (state.getBlock().getUnlocalizedName().toLowerCase().toLowerCase().contains("lime")) {
            return MapColor.LIME;
        } else if (state.getBlock().getUnlocalizedName().toLowerCase().contains("pink")) {
            return MapColor.PINK;
        } else if (state.getBlock().getUnlocalizedName().toLowerCase().contains("gray")) {
            return MapColor.GRAY;
        } else if (state.getBlock().getUnlocalizedName().toLowerCase().contains("light_gray")) {
            return MapColor.SILVER;
        } else if (state.getBlock().getUnlocalizedName().toLowerCase().contains("cyan")) {
            return MapColor.CYAN;
        } else if (state.getBlock().getUnlocalizedName().toLowerCase().contains("purple")) {
            return MapColor.PURPLE;
        } else if (state.getBlock().getUnlocalizedName().toLowerCase().contains("blue")) {
            return MapColor.BLUE;
        } else if (state.getBlock().getUnlocalizedName().toLowerCase().contains("brown")) {
            return MapColor.BROWN;
        } else if (state.getBlock().getUnlocalizedName().toLowerCase().contains("green")) {
            return MapColor.GREEN;
        } else if (state.getBlock().getUnlocalizedName().toLowerCase().contains("red")) {
            return MapColor.RED;
        } else if (state.getBlock().getUnlocalizedName().toLowerCase().contains("black")) {
            return MapColor.BLACK;
        } else {
            throw new IllegalStateException("Unexpected value: " + state.getBlock());
        }
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
