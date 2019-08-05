package nvminecraftbros.minecraftaddons.obsidian.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import nvminecraftbros.minecraftaddons.MinecraftAddonMod;

public class ObsidianTab extends CreativeTabs {

	public static final String TAB = "obsidian";
	
	public ObsidianTab()
	{
		super(ObsidianTab.TAB);
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(Blocks.OBSIDIAN);
	}
}
