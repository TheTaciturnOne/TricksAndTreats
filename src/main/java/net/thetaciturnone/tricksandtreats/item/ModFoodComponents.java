package net.thetaciturnone.tricksandtreats.item;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent CARAMEL_APPLE = (new FoodComponent.Builder()).hunger(6).saturationModifier(0.4F).build();
    public static final FoodComponent CARAMEL = (new FoodComponent.Builder()).hunger(4).saturationModifier(0.3F).build();
    public static final FoodComponent CARAMEL_CHOCOLATE_BAR = (new FoodComponent.Builder()).hunger(10).saturationModifier(0.8F).build();
    public static final FoodComponent CHOCOLATE_BAR = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.6F).build();
    public static final FoodComponent LOLLIPOP = (new FoodComponent.Builder()).hunger(8).saturationModifier(0.6F).build();
}
