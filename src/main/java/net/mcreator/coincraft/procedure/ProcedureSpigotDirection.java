package net.mcreator.coincraft.procedure;

import net.minecraft.world.World;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.EnumFacing;

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
		if (dependencies.get("direction") == null) {
			System.err.println("Failed to load dependency direction for procedure SpigotDirection!");
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
		EnumFacing direction = (EnumFacing) dependencies.get("direction");
		int x = (int) dependencies.get("x");
		int y = (int) dependencies.get("y");
		int z = (int) dependencies.get("z");
		World world = (World) dependencies.get("world");
		if (((direction == EnumFacing.WEST) && (world.isAirBlock(new BlockPos((int) (x - 1), (int) y, (int) z))))) {
			world.setBlockState(new BlockPos((int) (x - 1), (int) y, (int) z), BlockSpigotOffEast.block.getDefaultState(), 3);
		} else if (((direction == EnumFacing.SOUTH) && (world.isAirBlock(new BlockPos((int) x, (int) y, (int) (z + 1)))))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z + 1)), BlockSpigotOffNorth.block.getDefaultState(), 3);
		} else if (((direction == EnumFacing.EAST) && (world.isAirBlock(new BlockPos((int) (x + 1), (int) y, (int) z))))) {
			world.setBlockState(new BlockPos((int) (x + 1), (int) y, (int) z), BlockSpigotOffWest.block.getDefaultState(), 3);
		} else if (((direction == EnumFacing.NORTH) && (world.isAirBlock(new BlockPos((int) x, (int) y, (int) (z - 1)))))) {
			world.setBlockState(new BlockPos((int) x, (int) y, (int) (z - 1)), BlockSpigotOffSouth.block.getDefaultState(), 3);
		} else if (((direction == EnumFacing.UP) && (world.isAirBlock(new BlockPos((int) x, (int) (y + 1), (int) z))))) {
			world.setBlockState(new BlockPos((int) x, (int) (y + 1), (int) z), BlockSpigotOffSouth.block.getDefaultState(), 3);
		} else if (((direction == EnumFacing.DOWN) && (world.isAirBlock(new BlockPos((int) x, (int) (y - 1), (int) z))))) {
			world.setBlockState(new BlockPos((int) x, (int) (y - 1), (int) z), BlockSpigotOffSouth.block.getDefaultState(), 3);
		}
	}
}
