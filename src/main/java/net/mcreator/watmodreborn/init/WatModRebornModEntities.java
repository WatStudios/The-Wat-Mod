
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.watmodreborn.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.watmodreborn.entity.WuneyaKittyMeowsEntity;
import net.mcreator.watmodreborn.entity.WhiteKittyEntity;
import net.mcreator.watmodreborn.entity.StormyEntity;
import net.mcreator.watmodreborn.entity.SirMeowsEntity;
import net.mcreator.watmodreborn.entity.SirKittyEntity;
import net.mcreator.watmodreborn.entity.SculkCatEntity;
import net.mcreator.watmodreborn.entity.RedEntity;
import net.mcreator.watmodreborn.entity.OrangeEntity;
import net.mcreator.watmodreborn.entity.LunaEntity;
import net.mcreator.watmodreborn.entity.FlyingWuneyaKittyMeowsEntity;
import net.mcreator.watmodreborn.entity.FlyingWhiteKittyEntity;
import net.mcreator.watmodreborn.entity.FlyingStormyEntity;
import net.mcreator.watmodreborn.entity.FlyingSirMeowsEntity;
import net.mcreator.watmodreborn.entity.FlyingRedEntityProjectile;
import net.mcreator.watmodreborn.entity.FlyingRedEntity;
import net.mcreator.watmodreborn.entity.FlyingLunaEntity;
import net.mcreator.watmodreborn.entity.FlyingCatGodEntity;
import net.mcreator.watmodreborn.entity.FlyingAlexEntity;
import net.mcreator.watmodreborn.entity.CorruptedWuneyaMeowsEntity;
import net.mcreator.watmodreborn.entity.CorruptedWhiteKittyEntity;
import net.mcreator.watmodreborn.entity.CorruptedStormyEntity;
import net.mcreator.watmodreborn.entity.CorruptedSirMeowsEntity;
import net.mcreator.watmodreborn.entity.CorruptedLunaEntity;
import net.mcreator.watmodreborn.entity.CorruptedBlankCatEntity;
import net.mcreator.watmodreborn.entity.CorruptedAlexEntity;
import net.mcreator.watmodreborn.entity.CorruptSirKittyEntity;
import net.mcreator.watmodreborn.entity.CatGodEntity;
import net.mcreator.watmodreborn.entity.BlankCatEntity;
import net.mcreator.watmodreborn.entity.AttackWuneyaMeowsEntity;
import net.mcreator.watmodreborn.entity.AlexEntity;
import net.mcreator.watmodreborn.WatModRebornMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class WatModRebornModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, WatModRebornMod.MODID);
	public static final RegistryObject<EntityType<StormyEntity>> STORMY = register("stormy",
			EntityType.Builder.<StormyEntity>of(StormyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(800).setUpdateInterval(3).setCustomClientFactory(StormyEntity::new).fireImmune().sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<LunaEntity>> LUNA = register("luna",
			EntityType.Builder.<LunaEntity>of(LunaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(46).setUpdateInterval(3).setCustomClientFactory(LunaEntity::new).fireImmune().sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<SirMeowsEntity>> SIR_MEOWS = register("sir_meows",
			EntityType.Builder.<SirMeowsEntity>of(SirMeowsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(54).setUpdateInterval(3).setCustomClientFactory(SirMeowsEntity::new).fireImmune().sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<WuneyaKittyMeowsEntity>> WUNEYA_KITTY_MEOWS = register("wuneya_kitty_meows", EntityType.Builder.<WuneyaKittyMeowsEntity>of(WuneyaKittyMeowsEntity::new, MobCategory.CREATURE)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(654).setUpdateInterval(3).setCustomClientFactory(WuneyaKittyMeowsEntity::new).fireImmune().sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<RedEntity>> RED = register("red",
			EntityType.Builder.<RedEntity>of(RedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(654).setUpdateInterval(3).setCustomClientFactory(RedEntity::new).fireImmune().sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<CatGodEntity>> CAT_GOD = register("cat_god",
			EntityType.Builder.<CatGodEntity>of(CatGodEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(CatGodEntity::new).fireImmune().sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<WhiteKittyEntity>> WHITE_KITTY = register("white_kitty",
			EntityType.Builder.<WhiteKittyEntity>of(WhiteKittyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(12).setUpdateInterval(3).setCustomClientFactory(WhiteKittyEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<CorruptedSirMeowsEntity>> CORRUPTED_SIR_MEOWS = register("corrupted_sir_meows",
			EntityType.Builder.<CorruptedSirMeowsEntity>of(CorruptedSirMeowsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CorruptedSirMeowsEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<CorruptedLunaEntity>> CORRUPTED_LUNA = register("corrupted_luna",
			EntityType.Builder.<CorruptedLunaEntity>of(CorruptedLunaEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(CorruptedLunaEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<CorruptedStormyEntity>> CORRUPTED_STORMY = register("corrupted_stormy",
			EntityType.Builder.<CorruptedStormyEntity>of(CorruptedStormyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(40).setUpdateInterval(3).setCustomClientFactory(CorruptedStormyEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<CorruptedWhiteKittyEntity>> CORRUPTED_WHITE_KITTY = register("corrupted_white_kitty",
			EntityType.Builder.<CorruptedWhiteKittyEntity>of(CorruptedWhiteKittyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(12).setUpdateInterval(3).setCustomClientFactory(CorruptedWhiteKittyEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<SirKittyEntity>> SIR_KITTY = register("sir_kitty",
			EntityType.Builder.<SirKittyEntity>of(SirKittyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(32).setUpdateInterval(3).setCustomClientFactory(SirKittyEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<CorruptedWuneyaMeowsEntity>> CORRUPTED_WUNEYA_MEOWS = register("corrupted_wuneya_meows",
			EntityType.Builder.<CorruptedWuneyaMeowsEntity>of(CorruptedWuneyaMeowsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(22).setUpdateInterval(3)
					.setCustomClientFactory(CorruptedWuneyaMeowsEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<AlexEntity>> ALEX = register("alex",
			EntityType.Builder.<AlexEntity>of(AlexEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(46).setUpdateInterval(3).setCustomClientFactory(AlexEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<OrangeEntity>> ORANGE = register("orange",
			EntityType.Builder.<OrangeEntity>of(OrangeEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(88).setUpdateInterval(3).setCustomClientFactory(OrangeEntity::new).fireImmune().sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<AttackWuneyaMeowsEntity>> ATTACK_WUNEYA_MEOWS = register("attack_wuneya_meows",
			EntityType.Builder.<AttackWuneyaMeowsEntity>of(AttackWuneyaMeowsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AttackWuneyaMeowsEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<BlankCatEntity>> BLANK_CAT = register("blank_cat",
			EntityType.Builder.<BlankCatEntity>of(BlankCatEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(76).setUpdateInterval(3).setCustomClientFactory(BlankCatEntity::new).fireImmune().sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<SculkCatEntity>> SCULK_CAT = register("sculk_cat",
			EntityType.Builder.<SculkCatEntity>of(SculkCatEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(256).setUpdateInterval(3).setCustomClientFactory(SculkCatEntity::new).fireImmune().sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<FlyingStormyEntity>> FLYING_STORMY = register("flying_stormy", EntityType.Builder.<FlyingStormyEntity>of(FlyingStormyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(800).setUpdateInterval(3).setCustomClientFactory(FlyingStormyEntity::new).fireImmune().sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<CorruptedBlankCatEntity>> CORRUPTED_BLANK_CAT = register("corrupted_blank_cat", EntityType.Builder.<CorruptedBlankCatEntity>of(CorruptedBlankCatEntity::new, MobCategory.MONSTER)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(76).setUpdateInterval(3).setCustomClientFactory(CorruptedBlankCatEntity::new).fireImmune().sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<FlyingLunaEntity>> FLYING_LUNA = register("flying_luna", EntityType.Builder.<FlyingLunaEntity>of(FlyingLunaEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(46)
			.setUpdateInterval(3).setCustomClientFactory(FlyingLunaEntity::new).fireImmune().sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<FlyingSirMeowsEntity>> FLYING_SIR_MEOWS = register("flying_sir_meows", EntityType.Builder.<FlyingSirMeowsEntity>of(FlyingSirMeowsEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(54).setUpdateInterval(3).setCustomClientFactory(FlyingSirMeowsEntity::new).fireImmune().sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<FlyingWuneyaKittyMeowsEntity>> FLYING_WUNEYA_KITTY_MEOWS = register("flying_wuneya_kitty_meows",
			EntityType.Builder.<FlyingWuneyaKittyMeowsEntity>of(FlyingWuneyaKittyMeowsEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(654).setUpdateInterval(3)
					.setCustomClientFactory(FlyingWuneyaKittyMeowsEntity::new).fireImmune().sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<FlyingRedEntity>> FLYING_RED = register("flying_red", EntityType.Builder.<FlyingRedEntity>of(FlyingRedEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(654)
			.setUpdateInterval(3).setCustomClientFactory(FlyingRedEntity::new).fireImmune().sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<FlyingRedEntityProjectile>> FLYING_RED_PROJECTILE = register("projectile_flying_red", EntityType.Builder.<FlyingRedEntityProjectile>of(FlyingRedEntityProjectile::new, MobCategory.MISC)
			.setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(1).setCustomClientFactory(FlyingRedEntityProjectile::new).sized(0.5f, 0.5f));
	public static final RegistryObject<EntityType<FlyingCatGodEntity>> FLYING_CAT_GOD = register("flying_cat_god", EntityType.Builder.<FlyingCatGodEntity>of(FlyingCatGodEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(128).setUpdateInterval(3).setCustomClientFactory(FlyingCatGodEntity::new).fireImmune().sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<FlyingWhiteKittyEntity>> FLYING_WHITE_KITTY = register("flying_white_kitty",
			EntityType.Builder.<FlyingWhiteKittyEntity>of(FlyingWhiteKittyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(12).setUpdateInterval(3).setCustomClientFactory(FlyingWhiteKittyEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<CorruptedAlexEntity>> CORRUPTED_ALEX = register("corrupted_alex",
			EntityType.Builder.<CorruptedAlexEntity>of(CorruptedAlexEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(46).setUpdateInterval(3).setCustomClientFactory(CorruptedAlexEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<FlyingAlexEntity>> FLYING_ALEX = register("flying_alex",
			EntityType.Builder.<FlyingAlexEntity>of(FlyingAlexEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(46).setUpdateInterval(3).setCustomClientFactory(FlyingAlexEntity::new)

					.sized(0.6f, 0.7f));
	public static final RegistryObject<EntityType<CorruptSirKittyEntity>> CORRUPT_SIR_KITTY = register("corrupt_sir_kitty",
			EntityType.Builder.<CorruptSirKittyEntity>of(CorruptSirKittyEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CorruptSirKittyEntity::new)

					.sized(0.6f, 0.7f));

	// Start of user code block custom entities
	// End of user code block custom entities
	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			StormyEntity.init();
			LunaEntity.init();
			SirMeowsEntity.init();
			WuneyaKittyMeowsEntity.init();
			RedEntity.init();
			CatGodEntity.init();
			WhiteKittyEntity.init();
			CorruptedSirMeowsEntity.init();
			CorruptedLunaEntity.init();
			CorruptedStormyEntity.init();
			CorruptedWhiteKittyEntity.init();
			SirKittyEntity.init();
			CorruptedWuneyaMeowsEntity.init();
			AlexEntity.init();
			OrangeEntity.init();
			AttackWuneyaMeowsEntity.init();
			BlankCatEntity.init();
			SculkCatEntity.init();
			FlyingStormyEntity.init();
			CorruptedBlankCatEntity.init();
			FlyingLunaEntity.init();
			FlyingSirMeowsEntity.init();
			FlyingWuneyaKittyMeowsEntity.init();
			FlyingRedEntity.init();
			FlyingCatGodEntity.init();
			FlyingWhiteKittyEntity.init();
			CorruptedAlexEntity.init();
			FlyingAlexEntity.init();
			CorruptSirKittyEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(STORMY.get(), StormyEntity.createAttributes().build());
		event.put(LUNA.get(), LunaEntity.createAttributes().build());
		event.put(SIR_MEOWS.get(), SirMeowsEntity.createAttributes().build());
		event.put(WUNEYA_KITTY_MEOWS.get(), WuneyaKittyMeowsEntity.createAttributes().build());
		event.put(RED.get(), RedEntity.createAttributes().build());
		event.put(CAT_GOD.get(), CatGodEntity.createAttributes().build());
		event.put(WHITE_KITTY.get(), WhiteKittyEntity.createAttributes().build());
		event.put(CORRUPTED_SIR_MEOWS.get(), CorruptedSirMeowsEntity.createAttributes().build());
		event.put(CORRUPTED_LUNA.get(), CorruptedLunaEntity.createAttributes().build());
		event.put(CORRUPTED_STORMY.get(), CorruptedStormyEntity.createAttributes().build());
		event.put(CORRUPTED_WHITE_KITTY.get(), CorruptedWhiteKittyEntity.createAttributes().build());
		event.put(SIR_KITTY.get(), SirKittyEntity.createAttributes().build());
		event.put(CORRUPTED_WUNEYA_MEOWS.get(), CorruptedWuneyaMeowsEntity.createAttributes().build());
		event.put(ALEX.get(), AlexEntity.createAttributes().build());
		event.put(ORANGE.get(), OrangeEntity.createAttributes().build());
		event.put(ATTACK_WUNEYA_MEOWS.get(), AttackWuneyaMeowsEntity.createAttributes().build());
		event.put(BLANK_CAT.get(), BlankCatEntity.createAttributes().build());
		event.put(SCULK_CAT.get(), SculkCatEntity.createAttributes().build());
		event.put(FLYING_STORMY.get(), FlyingStormyEntity.createAttributes().build());
		event.put(CORRUPTED_BLANK_CAT.get(), CorruptedBlankCatEntity.createAttributes().build());
		event.put(FLYING_LUNA.get(), FlyingLunaEntity.createAttributes().build());
		event.put(FLYING_SIR_MEOWS.get(), FlyingSirMeowsEntity.createAttributes().build());
		event.put(FLYING_WUNEYA_KITTY_MEOWS.get(), FlyingWuneyaKittyMeowsEntity.createAttributes().build());
		event.put(FLYING_RED.get(), FlyingRedEntity.createAttributes().build());
		event.put(FLYING_CAT_GOD.get(), FlyingCatGodEntity.createAttributes().build());
		event.put(FLYING_WHITE_KITTY.get(), FlyingWhiteKittyEntity.createAttributes().build());
		event.put(CORRUPTED_ALEX.get(), CorruptedAlexEntity.createAttributes().build());
		event.put(FLYING_ALEX.get(), FlyingAlexEntity.createAttributes().build());
		event.put(CORRUPT_SIR_KITTY.get(), CorruptSirKittyEntity.createAttributes().build());
	}
}
