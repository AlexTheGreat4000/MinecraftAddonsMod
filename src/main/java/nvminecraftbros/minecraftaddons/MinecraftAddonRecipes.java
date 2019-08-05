package nvminecraftbros.minecraftaddons;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import nvminecraftbros.minecraftaddons.rosegold.blocks.RoseGoldBlocks;
import nvminecraftbros.minecraftaddons.rosegold.items.RoseGoldItems;
import nvminecraftbros.minecraftaddons.ruby.blocks.RubyBlocks;
import nvminecraftbros.minecraftaddons.ruby.items.RubyItems;

public class MinecraftAddonRecipes {

	public static void init()
	{
		/*Rose Gold Items*/
		GameRegistry.addSmelting(RoseGoldBlocks.rose_gold_ore, new ItemStack(RoseGoldItems.rose_gold_ingot), 1.0f);
		
		/*Ruby Items*/
		GameRegistry.addSmelting(RubyBlocks.ruby_ore, new ItemStack(RubyItems.ruby), 1.0F);
	}
}
