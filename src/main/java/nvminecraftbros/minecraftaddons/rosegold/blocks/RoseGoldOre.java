package nvminecraftbros.minecraftaddons.rosegold.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RoseGoldOre extends BlockBase {

	public RoseGoldOre(String name) {
		super(Material.ROCK, name);
	
		setHardness(3f);
		setResistance(10f);
	}
	
	@Override
	public RoseGoldOre setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
