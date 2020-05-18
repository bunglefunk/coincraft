
package net.mcreator.coincraft.creativetab;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;

import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;
import net.minecraft.creativetab.CreativeTabs;

import net.mcreator.coincraft.ElementsCoinCraft;

@ElementsCoinCraft.ModElement.Tag
public class TabCraftedComponents extends ElementsCoinCraft.ModElement {
	public TabCraftedComponents(ElementsCoinCraft instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		tab = new CreativeTabs("tabcraftedcomponents") {
			@SideOnly(Side.CLIENT)
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(Blocks.CRAFTING_TABLE, (int) (1));
			}

			@SideOnly(Side.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
	public static CreativeTabs tab;
}
