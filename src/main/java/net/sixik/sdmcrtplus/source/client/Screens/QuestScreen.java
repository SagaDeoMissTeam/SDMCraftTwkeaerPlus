package net.sixik.sdmcrtplus.source.client.Screens;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.GuiComponent;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.sixik.sdmcrtplus.Sdmcrtplus;

public class QuestScreen extends Screen {
    public static final QuestScreen test = new QuestScreen("trst");
    private final ResourceLocation backgroundTexture = new ResourceLocation(Sdmcrtplus.MODID, "textures/gui/test.png");

    public QuestScreen(String title) {
        super(Component.literal(title).withStyle(ChatFormatting.GOLD));
    }

    @Override
    protected void init() {
    }

    public void render(PoseStack p_96692_, int p_96693_, int p_96694_, float p_96695_) {
        this.renderBackground(p_96692_);
        RenderSystem.setShaderTexture(0, backgroundTexture);
        drawCenteredString(p_96692_, this.font, this.title, this.width / 2, 20, 16777215);
        super.render(p_96692_, p_96693_, p_96694_, p_96695_);
    }

    private static void onAccept(Button button) {
    }


    @Override
    public boolean isPauseScreen() {
        return false;
    }
}
