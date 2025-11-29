package tf.feamc.mod.mixin;

import net.minecraft.client.render.block.entity.ChestBlockEntityRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import tf.feamc.mod.config.Config;

@Mixin(ChestBlockEntityRenderer.class)
public class RenderMixin
{
    @Inject(method = "render", at = @At("HEAD"), cancellable = true)
    private void skipRenderingIfSimplified(CallbackInfo ci) {
        if (Config.simplifiedChest) {
            ci.cancel();
        }
    }
}