package smi.citycreate.mod;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;


public class manhole extends Block {
    protected static final AxisAlignedBB MANHOLE_AABB = new AxisAlignedBB(0.0D, 0.0D, 0.0D, 1.0D, 0.0D, 1.0D);
    
    public AxisAlignedBB getBoundingBox(IBlockState state, IBlockAccess source, BlockPos pos)
    {
        return MANHOLE_AABB;
    }



    
	public manhole() {
        super(Material.CARPET);
        this.setRegistryName("citycreate", "manhole");
        this.setCreativeTab(CreativeTabs.DECORATIONS);
        this.setUnlocalizedName("manhole");
        
      
    }
	   public MapColor getMapColor(IBlockState state, IBlockAccess worldIn, BlockPos pos)
	    {
	        return MapColor.SAND;
	    }
	
}