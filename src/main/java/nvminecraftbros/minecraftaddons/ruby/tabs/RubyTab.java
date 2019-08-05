package nvminecraftbros.minecraftaddons.ruby.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import nvminecraftbros.minecraftaddons.MinecraftAddonMod;
import nvminecraftbros.minecraftaddons.ruby.items.RubyItems;

public class RubyTab extends CreativeTabs {

	public static final String TAB = "ruby";
	
	public RubyTab() 
	{
		super(RubyTab.TAB);
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(RubyItems.ruby);
	}
}
