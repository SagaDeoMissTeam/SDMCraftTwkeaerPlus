package net.sixik.sdmcrtplus.configs;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;

import java.nio.file.Path;

public class ConfigBase {

    public static void init(Path file)
    {
        final CommentedFileConfig configData = CommentedFileConfig.builder(file)
                .sync()
                .autosave()
                .writingMode(WritingMode.REPLACE)
                .build();

        configData.load();
        SPEC.setConfig(configData);
    }

    private static final ForgeConfigSpec.Builder BUILDER = new ForgeConfigSpec.Builder();

    public static final ForgeConfigSpec.BooleanValue RPG_MODULE;
    public static boolean RPG_MODULE_DEFAULT = false;
    private static final String RPG_MODULE_TOOLTIP_NAME = "RPG_MODULE";
    private static final String EN_SHOW_RPG_MODULE_COMMENT =
            "The module is needed only for developers of RPG builds. It adds a variety of methods to do this.";
    private static final String RU_SHOW_RPG_MODULE_COMMENT =
            "Модуль нужный только для разработчиков RPG сборок. Он добавляет множество методов для этого.";


    public static final ForgeConfigSpec.BooleanValue ELEMENTS_MOBS;
    public static boolean ELEMENTS_MOBS_DEFAULT = false;
    private static final String ELEMENTS_MOBS_TOOLTIP_NAME = "ELEMENTS_MOBS";
    private static final String EN_ELEMENTS_MOBS_COMMENT =
            "Includes the ability to create and spawn monsters with your own settings.";
    private static final String RU_ELEMENTS_MOBS_COMMENT =
            "Включает возможность создания и появление монастров с собственными настройками";

    public static final ForgeConfigSpec.BooleanValue BLOCK_SKILL;
    public static boolean BLOCK_SKILL_DEFAULT = false;
    private static final String BLOCK_SKILL_TOOLTIP_NAME = "BLOCK_SKILLS";
    private static final String EN_BLOCK_SKILL_COMMENT =
            "Responsible for all sorts of mechanics related to blocks.";
    private static final String RU_BLOCK_SKILL_COMMENT =
            "Отвечает за всяческие механики связанные с блоками";

    public static final String CATEGORY_COMMON = "rpg_module";

    static {
        BUILDER.push(CATEGORY_COMMON);

        RPG_MODULE = BUILDER
                .comment(EN_SHOW_RPG_MODULE_COMMENT)
                .comment(RU_SHOW_RPG_MODULE_COMMENT)
                .define(RPG_MODULE_TOOLTIP_NAME, RPG_MODULE_DEFAULT);

        ELEMENTS_MOBS = BUILDER
                .comment(EN_ELEMENTS_MOBS_COMMENT)
                .comment(RU_ELEMENTS_MOBS_COMMENT)
                .define(ELEMENTS_MOBS_TOOLTIP_NAME, ELEMENTS_MOBS_DEFAULT);

        BLOCK_SKILL = BUILDER
                .comment(EN_BLOCK_SKILL_COMMENT)
                .comment(RU_BLOCK_SKILL_COMMENT)
                .define(BLOCK_SKILL_TOOLTIP_NAME, BLOCK_SKILL_DEFAULT);

        BUILDER.pop();
    }

    public static final ForgeConfigSpec SPEC = BUILDER.build();
}
