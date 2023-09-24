package net.sixik.sdmcrtplus.source.client;

import net.minecraft.client.gui.Font;
import net.minecraft.network.chat.FormattedText;
import net.minecraft.network.chat.Style;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class SDMSuperpositionHandler {

    @OnlyIn(Dist.CLIENT)
    public static String[] wrapString(String string, Font font, int width) {
        List<FormattedText> list = font.getSplitter().splitLines(string, width, Style.EMPTY);
        String[] lines = new String[list.size()];

        for(int i = 0; i < lines.length; ++i) {
            FormattedText text = (FormattedText)list.get(i);
            lines[i] = text.getString();
        }

        return lines;
    }

    @OnlyIn(Dist.CLIENT)
    public static int greatestWidth(Font font, String[] lines) {
        Stream<String> var10000 = Arrays.stream(lines);
        Objects.requireNonNull(font);
        return var10000.mapToInt(font::width).reduce((num1, num2) -> {
            return num1 > num2 ? num1 : num2;
        }).getAsInt();
    }
}
