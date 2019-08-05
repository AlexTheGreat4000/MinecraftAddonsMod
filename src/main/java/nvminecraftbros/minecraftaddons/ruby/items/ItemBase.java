package nvminecraftbros.minecraftaddons.ruby.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import nvminecraftbros.minecraftaddons.MinecraftAddonMod;

public class ItemBase extends Item {

	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(MinecraftAddonMod.tabRuby);
	}
	
	public void registerItemModel() {
		MinecraftAddonMod.proxy.registerItemRenderer(this, 0, name);
	}
	
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	
	}
}
