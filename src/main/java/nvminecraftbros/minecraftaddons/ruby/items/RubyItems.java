package nvminecraftbros.minecraftaddons.ruby.items;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import nvminecraftbros.minecraftaddons.MinecraftAddonMod;

public class RubyItems {
	
	public static ItemBase ruby = new ItemBase("ruby");
	public static ItemPickaxe ruby_pickaxe = new ItemPickaxe(MinecraftAddonMod.rubymaterial, "ruby_pickaxe");
	public static ItemSword ruby_sword = new ItemSword(MinecraftAddonMod.rubymaterial, "ruby_sword");
	public static ItemAxe ruby_axe = new ItemAxe(MinecraftAddonMod.rubymaterial, "ruby_axe");
	public static ItemShovel ruby_shovel = new ItemShovel(MinecraftAddonMod.rubymaterial, "ruby_shovel");
	public static ItemHoe ruby_hoe = new ItemHoe(MinecraftAddonMod.rubymaterial, "ruby_hoe");
	public static ItemArmor ruby_helmet = new ItemArmor(MinecraftAddonMod.rubyarmor, EntityEquipmentSlot.HEAD, "ruby_helmet");
	public static ItemArmor ruby_chestplate = new ItemArmor(MinecraftAddonMod.rubyarmor, EntityEquipmentSlot.CHEST, "ruby_chestplate");
	public static ItemArmor ruby_leggings = new ItemArmor(MinecraftAddonMod.rubyarmor, EntityEquipmentSlot.LEGS, "ruby_leggings");
	public static ItemArmor ruby_boots = new ItemArmor(MinecraftAddonMod.rubyarmor, EntityEquipmentSlot.FEET, "ruby_boots");
	
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(ruby);
		registry.registerAll(ruby_pickaxe);
		registry.registerAll(ruby_sword);
		registry.registerAll(ruby_axe);
		registry.registerAll(ruby_shovel);
		registry.registerAll(ruby_hoe);
		registry.registerAll(ruby_helmet);
		registry.registerAll(ruby_chestplate);
		registry.registerAll(ruby_leggings);
		registry.registerAll(ruby_boots);
	}
	
	public static void registerModels() {
		ruby.registerItemModel();
		ruby_pickaxe.registerItemModel(ruby_pickaxe);
		ruby_sword.registerItemModel(ruby_sword);
		ruby_axe.registerItemModel(ruby_axe);
		ruby_shovel.registerItemModel(ruby_shovel);
		ruby_hoe.registerItemModel(ruby_hoe);
		ruby_helmet.registerItemModel(ruby_helmet);
		ruby_chestplate.registerItemModel(ruby_chestplate);
		ruby_leggings.registerItemModel(ruby_leggings);
		ruby_boots.registerItemModel(ruby_boots);
	}
}
