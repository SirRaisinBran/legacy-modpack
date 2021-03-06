package net.sirraisinbran.legacy.world.configured_features;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.sirraisinbran.legacy.world.placed_features.OtherworldPlacedFeatures;

import java.util.List;

import static net.sirraisinbran.legacy.LegacyMod.locate;

@SuppressWarnings("unused")
public class OtherworldConfiguredFeatures {

    protected static <FC extends FeatureConfig, F extends Feature<FC>> RegistryEntry<ConfiguredFeature<FC, ?>> register(String id, F feature, FC featureConfig) {
        return register(BuiltinRegistries.CONFIGURED_FEATURE, id, new ConfiguredFeature<>(feature, featureConfig));
    }

    private static <V extends T, T> RegistryEntry<V> register(Registry<T> registry, String id, V value) {
        return (RegistryEntry<V>) BuiltinRegistries.<T>add(registry, locate(id), value);
    }

    public static void init() {
        OtherworldTreeConfiguredFeatures.init();
    }

    public static class Configs {
        static RandomPatchFeatureConfig blockPatch(int tries, int hSpread, int ySpread, BlockState state){
            return blockPatch(tries, hSpread, ySpread, BlockStateProvider.of(state));
        }
        static RandomPatchFeatureConfig blockPatch(int tries, int hSpread, int ySpread, Block block){
            return blockPatch(tries, hSpread, ySpread, BlockStateProvider.of(block));
        }
        static RandomPatchFeatureConfig blockPatch(int tries, int hSpread, int ySpread, BlockStateProvider provider){
            return new RandomPatchFeatureConfig(
                    tries, hSpread, ySpread,
                    singleBlock(provider, OtherworldPlacedFeatures.ON_SOLID_GROUND)
            );
        }
        static SimpleBlockFeatureConfig singleBlockConfig(BlockStateProvider provider){
            return new SimpleBlockFeatureConfig(provider);
        }
        static SimpleBlockFeatureConfig singleBlockConfig(Block block){
            return singleBlockConfig(BlockStateProvider.of(block));
        }
        static RegistryEntry<PlacedFeature> singleBlock(BlockStateProvider provider){
            return PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, singleBlockConfig(provider));
        }
        static RegistryEntry<PlacedFeature> singleBlock(Block block){
            return singleBlock(BlockStateProvider.of(block));
        }

        static RegistryEntry<PlacedFeature> singleBlock(BlockStateProvider provider, PlacementModifier... modifiers){
            return PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(provider), modifiers);
        }
        static RegistryEntry<PlacedFeature> singleBlock(Block block, PlacementModifier... modifiers){
            return singleBlock(BlockStateProvider.of(block), modifiers);
        }
        protected static <C extends FeatureConfig, F extends Feature<C>> F register(String name, F feature) {
            return Registry.register(Registry.FEATURE, locate(name), feature);
        }
    }
}
