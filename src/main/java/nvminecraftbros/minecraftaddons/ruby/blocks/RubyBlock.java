package nvminecraftbros.minecraftaddons.ruby.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class RubyBlock extends BlockBase {

		public RubyBlock(String name) {
			super(Material.ROCK, name);
		
			setHardness(3f);
			setResistance(10f);
		}
		
		@Override
		public RubyBlock setCreativeTab(CreativeTabs tab) {
			super.setCreativeTab(tab);
			return this;
		}
}
