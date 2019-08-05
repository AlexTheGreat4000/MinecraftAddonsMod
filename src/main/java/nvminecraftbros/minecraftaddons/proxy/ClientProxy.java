package nvminecraftbros.minecraftaddons.proxy;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import nvminecraftbros.minecraftaddons.MinecraftAddonMod;

public class ClientProxy extends CommonProxy {

	@Override
	public void registerItemRenderer(Item item, int meta, String id) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(MinecraftAddonMod.MOD_ID + ":" + id, "inventory"));
	}
}
