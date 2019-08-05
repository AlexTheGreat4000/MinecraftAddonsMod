package nvminecraftbros.minecraftaddons.emerald.tabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import nvminecraftbros.minecraftaddons.MinecraftAddonMod;
import nvminecraftbros.minecraftaddons.emerald.items.EmeraldItems;

public class EmeraldTab extends CreativeTabs {

	public static final String TAB = "emerald";
	
	public EmeraldTab()
	{
		super(EmeraldTab.TAB);
	}
	
	@Override
	public ItemStack getTabIconItem()
	{
		return new ItemStack(Items.EMERALD);
	}
}
