package darkster9757.mods.Youtech;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import darkster9757.mods.Youtech.items.ItemCoalCompound;
import darkster9757.mods.Youtech.items.ItemCoalMixture;
import darkster9757.mods.Youtech.items.ItemDiamondStick;
import darkster9757.mods.Youtech.items.ItemEnergyCrystalBlue;
import darkster9757.mods.Youtech.items.ItemEnergyCrystalClear;
import darkster9757.mods.Youtech.items.ItemEnergyCrystalGreen;
import darkster9757.mods.Youtech.items.ItemEnergyCrystalRed;
import darkster9757.mods.Youtech.items.ItemGoldStick;
import darkster9757.mods.Youtech.items.ItemIronAlloy;
import darkster9757.mods.Youtech.items.ItemIronStick;
import darkster9757.mods.Youtech.items.ItemLead;
import darkster9757.mods.Youtech.items.ItemMysteriousCrystal;
import darkster9757.mods.Youtech.items.ItemObsidianStick;
import darkster9757.mods.Youtech.items.ItemSteel;
import darkster9757.mods.Youtech.items.ItemStoneStick;

@Mod(modid = "darkster9757.Youtech.base", name = "Youtech", version = "Alpha 0.0.5")
public class YoutechMain 
{
	
	public static Item IronAlloy = new ItemIronAlloy(4210).setUnlocalizedName("IronAlloy");
	public static Item Steel = new ItemSteel(4211).setUnlocalizedName("Steel");
	public static Item StoneStick = new ItemStoneStick(4212).setUnlocalizedName("StoneStick");
	public static Item IronStick = new ItemIronStick(4213).setUnlocalizedName("IronStick");
	public static Item GoldStick = new ItemGoldStick(4214).setUnlocalizedName("GoldStick");
	public static Item DiamondStick = new ItemDiamondStick(4215).setUnlocalizedName("DiamondStick");
	public static Item ObsidianStick = new ItemObsidianStick(4216).setUnlocalizedName("ObsidianStick");
	public static Item EnergyCrystalClear = new ItemEnergyCrystalClear(4217).setUnlocalizedName("EnergyCrystalClear");
	public static Item EnergyCrystalRed = new ItemEnergyCrystalRed(4218).setUnlocalizedName("EnergyCrystalRed");
	public static Item EnergyCrystalBlue = new ItemEnergyCrystalBlue(4219).setUnlocalizedName("EnergyCrystalBlue");
	public static Item EnergyCrystalGreen = new ItemEnergyCrystalGreen(4220).setUnlocalizedName("EnergyCrystalGreen");
	public static Item MysteriousCrystal = new ItemMysteriousCrystal(4221).setUnlocalizedName("MysteriousCrystal");
	public static Item CoalCompound = new ItemCoalCompound(4222).setUnlocalizedName("CoalCompound");
	public static Item CoalMixture = new ItemCoalMixture(4223).setUnlocalizedName("CoalMixture");
	public static Item Lead = new ItemLead(4224).setUnlocalizedName("Lead");
	
	public YoutechMain()
	{
		//Adding names
		LanguageRegistry.addName(IronAlloy, "Iron Alloy");
		LanguageRegistry.addName(Steel, "Steel");
		LanguageRegistry.addName(StoneStick, "Stone Stick");
		LanguageRegistry.addName(IronStick, "Iron Stick");
		LanguageRegistry.addName(GoldStick, "Gold Stick");
		LanguageRegistry.addName(DiamondStick, "Diamond Stick");
		LanguageRegistry.addName(ObsidianStick, "Obsidian Stick");
		LanguageRegistry.addName(EnergyCrystalClear, "Energy Crystal");
		LanguageRegistry.addName(EnergyCrystalRed, "Energy Crystal");
		LanguageRegistry.addName(EnergyCrystalBlue, "Energy Crystal");
		LanguageRegistry.addName(EnergyCrystalGreen, "Energy Crystal");
		LanguageRegistry.addName(MysteriousCrystal, "Mysterious Crystal");
		LanguageRegistry.addName(CoalCompound, "Coal Compound");
		LanguageRegistry.addName(CoalMixture, "Coal Mixture");
		LanguageRegistry.addName(Lead, "Lead");
		
		
		//Crafting recipes
		GameRegistry.addRecipe(new ItemStack(Lead, 1), new Object [] {
			" X ", "X*X", " X ", 'X', this.CoalMixture, '*', Item.ingotIron
		});
		
		GameRegistry.addRecipe(new ItemStack(CoalCompound, 1), new Object [] {
			"X*X", 'X', Item.coal, '*', Item.diamond
		});
		
		GameRegistry.addRecipe(new ItemStack(MysteriousCrystal, 1), new Object [] {
			"XXX", "X*X", "XXX", 'X', Block.blockGold, '*', Item.diamond
		});
		
		GameRegistry.addRecipe(new ItemStack(EnergyCrystalBlue, 1), new Object [] {
			"XXX", "X*X", "XXX", 'X', Item.diamond, '*', YoutechMain.EnergyCrystalClear
		});
		
		GameRegistry.addRecipe(new ItemStack(EnergyCrystalRed, 1), new Object [] {
			"XXX", "X*X", "XXX", 'X', Item.redstone, '*', YoutechMain.EnergyCrystalClear
		});
		
		GameRegistry.addRecipe(new ItemStack(EnergyCrystalGreen, 1), new Object [] {
			"XXX", "X*X", "XXX", 'X', Item.emerald, '*', YoutechMain.EnergyCrystalClear
		});
		
		GameRegistry.addRecipe(new ItemStack(IronAlloy, 1), new Object [] {
			"X*X", 'X', Item.coal, '*', Item.ingotIron
		});
		
		GameRegistry.addRecipe(new ItemStack(StoneStick, 1), new Object [] {
			"X", "X", 'X', Block.cobblestone
		});
		
		GameRegistry.addRecipe(new ItemStack(IronStick, 1), new Object [] {
			"X", "X", 'X', Item.ingotIron
		});
		
		GameRegistry.addRecipe(new ItemStack(GoldStick, 1), new Object [] {
			"X", "X", 'X', Item.ingotGold
		});
		
		GameRegistry.addRecipe(new ItemStack(DiamondStick, 1), new Object [] {
			"X", "X", 'X', Item.diamond
		});
		
		GameRegistry.addRecipe(new ItemStack(ObsidianStick, 1), new Object [] {
			"X", "X", 'X', Block.obsidian
		});
		
		//Smelting recipes
		GameRegistry.addSmelting(YoutechMain.IronAlloy.itemID, new ItemStack(Steel, 1), 0.0F);
		
		GameRegistry.addSmelting(YoutechMain.MysteriousCrystal.itemID, new ItemStack(EnergyCrystalClear), 10.0F);
		
		GameRegistry.addSmelting(YoutechMain.CoalCompound.itemID, new ItemStack(CoalMixture), 1.0F);
	}
}
