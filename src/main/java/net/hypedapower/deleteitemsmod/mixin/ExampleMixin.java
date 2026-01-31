package net.hypedapower.deleteitemsmod.mixin;

import net.minecraft.entity.player.PlayerEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(PlayerEntity.class)
public class ExampleMixin {

    @Inject(method = "dropInventory", at = @At("HEAD"), cancellable = true)
    private void deleteItemsAfterDeath(CallbackInfo ci) {
        // Cancel dropping items
        ci.cancel();
    }
}