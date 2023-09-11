package net.sixik.sdmcrtplus.CrT.utils;

import com.blamejared.crafttweaker.api.annotation.ZenRegister;
import com.blamejared.crafttweaker_annotations.annotations.Document;
import com.blamejared.crafttweaker_annotations.annotations.NativeConstructor;
import com.blamejared.crafttweaker_annotations.annotations.NativeTypeRegistration;
import org.openzen.zencode.java.ZenCodeType;

import java.util.Date;

@ZenRegister
@Document("mods/sdmcrtplus/utils/Data")
@NativeTypeRegistration(value = Date.class, zenCodeName = "mods.sdmcrtplus.utils.Data", constructors = {@NativeConstructor({})})
public class ExpandData {


    /**
     Returns the number of seconds past the minute represented by this date. The value returned is between 0 and 59;
     * @param data
     */
    @ZenCodeType.Method
    public static int getSeconds(Date data){
        return data.getSeconds();
    }

    /**
     Returns the number of minutes past the hour represented by this date, as interpreted in the local time zone. The value returned is between 0 and 59.
     */
    @ZenCodeType.Method
    @ZenCodeType.Getter("minutes")
    public static int getMinutes(Date data){
        return data.getMinutes();
    }

    /**
     Returns the hour represented by this Date object. The returned value is a number (0 through 23) representing the hour within the day that contains or begins with the instant in time represented by this Date object, as interpreted in the local time zone.
     */
    @ZenCodeType.Method
    @ZenCodeType.Getter("hours")
    public static int getHours(Date data){
        return data.getHours();
    }
    /**
     Returns the day of the week represented by this date. The returned value (0 = Sunday, 1 = Monday, 2 = Tuesday, 3 = Wednesday, 4 = Thursday, 5 = Friday, 6 = Saturday) represents the day of the week that contains or begins with the instant in time represented by this Date object, as interpreted in the local time zone.
     */
    @ZenCodeType.Method
    @ZenCodeType.Getter("day")
    public static int getDay(Date data){
       return data.getDay();
    }

    /**
     Returns a number representing the month that contains or begins with the instant in time represented by this Date object. The value returned is between 0 and 11, with the value 0 representing January.
     */
    @ZenCodeType.Method
    @ZenCodeType.Getter("month")
    public static int getMonth(Date data){
       return data.getMonth();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("year")
    public static int getYear(Date data){
       return data.getYear();
    }
    @ZenCodeType.Method
    @ZenCodeType.Getter("time")
    public static long getTime(Date data){
       return data.getTime();
    }
}
