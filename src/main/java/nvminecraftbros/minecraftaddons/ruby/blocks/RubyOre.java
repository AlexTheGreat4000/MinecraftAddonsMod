package nvminecraftbros.minecraftaddons.ruby.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RubyOre extends BlockBase {

	public RubyOre(String name) {
		super(Material.ROCK, name);
	
		setHardness(3f);
		setResistance(10f);
	}
	
	@Override
	public RubyOre setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(tab);
		return this;
	}
}
