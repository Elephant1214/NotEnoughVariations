package nathan.notenoughvariations.blocks.slab;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

import java.util.Random;

public class BlockBaseDoubleSlab extends BlockBaseSlab {

    public BlockBaseDoubleSlab(String name, Material material, MapColor mapColor, float hardness, float resistance, SoundType sound, String toolClass, int level, boolean shearable) {
        super(name, material, mapColor, hardness, resistance, sound, toolClass, level, shearable);
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
}
