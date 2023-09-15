package net.sixik.sdmcrtplus.CrT.nbt;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.nbt.Tag;
import org.openzen.zencode.java.ZenCodeType;

@ZenRegister
@Document("mods/sdmcrtplus/nbt/Tag")
@NativeTypeRegistration(value = Tag.class, zenCodeName = "mods.sdmcrtplus.nbt.Tag")
public class ExpandTag {

    @ZenCodeType.Method
   public static String toString(Tag tag){
       return tag.toString();
   }

   @ZenCodeType.Method
   public static byte getId(Tag tag){
       return tag.getId();
   }
   @ZenCodeType.Method
   public static String getAsString(Tag tag){
       return tag.getAsString();
   }
   @ZenCodeType.Method
   public static Tag copy(Tag tag){
       return tag.copy();
   }
}
