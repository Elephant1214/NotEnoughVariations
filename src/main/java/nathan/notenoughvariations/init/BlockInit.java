package nathan.notenoughvariations.init;

import nathan.notenoughvariations.NotEnoughVariants;
import nathan.notenoughvariations.blocks.slab.BlockBaseDoubleSlab;
import nathan.notenoughvariations.blocks.slab.BlockBaseHalfSlab;
import nathan.notenoughvariations.blocks.BlockBaseStairs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> blocks = new ArrayList<>();

    private static final IBlockState concrete = Blocks.CONCRETE.getDefaultState();
    private static final IBlockState wool = Blocks.WOOL.getDefaultState();

    //Concrete stairs
    public static final Block white_concrete_stairs = new BlockBaseStairs("white_concrete_stairs", concrete, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, "pickaxe", 0, false);
    public static final Block orange_concrete_stairs = new BlockBaseStairs("orange_concrete_stairs", concrete, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, "pickaxe", 0, false);
    public static final Block magenta_concrete_stairs = new BlockBaseStairs("magenta_concrete_stairs", concrete, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, "pickaxe", 0, false);
    public static final Block light_blue_concrete_stairs = new BlockBaseStairs("light_blue_concrete_stairs", concrete, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, "pickaxe", 0, false);
    public static final Block yellow_concrete_stairs = new BlockBaseStairs("yellow_concrete_stairs", concrete, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, "pickaxe", 0, false);
    public static final Block lime_concrete_stairs = new BlockBaseStairs("lime_concrete_stairs", concrete, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, "pickaxe", 0, false);
    public static final Block pink_concrete_stairs = new BlockBaseStairs("pink_concrete_stairs", concrete, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, "pickaxe", 0, false);
    public static final Block gray_concrete_stairs = new BlockBaseStairs("gray_concrete_stairs", concrete, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, "pickaxe", 0, false);
    public static final Block light_gray_concrete_stairs = new BlockBaseStairs("light_gray_concrete_stairs", concrete, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, "pickaxe", 0, false);
    public static final Block cyan_concrete_stairs = new BlockBaseStairs("cyan_concrete_stairs", concrete, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, "pickaxe", 0, false);
    public static final Block purple_concrete_stairs = new BlockBaseStairs("purple_concrete_stairs", concrete, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, "pickaxe", 0, false);
    public static final Block blue_concrete_stairs = new BlockBaseStairs("blue_concrete_stairs", concrete, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, "pickaxe", 0, false);
    public static final Block brown_concrete_stairs = new BlockBaseStairs("brown_concrete_stairs", concrete, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, "pickaxe", 0, false);
    public static final Block green_concrete_stairs = new BlockBaseStairs("green_concrete_stairs", concrete, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, "pickaxe", 0, false);
    public static final Block red_concrete_stairs = new BlockBaseStairs("red_concrete_stairs", concrete, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, "pickaxe", 0, false);
    public static final Block black_concrete_stairs = new BlockBaseStairs("black_concrete_stairs", concrete, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, "pickaxe", 0, false);

    //Concrete slabs
    public static final Block white_concrete_double_slab = new BlockBaseDoubleSlab("white_concrete_double_slab", concrete.getMaterial(), MapColor.SNOW, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block white_concrete_slab = new BlockBaseHalfSlab("white_concrete_slab", concrete.getMaterial(), MapColor.SNOW, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false, (BlockSlab) BlockInit.white_concrete_double_slab);
    public static final Block orange_concrete_double_slab = new BlockBaseDoubleSlab("orange_concrete_double_slab", concrete.getMaterial(), MapColor.ADOBE, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block orange_concrete_slab = new BlockBaseHalfSlab("orange_concrete_slab", concrete.getMaterial(), MapColor.ADOBE, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false, (BlockSlab) BlockInit.orange_concrete_double_slab);
    public static final Block magenta_concrete_double_slab = new BlockBaseDoubleSlab("magenta_concrete_double_slab", concrete.getMaterial(), MapColor.MAGENTA, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block magenta_concrete_slab = new BlockBaseHalfSlab("magenta_concrete_slab", concrete.getMaterial(), MapColor.MAGENTA, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false, (BlockSlab) BlockInit.magenta_concrete_double_slab);
    public static final Block light_blue_concrete_double_slab = new BlockBaseDoubleSlab("light_blue_concrete_double_slab", concrete.getMaterial(), MapColor.LIGHT_BLUE, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block light_blue_concrete_slab = new BlockBaseHalfSlab("light_blue_concrete_slab", concrete.getMaterial(), MapColor.LIGHT_BLUE, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false, (BlockSlab) BlockInit.light_blue_concrete_double_slab);
    public static final Block yellow_concrete_double_slab = new BlockBaseDoubleSlab("yellow_concrete_double_slab", concrete.getMaterial(), MapColor.YELLOW, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block yellow_concrete_slab = new BlockBaseHalfSlab("yellow_concrete_slab", concrete.getMaterial(), MapColor.YELLOW, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false,  (BlockSlab) BlockInit.yellow_concrete_double_slab);
    public static final Block lime_concrete_double_slab = new BlockBaseDoubleSlab("lime_concrete_double_slab", concrete.getMaterial(), MapColor.LIME, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block lime_concrete_slab = new BlockBaseHalfSlab("lime_concrete_slab", concrete.getMaterial(), MapColor.LIME, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false, (BlockSlab) BlockInit.lime_concrete_double_slab);
    public static final Block pink_concrete_double_slab = new BlockBaseDoubleSlab("pink_concrete_double_slab", concrete.getMaterial(), MapColor.PINK, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block pink_concrete_slab = new BlockBaseHalfSlab("pink_concrete_slab", concrete.getMaterial(), MapColor.PINK, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false, (BlockSlab) BlockInit.pink_concrete_double_slab);
    public static final Block gray_concrete_double_slab = new BlockBaseDoubleSlab("gray_concrete_double_slab", concrete.getMaterial(), MapColor.GRAY, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block gray_concrete_slab = new BlockBaseHalfSlab("gray_concrete_slab", concrete.getMaterial(), MapColor.GRAY, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false, (BlockSlab) BlockInit.gray_concrete_double_slab);
    public static final Block light_gray_concrete_double_slab = new BlockBaseDoubleSlab("light_gray_concrete_double_slab", concrete.getMaterial(), MapColor.SILVER, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block light_gray_concrete_slab = new BlockBaseHalfSlab("light_gray_concrete_slab", concrete.getMaterial(), MapColor.SILVER, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false, (BlockSlab) BlockInit.light_gray_concrete_double_slab);
    public static final Block cyan_concrete_double_slab = new BlockBaseDoubleSlab("cyan_concrete_double_slab", concrete.getMaterial(), MapColor.CYAN, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block cyan_concrete_slab = new BlockBaseHalfSlab("cyan_concrete_slab", concrete.getMaterial(), MapColor.CYAN, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false, (BlockSlab) BlockInit.cyan_concrete_double_slab);
    public static final Block purple_concrete_double_slab = new BlockBaseDoubleSlab("purple_concrete_double_slab", concrete.getMaterial(), MapColor.PURPLE, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block purple_concrete_slab = new BlockBaseHalfSlab("purple_concrete_slab", concrete.getMaterial(), MapColor.PURPLE, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false, (BlockSlab) BlockInit.purple_concrete_double_slab);
    public static final Block blue_concrete_double_slab = new BlockBaseDoubleSlab("blue_concrete_double_slab", concrete.getMaterial(), MapColor.BLUE, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block blue_concrete_slab = new BlockBaseHalfSlab("blue_concrete_slab", concrete.getMaterial(), MapColor.BLUE, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false, (BlockSlab) BlockInit.blue_concrete_double_slab);
    public static final Block brown_concrete_double_slab = new BlockBaseDoubleSlab("brown_concrete_double_slab", concrete.getMaterial(), MapColor.BROWN, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block brown_concrete_slab = new BlockBaseHalfSlab("brown_concrete_slab", concrete.getMaterial(), MapColor.BROWN, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false, (BlockSlab) BlockInit.brown_concrete_double_slab);
    public static final Block green_concrete_double_slab = new BlockBaseDoubleSlab("green_concrete_double_slab", concrete.getMaterial(), MapColor.GREEN, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block green_concrete_slab = new BlockBaseHalfSlab("green_concrete_slab", concrete.getMaterial(), MapColor.GREEN, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false, (BlockSlab) BlockInit.green_concrete_double_slab);
    public static final Block red_concrete_double_slab = new BlockBaseDoubleSlab("red_concrete_double_slab", concrete.getMaterial(), MapColor.RED, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block red_concrete_slab = new BlockBaseHalfSlab("red_concrete_slab", concrete.getMaterial(), MapColor.RED, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false, (BlockSlab) BlockInit.red_concrete_double_slab);
    public static final Block black_concrete_double_slab = new BlockBaseDoubleSlab("black_concrete_double_slab", concrete.getMaterial(), MapColor.BLACK, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block black_concrete_slab = new BlockBaseHalfSlab("black_concrete_slab", concrete.getMaterial(), MapColor.BLACK, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false, (BlockSlab) BlockInit.black_concrete_double_slab);

    //Wool stairs
    public static final Block white_wool_stairs = new BlockBaseStairs("white_wool_stairs", wool, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, "none", 0, true);
    public static final Block orange_wool_stairs = new BlockBaseStairs("orange_wool_stairs", wool, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, "none", 0, true);
    public static final Block magenta_wool_stairs = new BlockBaseStairs("magenta_wool_stairs", wool, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, "none", 0, true);
    public static final Block light_blue_wool_stairs = new BlockBaseStairs("light_blue_wool_stairs", wool, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, "none", 0, true);
    public static final Block yellow_wool_stairs = new BlockBaseStairs("yellow_wool_stairs", wool, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, "none", 0, true);
    public static final Block lime_wool_stairs = new BlockBaseStairs("lime_wool_stairs", wool, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, "none", 0, true);
    public static final Block pink_wool_stairs = new BlockBaseStairs("pink_wool_stairs", wool, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, "none", 0, true);
    public static final Block gray_wool_stairs = new BlockBaseStairs("gray_wool_stairs", wool, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, "none", 0, true);
    public static final Block light_gray_wool_stairs = new BlockBaseStairs("light_gray_wool_stairs", wool, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, "none", 0, true);
    public static final Block cyan_wool_stairs = new BlockBaseStairs("cyan_wool_stairs", wool, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, "none", 0, true);
    public static final Block purple_wool_stairs = new BlockBaseStairs("purple_wool_stairs", wool, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, "none", 0, true);
    public static final Block blue_wool_stairs = new BlockBaseStairs("blue_wool_stairs", wool, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, "none", 0, true);
    public static final Block brown_wool_stairs = new BlockBaseStairs("brown_wool_stairs", wool, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, "none", 0, true);
    public static final Block green_wool_stairs = new BlockBaseStairs("green_wool_stairs", wool, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, "none", 0, true);
    public static final Block red_wool_stairs = new BlockBaseStairs("red_wool_stairs", wool, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, "none", 0, true);
    public static final Block black_wool_stairs = new BlockBaseStairs("black_wool_stairs", wool, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, "none", 0, true);

    //Wool slabs
    public static final Block white_wool_double_slab = new BlockBaseDoubleSlab("white_wool_double_slab", wool.getMaterial(), MapColor.SNOW, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true);
    public static final Block white_wool_slab = new BlockBaseHalfSlab("white_wool_slab", wool.getMaterial(), MapColor.SNOW, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true, (BlockSlab) BlockInit.white_wool_double_slab);
    public static final Block orange_wool_double_slab = new BlockBaseDoubleSlab("orange_wool_double_slab", wool.getMaterial(), MapColor.ADOBE, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true);
    public static final Block orange_wool_slab = new BlockBaseHalfSlab("orange_wool_slab", wool.getMaterial(), MapColor.ADOBE, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true, (BlockSlab) BlockInit.orange_wool_double_slab);
    public static final Block magenta_wool_double_slab = new BlockBaseDoubleSlab("magenta_wool_double_slab", wool.getMaterial(), MapColor.MAGENTA, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true);
    public static final Block magenta_wool_slab = new BlockBaseHalfSlab("magenta_wool_slab", wool.getMaterial(), MapColor.MAGENTA, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true, (BlockSlab) BlockInit.magenta_wool_double_slab);
    public static final Block light_blue_wool_double_slab = new BlockBaseDoubleSlab("light_blue_wool_double_slab", wool.getMaterial(), MapColor.LIGHT_BLUE, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true);
    public static final Block light_blue_wool_slab = new BlockBaseHalfSlab("light_blue_wool_slab", wool.getMaterial(), MapColor.LIGHT_BLUE, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true, (BlockSlab) BlockInit.light_blue_wool_double_slab);
    public static final Block yellow_wool_double_slab = new BlockBaseDoubleSlab("yellow_wool_double_slab", wool.getMaterial(), MapColor.YELLOW, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true);
    public static final Block yellow_wool_slab = new BlockBaseHalfSlab("yellow_wool_slab", wool.getMaterial(), MapColor.YELLOW, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true, (BlockSlab) BlockInit.yellow_wool_double_slab);
    public static final Block lime_wool_double_slab = new BlockBaseDoubleSlab("lime_wool_double_slab", wool.getMaterial(), MapColor.LIME, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true);
    public static final Block lime_wool_slab = new BlockBaseHalfSlab("lime_wool_slab", wool.getMaterial(), MapColor.LIME, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true, (BlockSlab) BlockInit.lime_wool_double_slab);
    public static final Block pink_wool_double_slab = new BlockBaseDoubleSlab("pink_wool_double_slab", wool.getMaterial(), MapColor.PINK, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true);
    public static final Block pink_wool_slab = new BlockBaseHalfSlab("pink_wool_slab", wool.getMaterial(), MapColor.PINK, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true, (BlockSlab) BlockInit.pink_wool_double_slab);
    public static final Block gray_wool_double_slab = new BlockBaseDoubleSlab("gray_wool_double_slab", wool.getMaterial(), MapColor.GRAY, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true);
    public static final Block gray_wool_slab = new BlockBaseHalfSlab("gray_wool_slab", wool.getMaterial(), MapColor.GRAY, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true, (BlockSlab) BlockInit.gray_wool_double_slab);
    public static final Block light_gray_wool_double_slab = new BlockBaseDoubleSlab("light_gray_wool_double_slab", wool.getMaterial(), MapColor.SILVER, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true);
    public static final Block light_gray_wool_slab = new BlockBaseHalfSlab("light_gray_wool_slab", wool.getMaterial(), MapColor.SILVER, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true, (BlockSlab) BlockInit.light_gray_wool_double_slab);
    public static final Block cyan_wool_double_slab = new BlockBaseDoubleSlab("cyan_wool_double_slab", wool.getMaterial(), MapColor.CYAN, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true);
    public static final Block cyan_wool_slab = new BlockBaseHalfSlab("cyan_wool_slab", wool.getMaterial(), MapColor.CYAN, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true, (BlockSlab) BlockInit.cyan_wool_double_slab);
    public static final Block purple_wool_double_slab = new BlockBaseDoubleSlab("purple_wool_double_slab", wool.getMaterial(), MapColor.PURPLE, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true);
    public static final Block purple_wool_slab = new BlockBaseHalfSlab("purple_wool_slab", wool.getMaterial(), MapColor.PURPLE, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true, (BlockSlab) BlockInit.purple_wool_double_slab);
    public static final Block blue_wool_double_slab = new BlockBaseDoubleSlab("blue_wool_double_slab", wool.getMaterial(), MapColor.BLUE, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true);
    public static final Block blue_wool_slab = new BlockBaseHalfSlab("blue_wool_slab", wool.getMaterial(), MapColor.BLUE, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true, (BlockSlab) BlockInit.blue_wool_double_slab);
    public static final Block brown_wool_double_slab = new BlockBaseDoubleSlab("brown_wool_double_slab", wool.getMaterial(), MapColor.BROWN, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true);
    public static final Block brown_wool_slab = new BlockBaseHalfSlab("brown_wool_slab", wool.getMaterial(), MapColor.BROWN, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true, (BlockSlab) BlockInit.brown_wool_double_slab);
    public static final Block green_wool_double_slab = new BlockBaseDoubleSlab("green_wool_double_slab", wool.getMaterial(), MapColor.GREEN, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true);
    public static final Block green_wool_slab = new BlockBaseHalfSlab("green_wool_slab", wool.getMaterial(), MapColor.GREEN, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true, (BlockSlab) BlockInit.green_wool_double_slab);
    public static final Block red_wool_double_slab = new BlockBaseDoubleSlab("red_wool_double_slab", wool.getMaterial(), MapColor.RED, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true);
    public static final Block red_wool_slab = new BlockBaseHalfSlab("red_wool_slab", wool.getMaterial(), MapColor.RED, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true, (BlockSlab) BlockInit.red_wool_double_slab);
    public static final Block black_wool_double_slab = new BlockBaseDoubleSlab("black_wool_double_slab", wool.getMaterial(), MapColor.BLACK, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true);
    public static final Block black_wool_slab = new BlockBaseHalfSlab("black_wool_slab", wool.getMaterial(), MapColor.BLACK, NotEnoughVariants.NOT_ENOUGH_VARIANTS, 0.8F, 0.8F, SoundType.CLOTH, "none", 0, true, (BlockSlab) BlockInit.black_wool_double_slab);
}
