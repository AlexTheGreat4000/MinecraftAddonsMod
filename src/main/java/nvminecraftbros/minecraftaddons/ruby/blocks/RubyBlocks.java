package nvminecraftbros.minecraftaddons.ruby.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class RubyBlocks {
	
	public static RubyOre ruby_ore = new RubyOre("ruby_ore");
	public static RubyBlock ruby_block = new RubyBlock("ruby_block");

	public static void register(IForgeRegistry<Block> registry)
	{
		registry.registerAll(ruby_ore);
		registry.registerAll(ruby_block);
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry)
	{
		registry.registerAll(ruby_ore.createItemBlock());
		registry.registerAll(ruby_block.createItemBlock());
	}
	
	public static void registerModels()
	{
		ruby_ore.registerItemModel(Item.getItemFromBlock(ruby_ore));
		ruby_block.registerItemModel(Item.getItemFromBlock(ruby_block));
	}
}
