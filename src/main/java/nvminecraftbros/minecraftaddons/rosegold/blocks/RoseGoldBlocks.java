package nvminecraftbros.minecraftaddons.rosegold.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class RoseGoldBlocks {
	
	public static RoseGoldOre rose_gold_ore = new RoseGoldOre("rose_gold_ore");
	public static RoseGoldBlock rose_gold_block = new RoseGoldBlock("rose_gold_block");

	public static void register(IForgeRegistry<Block> registry)
	{
		registry.registerAll(rose_gold_ore);
		registry.registerAll(rose_gold_block);
	}
	
	public static void registerItemBlocks(IForgeRegistry<Item> registry)
	{
		registry.registerAll(rose_gold_ore.createItemBlock());
		registry.registerAll(rose_gold_block.createItemBlock());
	}
	
	public static void registerModels()
	{
		rose_gold_ore.registerItemModel(Item.getItemFromBlock(rose_gold_ore));
		rose_gold_block.registerItemModel(Item.getItemFromBlock(rose_gold_block));
		
	}
}
