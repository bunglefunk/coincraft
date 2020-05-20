
package net.mcreator.coincraft.item;

@ElementsCoinCraft.ModElement.Tag
public class ItemCutDiamond extends ElementsCoinCraft.ModElement {

	@GameRegistry.ObjectHolder("coincraft:cutdiamond")
	public static final Item block = null;

	public ItemCutDiamond(ElementsCoinCraft instance) {
		super(instance, 57);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels(ModelRegistryEvent event) {
		ModelLoader.setCustomModelResourceLocation(block, 0, new ModelResourceLocation("coincraft:cutdiamond", "inventory"));
	}

	public static class ItemCustom extends Item {

		public ItemCustom() {
			setMaxDamage(0);
			maxStackSize = 64;
			setUnlocalizedName("cutdiamond");
			setRegistryName("cutdiamond");
			setCreativeTab(TabCoinCraft.tab);
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getMaxItemUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, IBlockState par2Block) {
			return 1F;
		}

	}

}
