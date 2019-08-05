package nvminecraftbros.minecraftaddons.rosegold.items;

import net.minecraft.item.Item;
import nvminecraftbros.minecraftaddons.MinecraftAddonMod;

public class ItemSword extends net.minecraft.item.ItemSword {

private String name;
	
	public ItemSword(ToolMaterial material, String name)
	{
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		setCreativeTab(MinecraftAddonMod.tabRoseGold);
	}
	
	public void registerItemModel(Item item)
	{
		MinecraftAddonMod.proxy.registerItemRenderer(this, 0, name);
	}
}
