package net.mcreator.coincraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;

import net.mcreator.coincraft.block.BlockSpigot;
import net.mcreator.coincraft.ElementsCoinCraft;

@ElementsCoinCraft.ModElement.Tag
public class ProcedureItemSpigotRightClickedOnBlock extends ElementsCoinCraft.ModElement {
	public ProcedureItemSpigotRightClickedOnBlock(ElementsCoinCraft instance) {
		super(instance, 4);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure ItemSpigotRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure ItemSpigotRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure ItemSpigotRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure ItemSpigotRightClickedOnBlock!");
			return;
		}
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockSpigot.block.getDefaultState(), 3);
	}
}
