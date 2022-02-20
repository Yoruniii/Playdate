package net.yoruniii.playdate;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsage;
import net.minecraft.item.Items;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.stat.Stats;
import net.minecraft.util.Identifier;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.RaycastContext;
import net.minecraft.world.World;
import net.yoruniii.playdate.block.ModBlocks;
import net.yoruniii.playdate.block.custom.*;
import net.yoruniii.playdate.block.custom.plush.*;
import net.yoruniii.playdate.block.custom.plush.be.*;
import net.yoruniii.playdate.entity.HappySunEntity;
import net.yoruniii.playdate.entity.LollipopClownEntity;
import net.yoruniii.playdate.entity.PetuniaPigEntity;
import net.yoruniii.playdate.item.ModGroup;
import net.yoruniii.playdate.item.ModItems;
import net.yoruniii.playdate.item.custom.*;
import net.yoruniii.playdate.mixin.ItemAccessor;
import net.yoruniii.playdate.painting.ModPaintings;
import software.bernie.geckolib3.GeckoLib;

public class Playdate implements ModInitializer {

	public static final String MOD_ID = "playdate";

	public static final EntityType<PetuniaPigEntity> PETUNIA_PIG = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MOD_ID, "petunia_pig"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, PetuniaPigEntity::new).dimensions(EntityDimensions.fixed(0.95f, 1.7f)).build());

	public static final EntityType<HappySunEntity> HAPPY_SUN = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MOD_ID, "happy_sun"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, HappySunEntity::new).dimensions(EntityDimensions.fixed(0.85f, 1.95f)).build());

	public static final EntityType<LollipopClownEntity> LOLLIPOP_CLOWN = Registry.register(
			Registry.ENTITY_TYPE,
			new Identifier(MOD_ID, "lollipop_clown"),
			FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, LollipopClownEntity::new).dimensions(EntityDimensions.fixed(1.25f, 2.95f)).build());

	public static BlockEntityType<PetuniaPigToyEntity> PETUNIA_PIG_TOY_ENTITY;
	public static final PetuniaPigToy PETUNIA_PIG_TOY = new PetuniaPigToy(FabricBlockSettings.of(Material.STONE).strength(0.4f).sounds(BlockSoundGroup.STONE).breakByHand(true));
	public static final PetuniaPigToyBlockItem PETUNIA_PIG_TOY_BLOCK_ITEM = new PetuniaPigToyBlockItem(PETUNIA_PIG_TOY, new FabricItemSettings().group(ModGroup.PLAYDATE_GROUP));

	public static BlockEntityType<HappySunToyEntity> HAPPY_SUN_TOY_ENTITY;
	public static final HappySunToy HAPPY_SUN_TOY = new HappySunToy(FabricBlockSettings.of(Material.WOOL).strength(0.4f).sounds(BlockSoundGroup.WOOL).breakByHand(true));
	public static final HappySunToyBlockItem HAPPY_SUN_TOY_BLOCK_ITEM = new HappySunToyBlockItem(HAPPY_SUN_TOY, new FabricItemSettings().group(ModGroup.PLAYDATE_GROUP));

	public static BlockEntityType<LollipopClownToyEntity> LOLLIPOP_CLOWN_TOY_ENTITY;
	public static final LollipopClownToy LOLLIPOP_CLOWN_TOY = new LollipopClownToy(FabricBlockSettings.of(Material.WOOL).strength(0.4f).sounds(BlockSoundGroup.WOOL).breakByHand(true));
	public static final LollipopClownToyBlockItem LOLLIPOP_CLOWN_TOY_BLOCK_ITEM = new LollipopClownToyBlockItem(LOLLIPOP_CLOWN_TOY, new FabricItemSettings().group(ModGroup.PLAYDATE_GROUP));

	public static BlockEntityType<CreeperPlushEntity> CREEPER_PLUSH_ENTITY;
	public static final CreeperPlush CREEPER_PLUSH = new CreeperPlush(FabricBlockSettings.of(Material.WOOL).strength(0.4f).sounds(BlockSoundGroup.WOOL).breakByHand(true));
	public static final CreeperPlushBlockItem CREEPER_PLUSH_BLOCK_ITEM = new CreeperPlushBlockItem(CREEPER_PLUSH, new FabricItemSettings().group(ModGroup.PLAYDATE_GROUP));

	public static BlockEntityType<DinoPlushEntity> DINO_PLUSH_ENTITY;
	public static final DinoPlush DINO_PLUSH = new DinoPlush(FabricBlockSettings.of(Material.WOOL).strength(0.4f).sounds(BlockSoundGroup.WOOL).breakByHand(true));
	public static final DinoPlushBlockItem DINO_PLUSH_BLOCK_ITEM = new DinoPlushBlockItem(DINO_PLUSH, new FabricItemSettings().group(ModGroup.PLAYDATE_GROUP));

	public static BlockEntityType<EndermanPlushEntity> ENDERMAN_PLUSH_ENTITY;
	public static final EndermanPlush ENDERMAN_PLUSH = new EndermanPlush(FabricBlockSettings.of(Material.WOOL).strength(0.4f).sounds(BlockSoundGroup.WOOL).breakByHand(true));
	public static final EndermanPlushBlockItem ENDERMAN_PLUSH_BLOCK_ITEM = new EndermanPlushBlockItem(ENDERMAN_PLUSH, new FabricItemSettings().group(ModGroup.PLAYDATE_GROUP));

	public static BlockEntityType<HappySunPlushEntity> HAPPY_SUN_PLUSH_ENTITY;
	public static final HappySunPlush HAPPY_SUN_PLUSH = new HappySunPlush(FabricBlockSettings.of(Material.WOOL).strength(0.4f).sounds(BlockSoundGroup.WOOL).breakByHand(true));
	public static final HappySunPlushBlockItem HAPPY_SUN_PLUSH_BLOCK_ITEM = new HappySunPlushBlockItem(HAPPY_SUN_PLUSH, new FabricItemSettings().group(ModGroup.PLAYDATE_GROUP));

	public static BlockEntityType<LollipopClownPlushEntity> LOLLIPOP_CLOWN_PLUSH_ENTITY;
	public static final LollipopClownPlush LOLLIPOP_CLOWN_PLUSH = new LollipopClownPlush(FabricBlockSettings.of(Material.WOOL).strength(0.4f).sounds(BlockSoundGroup.WOOL).breakByHand(true));
	public static final LollipopClownPlushBlockItem LOLLIPOP_CLOWN_PLUSH_BLOCK_ITEM = new LollipopClownPlushBlockItem(LOLLIPOP_CLOWN_PLUSH, new FabricItemSettings().group(ModGroup.PLAYDATE_GROUP));

	public static BlockEntityType<PetuniaPigPlushEntity> PETUNIA_PIG_PLUSH_ENTITY;
	public static final PetuniaPigPlush PETUNIA_PIG_PLUSH = new PetuniaPigPlush(FabricBlockSettings.of(Material.WOOL).strength(0.4f).sounds(BlockSoundGroup.WOOL).breakByHand(true));
	public static final PetuniaPigPlushBlockItem PETUNIA_PIG_PLUSH_BLOCK_ITEM = new PetuniaPigPlushBlockItem(PETUNIA_PIG_PLUSH, new FabricItemSettings().group(ModGroup.PLAYDATE_GROUP));

	public static BlockEntityType<RubberDuckyEntity> RUBBER_DUCKY_ENTITY;
	public static final RubberDucky RUBBER_DUCKY = new RubberDucky(FabricBlockSettings.of(Material.WOOL).strength(0.4f).sounds(BlockSoundGroup.SLIME).breakByHand(true));
	public static final RubberDuckyBlockItem RUBBER_DUCKY_BLOCK_ITEM = new RubberDuckyBlockItem(RUBBER_DUCKY, new FabricItemSettings().group(ModGroup.PLAYDATE_GROUP));

	public static BlockEntityType<ToadstoolStudiosPlushEntity> TOADSTOOL_STUDIOS_PLUSH_ENTITY;
	public static final ToadstoolStudiosPlush TOADSTOOL_STUDIOS_PLUSH = new ToadstoolStudiosPlush(FabricBlockSettings.of(Material.WOOL).strength(0.4f).sounds(BlockSoundGroup.WOOL).breakByHand(true));
	public static final ToadstoolStudiosPlushBlockItem TOADSTOOL_STUDIOS_PLUSH_BLOCK_ITEM = new ToadstoolStudiosPlushBlockItem(TOADSTOOL_STUDIOS_PLUSH, new FabricItemSettings().group(ModGroup.PLAYDATE_GROUP));

	public static BlockEntityType<WheeliePupEntity> WHEELIE_PUP_ENTITY;
	public static final WheeliePup WHEELIE_PUP = new WheeliePup(FabricBlockSettings.of(Material.WOOD).strength(0.4f).sounds(BlockSoundGroup.WOOD).breakByHand(true));
	public static final WheeliePupBlockItem WHEELIE_PUP_BLOCK_ITEM = new WheeliePupBlockItem(WHEELIE_PUP, new FabricItemSettings().group(ModGroup.PLAYDATE_GROUP));

	public static BlockEntityType<ZombiePlushEntity> ZOMBIE_PLUSH_ENTITY;
	public static final ZombiePlush ZOMBIE_PLUSH = new ZombiePlush(FabricBlockSettings.of(Material.WOOL).strength(0.4f).sounds(BlockSoundGroup.WOOL).breakByHand(true));
	public static final ZombiePlushBlockItem ZOMBIE_PLUSH_BLOCK_ITEM = new ZombiePlushBlockItem(ZOMBIE_PLUSH, new FabricItemSettings().group(ModGroup.PLAYDATE_GROUP));


	@Override
	public void onInitialize() {

		GeckoLib.initialize();

		ModBlocks.registerModBlocks();

		Registry.register(Registry.BLOCK, new Identifier("playdate:creeper_plush"), CREEPER_PLUSH);
		Registry.register(Registry.ITEM, new Identifier("playdate:creeper_plush"), CREEPER_PLUSH_BLOCK_ITEM);
		CREEPER_PLUSH_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "playdate:creeper_plush_entity", FabricBlockEntityTypeBuilder.create(CreeperPlushEntity::new, CREEPER_PLUSH).build(null));

		Registry.register(Registry.BLOCK, new Identifier("playdate:dino_plush"), DINO_PLUSH);
		Registry.register(Registry.ITEM, new Identifier("playdate:dino_plush"), DINO_PLUSH_BLOCK_ITEM);
		DINO_PLUSH_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "playdate:dino_plush_entity", FabricBlockEntityTypeBuilder.create(DinoPlushEntity::new, DINO_PLUSH).build(null));

		Registry.register(Registry.BLOCK, new Identifier("playdate:enderman_plush"), ENDERMAN_PLUSH);
		Registry.register(Registry.ITEM, new Identifier("playdate:enderman_plush"), ENDERMAN_PLUSH_BLOCK_ITEM);
		ENDERMAN_PLUSH_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "playdate:enderman_plush_entity", FabricBlockEntityTypeBuilder.create(EndermanPlushEntity::new, ENDERMAN_PLUSH).build(null));

		Registry.register(Registry.BLOCK, new Identifier("playdate:happy_sun_plush"), HAPPY_SUN_PLUSH);
		Registry.register(Registry.ITEM, new Identifier("playdate:happy_sun_plush"), HAPPY_SUN_PLUSH_BLOCK_ITEM);
		HAPPY_SUN_PLUSH_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "playdate:happy_sun_plush_entity", FabricBlockEntityTypeBuilder.create(HappySunPlushEntity::new, HAPPY_SUN_PLUSH).build(null));

		Registry.register(Registry.BLOCK, new Identifier("playdate:lollipop_clown_plush"), LOLLIPOP_CLOWN_PLUSH);
		Registry.register(Registry.ITEM, new Identifier("playdate:lollipop_clown_plush"), LOLLIPOP_CLOWN_PLUSH_BLOCK_ITEM);
		LOLLIPOP_CLOWN_PLUSH_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "playdate:lollipop_clown_plush_entity", FabricBlockEntityTypeBuilder.create(LollipopClownPlushEntity::new, LOLLIPOP_CLOWN_PLUSH).build(null));

		Registry.register(Registry.BLOCK, new Identifier("playdate:petunia_pig_plush"), PETUNIA_PIG_PLUSH);
		Registry.register(Registry.ITEM, new Identifier("playdate:petunia_pig_plush"), PETUNIA_PIG_PLUSH_BLOCK_ITEM);
		PETUNIA_PIG_PLUSH_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "playdate:petunia_pig_plush_entity", FabricBlockEntityTypeBuilder.create(PetuniaPigPlushEntity::new, PETUNIA_PIG_PLUSH).build(null));

		Registry.register(Registry.BLOCK, new Identifier("playdate:rubber_ducky"), RUBBER_DUCKY);
		Registry.register(Registry.ITEM, new Identifier("playdate:rubber_ducky"), RUBBER_DUCKY_BLOCK_ITEM);
		RUBBER_DUCKY_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "playdate:rubber_ducky_entity", FabricBlockEntityTypeBuilder.create(RubberDuckyEntity::new, RUBBER_DUCKY).build(null));

		Registry.register(Registry.BLOCK, new Identifier("playdate:toadstool_studios_plush"), TOADSTOOL_STUDIOS_PLUSH);
		Registry.register(Registry.ITEM, new Identifier("playdate:toadstool_studios_plush"), TOADSTOOL_STUDIOS_PLUSH_BLOCK_ITEM);
		TOADSTOOL_STUDIOS_PLUSH_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "playdate:toadstool_studios_plush_entity", FabricBlockEntityTypeBuilder.create(ToadstoolStudiosPlushEntity::new, TOADSTOOL_STUDIOS_PLUSH).build(null));

		Registry.register(Registry.BLOCK, new Identifier("playdate:wheelie_pup"), WHEELIE_PUP);
		Registry.register(Registry.ITEM, new Identifier("playdate:wheelie_pup"), WHEELIE_PUP_BLOCK_ITEM);
		WHEELIE_PUP_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "playdate:wheelie_pup_entity", FabricBlockEntityTypeBuilder.create(WheeliePupEntity::new, WHEELIE_PUP).build(null));

		Registry.register(Registry.BLOCK, new Identifier("playdate:zombie_plush"), ZOMBIE_PLUSH);
		Registry.register(Registry.ITEM, new Identifier("playdate:zombie_plush"), ZOMBIE_PLUSH_BLOCK_ITEM);
		ZOMBIE_PLUSH_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "playdate:zombie_plush_entity", FabricBlockEntityTypeBuilder.create(ZombiePlushEntity::new, ZOMBIE_PLUSH).build(null));


		Registry.register(Registry.BLOCK, new Identifier("playdate:petunia_pig_toy"), PETUNIA_PIG_TOY);
		Registry.register(Registry.ITEM, new Identifier("playdate:petunia_pig_toy"), PETUNIA_PIG_TOY_BLOCK_ITEM);
		PETUNIA_PIG_TOY_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "playdate:petunia_pig_toy_entity", FabricBlockEntityTypeBuilder.create(PetuniaPigToyEntity::new, PETUNIA_PIG_TOY).build(null));
		FabricDefaultAttributeRegistry.register(PETUNIA_PIG, PetuniaPigEntity.createHostileAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 60).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 4).add(EntityAttributes.GENERIC_FOLLOW_RANGE, 60).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.27));

		Registry.register(Registry.BLOCK, new Identifier("playdate:happy_sun_toy"), HAPPY_SUN_TOY);
		Registry.register(Registry.ITEM, new Identifier("playdate:happy_sun_toy"), HAPPY_SUN_TOY_BLOCK_ITEM);
		HAPPY_SUN_TOY_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "playdate:happy_sun_toy_entity", FabricBlockEntityTypeBuilder.create(HappySunToyEntity::new, HAPPY_SUN_TOY).build(null));
		FabricDefaultAttributeRegistry.register(HAPPY_SUN, HappySunEntity.createHostileAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 100).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 8).add(EntityAttributes.GENERIC_FOLLOW_RANGE, 60).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3));

		Registry.register(Registry.BLOCK, new Identifier("playdate:lollipop_clown_toy"), LOLLIPOP_CLOWN_TOY);
		Registry.register(Registry.ITEM, new Identifier("playdate:lollipop_clown_toy"), LOLLIPOP_CLOWN_TOY_BLOCK_ITEM);
		LOLLIPOP_CLOWN_TOY_ENTITY = Registry.register(Registry.BLOCK_ENTITY_TYPE, "playdate:lollipop_clown_toy_entity", FabricBlockEntityTypeBuilder.create(LollipopClownToyEntity::new, LOLLIPOP_CLOWN_TOY).build(null));
		FabricDefaultAttributeRegistry.register(LOLLIPOP_CLOWN, LollipopClownEntity.createHostileAttributes().add(EntityAttributes.GENERIC_MAX_HEALTH, 80).add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 6).add(EntityAttributes.GENERIC_FOLLOW_RANGE, 60).add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.325));

		ModPaintings.registerPaintings();

		ModItems.registerModItems();

		UseItemCallback.EVENT.register((player, world, hand) -> {
			ItemStack stack = player.getStackInHand(hand);
			if (stack.isOf(Items.GLASS_BOTTLE)) {
				HitResult result = ItemAccessor.invokeRaycast(world, player, RaycastContext.FluidHandling.SOURCE_ONLY);

				if (result.getType().equals(HitResult.Type.BLOCK) && result instanceof BlockHitResult blockResult) {
					var blockPos = blockResult.getBlockPos();
					if (world.getBlockState(blockPos).isOf(Blocks.SOUL_SAND)) {
						world.playSound(player, player.getX(), player.getY(), player.getZ(), SoundEvents.BLOCK_SOUL_SAND_BREAK, SoundCategory.NEUTRAL, 1, 1);
						world.setBlockState(blockPos, Blocks.SOUL_SOIL.getDefaultState());
						world.playSound(player, blockPos, SoundEvents.AMBIENT_SOUL_SAND_VALLEY_ADDITIONS, SoundCategory.NEUTRAL, 1, 1);
						player.incrementStat(Stats.USED.getOrCreateStat(stack.getItem()));
						return TypedActionResult.success(ItemUsage.exchangeStack(stack, player, new ItemStack(ModItems.BOTTLED_SOUL)));
					}
				}
			}

			return TypedActionResult.pass(stack);
		});

	}
}
