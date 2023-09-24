package net.sixik.sdmcrtplus.source.lore.client;

import com.mojang.blaze3d.platform.Window;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.Font;
import net.minecraft.client.gui.screens.LevelLoadingScreen;
import net.minecraft.client.gui.screens.ReceivingLevelScreen;
import net.minecraft.client.resources.sounds.SimpleSoundInstance;
import net.minecraft.client.resources.sounds.SoundInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.RenderGuiEvent;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.sixik.sdmcrtplus.source.client.SDMGUIUtils;
import net.sixik.sdmcrtplus.source.client.SDMSuperpositionHandler;
import net.sixik.sdmcrtplus.source.lore.LoreQuote;

import java.util.Objects;

@OnlyIn(Dist.CLIENT)
public class LoreQuoteHandler {

    public static final LoreQuoteHandler INSTANCE = new LoreQuoteHandler();
    private static final RandomSource RANDOM = RandomSource.create();
    private LoreQuote currentQuote = null;
    private long startedPlaying = -1L;
    private int delayTicks = -1;
    private int cdelayTick = -1;
    private boolean shownExperimentalInfo = false;

    private LoreQuoteHandler() {
    }

    private double getPlayTime() {
        long millis = System.currentTimeMillis() - this.startedPlaying;
        return (double)millis / 1000.0;
    }

    public void playQuote(LoreQuote quote, int delayTicks) {
        if (this.currentQuote == null) {
            this.currentQuote = quote;
            this.delayTicks = delayTicks;
        }
    }

    @SubscribeEvent
    public void onPlayerTick(TickEvent.PlayerTickEvent event) {
        if (event.player == Minecraft.getInstance().player && this.delayTicks > 0 && !(Minecraft.getInstance().screen instanceof LevelLoadingScreen) && !(Minecraft.getInstance().screen instanceof ReceivingLevelScreen)) {
            --this.delayTicks;
            if (this.delayTicks == 0) {
                SimpleSoundInstance instance = new SimpleSoundInstance(this.currentQuote.getSound().getLocation(), SoundSource.VOICE, 0.7F, 1.0F, RANDOM, false, 0, SoundInstance.Attenuation.NONE, 0.0, 0.0, 0.0, true);
                Minecraft.getInstance().getSoundManager().play(instance);
                this.startedPlaying = System.currentTimeMillis();
            }
        }
    }

    @SubscribeEvent
    public void onOverlayRender(RenderGuiEvent.Post event) {
        if (Minecraft.getInstance().screen == null && this.currentQuote != null && this.delayTicks <= 0) {
            this.drawQuote(event.getPoseStack(), event.getWindow());
        }
    }

    @SubscribeEvent
    public void onScreenRender(ScreenEvent.Render.Post event) {
        if (this.currentQuote != null && this.delayTicks <= 0) {
            this.drawQuote(event.getPoseStack(), Minecraft.getInstance().getWindow());
            Minecraft.getInstance().getSoundManager().resume();
        }

    }

    private void sendExperimentalInfo(Player player) {
    }

    //!(this.getPlayTime() < 0.05)
    private void drawQuote(PoseStack stack, Window window) {
        if (this.currentQuote.getSubtitles().getDuration() - this.getPlayTime() <= 0.1) {
//            if (LoreQuote.NARRATOR_INTROS.contains(this.currentQuote) && Minecraft.getInstance().player != null) {
//                this.sendExperimentalInfo(Minecraft.getInstance().player);
//            }

            this.currentQuote = null;
            this.startedPlaying = (long)(this.delayTicks = -1);
        } else if (!(this.getPlayTime() < 0.05)) {
                LoreSubtitles subtitles = this.currentQuote.getSubtitles();
                Font font = Minecraft.getInstance().font;
                String[] text = SDMSuperpositionHandler.wrapString(subtitles.getLine(this.getPlayTime()), font, 260);
                int alphaMod = 255;
                if (this.getPlayTime() < 0.5) {
                    alphaMod = (int)((double)alphaMod * (this.getPlayTime() / 0.5));
                } else if (this.currentQuote.getSubtitles().getDuration() - this.getPlayTime() < 0.5) {
                    alphaMod = (int)((double)alphaMod * ((this.currentQuote.getSubtitles().getDuration() - this.getPlayTime()) / 0.5));
                }

                if (alphaMod < 0) {
                    alphaMod = 255;
                }

                int width = window.getGuiScaledWidth() / 2 - SDMSuperpositionHandler.greatestWidth(font, text) / 2;
                int var10000 = window.getGuiScaledHeight() - 70;
                Objects.requireNonNull(font);
                int height = var10000 - (9 + 2) * (text.length - 1);
                stack.pushPose();
                stack.scale(1.0F, 1.0F, 1.0F);
                int toX = width + SDMSuperpositionHandler.greatestWidth(font, text);
                Objects.requireNonNull(font);
                int toY = height + 9 * text.length + 2 * text.length - 1;
                int color1 = 0 | (int)((double)alphaMod * 0.266) << 24;
                int color2 = ChatFormatting.YELLOW.getColor() | alphaMod << 24;
                SDMGUIUtils.drawGradientRect(stack.last().pose(), 0, width - 4, height - 4, toX + 4, toY + 4, color1, color1);
                SDMGUIUtils.drawGradientRect(stack.last().pose(), 0, width - 6, height - 6, toX + 6, toY + 6, color1, color1);
                SDMGUIUtils.drawGradientRect(stack.last().pose(), 0, width - 8, height - 8, toX + 8, toY + 8, color1, color1);
                int counter = 0;
                String[] var16 = text;
                int var17 = text.length;

                for(int var18 = 0; var18 < var17; ++var18) {
                    String line = var16[var18];
                    float var10003 = (float)(window.getGuiScaledWidth() / 2 - font.width(line) / 2);
                    Objects.requireNonNull(font);
                    font.drawShadow(stack, line, var10003, (float)(height + counter * (9 + 2)), color2, true);
                    ++counter;
                }

                stack.popPose();
            }

    }
}
