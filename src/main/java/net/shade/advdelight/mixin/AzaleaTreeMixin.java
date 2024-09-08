package net.shade.advdelight.mixin;

import net.minecraft.server.MinecraftServer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftServer.class)
public class AzaleaTreeMixin {
	@Inject(at = @At("HEAD"), method = "loadWorld")
	private void init(CallbackInfo info) {
		// This code is injected into the start of MinecraftServer.loadWorld()V
		// Just inject into HEAD of Lnet/minecraft/block/entity/JukeboxBlockEntity;startPlaying()V,
		// look how that handles the music playing normally, copy the logic from that and cancel the method if the given conditions are met
	}
}