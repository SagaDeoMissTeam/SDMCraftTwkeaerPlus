package net.sixik.sdmcrtplus.CrT.world;


import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.nbt.ListTag;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.inventory.PlayerEnderChestContainer;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/world/SimpleContainer")
@NativeTypeRegistration(value = SimpleContainer.class, zenCodeName = "mods.sdmcrtplus.world.SimpleContainer")
public class ExpandSimpleContainer {

    @ZenCodeType.Method
    public static ListTag createTag(SimpleContainer simpleContainer){
        return simpleContainer.createTag();
    }

    @ZenCodeType.Method
    public static void fromTag(SimpleContainer playerEnderChestContainer, ListTag tag) {
        playerEnderChestContainer.fromTag(tag);
    }

}
