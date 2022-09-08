package smi.citycreate.mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockTest extends Block {
	
	    public BlockTest() {
	        super(Material.BARRIER);
	        this.setRegistryName("citycreate","test_block");
	        this.setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
	        this.setUnlocalizedName("test_block");
	        this.setLightLevel(1.0F);
	    }

		


}
