package net.sixik.sdmcrtplus.CrT.action.logic;

import com.blamejared.crafttweaker.api.action.base.IRuntimeAction;
import net.sixik.sdmcrtplus.CustomParameters;

public class ActionCustomPerlinNoice implements IRuntimeAction {
    private final double num;

    public ActionCustomPerlinNoice(double num){
        this.num = num;
    }

    @Override
    public void apply() {
        CustomParameters.setCustomPerlinNoiseProperty(this.num);
    }

    @Override
    public String describe() {
        return "Add Custom Perlin Noise. Parameter: " + this.num;
    }
}
