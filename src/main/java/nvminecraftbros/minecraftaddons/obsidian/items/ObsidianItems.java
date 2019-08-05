package nvminecraftbros.minecraftaddons.obsidian.items;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import nvminecraftbros.minecraftaddons.MinecraftAddonMod;

public class ObsidianItems {
	
	public static ItemPickaxe obsidian_pickaxe = new ItemPickaxe(MinecraftAddonMod.obsidianmaterial, "obsidian_pickaxe");
	public static ItemSword obsidian_sword = new ItemSword(MinecraftAddonMod.obsidianmaterial, "obsidian_sword");
	public static ItemAxe obsidian_axe = new ItemAxe(MinecraftAddonMod.obsidianmaterial, "obsidian_axe");
	public static ItemShovel obsidian_shovel = new ItemShovel(MinecraftAddonMod.obsidianmaterial, "obsidian_shovel");
	public static ItemHoe obsidian_hoe = new ItemHoe(MinecraftAddonMod.obsidianmaterial, "obsidian_hoe");
	public static ItemArmor obsidian_helmet = new ItemArmor(MinecraftAddonMod.obsidianarmor, EntityEquipmentSlot.HEAD, "obsidian_helmet");
	public static ItemArmor obsidian_chestplate = new ItemArmor(MinecraftAddonMod.obsidianarmor, EntityEquipmentSlot.CHEST, "obsidian_chestplate");
	public static ItemArmor obsidian_leggings = new ItemArmor(MinecraftAddonMod.obsidianarmor, EntityEquipmentSlot.LEGS, "obsidian_leggings");
	public static ItemArmor obsidian_boots = new ItemArmor(MinecraftAddonMod.obsidianarmor, EntityEquipmentSlot.FEET, "obsidian_boots");
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(obsidian_pickaxe);
		registry.registerAll(obsidian_sword);
		registry.registerAll(obsidian_axe);
		registry.registerAll(obsidian_shovel);
		registry.registerAll(obsidian_hoe);
		registry.registerAll(obsidian_helmet);
		registry.registerAll(obsidian_chestplate);
		registry.registerAll(obsidian_leggings);
		registry.registerAll(obsidian_boots);
	}
	
	public static void registerModels() {
		obsidian_pickaxe.registerItemModel(obsidian_pickaxe);
		obsidian_sword.registerItemModel(obsidian_sword);
		obsidian_axe.registerItemModel(obsidian_axe);
		obsidian_shovel.registerItemModel(obsidian_shovel);
		obsidian_hoe.registerItemModel(obsidian_hoe);
		obsidian_helmet.registerItemModel(obsidian_helmet);
		obsidian_chestplate.registerItemModel(obsidian_chestplate);
		obsidian_leggings.registerItemModel(obsidian_leggings);
		obsidian_boots.registerItemModel(obsidian_boots);
	}
}
