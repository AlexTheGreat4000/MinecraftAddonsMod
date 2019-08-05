package nvminecraftbros.minecraftaddons.rosegold.items;

import net.minecraft.item.Item;
import nvminecraftbros.minecraftaddons.MinecraftAddonMod;

public class ItemShovel extends net.minecraft.item.ItemSpade {

	private String name;

	public ItemShovel(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		setCreativeTab(MinecraftAddonMod.tabRoseGold);
	}
	
	public void registerItemModel(Item item) {
		MinecraftAddonMod.proxy.registerItemRenderer(this, 0, name);
	}
}
