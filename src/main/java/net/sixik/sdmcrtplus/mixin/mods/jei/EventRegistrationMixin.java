package net.sixik.sdmcrtplus.mixin.mods.jei;

import com.mojang.blaze3d.vertex.PoseStack;
import mezz.jei.forge.events.RuntimeEventSubscriptions;
import mezz.jei.forge.startup.EventRegistration;
import mezz.jei.gui.events.GuiEventHandler;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ContainerScreenEvent;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.fml.ModList;
import net.sixik.sdmcrtplus.source.cinematic.client.ClientHandler;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = EventRegistration.class, remap = false)
public class EventRegistrationMixin {


    @Inject(method = "registerGuiHandler", at = @At(value = "HEAD"), cancellable = true)
    private static void get(RuntimeEventSubscriptions subscriptions, GuiEventHandler guiEventHandler, CallbackInfo ci){
        ci.cancel();
        subscriptions.register(ScreenEvent.Init.Post.class, (event) -> {
            Screen screen = event.getScreen();
            if(!ClientHandler.isOpen)
                guiEventHandler.onGuiInit(screen);
        });
        subscriptions.register(ScreenEvent.Opening.class, (event) -> {
            Screen screen = event.getScreen();
            if(!ClientHandler.isOpen)
                guiEventHandler.onGuiOpen(screen);
        });
        subscriptions.register(ScreenEvent.BackgroundRendered.class, (event) -> {
            Screen screen = event.getScreen();
            PoseStack poseStack = event.getPoseStack();
            if(!ClientHandler.isOpen)
                guiEventHandler.onDrawBackgroundPost(screen, poseStack);
        });
        subscriptions.register(ContainerScreenEvent.Render.Foreground.class, (event) -> {
            AbstractContainerScreen<?> containerScreen = event.getContainerScreen();
            PoseStack poseStack = event.getPoseStack();
            int mouseX = event.getMouseX();
            int mouseY = event.getMouseY();
            if(!ClientHandler.isOpen)
                guiEventHandler.onDrawForeground(containerScreen, poseStack, mouseX, mouseY);
        });
        subscriptions.register(ScreenEvent.Render.Post.class, (event) -> {
            Screen screen = event.getScreen();
            PoseStack poseStack = event.getPoseStack();
            int mouseX = event.getMouseX();
            int mouseY = event.getMouseY();
            if(!ClientHandler.isOpen)
                guiEventHandler.onDrawScreenPost(screen, poseStack, mouseX, mouseY);
        });
        subscriptions.register(TickEvent.ClientTickEvent.class, (event) -> {
            if (event.phase == TickEvent.Phase.START) {
                guiEventHandler.onClientTick();
            }

        });
        subscriptions.register(ScreenEvent.RenderInventoryMobEffects.class, (event) -> {
            if (guiEventHandler.renderCompactPotionIndicators()) {
                event.setCompact(true);
            }

        });
    }
}
