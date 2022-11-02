package nathan.notenoughvariations.blocks.slab;

import nathan.notenoughvariations.init.BlockInit;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class BlockBaseDoubleSlab extends BlockBaseSlab {
    public BlockBaseDoubleSlab(String name, Material material, MapColor mapColor, float hardness, float resistance, SoundType sound, String toolClass, int level) {
        super(name, material, mapColor, hardness, resistance, sound, toolClass, level);
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return this.getUnlocalizedName();
    }

    @Override
    public boolean isDouble() {
        return true;
    }

    @Override
    public int quantityDropped(Random random) {
        return 2;
    }

    /**
     * A better way to handle this would be greatly appreciated, current implementation is awful.
     */
    @Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune) {
        String unlocalizedName = state.getBlock().getUnlocalizedName().toLowerCase();

        if (unlocalizedName.contains("concrete")) {
            if (unlocalizedName.contains("orange")) {
                return Item.getItemFromBlock(BlockInit.orange_concrete_slab);
            } else if (unlocalizedName.contains("magenta")) {
                return Item.getItemFromBlock(BlockInit.magenta_concrete_slab);
            } else if (unlocalizedName.contains("light_blue")) {
                return Item.getItemFromBlock(BlockInit.light_blue_concrete_slab);
            } else if (unlocalizedName.contains("yellow")) {
                return Item.getItemFromBlock(BlockInit.yellow_concrete_slab);
            } else if (unlocalizedName.contains("lime")) {
                return Item.getItemFromBlock(BlockInit.lime_concrete_slab);
            } else if (unlocalizedName.contains("pink")) {
                return Item.getItemFromBlock(BlockInit.pink_concrete_slab);
            } else if (unlocalizedName.contains("gray")) {
                return Item.getItemFromBlock(BlockInit.gray_concrete_slab);
            } else if (unlocalizedName.contains("light_gray")) {
                return Item.getItemFromBlock(BlockInit.light_gray_concrete_slab);
            } else if (unlocalizedName.contains("cyan")) {
                return Item.getItemFromBlock(BlockInit.cyan_concrete_slab);
            } else if (unlocalizedName.contains("purple")) {
                return Item.getItemFromBlock(BlockInit.purple_concrete_slab);
            } else if (unlocalizedName.contains("blue")) {
                return Item.getItemFromBlock(BlockInit.blue_concrete_slab);
            } else if (unlocalizedName.contains("brown")) {
                return Item.getItemFromBlock(BlockInit.brown_concrete_slab);
            } else if (unlocalizedName.contains("green")) {
                return Item.getItemFromBlock(BlockInit.green_concrete_slab);
            } else if (unlocalizedName.contains("red")) {
                return Item.getItemFromBlock(BlockInit.red_concrete_slab);
            } else if (unlocalizedName.contains("black")) {
                return Item.getItemFromBlock(BlockInit.black_concrete_slab);
            } else {
                return Item.getItemFromBlock(BlockInit.white_concrete_slab);
            }
        } else if (unlocalizedName.contains("wool")) {
            if (unlocalizedName.contains("orange")) {
                return Item.getItemFromBlock(BlockInit.orange_wool_slab);
            } else if (unlocalizedName.contains("magenta")) {
                return Item.getItemFromBlock(BlockInit.magenta_wool_slab);
            } else if (unlocalizedName.contains("light_blue")) {
                return Item.getItemFromBlock(BlockInit.light_blue_wool_slab);
            } else if (unlocalizedName.contains("yellow")) {
                return Item.getItemFromBlock(BlockInit.yellow_wool_slab);
            } else if (unlocalizedName.contains("lime")) {
                return Item.getItemFromBlock(BlockInit.lime_wool_slab);
            } else if (unlocalizedName.contains("pink")) {
                return Item.getItemFromBlock(BlockInit.pink_wool_slab);
            } else if (unlocalizedName.contains("gray")) {
                return Item.getItemFromBlock(BlockInit.gray_wool_slab);
            } else if (unlocalizedName.contains("light_gray")) {
                return Item.getItemFromBlock(BlockInit.light_gray_wool_slab);
            } else if (unlocalizedName.contains("cyan")) {
                return Item.getItemFromBlock(BlockInit.cyan_wool_slab);
            } else if (unlocalizedName.contains("purple")) {
                return Item.getItemFromBlock(BlockInit.purple_wool_slab);
            } else if (unlocalizedName.contains("blue")) {
                return Item.getItemFromBlock(BlockInit.blue_wool_slab);
            } else if (unlocalizedName.contains("brown")) {
                return Item.getItemFromBlock(BlockInit.brown_wool_slab);
            } else if (unlocalizedName.contains("green")) {
                return Item.getItemFromBlock(BlockInit.green_wool_slab);
            } else if (unlocalizedName.contains("red")) {
                return Item.getItemFromBlock(BlockInit.red_wool_slab);
            } else if (unlocalizedName.contains("black")) {
                return Item.getItemFromBlock(BlockInit.black_wool_slab);
            } else {
                return Item.getItemFromBlock(BlockInit.white_wool_slab);
            }
        } else if (unlocalizedName.contains("polished_andesite")) {
            return Item.getItemFromBlock(BlockInit.polished_andesite_slab);
        } else if (unlocalizedName.contains("polished_diorite")) {
            return Item.getItemFromBlock(BlockInit.polished_diorite_slab);
        } else if (unlocalizedName.contains("polished_granite")) {
            return Item.getItemFromBlock(BlockInit.polished_granite_slab);
        } else if (unlocalizedName.contains("andesite")) {
            return Item.getItemFromBlock(BlockInit.andesite_slab);
        } else if (unlocalizedName.contains("diorite")) {
            return Item.getItemFromBlock(BlockInit.diorite_slab);
        } else if (unlocalizedName.contains("granite")) {
            return Item.getItemFromBlock(BlockInit.granite_slab);
        } else if (unlocalizedName.contains("mossy_cobblestone")) {
            return Item.getItemFromBlock(BlockInit.mossy_cobblestone_slab);
        } else if (unlocalizedName.contains("mossy_stone_bricks")) {
            return Item.getItemFromBlock(BlockInit.mossy_stone_bricks_slab);
        } else if (unlocalizedName.contains("prismarine")) {
            if (unlocalizedName.contains("bricks")) {
                return Item.getItemFromBlock(BlockInit.prismarine_bricks_slab);
            } else if (unlocalizedName.contains("dark")) {
                return Item.getItemFromBlock(BlockInit.dark_prismarine_slab);
            } else {
                return Item.getItemFromBlock(BlockInit.prismarine_slab);
            }
        } else if (unlocalizedName.contains("red_nether_bricks")) {
            return Item.getItemFromBlock(BlockInit.red_nether_bricks_slab);
        } else if (unlocalizedName.contains("end_stone_bricks")) {
            return Item.getItemFromBlock(BlockInit.end_stone_bricks_slab);
        } else {
            throw new IllegalStateException("Unexpected value: " + state.getBlock());
        }
    }
}
