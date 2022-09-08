package smi.citycreate.mod;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod(modid = "citycreate", version = "0.99", name = "CityCreateMod")
	public class CityCreateMod {
	    public static final Block TEST_BLOCK = new BlockTest();
	    public static final Block MANHOLE = new manhole();
	    public static final Block LIGHT_14 = new light14();
	    public static final Block LIGHT_12 = new light12();
	    public static final Block LIGHT_10 = new light10();
	    public static final Block LIGHT_8 = new light8();
	    public static final Item LOGO = new logo();
	    

	    //この関数でMODファイル自体をイベントの発火先にする。
    @Mod.EventHandler
    public void construct(FMLConstructionEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
    }
    //アイテムを登録するイベント。 旧preinitのタイミングで発火する。
    @SubscribeEvent
    public void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().register(new ItemBlock(TEST_BLOCK).setRegistryName("citycreate","test_block"));
        event.getRegistry().register(new ItemBlock(MANHOLE).setRegistryName("citycreate", "manhole"));
        event.getRegistry().register(new ItemBlock(LIGHT_14).setRegistryName("citycreate","light_14"));
        event.getRegistry().register(new ItemBlock(LIGHT_12).setRegistryName("citycreate","light_12"));
        event.getRegistry().register(new ItemBlock(LIGHT_10).setRegistryName("citycreate","light_10"));
        event.getRegistry().register(new ItemBlock(LIGHT_8).setRegistryName("citycreate","light_8"));
        
        event.getRegistry().register(LOGO);
        
        
        
        
        
    }

    //ブロックを登録するイベント。 旧preinitのタイミングで発火する。
    @SubscribeEvent
    public void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(TEST_BLOCK);
        event.getRegistry().register(MANHOLE);       
        event.getRegistry().register(LIGHT_14);
        event.getRegistry().register(LIGHT_12);
        event.getRegistry().register(LIGHT_10);
        event.getRegistry().register(LIGHT_8);
       
        
    }

    //モデルを登録するイベント。SideOnlyによってクライアント側のみ呼ばれる。旧preinitのタイミングで発火する。
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(TEST_BLOCK), 0, new ModelResourceLocation(new ResourceLocation("citycreate", "test_block"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(MANHOLE), 0, new ModelResourceLocation(new ResourceLocation("citycreate", "manhole"), "inventory"));
        
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(LIGHT_14), 0, new ModelResourceLocation(new ResourceLocation("citycreate","light_14"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(LIGHT_12), 0, new ModelResourceLocation(new ResourceLocation("citycreate","light_12"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(LIGHT_10), 0, new ModelResourceLocation(new ResourceLocation("citycreate","light_10"), "inventory"));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(LIGHT_8), 0, new ModelResourceLocation(new ResourceLocation("citycreate","light_8"), "inventory"));
      
        ModelLoader.setCustomModelResourceLocation(LOGO, 0, new ModelResourceLocation(new ResourceLocation("citycreate", "logo"), "inventory"));
      
  }
    
    
    
    }



