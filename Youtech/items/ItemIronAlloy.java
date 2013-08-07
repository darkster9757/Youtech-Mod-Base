package darkster9757.mods.Youtech.items;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemIronAlloy extends Item
{

	public ItemIronAlloy(int par1) {
		super(par1);
		this.setCreativeTab(CreativeTabs.tabMaterials);
	}

	public void registerIcons(IconRegister iconRegister)
	{
		itemIcon = iconRegister.registerIcon("YoutechMain:IronAlloy");
	}
	
}