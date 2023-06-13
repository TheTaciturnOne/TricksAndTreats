package net.thetaciturnone.tricksandtreats.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.thetaciturnone.tricksandtreats.TricksAndTreats;
import net.thetaciturnone.tricksandtreats.block.custom.*;

public class ModBlocks {

    public static final Block COMEDIC_PUMPKIN = registerBlock("comedic_pumpkin",
            new ModCarvedPumpkinBlock(AbstractBlock.Settings.of(Material.GOURD, MapColor.ORANGE)
                    .strength(1.0F).sounds(BlockSoundGroup.WOOD)), ItemGroups.NATURAL);
    public static final Block TRAGIC_PUMPKIN = registerBlock("tragic_pumpkin",
            new ModCarvedPumpkinBlock(AbstractBlock.Settings.of(Material.GOURD, MapColor.ORANGE)
                    .strength(1.0F).sounds(BlockSoundGroup.WOOD)), ItemGroups.NATURAL);
    public static final Block HANGING_COBWEB = registerBlock("hanging_cobweb",
            new CobwebBlock(AbstractBlock.Settings.of(Material.COBWEB)
                    .strength(2.0F).noCollision()), ItemGroups.NATURAL);
    public static final Block DENSE_COBWEB = registerBlock("dense_cobweb",
            new DenseCobwebBlock(AbstractBlock.Settings.of(Material.COBWEB)
                    .strength(2.0F).noCollision()), ItemGroups.NATURAL);
    public static final Block CONFECTIONERS_TABLE = registerBlock("confectioners_table",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(2.5F, 6.0F).sounds(BlockSoundGroup.WOOD)), ItemGroups.FUNCTIONAL);
    public static final Block MARAUDERS_TABLE = registerBlock("marauders_table",
            new Block(FabricBlockSettings.of(Material.WOOD)
                    .strength(2.5F, 6.0F).sounds(BlockSoundGroup.WOOD)), ItemGroups.FUNCTIONAL);
    public static final Block VOID_OF_EYES = registerBlock("void_of_eyes",
            new Block(FabricBlockSettings.of(Material.SOLID_ORGANIC)
                    .strength(2.5F, 6.0F).sounds(BlockSoundGroup.NYLIUM)), ItemGroups.BUILDING_BLOCKS);


    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(TricksAndTreats.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        Item item = Registry.register(Registries.ITEM, new Identifier(TricksAndTreats.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(tab).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks () {
        TricksAndTreats.LOGGER.debug("Registering ModBlocks for "+ TricksAndTreats.MOD_ID);
    }
}
