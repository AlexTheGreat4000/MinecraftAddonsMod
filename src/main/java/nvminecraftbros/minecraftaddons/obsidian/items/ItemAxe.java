package nvminecraftbros.minecraftaddons.obsidian.items;

import net.minecraft.item.Item;
import nvminecraftbros.minecraftaddons.MinecraftAddonMod;

public class ItemAxe extends net.minecraft.item.ItemAxe {

	private String name;

	public ItemAxe(ToolMaterial material, String name) {
		super(material, 8f, -3.1f);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		setCreativeTab(MinecraftAddonMod.tabObsidian);
	}
	
	public void registerItemModel(Item item) {
		MinecraftAddonMod.proxy.registerItemRenderer(this, 0, name);
	}
}
