package nvminecraftbros.minecraftaddons.obsidian.items;

import net.minecraft.item.Item;
import nvminecraftbros.minecraftaddons.MinecraftAddonMod;

public class ItemHoe extends net.minecraft.item.ItemHoe {

	private String name;

	public ItemHoe(ToolMaterial material, String name) {
		super(material);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		setCreativeTab(MinecraftAddonMod.tabObsidian);
	}
	
	public void registerItemModel(Item item) {
		MinecraftAddonMod.proxy.registerItemRenderer(this, 0, name);
	}
}
