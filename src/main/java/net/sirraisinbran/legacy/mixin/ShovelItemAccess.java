package net.sirraisinbran.legacy.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ShovelItem;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Mutable;
import org.spongepowered.asm.mixin.gen.Accessor;

import java.util.Map;

@Mixin(ShovelItem.class)
public interface ShovelItemAccess {

    @Accessor("PATH_STATES")
    static Map<Block, BlockState> getFlattenables() {
        throw new Error("Mixin did not apply");
    }

    @Accessor("PATH_STATES")
    @Mutable
    static void setFlattenables(Map<Block, BlockState> newMap) {
        throw new Error("Mixin did not apply");
    }
}
