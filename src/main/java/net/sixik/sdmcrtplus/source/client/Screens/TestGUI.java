package net.sixik.sdmcrtplus.source.client.Screens;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.Gui;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraftforge.client.gui.overlay.IGuiOverlay;
import net.sixik.sdmcrtplus.Sdmcrtplus;


public class TestGUI {
    private static final ResourceLocation TEXTURE = new ResourceLocation(Sdmcrtplus.MODID, "textures/gui/acacia_boat.png");

    public static final IGuiOverlay HUD = ((Gui, posestack, particle, width, height) -> {
       int x = width / 2;
       int y = height;

        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1, 1,1,1);
        RenderSystem.setShaderTexture(0, TEXTURE);

        for(int i = 0; i < 10; i++){
            GuiComponent.blit(posestack,
                    x - 94 + (i * 9),
                    y - 54,
                    0,
                    0,
                    12,
                    12,
                    12,
                    12);
        }

    });
}
