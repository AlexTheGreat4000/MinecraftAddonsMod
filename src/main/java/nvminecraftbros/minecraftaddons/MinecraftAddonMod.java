package nvminecraftbros.minecraftaddons;

import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nvminecraftbros.minecraftaddons.emerald.items.EmeraldItems;
import nvminecraftbros.minecraftaddons.emerald.tabs.EmeraldTab;
import nvminecraftbros.minecraftaddons.obsidian.items.ObsidianItems;
import nvminecraftbros.minecraftaddons.obsidian.tabs.ObsidianTab;
import nvminecraftbros.minecraftaddons.proxy.CommonProxy;
import nvminecraftbros.minecraftaddons.rosegold.blocks.RoseGoldBlocks;
import nvminecraftbros.minecraftaddons.rosegold.items.RoseGoldItems;
import nvminecraftbros.minecraftaddons.rosegold.tabs.RoseGoldTab;
import nvminecraftbros.minecraftaddons.rosegold.world.RoseGoldWorldGeneration;
import nvminecraftbros.minecraftaddons.ruby.blocks.RubyBlocks;
import nvminecraftbros.minecraftaddons.ruby.items.RubyItems;
import nvminecraftbros.minecraftaddons.ruby.tabs.RubyTab;
import nvminecraftbros.minecraftaddons.ruby.world.RubyWorldGeneration;

@Mod(modid = MinecraftAddonMod.MOD_ID, name = MinecraftAddonMod.NAME, version = MinecraftAddonMod.VERSION, acceptedMinecraftVersions = MinecraftAddonMod.ACCEPTED_MC_VERSIONS)
public class MinecraftAddonMod {

	public static final String MOD_ID = "mam";
	public static final String NAME = "Minecraft Addons Mod";
	public static final String VERSION = "1.0.0";
	public static final String ACCEPTED_MC_VERSIONS = "[1.12.2]";
	public static final String CLIENT_PROXY_CLASS = "nvminecraftbros.minecraftaddons.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "nvminecraftbros.minecraftaddons.proxy.CommonProxy";

	@Mod.Instance(MinecraftAddonMod.MOD_ID)
	public static MinecraftAddonMod instance;
	
	@SidedProxy(clientSide = MinecraftAddonMod.CLIENT_PROXY_CLASS, serverSide = MinecraftAddonMod.SERVER_PROXY_CLASS)
	public static CommonProxy proxy;
	
	/*Rose Gold*/
	public static final Item.ToolMaterial rosegoldmaterial = EnumHelper.addToolMaterial("rosegoldmaterial", 0, 500, 6, 2, 14);
	public static final ItemArmor.ArmorMaterial rosegoldarmor = EnumHelper.addArmorMaterial("rosegoldarmor","mam:rose_gold", 50, new int[] {2,5,3,1}, 20, SoundEvents.ITEM_ARMOR_EQUIP_GOLD, 0.0F);
	public static final RoseGoldTab tabRoseGold = new RoseGoldTab();
	
	/*Obsidian*/
	public static final Item.ToolMaterial obsidianmaterial = EnumHelper.addToolMaterial("obsidianmaterial", 6, 3999, 30, 15, 3);
	public static final ItemArmor.ArmorMaterial obsidianarmor = EnumHelper.addArmorMaterial("obsidianarmor", "mam:obsidian", 75, new int[] {3,8,6,3}, 3, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final ObsidianTab tabObsidian = new ObsidianTab();
	
	/*Ruby*/
	public static final Item.ToolMaterial rubymaterial = EnumHelper.addToolMaterial("rubymaterial", 3, 999, 10, 7, 7);
	public static final ItemArmor.ArmorMaterial rubyarmor = EnumHelper.addArmorMaterial("rubyarmor", "mam:ruby", 40, new int[] {2,6,4,2}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final RubyTab tabRuby = new RubyTab();
	
	/*Emerald*/
	public static final Item.ToolMaterial emeraldmaterial = EnumHelper.addToolMaterial("emeraldmaterial", 4, 1199, 12, 8, 6);
	public static final ItemArmor.ArmorMaterial emeraldarmor = EnumHelper.addArmorMaterial("emeraldarmor", "mam:emerald", 40, new int[] {3,8,6,3}, 8, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 0.0F);
	public static final EmeraldTab tabEmerald = new EmeraldTab();
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		GameRegistry.registerWorldGenerator(new RoseGoldWorldGeneration(), 3);
		GameRegistry.registerWorldGenerator(new RubyWorldGeneration(), 4);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		
		MinecraftAddonRecipes.init();
	}

	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
	
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			
			/* Emerald */
			EmeraldItems.register(event.getRegistry());
			
			/* Obsidian */
			ObsidianItems.register(event.getRegistry());
			
			/* Rose Gold */
			RoseGoldItems.register(event.getRegistry());
			RoseGoldBlocks.registerItemBlocks(event.getRegistry());
			
			/* Ruby */
			RubyItems.register(event.getRegistry());
			RubyBlocks.registerItemBlocks(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItems(ModelRegistryEvent event) {
			
			/* Emerald */
			EmeraldItems.registerModels();
			
			/* Obsidian */
			ObsidianItems.registerModels();

			/* Rose Gold */
			RoseGoldItems.registerModels();
			RoseGoldBlocks.registerModels();
			
			/* Ruby */
			RubyItems.registerModels();
			RubyBlocks.registerModels();
		}
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			
			/* Rose Gold */
			RoseGoldBlocks.register(event.getRegistry());
			
			/* Ruby */
			RubyBlocks.register(event.getRegistry());
		}
	}
}
