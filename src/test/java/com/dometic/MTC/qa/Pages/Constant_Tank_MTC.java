package com.dometic.MTC.qa.Pages;

public class Constant_Tank_MTC {
    // ---------------------Accesibility_Id-----------------------//
    public static final String mtc_Tank_Title_Access_ID = "com.dometicapp:id/header-TitleText";
    public static final String mtc_Tank_Alert_Tank_Level_Above_Access_ID = "com.dometicapp:id/Tank-alertTankLevelAbove-cardTitle";
    public static final String mtc_Tank_Alert_Tank_Level_Below_Access_ID = "com.dometicapp:id/Tank-alertTankLevelAbove-cardTitle";
    public static final String mtc_Tank_Warning_Tank_Level_Above_Access_ID = "com.dometicapp:id/Tank-warningTankLevelAbove-cardTitle";
    public static final String mtc_Tank_Warning_Tank_Level_Below_Access_ID = "com.dometicapp:id/Tank-warningTankLevelAbove-cardTitle";
    public static final String mtc_Tank_Alert_Tank_level_applied_value_Access_id = "com.dometicapp:id/Tank-alertTankLevelAbove-cardSubText";
    public static final String mtc_Tank_Alert_Set_Latency_access_id = "com.dometicapp:id/Tank-alertSetLatency-cardSubText";
    public static final String mtc_Tank_Warning_Tank_Level_Applied_Value_access_id = "com.dometicapp:id/Tank-warningTankLevelAbove-cardSubText";
    public static final String mtc_Tank_Warning_Set_Latency_Applied_Value_access_id = "com.dometicapp:id/Tank-warningSetLatency-cardSubText";
    public static final String mtc_Tank_Grey_Water_Access_Id = "com.dometicapp:id/Tank-circleCarousel-tankName-text-1";
    public static final String mtc_Tank_Black_Water_Access_Id = "com.dometicapp:id/Tank-circleCarousel-tankName-text-2";
    public static final String Mtc_Tank_fresh_accessid = "com.dometicapp:id/tile-tanks-mainCardSubText-0";
    public static final String Mtc_Tank_Pump_Grey_accessid = "com.dometicapp:id/tile-tanks-mainCardSubText-1";
    public static final String Mtc_Tank_Pump_Black_accessid = "com.dometicapp:id/tile-tanks-mainCardSubText-2";
    public static final String Mtc_Tank_tile_text_accessid = "com.dometicapp:id/tile-tanks-titleView";
    //---------------------------xPath----------------------------//
    public static final String mtc_Tank_Tile_Xpath = "//*[contains(@text,'Tank')]";
    public static final String mtc_Tank_Alerts_Tank_Level_Above_xpath = "(//*[contains(@text,'Tank Level ')])[1]";
    public static final String mtc_Tank_Alerts_Set_Latency_xpath = "(//*[@text='Latency'])[1]";
    public static final String mtc_Tank_Warnings_Tank_Level_Above_xpath = "(//*[contains(@text,'Tank Level ')])[2]";
    public static final String mtc_Tank_Warnings_Set_Latency_xpath = "(//*[@text='Latency'])[2]";
    public static final String mtc_Tank_AlertsText_xpath = "//*[@text='Alert']";
    public static final String mtc_Tank_Alerts_toggle_xpath = "//*[@content-desc='com.dometicapp:id/Tank-alerts-switchComponent']";
    public static final String mtc_Tank_Alerts_Status_Text_xpath = "(//*[@text='OFF'])[1]";
    public static final String mtc_Tank_WarningsText_xpath = "//*[@text='Warning']";
    public static final String mtc_Tank_Warnings_toggle_xpath = "//*[@content-desc='com.dometicapp:id/Tank-warning-switchComponent']";
    public static final String mtc_Tank_Warnings_Status_Text_xpath = "(//*[@text='OFF'])[1]";
    public static final String mtc_Tank_Alerts_Apply_xpath = "//*[@text='Apply']";
    public static final String mtc_Tank_Alerts_Tank_Level_Above_FirstValue_xpath = "(//*[@content-desc='com.dometicapp:id/Tank-alertTankLevelAbove-carousalValue']//following::android.widget.TextView)[1]";
    public static final String mtc_Tank_Alerts_Tank_Level_Above_SecondValue_xpath = "(//*[@content-desc='com.dometicapp:id/Tank-alertTankLevelAbove-carousalValue']//following::android.widget.TextView)[3]";
    public static final String mtc_Tank_Alerts_Tank_Level_Above_ThirdValue_xpath = "(//*[@content-desc='com.dometicapp:id/Tank-alertTankLevelAbove-carousalValue']//following::android.widget.TextView)[5]";
    public static final String mtc_Tank_Alerts_Tank_Level_Above_Updated_Value_xpath = "((//*[contains(@text,'Tank Level ')])[1]//following::android.widget.TextView)[1]";
    public static final String mtc_Tank_Alerts_Set_Latency_FirstValue_xpath = "(//*[@content-desc='com.dometicapp:id/Tank-alertSetLatency-carousalValue']//following::android.widget.TextView)[1]";
    public static final String mtc_Tank_Alerts_Set_Latency_SecondValue_xpath = "(//*[@content-desc='com.dometicapp:id/Tank-alertSetLatency-carousalValue']//following::android.widget.TextView)[3]";
    public static final String mtc_Tank_Alerts_Set_Latency_ThirdValue_xpath = "(//*[@content-desc='com.dometicapp:id/Tank-alertSetLatency-carousalValue']//following::android.widget.TextView)[5]";
    public static final String mtc_Tank_Alerts_Set_Latency_Updated_Value_xpath = "(//*[@text='Latency']//following::android.widget.TextView)[1]";
    public static final String mtc_Batteries_Warnings_Tank_Level_Above_FirstValue_xpath = "(//*[@content-desc='com.dometicapp:id/Tank-warningTankLevelAbove-carousalValue']//following::android.widget.TextView)[1]";
    public static final String mtc_Batteries_Warnings_Tank_Level_Above_SecondValue_xpath = "(//*[@content-desc='com.dometicapp:id/Tank-warningTankLevelAbove-carousalValue']//following::android.widget.TextView)[3]";
    public static final String mtc_Batteries_Warnings_Tank_Level_Above_ThirdValue_xpath = "(//*[@content-desc='com.dometicapp:id/Tank-warningTankLevelAbove-carousalValue']//following::android.widget.TextView)[5]";
    public static final String mtc_Batteries_Warnings_Tank_Level_Above_Updated_Value_xpath = "((//*[contains(@text,'Tank Level ')])[2]//following::android.widget.TextView)[1]";
    public static final String mtc_Batteries_Warnings_Set_Latency_FirstValue_xpath = "(//*[@content-desc='com.dometicapp:id/Tank-warningSetLatency-carousalValue']//following::android.widget.TextView)[1]";
    public static final String mtc_Batteries_Warnings_Set_Latency_Below_SecondValue_xpath = "(//*[@content-desc='com.dometicapp:id/Tank-warningSetLatency-carousalValue']//following::android.widget.TextView)[3]";
    public static final String mtc_Batteries_Warnings_Set_Latency_ThirdValue_xpath = "(//*[@content-desc='com.dometicapp:id/Tank-warningSetLatency-carousalValue']//following::android.widget.TextView)[5]";
    public static final String mtc_Batteries_Warnings_Set_Latency_Updated_Value_xpath = "((//*[@text='Latency'])[2]//following::android.widget.TextView)[1]";
    //---------------------------Data----------------------------//
    public static final String mtc_Tank = "TANKS";
    public static final String mtc_Tank_toggle_Status = "OFF";
    public static final String mtc_Tank_AlertsText = "Alert";
    public static final String mtc_Tank_WarningsText = "Warning";
    public static final String mtc_Tank_Alerts_Tank_Level_Above = "Tank Level Above";
    public static final String mtc_Tank_Alerts_Tank_Level_Below = "Tank Level Below";
    public static final String mtc_Tank_Alerts_Set_Latency = "Latency";
    public static final String mtc_Tank_Grey_Water_Text = "Grey Water";
    public static final String mtc_Tank_Black_Water_Text = "Black Water";
    public static final String mtc_freshtank_Text = "Fresh";
    public static final String mtc_greytank_text = "Grey";
    public static final String mtc_Black_Text = "Black";

}
