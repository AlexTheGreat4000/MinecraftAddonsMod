package nvminecraftbros.minecraftaddons.ruby.items;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import nvminecraftbros.minecraftaddons.MinecraftAddonMod;

public class ItemArmor extends net.minecraft.item.ItemArmor {

	private String name;

	public ItemArmor(ArmorMaterial material, EntityEquipmentSlot slot, String name) {
		super(material, 0, slot);
		setRegistryName(name);
		setUnlocalizedName(name);
		this.name = name;
		setCreativeTab(MinecraftAddonMod.tabRuby);
	}
	
	public void registerItemModel(Item item) {
		MinecraftAddonMod.proxy.registerItemRenderer(this, 0, name);
	}
}
