package net.sixik.sdmcrtplus.source.sixikrpg.register;

import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimplePreparableReloadListener;
import net.minecraft.util.profiling.ProfilerFiller;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.block.BlockSkillBase;
import net.sixik.sdmcrtplus.CrT.utils.functions.sixikrpg.entity.elements.EntityElementBase;
import net.sixik.sdmcrtplus.Sdmcrtplus;

import java.util.ArrayList;
import java.util.List;

public class EntityRegisters extends SimplePreparableReloadListener<Void> {
    public static final EntityRegisters INSTANCE = new EntityRegisters();
    public static final List<EntityElementBase> ENTITY_ELEMENT_BASES_LIST = new ArrayList<>();
    public static final List<BlockSkillBase> BLOCK_SKILL_BASES_LIST = new ArrayList<>();

    public static BlockSkillBase getOrCreate(BlockSkillBase base){
        if(BLOCK_SKILL_BASES_LIST.contains(base)) return base;
        BLOCK_SKILL_BASES_LIST.add(base);
        return base;
    }

    public static EntityElementBase getOrCreate(EntityElementBase base){
        if(ENTITY_ELEMENT_BASES_LIST.contains(base)) return base;
        ENTITY_ELEMENT_BASES_LIST.add(base);
        return base;
    }

    @Override
    protected Void prepare(ResourceManager p_10796_, ProfilerFiller p_10797_) {
        return null;
    }

    @Override
    protected void apply(Void p_10793_, ResourceManager p_10794_, ProfilerFiller p_10795_) {
        ENTITY_ELEMENT_BASES_LIST.clear();
        BLOCK_SKILL_BASES_LIST.clear();
        Sdmcrtplus.CLIENT_GUI_RESTRICTED.clear();
    }
}
