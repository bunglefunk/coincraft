
package net.mcreator.coincraft.block;

import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;

import net.minecraft.util.NonNullList;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockWall;
import net.minecraft.block.Block;

import net.mcreator.coincraft.creativetab.TabCoinCraft;
import net.mcreator.coincraft.ElementsCoinCraft;

@ElementsCoinCraft.ModElement.Tag
public class BlockCastIronWall extends ElementsCoinCraft.ModElement {
	@GameRegistry.ObjectHolder("coincraft:castironwall")
	public static final Block block = null;
	public BlockCastIronWall(ElementsCoinCraft instance) {
		super(instance, 54);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new BlockCustom().setRegistryName("castironwall"));
		elements.items.add(() -> new ItemBlock(block).setRegistryName(block.getRegistryName()));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation("coincraft:castironwall", "inventory"));
	}
	public static class BlockCustom extends BlockWall {
		public BlockCustom() {
			super(new Block(Material.IRON));
			setUnlocalizedName("castironwall");
			setSoundType(SoundType.METAL);
			setHardness(5F);
			setResistance(30F);
			setLightLevel(0F);
			setLightOpacity(0);
			setCreativeTab(TabCoinCraft.tab);
		}

		@Override
		public void getSubBlocks(CreativeTabs tab, NonNullList<ItemStack> items) {
			items.add(new ItemStack(this));
		}

		@Override
		public boolean isOpaqueCube(IBlockState state) {
			return false;
		}
	}
}
