package nathan.notenoughvariations.init;

import nathan.notenoughvariations.blocks.BlockBaseStairs;
import nathan.notenoughvariations.blocks.slab.BlockBaseDoubleSlab;
import nathan.notenoughvariations.blocks.slab.BlockBaseHalfSlab;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;

import java.util.ArrayList;
import java.util.List;

import static net.minecraft.block.SoundType.CLOTH;
import static net.minecraft.block.material.MapColor.*;

@SuppressWarnings("unused")
public class BlockInit {
    // Array list where all blocks from below are stored
    public static final List<Block> BLOCKS = new ArrayList<>();

    private static final IBlockState COBBLESTONE_DEFAULT_STATE = Blocks.COBBLESTONE.getDefaultState();
    private static final IBlockState CONCRETE_DEFAULT_STATE = Blocks.CONCRETE.getDefaultState();
    private static final IBlockState PRISMARINE_DEFAULT_STATE = Blocks.PRISMARINE.getDefaultState();
    private static final IBlockState STONE_DEFAULT_STATE = Blocks.STONE.getDefaultState();
    private static final IBlockState WOOL_DEFAULT_STATE = Blocks.WOOL.getDefaultState();

    // Concrete stairs
    public static final Block white_concrete_stairs = new BlockBaseStairs("white_concrete_stairs",
            CONCRETE_DEFAULT_STATE, SNOW, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block orange_concrete_stairs = new BlockBaseStairs("orange_concrete_stairs",
            CONCRETE_DEFAULT_STATE, ADOBE, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block magenta_concrete_stairs = new BlockBaseStairs("magenta_concrete_stairs",
            CONCRETE_DEFAULT_STATE, MAGENTA, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block light_blue_concrete_stairs = new BlockBaseStairs("light_blue_concrete_stairs",
            CONCRETE_DEFAULT_STATE, LIGHT_BLUE, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block yellow_concrete_stairs = new BlockBaseStairs("yellow_concrete_stairs",
            CONCRETE_DEFAULT_STATE, YELLOW, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block lime_concrete_stairs = new BlockBaseStairs("lime_concrete_stairs",
            CONCRETE_DEFAULT_STATE, LIME, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block pink_concrete_stairs = new BlockBaseStairs("pink_concrete_stairs",
            CONCRETE_DEFAULT_STATE, PINK, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block gray_concrete_stairs = new BlockBaseStairs("gray_concrete_stairs",
            CONCRETE_DEFAULT_STATE, GRAY, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block light_gray_concrete_stairs = new BlockBaseStairs("light_gray_concrete_stairs",
            CONCRETE_DEFAULT_STATE, SILVER, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block cyan_concrete_stairs = new BlockBaseStairs("cyan_concrete_stairs",
            CONCRETE_DEFAULT_STATE, CYAN, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block purple_concrete_stairs = new BlockBaseStairs("purple_concrete_stairs",
            CONCRETE_DEFAULT_STATE, PURPLE, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block blue_concrete_stairs = new BlockBaseStairs("blue_concrete_stairs",
            CONCRETE_DEFAULT_STATE, BLUE, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block brown_concrete_stairs = new BlockBaseStairs("brown_concrete_stairs",
            CONCRETE_DEFAULT_STATE, BROWN, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block green_concrete_stairs = new BlockBaseStairs("green_concrete_stairs",
            CONCRETE_DEFAULT_STATE, GREEN, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block red_concrete_stairs = new BlockBaseStairs("red_concrete_stairs",
            CONCRETE_DEFAULT_STATE, RED, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block black_concrete_stairs = new BlockBaseStairs("black_concrete_stairs",
            CONCRETE_DEFAULT_STATE, BLACK, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);

    // Concrete slabs
    public static final Block white_concrete_double_slab = new BlockBaseDoubleSlab("white_concrete_double_slab",
            CONCRETE_DEFAULT_STATE, SNOW, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block white_concrete_slab = new BlockBaseHalfSlab("white_concrete_slab",
            CONCRETE_DEFAULT_STATE, SNOW, 1.8F, 1.8F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) white_concrete_double_slab);
    public static final Block orange_concrete_double_slab = new BlockBaseDoubleSlab("orange_concrete_double_slab",
            CONCRETE_DEFAULT_STATE, ADOBE, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block orange_concrete_slab = new BlockBaseHalfSlab("orange_concrete_slab",
            CONCRETE_DEFAULT_STATE, ADOBE, 1.8F, 1.8F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) orange_concrete_double_slab);
    public static final Block magenta_concrete_double_slab = new BlockBaseDoubleSlab("magenta_concrete_double_slab",
            CONCRETE_DEFAULT_STATE, MAGENTA, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block magenta_concrete_slab = new BlockBaseHalfSlab("magenta_concrete_slab",
            CONCRETE_DEFAULT_STATE, MAGENTA, 1.8F, 1.8F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) magenta_concrete_double_slab);
    public static final Block light_blue_concrete_double_slab = new BlockBaseDoubleSlab("light_blue_concrete_double_slab",
            CONCRETE_DEFAULT_STATE, LIGHT_BLUE, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block light_blue_concrete_slab = new BlockBaseHalfSlab("light_blue_concrete_slab",
            CONCRETE_DEFAULT_STATE, LIGHT_BLUE, 1.8F, 1.8F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) light_blue_concrete_double_slab);
    public static final Block yellow_concrete_double_slab = new BlockBaseDoubleSlab("yellow_concrete_double_slab",
            CONCRETE_DEFAULT_STATE, YELLOW, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block yellow_concrete_slab = new BlockBaseHalfSlab("yellow_concrete_slab",
            CONCRETE_DEFAULT_STATE, YELLOW, 1.8F, 1.8F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) yellow_concrete_double_slab);
    public static final Block lime_concrete_double_slab = new BlockBaseDoubleSlab("lime_concrete_double_slab",
            CONCRETE_DEFAULT_STATE, LIME, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block lime_concrete_slab = new BlockBaseHalfSlab("lime_concrete_slab",
            CONCRETE_DEFAULT_STATE, LIME, 1.8F, 1.8F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) lime_concrete_double_slab);
    public static final Block pink_concrete_double_slab = new BlockBaseDoubleSlab("pink_concrete_double_slab",
            CONCRETE_DEFAULT_STATE, PINK, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block pink_concrete_slab = new BlockBaseHalfSlab("pink_concrete_slab",
            CONCRETE_DEFAULT_STATE, PINK, 1.8F, 1.8F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) pink_concrete_double_slab);
    public static final Block gray_concrete_double_slab = new BlockBaseDoubleSlab("gray_concrete_double_slab",
            CONCRETE_DEFAULT_STATE, GRAY, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block gray_concrete_slab = new BlockBaseHalfSlab("gray_concrete_slab",
            CONCRETE_DEFAULT_STATE, GRAY, 1.8F, 1.8F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) gray_concrete_double_slab);
    public static final Block light_gray_concrete_double_slab = new BlockBaseDoubleSlab("light_gray_concrete_double_slab",
            CONCRETE_DEFAULT_STATE, SILVER, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block light_gray_concrete_slab = new BlockBaseHalfSlab("light_gray_concrete_slab",
            CONCRETE_DEFAULT_STATE, SILVER, 1.8F, 1.8F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) light_gray_concrete_double_slab);
    public static final Block cyan_concrete_double_slab = new BlockBaseDoubleSlab("cyan_concrete_double_slab",
            CONCRETE_DEFAULT_STATE, CYAN, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block cyan_concrete_slab = new BlockBaseHalfSlab("cyan_concrete_slab",
            CONCRETE_DEFAULT_STATE, CYAN, 1.8F, 1.8F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) cyan_concrete_double_slab);
    public static final Block purple_concrete_double_slab = new BlockBaseDoubleSlab("purple_concrete_double_slab",
            CONCRETE_DEFAULT_STATE, PURPLE, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block purple_concrete_slab = new BlockBaseHalfSlab("purple_concrete_slab",
            CONCRETE_DEFAULT_STATE, PURPLE, 1.8F, 1.8F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) purple_concrete_double_slab);
    public static final Block blue_concrete_double_slab = new BlockBaseDoubleSlab("blue_concrete_double_slab",
            CONCRETE_DEFAULT_STATE, BLUE, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block blue_concrete_slab = new BlockBaseHalfSlab("blue_concrete_slab",
            CONCRETE_DEFAULT_STATE, BLUE, 1.8F, 1.8F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) blue_concrete_double_slab);
    public static final Block brown_concrete_double_slab = new BlockBaseDoubleSlab("brown_concrete_double_slab",
            CONCRETE_DEFAULT_STATE, BROWN, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block brown_concrete_slab = new BlockBaseHalfSlab("brown_concrete_slab",
            CONCRETE_DEFAULT_STATE, BROWN, 1.8F, 1.8F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) brown_concrete_double_slab);
    public static final Block green_concrete_double_slab = new BlockBaseDoubleSlab("green_concrete_double_slab",
            CONCRETE_DEFAULT_STATE, GREEN, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block green_concrete_slab = new BlockBaseHalfSlab("green_concrete_slab",
            CONCRETE_DEFAULT_STATE, GREEN, 1.8F, 1.8F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) green_concrete_double_slab);
    public static final Block red_concrete_double_slab = new BlockBaseDoubleSlab("red_concrete_double_slab",
            CONCRETE_DEFAULT_STATE, RED, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block red_concrete_slab = new BlockBaseHalfSlab("red_concrete_slab",
            CONCRETE_DEFAULT_STATE, RED, 1.8F, 1.8F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) red_concrete_double_slab);
    public static final Block black_concrete_double_slab = new BlockBaseDoubleSlab("black_concrete_double_slab",
            CONCRETE_DEFAULT_STATE, BLACK, 1.8F, 1.8F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block black_concrete_slab = new BlockBaseHalfSlab("black_concrete_slab",
            CONCRETE_DEFAULT_STATE, BLACK, 1.8F, 1.8F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) black_concrete_double_slab);

    // Wool stairs
    public static final Block white_wool_stairs = new BlockBaseStairs("white_wool_stairs", WOOL_DEFAULT_STATE,
            SNOW, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block orange_wool_stairs = new BlockBaseStairs("orange_wool_stairs", WOOL_DEFAULT_STATE,
            ADOBE, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block magenta_wool_stairs = new BlockBaseStairs("magenta_wool_stairs", WOOL_DEFAULT_STATE,
            MAGENTA, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block light_blue_wool_stairs = new BlockBaseStairs("light_blue_wool_stairs", WOOL_DEFAULT_STATE,
            LIGHT_BLUE, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block yellow_wool_stairs = new BlockBaseStairs("yellow_wool_stairs", WOOL_DEFAULT_STATE,
            YELLOW, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block lime_wool_stairs = new BlockBaseStairs("lime_wool_stairs", WOOL_DEFAULT_STATE,
            LIME, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block pink_wool_stairs = new BlockBaseStairs("pink_wool_stairs", WOOL_DEFAULT_STATE,
            PINK, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block gray_wool_stairs = new BlockBaseStairs("gray_wool_stairs", WOOL_DEFAULT_STATE,
            GRAY, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block light_gray_wool_stairs = new BlockBaseStairs("light_gray_wool_stairs", WOOL_DEFAULT_STATE,
            SILVER, 0.8F, 0.8F, CLOTH, "shears", 0, false );
    public static final Block cyan_wool_stairs = new BlockBaseStairs("cyan_wool_stairs", WOOL_DEFAULT_STATE,
            CYAN, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block purple_wool_stairs = new BlockBaseStairs("purple_wool_stairs", WOOL_DEFAULT_STATE,
            PURPLE, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block blue_wool_stairs = new BlockBaseStairs("blue_wool_stairs", WOOL_DEFAULT_STATE,
            BLUE, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block brown_wool_stairs = new BlockBaseStairs("brown_wool_stairs", WOOL_DEFAULT_STATE,
            BROWN, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block green_wool_stairs = new BlockBaseStairs("green_wool_stairs", WOOL_DEFAULT_STATE,
            GREEN, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block red_wool_stairs = new BlockBaseStairs("red_wool_stairs", WOOL_DEFAULT_STATE,
            RED, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block black_wool_stairs = new BlockBaseStairs("black_wool_stairs", WOOL_DEFAULT_STATE,
            BLACK, 0.8F, 0.8F, CLOTH, "shears", 0, false);

    // Wool slabs
    public static final Block white_wool_double_slab = new BlockBaseDoubleSlab("white_wool_double_slab",
            WOOL_DEFAULT_STATE, SNOW, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block white_wool_slab = new BlockBaseHalfSlab("white_wool_slab",
            WOOL_DEFAULT_STATE, SNOW, 0.8F, 0.8F,
            CLOTH, "shears", 0, false, (BlockBaseDoubleSlab) white_wool_double_slab);
    public static final Block orange_wool_double_slab = new BlockBaseDoubleSlab("orange_wool_double_slab",
            WOOL_DEFAULT_STATE, ADOBE, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block orange_wool_slab = new BlockBaseHalfSlab("orange_wool_slab",
            WOOL_DEFAULT_STATE, ADOBE, 0.8F, 0.8F,
            CLOTH, "shears", 0, false, (BlockBaseDoubleSlab) orange_wool_double_slab);
    public static final Block magenta_wool_double_slab = new BlockBaseDoubleSlab("magenta_wool_double_slab",
            WOOL_DEFAULT_STATE, MAGENTA, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block magenta_wool_slab = new BlockBaseHalfSlab("magenta_wool_slab",
            WOOL_DEFAULT_STATE, MAGENTA, 0.8F, 0.8F,
            CLOTH, "shears", 0, false, (BlockBaseDoubleSlab) magenta_wool_double_slab);
    public static final Block light_blue_wool_double_slab = new BlockBaseDoubleSlab("light_blue_wool_double_slab",
            WOOL_DEFAULT_STATE, LIGHT_BLUE, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block light_blue_wool_slab = new BlockBaseHalfSlab("light_blue_wool_slab",
            WOOL_DEFAULT_STATE, LIGHT_BLUE, 0.8F, 0.8F,
            CLOTH, "shears", 0, false, (BlockBaseDoubleSlab) light_blue_wool_double_slab);
    public static final Block yellow_wool_double_slab = new BlockBaseDoubleSlab("yellow_wool_double_slab",
            WOOL_DEFAULT_STATE, YELLOW, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block yellow_wool_slab = new BlockBaseHalfSlab("yellow_wool_slab",
            WOOL_DEFAULT_STATE, YELLOW, 0.8F, 0.8F,
            CLOTH, "shears", 0, false, (BlockBaseDoubleSlab) yellow_wool_double_slab);
    public static final Block lime_wool_double_slab = new BlockBaseDoubleSlab("lime_wool_double_slab",
            WOOL_DEFAULT_STATE, LIME, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block lime_wool_slab = new BlockBaseHalfSlab("lime_wool_slab",
            WOOL_DEFAULT_STATE, LIME, 0.8F, 0.8F,
            CLOTH, "shears", 0, false, (BlockBaseDoubleSlab) lime_wool_double_slab);
    public static final Block pink_wool_double_slab = new BlockBaseDoubleSlab("pink_wool_double_slab",
            WOOL_DEFAULT_STATE, PINK, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block pink_wool_slab = new BlockBaseHalfSlab("pink_wool_slab",
            WOOL_DEFAULT_STATE, PINK, 0.8F, 0.8F,
            CLOTH, "shears", 0, false, (BlockBaseDoubleSlab) pink_wool_double_slab);
    public static final Block gray_wool_double_slab = new BlockBaseDoubleSlab("gray_wool_double_slab",
            WOOL_DEFAULT_STATE, GRAY, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block gray_wool_slab = new BlockBaseHalfSlab("gray_wool_slab",
            WOOL_DEFAULT_STATE, GRAY, 0.8F, 0.8F,
            CLOTH, "shears", 0, false, (BlockBaseDoubleSlab) gray_wool_double_slab);
    public static final Block light_gray_wool_double_slab = new BlockBaseDoubleSlab("light_gray_wool_double_slab",
            WOOL_DEFAULT_STATE, SILVER, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block light_gray_wool_slab = new BlockBaseHalfSlab("light_gray_wool_slab",
            WOOL_DEFAULT_STATE, SILVER, 0.8F, 0.8F,
            CLOTH, "shears", 0, false, (BlockBaseDoubleSlab) light_gray_wool_double_slab);
    public static final Block cyan_wool_double_slab = new BlockBaseDoubleSlab("cyan_wool_double_slab",
            WOOL_DEFAULT_STATE, CYAN, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block cyan_wool_slab = new BlockBaseHalfSlab("cyan_wool_slab",
            WOOL_DEFAULT_STATE, CYAN, 0.8F, 0.8F,
            CLOTH, "shears", 0, false, (BlockBaseDoubleSlab) cyan_wool_double_slab);
    public static final Block purple_wool_double_slab = new BlockBaseDoubleSlab("purple_wool_double_slab",
            WOOL_DEFAULT_STATE, PURPLE, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block purple_wool_slab = new BlockBaseHalfSlab("purple_wool_slab",
            WOOL_DEFAULT_STATE, PURPLE, 0.8F, 0.8F,
            CLOTH, "shears", 0, false, (BlockBaseDoubleSlab) purple_wool_double_slab);
    public static final Block blue_wool_double_slab = new BlockBaseDoubleSlab("blue_wool_double_slab",
            WOOL_DEFAULT_STATE, BLUE, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block blue_wool_slab = new BlockBaseHalfSlab("blue_wool_slab",
            WOOL_DEFAULT_STATE, BLUE, 0.8F, 0.8F,
            CLOTH, "shears", 0, false, (BlockBaseDoubleSlab) blue_wool_double_slab);
    public static final Block brown_wool_double_slab = new BlockBaseDoubleSlab("brown_wool_double_slab",
            WOOL_DEFAULT_STATE, BROWN, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block brown_wool_slab = new BlockBaseHalfSlab("brown_wool_slab",
            WOOL_DEFAULT_STATE, BROWN, 0.8F, 0.8F,
            CLOTH, "shears", 0, false, (BlockBaseDoubleSlab) brown_wool_double_slab);
    public static final Block green_wool_double_slab = new BlockBaseDoubleSlab("green_wool_double_slab",
            WOOL_DEFAULT_STATE, GREEN, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block green_wool_slab = new BlockBaseHalfSlab("green_wool_slab",
            WOOL_DEFAULT_STATE, GREEN, 0.8F, 0.8F,
            CLOTH, "shears", 0, false, (BlockBaseDoubleSlab) green_wool_double_slab);
    public static final Block red_wool_double_slab = new BlockBaseDoubleSlab("red_wool_double_slab",
            WOOL_DEFAULT_STATE, RED, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block red_wool_slab = new BlockBaseHalfSlab("red_wool_slab",
            WOOL_DEFAULT_STATE, RED, 0.8F, 0.8F,
            CLOTH, "shears", 0, false, (BlockBaseDoubleSlab) red_wool_double_slab);
    public static final Block black_wool_double_slab = new BlockBaseDoubleSlab("black_wool_double_slab",
            WOOL_DEFAULT_STATE, BLACK, 0.8F, 0.8F, CLOTH, "shears", 0, false);
    public static final Block black_wool_slab = new BlockBaseHalfSlab("black_wool_slab",
            WOOL_DEFAULT_STATE, BLACK, 0.8F, 0.8F,
            CLOTH, "shears", 0, false, (BlockBaseDoubleSlab) black_wool_double_slab);

    // Stone variations start
    // Andesite
    public static final Block andesite_double_slab = new BlockBaseDoubleSlab("andesite_double_slab",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block andesite_slab = new BlockBaseHalfSlab("andesite_slab",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) andesite_double_slab);
    public static final Block andesite_stairs = new BlockBaseStairs("andesite_stairs",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block polished_andesite_double_slab = new BlockBaseDoubleSlab("polished_andesite_double_slab",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block polished_andesite_slab = new BlockBaseHalfSlab("polished_andesite_slab",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) polished_andesite_double_slab);
    public static final Block polished_andesite_stairs = new BlockBaseStairs("polished_andesite_stairs",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);

    // Diorite
    public static final Block diorite_double_slab = new BlockBaseDoubleSlab("diorite_double_slab",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block diorite_slab = new BlockBaseHalfSlab("diorite_slab",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) diorite_double_slab);
    public static final Block diorite_stairs = new BlockBaseStairs("diorite_stairs",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block polished_diorite_double_slab = new BlockBaseDoubleSlab("polished_diorite_double_slab",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block polished_diorite_slab = new BlockBaseHalfSlab("polished_diorite_slab",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) polished_diorite_double_slab);
    public static final Block polished_diorite_stairs = new BlockBaseStairs("polished_diorite_stairs",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);

    // Granite
    public static final Block granite_double_slab = new BlockBaseDoubleSlab("granite_double_slab",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block granite_slab = new BlockBaseHalfSlab("granite_slab",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) granite_double_slab);
    public static final Block granite_stairs = new BlockBaseStairs("granite_stairs",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block polished_granite_double_slab = new BlockBaseDoubleSlab("polished_granite_double_slab",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block polished_granite_slab = new BlockBaseHalfSlab("polished_granite_slab",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) polished_granite_double_slab);
    public static final Block polished_granite_stairs = new BlockBaseStairs("polished_granite_stairs",
            STONE_DEFAULT_STATE, STONE, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);

    // Mossy stones
    public static final Block mossy_cobblestone_double_slab = new BlockBaseDoubleSlab("mossy_cobblestone_double_slab",
            COBBLESTONE_DEFAULT_STATE, STONE, 2F, 10F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block mossy_cobblestone_slab = new BlockBaseHalfSlab("mossy_cobblestone_slab",
            COBBLESTONE_DEFAULT_STATE, STONE, 2F, 10F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) mossy_cobblestone_double_slab);
    public static final Block mossy_cobblestone_stairs = new BlockBaseStairs("mossy_cobblestone_stairs",
            COBBLESTONE_DEFAULT_STATE, STONE, 2F, 10F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block mossy_stone_bricks_double_slab = new BlockBaseDoubleSlab("mossy_stone_bricks_double_slab",
            COBBLESTONE_DEFAULT_STATE, STONE, 2F, 10F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block mossy_stone_bricks_slab = new BlockBaseHalfSlab("mossy_stone_bricks_slab",
            COBBLESTONE_DEFAULT_STATE, STONE, 2F, 10F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) mossy_stone_bricks_double_slab);
    public static final Block mossy_stone_brick_stairs = new BlockBaseStairs("mossy_stone_brick_stairs",
            COBBLESTONE_DEFAULT_STATE, STONE, 2F, 10F, SoundType.STONE, "pickaxe", 0, false);
    // Stone variations end

    // Prismarine
    public static final Block prismarine_double_slab = new BlockBaseDoubleSlab("prismarine_double_slab",
            PRISMARINE_DEFAULT_STATE, CYAN, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block prismarine_slab = new BlockBaseHalfSlab("prismarine_slab",
            PRISMARINE_DEFAULT_STATE, CYAN, 1.5F, 10F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) prismarine_double_slab);
    public static final Block prismarine_stairs = new BlockBaseStairs("prismarine_stairs",
            PRISMARINE_DEFAULT_STATE, CYAN, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block prismarine_bricks_double_slab = new BlockBaseDoubleSlab("prismarine_bricks_double_slab",
            PRISMARINE_DEFAULT_STATE, DIAMOND, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block prismarine_bricks_slab = new BlockBaseHalfSlab("prismarine_bricks_slab",
            PRISMARINE_DEFAULT_STATE, DIAMOND, 1.5F, 10F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) prismarine_bricks_double_slab);
    public static final Block prismarine_brick_stairs = new BlockBaseStairs("prismarine_brick_stairs",
            PRISMARINE_DEFAULT_STATE, DIAMOND, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block dark_prismarine_double_slab = new BlockBaseDoubleSlab("dark_prismarine_double_slab",
            PRISMARINE_DEFAULT_STATE, DIAMOND, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block dark_prismarine_slab = new BlockBaseHalfSlab("dark_prismarine_slab",
            PRISMARINE_DEFAULT_STATE, DIAMOND, 1.5F, 10F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) dark_prismarine_double_slab);
    public static final Block dark_prismarine_stairs = new BlockBaseStairs("dark_prismarine_stairs",
            PRISMARINE_DEFAULT_STATE, DIAMOND, 1.5F, 10F, SoundType.STONE, "pickaxe", 0, false);

    // Nether variations
    public static final Block red_nether_bricks_double_slab = new BlockBaseDoubleSlab("red_nether_bricks_double_slab",
            Blocks.RED_NETHER_BRICK.getDefaultState(), NETHERRACK, 2F, 10F,SoundType.STONE, "pickaxe", 0, false);
    public static final Block red_nether_bricks_slab = new BlockBaseHalfSlab("red_nether_bricks_slab",
            Blocks.RED_NETHER_BRICK.getDefaultState(), NETHERRACK, 2F, 10F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) red_nether_bricks_double_slab);
    public static final Block red_nether_brick_stairs = new BlockBaseStairs("red_nether_brick_stairs",
            Blocks.RED_NETHER_BRICK.getDefaultState(), NETHERRACK, 2F, 10F, SoundType.STONE, "pickaxe", 0, false);

    // End variations
    public static final Block end_stone_bricks_double_slab = new BlockBaseDoubleSlab("end_stone_bricks_double_slab",
            Blocks.END_STONE.getDefaultState(), SAND, 0.8F, 15F, SoundType.STONE, "pickaxe", 0, false);
    public static final Block end_stone_bricks_slab = new BlockBaseHalfSlab("end_stone_bricks_slab",
            Blocks.END_STONE.getDefaultState(), SAND, 0.8F, 15F,
            SoundType.STONE, "pickaxe", 0, false, (BlockBaseDoubleSlab) end_stone_bricks_double_slab);
    public static final Block end_stone_brick_stairs = new BlockBaseStairs("end_stone_brick_stairs",
            Blocks.END_STONE.getDefaultState(), SAND, 0.8F, 15F, SoundType.STONE, "pickaxe", 0, false);
}
