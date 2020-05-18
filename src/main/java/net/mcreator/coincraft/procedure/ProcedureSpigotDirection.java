package net.mcreator.coincraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.Entity;

import net.mcreator.coincraft.block.BlockSpigotOffWest;
import net.mcreator.coincraft.block.BlockSpigotOffSouth;
import net.mcreator.coincraft.block.BlockSpigotOffNorth;
import net.mcreator.coincraft.block.BlockSpigotOffEast;
import net.mcreator.coincraft.ElementsCoinCraft;

@ElementsCoinCraft.ModElement.Tag
public class ProcedureSpigotDirection extends ElementsCoinCraft.ModElement {
	public ProcedureSpigotDirection(ElementsCoinCraft instance) {
		super(instance, 5);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure SpigotDirection!");
			return;
		}
		if (dependencies.get("x") == null) {
			System.err.println("Failed to load dependency x for procedure SpigotDirection!");
			return;
		}
		if (dependencies.get("y") == null) {
			System.err.println("Failed to load dependency y for procedure SpigotDirection!");
			return;
		}
		if (dependencies.get("z") == null) {
			System.err.println("Failed to load dependency z for procedure SpigotDirection!");
			return;
		}
		if (dependencies.get("world") == null) {
			System.err.println("Failed to load dependency world for procedure SpigotDirection!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if ((!(world.isRemote))) {
			if ((((entity.rotationYaw) >= 45) && ((entity.rotationYaw) < 135))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockSpigotOffEast.block.getDefaultState(), 3);
			} else if ((((entity.rotationYaw) >= 135) && ((entity.rotationYaw) < 225))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockSpigotOffNorth.block.getDefaultState(), 3);
			} else if ((((entity.rotationYaw) >= 225) && ((entity.rotationYaw) < 315))) {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockSpigotOffWest.block.getDefaultState(), 3);
			} else {
				world.setBlockState(new BlockPos((int) x, (int) y, (int) z), BlockSpigotOffSouth.block.getDefaultState(), 3);
			}
		}
	}
}
