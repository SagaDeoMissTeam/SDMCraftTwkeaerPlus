package net.sixik.sdmcrtplus.CrT.utils;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Random;

@ZenRegister
//@Document("mods/sdmcrtplus/utils/Random")
@ZenCodeType.Name("mods.sdmcrtplus.utils.Random")
public class ExpandRandom {
    @ZenCodeType.Method
    public static int nextInt(int num){
        return new Random().nextInt(num);
    }
    @ZenCodeType.Method
    public static int nextInt(){
        return new Random().nextInt();
    }
    @ZenCodeType.Method
    public static int nextInt(int num, int num2){
        return new Random().nextInt(num, num2);
    }
    @ZenCodeType.Method
    public static boolean nextBoolean(){
        return new Random().nextBoolean();
    }
    @ZenCodeType.Method
    public static float nextFloat(){
        return new Random().nextFloat();
    }
    @ZenCodeType.Method
    public static float nextLong(){
        return new Random().nextLong();
    }
    @ZenCodeType.Method
    public static double nextDouble(){
        return new Random().nextDouble();
    }
    @ZenCodeType.Method
    public static double nextDouble(int num){
        return new Random().nextDouble(num);
    }
    @ZenCodeType.Method
    public static double nextDouble(int num, int num2){
        return new Random().nextDouble(num, num2);
    }
}
