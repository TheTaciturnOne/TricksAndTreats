package net.thetaciturnone.tricksandtreats.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.thetaciturnone.tricksandtreats.TricksAndTreats;
import net.thetaciturnone.tricksandtreats.item.custom.LollipopItem;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TricksAndTreats.MOD_ID, name), item);
    }

    public static void registerModItems() {
        TricksAndTreats.LOGGER.debug("Registering mod items for " + TricksAndTreats.MOD_ID);

        addItemsToItemGroups();
    }

    public static final Item MASK_OF_THE_CRACKLIN = registerItem("mask_of_the_cracklin",
            new ArmorItem(ModArmorMaterials.MASK_OF_THE_CRACKLIN, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MASK_OF_THE_RECLAIMER = registerItem("mask_of_the_reclaimer",
            new ArmorItem(ModArmorMaterials.MASK_OF_THE_RECLAIMER, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MASK_OF_THE_HAUNTED = registerItem("mask_of_the_haunted",
            new ArmorItem(ModArmorMaterials.MASK_OF_THE_HAUNTED, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MASK_OF_THE_RINGMASTER = registerItem("mask_of_the_ringmaster",
            new ArmorItem(ModArmorMaterials.MASK_OF_THE_RINGMASTER, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MASK_OF_THE_SLASHER = registerItem("mask_of_the_slasher",
            new ArmorItem(ModArmorMaterials.MASK_OF_THE_SLASHER, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MASK_OF_THE_OUTCAST = registerItem("mask_of_the_outcast",
            new ArmorItem(ModArmorMaterials.MASK_OF_THE_OUTCAST, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MASK_OF_THE_TRICKSTER = registerItem("mask_of_the_trickster",
            new ArmorItem(ModArmorMaterials.MASK_OF_THE_TRICKSTER, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item MASK_OF_THE_ANCIENTS = registerItem("mask_of_the_ancients",
            new ArmorItem(ModArmorMaterials.MASK_OF_THE_ANCIENTS, EquipmentSlot.HEAD,
                    new FabricItemSettings().rarity(Rarity.RARE)));

    public static final Item CARAMEL_APPLE = registerItem("caramel_apple",
            new Item(new FabricItemSettings()
                    .food(ModFoodComponents.CARAMEL_APPLE)));
    public static final Item CARAMEL = registerItem("caramel",
            new Item(new FabricItemSettings()
                    .food(ModFoodComponents.CARAMEL)));
    public static final Item CARAMEL_CHOCOLATE_BAR = registerItem("caramel_chocolate_bar",
            new Item(new FabricItemSettings()
                    .food(ModFoodComponents.CARAMEL_CHOCOLATE_BAR)));
    public static final Item CHOCOLATE_BAR = registerItem("chocolate_bar",
            new Item(new FabricItemSettings()
                    .food(ModFoodComponents.CHOCOLATE_BAR)));
    public static final Item LOLLIPOP = registerItem("lollipop",
            new LollipopItem(new FabricItemSettings().recipeRemainder(Items.STICK)
                    .food(ModFoodComponents.LOLLIPOP).maxCount(1)));

    public static final Item BUTCHERS_KNIFE = registerItem("butchers_knife",
            new SwordItem(ToolMaterials.IRON, 6, -3F,
                    new FabricItemSettings().maxCount(1).rarity(Rarity.UNCOMMON)));

    public static void addItemsToItemGroups() {
        addToItemGroup(ItemGroups.COMBAT, MASK_OF_THE_CRACKLIN);
        addToItemGroup(ItemGroups.COMBAT, MASK_OF_THE_SLASHER);
        addToItemGroup(ItemGroups.COMBAT, MASK_OF_THE_TRICKSTER);
        addToItemGroup(ItemGroups.COMBAT, MASK_OF_THE_RINGMASTER);
        addToItemGroup(ItemGroups.COMBAT, MASK_OF_THE_RECLAIMER);
        addToItemGroup(ItemGroups.COMBAT, MASK_OF_THE_OUTCAST);
        addToItemGroup(ItemGroups.COMBAT, MASK_OF_THE_HAUNTED);
        addToItemGroup(ItemGroups.COMBAT, MASK_OF_THE_ANCIENTS);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, CHOCOLATE_BAR);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, CARAMEL);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, CARAMEL_CHOCOLATE_BAR);
        addToItemGroup(ItemGroups.FOOD_AND_DRINK, CARAMEL_APPLE);
        addToItemGroup(ItemGroups.COMBAT, BUTCHERS_KNIFE);
        addToItemGroup(ItemGroups.COMBAT, BUTCHERS_KNIFE);
    }

    public static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }
}
