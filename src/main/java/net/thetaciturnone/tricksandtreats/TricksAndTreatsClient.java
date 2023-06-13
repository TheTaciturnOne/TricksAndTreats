package net.thetaciturnone.tricksandtreats;


import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;
import net.thetaciturnone.tricksandtreats.block.ModBlocks;


public class TricksAndTreatsClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.HANGING_COBWEB, RenderLayer.getTranslucent());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.DENSE_COBWEB, RenderLayer.getTranslucent());
    }

}
