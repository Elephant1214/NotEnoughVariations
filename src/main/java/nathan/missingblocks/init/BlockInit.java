package nathan.missingblocks.init;

import nathan.missingblocks.MissingBlocks;
import nathan.missingblocks.blocks.stairs.BlockBaseStairs;
import nathan.missingblocks.blocks.slab.BlockBaseDoubleSlab;
import nathan.missingblocks.blocks.slab.BlockBaseHalfSlab;
import nathan.missingblocks.blocks.stairs.BlockBaseWoolStairs;
import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.init.Blocks;

import java.util.ArrayList;
import java.util.List;

public class BlockInit {

    public static final List<Block> blocks = new ArrayList<>();

    //Concrete stairs
    public static final Block white_concrete_stairs = new BlockBaseStairs("white_concrete_stairs", Blocks.CONCRETE.getDefaultState(), MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0);
    public static final Block orange_concrete_stairs = new BlockBaseStairs("orange_concrete_stairs", Blocks.CONCRETE.getDefaultState(), MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0);
    public static final Block magenta_concrete_stairs = new BlockBaseStairs("magenta_concrete_stairs", Blocks.CONCRETE.getDefaultState(), MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0);
    public static final Block light_blue_concrete_stairs = new BlockBaseStairs("light_blue_concrete_stairs", Blocks.CONCRETE.getDefaultState(), MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0);
    public static final Block yellow_concrete_stairs = new BlockBaseStairs("yellow_concrete_stairs", Blocks.CONCRETE.getDefaultState(), MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0);
    public static final Block lime_concrete_stairs = new BlockBaseStairs("lime_concrete_stairs", Blocks.CONCRETE.getDefaultState(), MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0);
    public static final Block pink_concrete_stairs = new BlockBaseStairs("pink_concrete_stairs", Blocks.CONCRETE.getDefaultState(), MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0);
    public static final Block gray_concrete_stairs = new BlockBaseStairs("gray_concrete_stairs", Blocks.CONCRETE.getDefaultState(), MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0);
    public static final Block light_gray_concrete_stairs = new BlockBaseStairs("light_gray_concrete_stairs", Blocks.CONCRETE.getDefaultState(), MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0);
    public static final Block cyan_concrete_stairs = new BlockBaseStairs("cyan_concrete_stairs", Blocks.CONCRETE.getDefaultState(), MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0);
    public static final Block purple_concrete_stairs = new BlockBaseStairs("purple_concrete_stairs", Blocks.CONCRETE.getDefaultState(), MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0);
    public static final Block blue_concrete_stairs = new BlockBaseStairs("blue_concrete_stairs", Blocks.CONCRETE.getDefaultState(), MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0);
    public static final Block brown_concrete_stairs = new BlockBaseStairs("brown_concrete_stairs", Blocks.CONCRETE.getDefaultState(), MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0);
    public static final Block green_concrete_stairs = new BlockBaseStairs("green_concrete_stairs", Blocks.CONCRETE.getDefaultState(), MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0);
    public static final Block red_concrete_stairs = new BlockBaseStairs("red_concrete_stairs", Blocks.CONCRETE.getDefaultState(), MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0);
    public static final Block black_concrete_stairs = new BlockBaseStairs("black_concrete_stairs", Blocks.CONCRETE.getDefaultState(), MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0);

    //Concrete slabs
    public static final Block white_concrete_double_slab = new BlockBaseDoubleSlab("white_concrete_double_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.SNOW, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.white_concrete_slab);
    public static final Block white_concrete_slab = new BlockBaseHalfSlab("white_concrete_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.SNOW, MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.white_concrete_slab, (BlockSlab) BlockInit.white_concrete_double_slab);
    public static final Block orange_concrete_double_slab = new BlockBaseDoubleSlab("orange_concrete_double_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.ADOBE, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.orange_concrete_slab);
    public static final Block orange_concrete_slab = new BlockBaseHalfSlab("orange_concrete_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.ADOBE, MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.orange_concrete_slab, (BlockSlab) BlockInit.orange_concrete_double_slab);
    public static final Block magenta_concrete_double_slab = new BlockBaseDoubleSlab("magenta_concrete_double_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.MAGENTA, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.magenta_concrete_slab);
    public static final Block magenta_concrete_slab = new BlockBaseHalfSlab("magenta_concrete_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.MAGENTA, MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.magenta_concrete_slab, (BlockSlab) BlockInit.magenta_concrete_double_slab);
    public static final Block light_blue_concrete_double_slab = new BlockBaseDoubleSlab("light_blue_concrete_double_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.LIGHT_BLUE, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.light_blue_concrete_slab);
    public static final Block light_blue_concrete_slab = new BlockBaseHalfSlab("light_blue_concrete_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.LIGHT_BLUE, MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.light_blue_concrete_slab, (BlockSlab) BlockInit.light_blue_concrete_double_slab);
    public static final Block yellow_concrete_double_slab = new BlockBaseDoubleSlab("yellow_concrete_double_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.YELLOW, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.yellow_concrete_slab);
    public static final Block yellow_concrete_slab = new BlockBaseHalfSlab("yellow_concrete_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.YELLOW, MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.yellow_concrete_slab, (BlockSlab) BlockInit.yellow_concrete_double_slab);
    public static final Block lime_concrete_double_slab = new BlockBaseDoubleSlab("lime_concrete_double_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.LIME, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.lime_concrete_slab);
    public static final Block lime_concrete_slab = new BlockBaseHalfSlab("lime_concrete_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.LIME, MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.lime_concrete_slab, (BlockSlab) BlockInit.lime_concrete_double_slab);
    public static final Block pink_concrete_double_slab = new BlockBaseDoubleSlab("pink_concrete_double_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.PINK, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.pink_concrete_slab);
    public static final Block pink_concrete_slab = new BlockBaseHalfSlab("pink_concrete_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.PINK, MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.pink_concrete_slab, (BlockSlab) BlockInit.pink_concrete_double_slab);
    public static final Block gray_concrete_double_slab = new BlockBaseDoubleSlab("gray_concrete_double_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.GRAY, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.gray_concrete_slab);
    public static final Block gray_concrete_slab = new BlockBaseHalfSlab("gray_concrete_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.GRAY, MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.gray_concrete_slab, (BlockSlab) BlockInit.gray_concrete_double_slab);
    public static final Block light_gray_concrete_double_slab = new BlockBaseDoubleSlab("light_gray_concrete_double_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.SILVER, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.light_gray_concrete_slab);
    public static final Block light_gray_concrete_slab = new BlockBaseHalfSlab("light_gray_concrete_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.SILVER, MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.light_gray_concrete_slab, (BlockSlab) BlockInit.light_gray_concrete_double_slab);
    public static final Block cyan_concrete_double_slab = new BlockBaseDoubleSlab("cyan_concrete_double_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.CYAN, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.cyan_concrete_slab);
    public static final Block cyan_concrete_slab = new BlockBaseHalfSlab("cyan_concrete_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.CYAN, MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.cyan_concrete_slab, (BlockSlab) BlockInit.cyan_concrete_double_slab);
    public static final Block purple_concrete_double_slab = new BlockBaseDoubleSlab("purple_concrete_double_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.PURPLE, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.purple_concrete_slab);
    public static final Block purple_concrete_slab = new BlockBaseHalfSlab("purple_concrete_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.PURPLE, MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.purple_concrete_slab, (BlockSlab) BlockInit.purple_concrete_double_slab);
    public static final Block blue_concrete_double_slab = new BlockBaseDoubleSlab("blue_concrete_double_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.BLUE, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.blue_concrete_slab);
    public static final Block blue_concrete_slab = new BlockBaseHalfSlab("blue_concrete_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.BLUE, MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.blue_concrete_slab, (BlockSlab) BlockInit.blue_concrete_double_slab);
    public static final Block brown_concrete_double_slab = new BlockBaseDoubleSlab("brown_concrete_double_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.BROWN, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.brown_concrete_slab);
    public static final Block brown_concrete_slab = new BlockBaseHalfSlab("brown_concrete_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.BROWN, MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.brown_concrete_slab, (BlockSlab) BlockInit.brown_concrete_double_slab);
    public static final Block green_concrete_double_slab = new BlockBaseDoubleSlab("green_concrete_double_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.GREEN, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.green_concrete_slab);
    public static final Block green_concrete_slab = new BlockBaseHalfSlab("green_concrete_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.GREEN, MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.green_concrete_slab, (BlockSlab) BlockInit.green_concrete_double_slab);
    public static final Block red_concrete_double_slab = new BlockBaseDoubleSlab("red_concrete_double_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.RED, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.red_concrete_slab);
    public static final Block red_concrete_slab = new BlockBaseHalfSlab("red_concrete_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.RED, MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.red_concrete_slab, (BlockSlab) BlockInit.red_concrete_double_slab);
    public static final Block black_concrete_double_slab = new BlockBaseDoubleSlab("black_concrete_double_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.BLACK, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.black_concrete_slab);
    public static final Block black_concrete_slab = new BlockBaseHalfSlab("black_concrete_slab", Blocks.CONCRETE.getDefaultState().getMaterial(), MapColor.BLACK, MissingBlocks.MISSING_BLOCKS, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, (BlockSlab) BlockInit.black_concrete_slab, (BlockSlab) BlockInit.black_concrete_double_slab);
}
