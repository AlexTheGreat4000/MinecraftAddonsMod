package nvminecraftbros.minecraftaddons.emerald.items;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import nvminecraftbros.minecraftaddons.MinecraftAddonMod;

public class EmeraldItems {
	
	public static ItemPickaxe emerald_pickaxe = new ItemPickaxe(MinecraftAddonMod.emeraldmaterial, "emerald_pickaxe");
	public static ItemSword emerald_sword = new ItemSword(MinecraftAddonMod.emeraldmaterial, "emerald_sword");
	public static ItemAxe emerald_axe = new ItemAxe(MinecraftAddonMod.emeraldmaterial, "emerald_axe");
	public static ItemShovel emerald_shovel = new ItemShovel(MinecraftAddonMod.emeraldmaterial, "emerald_shovel");
	public static ItemHoe emerald_hoe = new ItemHoe(MinecraftAddonMod.emeraldmaterial, "emerald_hoe");
	public static ItemArmor emerald_helmet = new ItemArmor(MinecraftAddonMod.emeraldarmor, EntityEquipmentSlot.HEAD, "emerald_helmet");
	public static ItemArmor emerald_chestplate = new ItemArmor(MinecraftAddonMod.emeraldarmor, EntityEquipmentSlot.CHEST, "emerald_chestplate");
	public static ItemArmor emerald_leggings = new ItemArmor(MinecraftAddonMod.emeraldarmor, EntityEquipmentSlot.LEGS, "emerald_leggings");
	public static ItemArmor emerald_boots = new ItemArmor(MinecraftAddonMod.emeraldarmor, EntityEquipmentSlot.FEET, "emerald_boots");
	
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(emerald_pickaxe);
		registry.registerAll(emerald_sword);
		registry.registerAll(emerald_axe);
		registry.registerAll(emerald_shovel);
		registry.registerAll(emerald_hoe);
		registry.registerAll(emerald_helmet);
		registry.registerAll(emerald_chestplate);
		registry.registerAll(emerald_leggings);
		registry.registerAll(emerald_boots);
	}
	
	public static void registerModels() {
		emerald_pickaxe.registerItemModel(emerald_pickaxe);
		emerald_sword.registerItemModel(emerald_sword);
		emerald_axe.registerItemModel(emerald_axe);
		emerald_shovel.registerItemModel(emerald_shovel);
		emerald_hoe.registerItemModel(emerald_hoe);
		emerald_helmet.registerItemModel(emerald_helmet);
		emerald_chestplate.registerItemModel(emerald_chestplate);
		emerald_leggings.registerItemModel(emerald_leggings);
		emerald_boots.registerItemModel(emerald_boots);
	}
}
