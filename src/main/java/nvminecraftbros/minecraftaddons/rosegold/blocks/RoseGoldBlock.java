package nvminecraftbros.minecraftaddons.rosegold.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RoseGoldBlock extends BlockBase {

	public RoseGoldBlock(String name) {
		super(Material.ROCK, name);
	
		setHardness(3f);
		setResistance(10f);
	}
	
	@Override
	public RoseGoldBlock setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
