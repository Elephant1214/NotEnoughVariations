package nathan.missingblocks.blocks.slab;

import net.minecraft.block.BlockSlab;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockBaseDoubleSlab extends BlockBaseSlab {

    public BlockBaseDoubleSlab(String name, Material material, MapColor mapColor, float hardness, float resistance, SoundType sound, String toolClass, int level, BlockSlab half) {
        super(name, material, mapColor, hardness, resistance, sound, toolClass, level, half);
    }

    @Override
    public String getUnlocalizedName(int meta) {
        return this.getUnlocalizedName();
    }

    @Override
    public boolean isDouble() {
        return true;
    }
}
