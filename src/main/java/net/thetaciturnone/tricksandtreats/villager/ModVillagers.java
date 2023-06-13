package net.thetaciturnone.tricksandtreats.villager;

import com.google.common.collect.ImmutableSet;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.fabricmc.fabric.api.object.builder.v1.villager.VillagerProfessionBuilder;
import net.fabricmc.fabric.api.object.builder.v1.world.poi.PointOfInterestHelper;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.minecraft.world.poi.PointOfInterestType;
import net.thetaciturnone.tricksandtreats.TricksAndTreats;
import net.thetaciturnone.tricksandtreats.block.ModBlocks;
import net.thetaciturnone.tricksandtreats.item.ModItems;

public class ModVillagers {
    public static final PointOfInterestType CONFECTION_POI = registerPOI("confection_poi", ModBlocks.CONFECTIONERS_TABLE);
    public static final PointOfInterestType MARAUD_POI = registerPOI("maraud_poi", ModBlocks.MARAUDERS_TABLE);
    public static final VillagerProfession TRICKER = registerProfession("tricker",
            RegistryKey.of(Registries.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(TricksAndTreats.MOD_ID, "maraud_poi")));
    public static final VillagerProfession TREATER = registerProfession("treater",
            RegistryKey.of(Registries.POINT_OF_INTEREST_TYPE.getKey(), new Identifier(TricksAndTreats.MOD_ID, "confection_poi")));

    public static VillagerProfession registerProfession(String name, RegistryKey<PointOfInterestType> type) {
        return Registry.register(Registries.VILLAGER_PROFESSION, new Identifier(TricksAndTreats.MOD_ID, name),
                VillagerProfessionBuilder.create().id(new Identifier(TricksAndTreats.MOD_ID, name)).workstation(type)
                        .workSound(SoundEvents.ENTITY_VILLAGER_WORK_CLERIC).build());
    }

    public static PointOfInterestType registerPOI(String name, Block block) {
        return PointOfInterestHelper.register(new Identifier(TricksAndTreats.MOD_ID, name),
                1, 1, ImmutableSet.copyOf(block.getStateManager().getStates()));
    }

    public static void registerVillagers() {
        TricksAndTreats.LOGGER.debug("Registering villagers for " + TricksAndTreats.MOD_ID);
    }

    public static void registerTrades() {
        TradeOfferHelper.registerVillagerOffers(TRICKER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.REDSTONE, 8),
                            10, 2, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.AMETHYST_SHARD, 1),
                            new ItemStack(Items.EMERALD, 8),
                            6, 4, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(TRICKER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.GUNPOWDER, 4),
                            6, 4, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.POINTED_DRIPSTONE, 1),
                            new ItemStack(Items.EMERALD, 2),
                            16, 5, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(TRICKER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.DETECTOR_RAIL, 16),
                            new ItemStack(Items.TNT_MINECART, 16),
                            4, 6, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Blocks.COBWEB, 3),
                            new ItemStack(ModBlocks.HANGING_COBWEB, 4),
                            16, 7, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(TRICKER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 48),
                            new ItemStack(ModItems.MASK_OF_THE_ANCIENTS, 1),
                            2, 10, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 48),
                            new ItemStack(ModItems.MASK_OF_THE_CRACKLIN, 1),
                            2, 10, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 48),
                            new ItemStack(ModItems.MASK_OF_THE_HAUNTED, 1),
                            2, 10, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 48),
                            new ItemStack(ModItems.MASK_OF_THE_RECLAIMER, 1),
                            2, 10, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 48),
                            new ItemStack(ModItems.MASK_OF_THE_OUTCAST, 1),
                            2, 10, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 48),
                            new ItemStack(ModItems.MASK_OF_THE_RINGMASTER, 1),
                            2, 10, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 48),
                            new ItemStack(ModItems.MASK_OF_THE_TRICKSTER, 1),
                            2, 10, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 48),
                            new ItemStack(ModItems.MASK_OF_THE_SLASHER, 1),
                            2, 10, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(TRICKER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(ModItems.MASK_OF_THE_ANCIENTS, 1),
                            2, 10, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(ModItems.MASK_OF_THE_CRACKLIN, 1),
                            2, 10, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(ModItems.MASK_OF_THE_HAUNTED, 1),
                            2, 10, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(ModItems.MASK_OF_THE_RECLAIMER, 1),
                            2, 10, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(ModItems.MASK_OF_THE_OUTCAST, 1),
                            2, 10, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(ModItems.MASK_OF_THE_RINGMASTER, 1),
                            2, 10, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(ModItems.MASK_OF_THE_TRICKSTER, 1),
                            2, 10, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(ModItems.MASK_OF_THE_SLASHER, 1),
                            2, 10, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 32),
                            new ItemStack(ModItems.BUTCHERS_KNIFE, 1),
                            2, 10, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(TREATER, 1,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.SWEET_BERRIES, 10),
                            10, 2, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.GLOW_BERRIES, 16),
                            new ItemStack(Items.EMERALD, 2),
                            16, 4, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(TREATER, 2,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(Items.HONEY_BOTTLE, 4),
                            16, 6, 0.02f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.CARAMEL, 16),
                            16, 6, 0.02f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(TREATER, 3,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 4),
                            new ItemStack(ModItems.CHOCOLATE_BAR, 1),
                            10, 6, 0.03f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.APPLE, 8),
                            new ItemStack(ModItems.CARAMEL_APPLE, 8),
                            8, 8, 0.03f
                    )));
                });
        TradeOfferHelper.registerVillagerOffers(TREATER, 4,
                factories -> {
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 16),
                            new ItemStack(ModItems.CARAMEL_CHOCOLATE_BAR, 2),
                            10, 8, 0.04f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 8),
                            new ItemStack(ModItems.LOLLIPOP, 1),
                            4, 8, 0.04f
                    )));
                    factories.add(((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 16),
                            new ItemStack(Items.CAKE, 1),
                            4, 10, 0.04f
                    )));
                });
    }
}
