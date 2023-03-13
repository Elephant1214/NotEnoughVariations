package nathan.notenoughvariations.blocks;

import nathan.notenoughvariations.NotEnoughVariations;
import nathan.notenoughvariations.init.BlockInit;
import nathan.notenoughvariations.init.ItemInit;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemShears;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import javax.annotation.Nonnull;

import static nathan.notenoughvariations.NotEnoughVariations.NOT_ENOUGH_VARIATIONS;

@SuppressWarnings("deprecation")
public class BlockBaseStairs extends BlockStairs {
    protected final MapColor mapColor;
    protected final boolean shearable;
    protected final boolean canProvidePower;

    public BlockBaseStairs(String name, IBlockState state, MapColor mapColor, float hardness, float resistance, SoundType soundType, String toolClass, int level, boolean canProvidePower) {
        super(state);
        setUnlocalizedName(NotEnoughVariations.MODID + "." + name);
        setRegistryName(name);
        setCreativeTab(NOT_ENOUGH_VARIATIONS);
        setHardness(hardness);
        setResistance(resistance);
        setSoundType(soundType);
        this.mapColor = mapColor;
        this.useNeighborBrightness = true;
        this.canProvidePower = canProvidePower;
        if (!"shears".equals(toolClass)) {
            setHarvestLevel(toolClass, level);
            this.shearable = false;
        } else {
            this.shearable = true;
        }

        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
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
}
