package smi.citycreate.mod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class logo extends Item {
	public logo() {
        super();
        //レジストリに保存する名称を登録する。大文字禁止。
        this.setRegistryName("citycreate", "logo");
        //クリエイティブタブを設定する。
        this.setCreativeTab(CreativeTabs.MATERIALS);
        //翻訳名を登録する。大文字非推奨。
        this.setUnlocalizedName("logo");
    }
}


