package nathan.notenoughvariations.blocks;

import nathan.notenoughvariations.NotEnoughVariants;
import nathan.notenoughvariations.init.BlockInit;
import nathan.notenoughvariations.init.ItemInit;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemShears;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

import java.util.Objects;

public class BlockBaseStairs extends BlockStairs {

    public final boolean shearable;

    public BlockBaseStairs(String name, IBlockState state, CreativeTabs creativeTab, float hardness, float resistance, String toolClass, int level, boolean shearable) {
        super(state);
        setUnlocalizedName(NotEnoughVariants.MODID + "." + name);
        setRegistryName(name);
        setCreativeTab(creativeTab);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(toolClass, level);

        this.shearable = shearable;
        this.useNeighborBrightness = true;
        BlockInit.blocks.add(this);
        ItemInit.items.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
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
}
