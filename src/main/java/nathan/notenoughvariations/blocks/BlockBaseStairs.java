package nathan.notenoughvariations.blocks;

import nathan.notenoughvariations.NotEnoughVariations;
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
        setUnlocalizedName(NotEnoughVariations.MODID + "." + name);
        setRegistryName(name);
        setCreativeTab(creativeTab);
        setHardness(hardness);
        setResistance(resistance);
        setHarvestLevel(toolClass, level);

        this.shearable = shearable;
        this.useNeighborBrightness = true;
        BlockInit.BLOCKS.add(this);
        ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(Objects.requireNonNull(this.getRegistryName())));
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
        String unlocalizedName = state.getBlock().getUnlocalizedName().toLowerCase();

        if (unlocalizedName.contains("white")) {
            return MapColor.SNOW;
        } else if (unlocalizedName.contains("orange")) {
            return MapColor.ADOBE;
        } else if (unlocalizedName.contains("magenta")) {
            return MapColor.MAGENTA;
        } else if (unlocalizedName.contains("light_blue")) {
            return MapColor.LIGHT_BLUE;
        } else if (unlocalizedName.contains("yellow")) {
            return MapColor.YELLOW;
        } else if (unlocalizedName.contains("lime")) {
            return MapColor.LIME;
        } else if (unlocalizedName.contains("pink")) {
            return MapColor.PINK;
        } else if (unlocalizedName.contains("gray")) {
            return MapColor.GRAY;
        } else if (unlocalizedName.contains("light_gray")) {
            return MapColor.SILVER;
        } else if (unlocalizedName.contains("cyan")) {
            return MapColor.CYAN;
        } else if (unlocalizedName.contains("purple")) {
            return MapColor.PURPLE;
        } else if (unlocalizedName.contains("blue")) {
            return MapColor.BLUE;
        } else if (unlocalizedName.contains("brown")) {
            return MapColor.BROWN;
        } else if (unlocalizedName.contains("green")) {
            return MapColor.GREEN;
        } else if (unlocalizedName.contains("red")) {
            return MapColor.RED;
        } else if (unlocalizedName.contains("black")) {
            return MapColor.BLACK;
        } else if (unlocalizedName.contains("end")) {
            return MapColor.SAND;
        } else if (unlocalizedName.contains("andesite") || unlocalizedName.contains("diorite") || unlocalizedName.contains("granite") || unlocalizedName.contains("mossy_cobblestone")) {
            return MapColor.STONE;
        } else if (unlocalizedName.contains("red_nether")) {
            return MapColor.NETHERRACK;
        } else if (unlocalizedName.contains("prismarine")) {
            return MapColor.DIAMOND;
        } else {
            throw new IllegalStateException("Unexpected value: " + state.getBlock());
        }
    }
}
