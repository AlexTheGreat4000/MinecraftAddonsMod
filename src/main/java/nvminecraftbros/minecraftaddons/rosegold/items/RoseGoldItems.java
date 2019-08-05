package nvminecraftbros.minecraftaddons.rosegold.items;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;
import nvminecraftbros.minecraftaddons.MinecraftAddonMod;

public class RoseGoldItems {

	public static ItemBase rose_gold_ingot = new ItemBase("rose_gold_ingot");
	public static ItemPickaxe rose_gold_pickaxe = new ItemPickaxe(MinecraftAddonMod.rosegoldmaterial, "rose_gold_pickaxe");
	public static ItemSword rose_gold_sword = new ItemSword(MinecraftAddonMod.rosegoldmaterial, "rose_gold_sword");
	public static ItemAxe rose_gold_axe = new ItemAxe(MinecraftAddonMod.rosegoldmaterial, "rose_gold_axe");
	public static ItemShovel rose_gold_shovel = new ItemShovel(MinecraftAddonMod.rosegoldmaterial, "rose_gold_shovel");
	public static ItemHoe rose_gold_hoe = new ItemHoe(MinecraftAddonMod.rosegoldmaterial, "rose_gold_hoe");
	public static ItemArmor rose_gold_helmet = new ItemArmor(MinecraftAddonMod.rosegoldarmor, EntityEquipmentSlot.HEAD, "rose_gold_helmet");
	public static ItemArmor rose_gold_chestplate = new ItemArmor(MinecraftAddonMod.rosegoldarmor, EntityEquipmentSlot.CHEST, "rose_gold_chestplate");
	public static ItemArmor rose_gold_leggings = new ItemArmor(MinecraftAddonMod.rosegoldarmor, EntityEquipmentSlot.LEGS, "rose_gold_leggings");
	public static ItemArmor rose_gold_boots = new ItemArmor(MinecraftAddonMod.rosegoldarmor, EntityEquipmentSlot.FEET, "rose_gold_boots");
	
	public static void register(IForgeRegistry<Item> registry) {
		registry.registerAll(rose_gold_ingot);
		registry.registerAll(rose_gold_pickaxe);
		registry.registerAll(rose_gold_sword);
		registry.registerAll(rose_gold_axe);
		registry.registerAll(rose_gold_shovel);
		registry.registerAll(rose_gold_hoe);
		registry.registerAll(rose_gold_helmet);
		registry.registerAll(rose_gold_chestplate);
		registry.registerAll(rose_gold_leggings);
		registry.registerAll(rose_gold_boots);
	}
	
	public static void registerModels() {
		rose_gold_ingot.registerItemModel();
		rose_gold_pickaxe.registerItemModel(rose_gold_pickaxe);
		rose_gold_sword.registerItemModel(rose_gold_sword);
		rose_gold_axe.registerItemModel(rose_gold_axe);
		rose_gold_shovel.registerItemModel(rose_gold_shovel);
		rose_gold_hoe.registerItemModel(rose_gold_hoe);
		rose_gold_helmet.registerItemModel(rose_gold_helmet);
		rose_gold_chestplate.registerItemModel(rose_gold_chestplate);
		rose_gold_leggings.registerItemModel(rose_gold_leggings);
		rose_gold_boots.registerItemModel(rose_gold_boots);
	}
}
