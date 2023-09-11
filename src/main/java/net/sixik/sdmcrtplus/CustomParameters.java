package net.sixik.sdmcrtplus;

import net.minecraftforge.event.AddReloadListenerEvent;

public class CustomParameters {

    public static boolean customPerlinNoise = false;
    public static double customPerlinProperty = 0.0d;
    public static double relativePerlinProperty = 0.0d;


    public static void setCustomPerlinNoise(boolean customPerlinNoise2){
        customPerlinNoise = customPerlinNoise2;
    }
    public static void setCustomPerlinNoiseProperty(double customPerlinProperty2){
        customPerlinProperty = customPerlinProperty2;
        setCustomPerlinNoise(true);
    }


    public static void modReload(AddReloadListenerEvent event){
        customPerlinNoise = false;
        customPerlinProperty = 0.0d;
    }

}
