package net.sixik.sdmcrtplus.CrT.nbt;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.ListTag;
import net.minecraft.nbt.Tag;
import org.openzen.zencode.java.ZenCodeType;

import java.util.List;
import java.util.UUID;

@ZenRegister
@Document("mods/sdmcrtplus/nbt/CompoundTag")
@NativeTypeRegistration(value = CompoundTag.class, zenCodeName = "mods.sdmcrtplus.nbt.CompoundTag", constructors =
@NativeConstructor({}))
public class ExpandCompoundTag {
    @ZenCodeType.Method
    public static CompoundTag copy(CompoundTag compoundTag){
        return compoundTag.copy();
    }
    @ZenCodeType.Method
    public static @ZenCodeType.Nullable Tag getTag(CompoundTag compoundTag, String var1){
        return compoundTag.get(var1);
    }
    @ZenCodeType.Method
    public static Tag put(CompoundTag compoundTag, String var1, Tag tag){
        return compoundTag.put(var1, tag);
    }
    @ZenCodeType.Method
    public static void putByte(CompoundTag compoundTag, String var1, byte var2){
         compoundTag.putByte(var1, var2);
    }
    @ZenCodeType.Method
    public static void putShort(CompoundTag compoundTag, String var1, short var2){
         compoundTag.putShort(var1, var2);
    }
    @ZenCodeType.Method
    public static void putInt(CompoundTag compoundTag, String var1, int var2){
         compoundTag.putInt(var1, var2);
    }
    @ZenCodeType.Method
    public static void putLong(CompoundTag compoundTag, String var1, long var2){
         compoundTag.putLong(var1, var2);
    }
    @ZenCodeType.Method
    public static void putUUID(CompoundTag compoundTag, String var1, String uuid){
         compoundTag.putUUID(var1, UUID.fromString(uuid));
    }
    @ZenCodeType.Method
    public static String getUUID(CompoundTag compoundTag, String var1){
        return compoundTag.getUUID(var1).toString();
    }
    @ZenCodeType.Method
    public static boolean hasUUID(CompoundTag compoundTag, String uuid){
        return compoundTag.hasUUID(uuid);
    }
    @ZenCodeType.Method
    public static void putFloat(CompoundTag compoundTag, String var1, float var2){
         compoundTag.putFloat(var1, var2);
    }
    @ZenCodeType.Method
    public static void putDouble(CompoundTag compoundTag, String var1, double var2){
         compoundTag.putDouble(var1, var2);
    }
    @ZenCodeType.Method
    public static void putString(CompoundTag compoundTag, String var1, String var2){
         compoundTag.putString(var1, var2);
    }
    @ZenCodeType.Method
    public static void putByteArray(CompoundTag compoundTag, String var1, byte[] var2){
         compoundTag.putByteArray(var1, var2);
    }
    @ZenCodeType.Method
    public static void putByteArray(CompoundTag compoundTag, String var1, List<Byte> var2){
         compoundTag.putByteArray(var1, var2);
    }
    @ZenCodeType.Method
    public static void putIntArray(CompoundTag compoundTag, String var1, int[] var2){
         compoundTag.putIntArray(var1, var2);
    }
    @ZenCodeType.Method
    public static void putIntArray(CompoundTag compoundTag, String var1, List<Integer> var2){
         compoundTag.putIntArray(var1, var2);
    }
    @ZenCodeType.Method
    public static void putLongArray(CompoundTag compoundTag, String var1, long[] var2){
         compoundTag.putLongArray(var1, var2);
    }
    @ZenCodeType.Method
    public static void putLongArray(CompoundTag compoundTag, String var1, List<Long> var2){
         compoundTag.putLongArray(var1, var2);
    }
    @ZenCodeType.Method
    public static void putBoolean(CompoundTag compoundTag, String var1, boolean var2){
         compoundTag.putBoolean(var1, var2);
    }
    @ZenCodeType.Method
    public static long getLong(CompoundTag compoundTag, String var1){
        return compoundTag.getLong(var1);
    }
    @ZenCodeType.Method
    public static byte getTagType(CompoundTag compoundTag, String var1){
        return compoundTag.getTagType(var1);
    }
    @ZenCodeType.Method
    public static byte getByte(CompoundTag compoundTag, String var1){
        return compoundTag.getByte(var1);
    }
    @ZenCodeType.Method
    public static boolean getBoolean(CompoundTag compoundTag, String var1){
        return compoundTag.getBoolean(var1);
    }
    @ZenCodeType.Method
    public static short getShort(CompoundTag compoundTag, String var1){
        return compoundTag.getShort(var1);
    }
    @ZenCodeType.Method
    public static int getInt(CompoundTag compoundTag, String var1){
        return compoundTag.getInt(var1);
    }
    @ZenCodeType.Method
    public static float getFloat(CompoundTag compoundTag, String var1){
        return compoundTag.getFloat(var1);
    }
    @ZenCodeType.Method
    public static double getDouble(CompoundTag compoundTag, String var1){
        return compoundTag.getDouble(var1);
    }
    @ZenCodeType.Method
    public static String getString(CompoundTag compoundTag, String var1){
        return compoundTag.getString(var1);
    }
    @ZenCodeType.Method
    public static byte[] getByteArray(CompoundTag compoundTag, String var1){
        return compoundTag.getByteArray(var1);
    }
    @ZenCodeType.Method
    public static int[] getIntArray(CompoundTag compoundTag, String var1){
        return compoundTag.getIntArray(var1);
    }
    @ZenCodeType.Method
    public static ListTag getList(CompoundTag compoundTag, String var1, int var2){
        return compoundTag.getList(var1,var2);
    }
    @ZenCodeType.Method
    public static void remove(CompoundTag compoundTag, String var1){
         compoundTag.remove(var1);
    }
    @ZenCodeType.Method
    public static long[] getLongArray(CompoundTag compoundTag, String var1){
        return compoundTag.getLongArray(var1);
    }
    @ZenCodeType.Method
    public static boolean isEmpty(CompoundTag compoundTag){
        return compoundTag.isEmpty();
    }
    @ZenCodeType.Method
    public static CompoundTag merge(CompoundTag compoundTag, CompoundTag compoundTag2){
        return compoundTag.merge(compoundTag2);
    }
    @ZenCodeType.Method
    public static CompoundTag getCompound(CompoundTag compoundTag,String compound){
        return compoundTag.getCompound(compound);
    }
}
