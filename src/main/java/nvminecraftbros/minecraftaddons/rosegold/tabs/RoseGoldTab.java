package nvminecraftbros.minecraftaddons.rosegold.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import nvminecraftbros.minecraftaddons.MinecraftAddonMod;
import nvminecraftbros.minecraftaddons.rosegold.items.RoseGoldItems;

public class RoseGoldTab extends CreativeTabs {

	public static final String TAB = "rosegold";
	
	public RoseGoldTab() 
	{
		super(RoseGoldTab.TAB);
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(RoseGoldItems.rose_gold_ingot);
	}
}
