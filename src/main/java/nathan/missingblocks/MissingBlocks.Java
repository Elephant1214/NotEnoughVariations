package nathan.missingblocks;

import nathan.missingblocks.init.BlockInit;
import nathan.missingblocks.proxy.CommonProxy;
import nathan.missingblocks.tabs.MissingBlocksTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = MissingBlocks.MODID, name = MissingBlocks.NAME, version = MissingBlocks.VERSION)
public class MissingBlocks {

    public static final String MODID = "missingblocks";
    public static final String NAME = "Missing Blocks";
    public static final String VERSION = "0.1.0";

    public static final CreativeTabs MISSING_BLOCKS = new MissingBlocksTab("missing_blocks");

    @SidedProxy(clientSide = "nathan.missingblocks.proxy.ClientProxy", serverSide = "nathan.missingblocks.proxy.ServerProxy")
    public static CommonProxy proxy;
    
}
