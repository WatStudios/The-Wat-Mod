package net.mcreator.watmodreborn.procedures;

import org.checkerframework.checker.units.qual.m;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

import net.mcreator.watmodreborn.entity.FlyingStormyEntity;

import java.util.List;
import java.util.Comparator;

public class FlyingStormyGUIModelShowProcedure {
	public static Entity execute(LevelAccessor world, double x, double y, double z) {
		Entity mobdisplay = null;
		String mobdisplay2 = "";
		boolean m = false;
		{
			final Vec3 _center = new Vec3(x, y, z);
			List<Entity> _entfound = world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(32 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList();
			for (Entity entityiterator : _entfound) {
				if (entityiterator instanceof FlyingStormyEntity) {
					mobdisplay = entityiterator;
				}
			}
		}
		return mobdisplay;
	}
}
