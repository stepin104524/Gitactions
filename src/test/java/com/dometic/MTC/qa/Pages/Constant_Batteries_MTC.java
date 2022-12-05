package com.dometic.MTC.qa.Pages;

public class Constant_Batteries_MTC {

    // ---------------------Accesibility_Id-----------------------//
    public static final String mtc_Climate_Title_Access_ID="com.dometicapp:id/header-TitleText";
    public static final String mtc_Climate_Tile_Inside_Access_ID="com.dometicapp:id/climate-insideTemp";
    public static final String mtc_Climate_Tile_Outside_Access_ID="com.dometicapp:id/climate-outsideTemp";
    public static final String mtc_Climate_Tile_FanIcon_Access_ID="com.dometicapp:id/climate-fanIcon";
    public static final String mtc_Climate_Tile_FanSpeed_Access_ID="com.dometicapp:id/climate-FanSpeed";
    public static final String mtc_Climate_Tile_AllClimate_toggle_Status_Access_ID="undefined-switchText";
    public static final String mtc_Climate_Tile_AllClimate_toggle_Access_ID="undefined-switchComponent";
    public static final String mtc_Climate_Tile_Power_text_Access_ID="com.dometicapp:id/climate-powerText";
    public static final String mtc_Batteries_Status_Access_ID="com.dometicapp:id/powerScreen-batteryCarousel-batteryStatus";
    public static final String mtc_Batteries_Alerts_Battery_Voltage_BelowText_Aceess_Id="com.dometicapp:id/batteryScreen-alertsBatteryBelowVoltage-cardTitle";
    public static final String mtc_Batteries_Alerts_Battery_Voltage_BelowText_Apply_Access_ID="com.dometicapp:id/waterHeater-applyText";
    public static final String mtc_Batteries_Alerts_Battery_Voltage_BelowText_Maximum_Value_Access_ID="com.dometicapp:id/batteryScreen-alertsBatteryBelowVoltage-carousalItemValue-209";
    public static final String mtc_Batteries_title_template_ID="android:id/title_template";
    public static final String mtc_Batteries_button1_ID="android:id/button1";
    public static final String mtc_Batteries_Header_Text_Access_ID="com.dometicapp:id/header-TitleText";
    public static final String mtc_Alerts_Battery_Voltage_Below_Applied_Value_access_id = "com.dometicapp:id/batteryScreen-alertsBatteryBelowVoltage-cardSubText";
    public static final String mtc_Alerts_SetLatency_Applied_Value_access_id = "com.dometicapp:id/batteryScreen-alertSetLatency-cardSubText";
    public static final String mtc_Warnings_Battery_Voltage_Below_Applied_value_access_id = "com.dometicapp:id/batteryScreen-warningsBatteryBelowVoltage-cardSubText";
    public static final String mtc_Warnings_Set_Latency_Applied_Value_access_id = "com.dometicapp:id/batteryScreen-warningSetLatency-cardSubText";
    public static final String mtc_Batteries_Warnings_Battery_Voltage_BelowText_Aceess_Id="com.dometicapp:id/batteryScreen-warningsBatteryBelowVoltage-cardTitle";
    public static final String LandingPage_MTC_Batteries_portEngine_accessid="com.dometicapp:id/tile-batteries-mainCardSubText-0";
    public static final String LandingPage_MTC_Batteries_stbdEngine_accessid="com.dometicapp:id/tile-batteries-mainCardSubText-1";
    public static final String LandingPage_MTC_Batteries_port_center_Engine_accessid="com.dometicapp:id/tile-batteries-mainCardSubText-2";
    public static final String LandingPage_MTC_Batteries_tile_accessid="com.dometicapp:id/tile-batteries-titleView";
    public static final String mtc_Batteries_Back_Button_Access_ID="com.dometicapp:id/header-leftButton";
    // ---------------------NeededAccesibility_Id-----------------------//
    public static final String mtc_Climate_Tile_AllClimateText_Access_ID="";
    public static final String mtc_Climate_Tile_Power_toggle_Status_Access_ID="";
    public static final String mtc_Climate_Tile_Power_toggle_Access_ID="";

    //---------------------------xPath----------------------------//
    public static final String mtc_Climate_Tile_Title_xpath="//*[@text='CLIMATE']";
    public static final String mtc_Climate_Tile_Inside_xpath="//*[@text='Inside 0°C']";
    public static final String mtc_Climate_Tile_Outside_xpath="//*[@text='Outside _ _°C']";
    public static final String mtc_Climate_Tile_AllClimateText_xpath="//*[@text='All Climate' and @content-desc='undefined-cardTitle']";
    public static final String mtc_Climate_Tile_AllClimate_toggle_Status_xpath="//*[@text='ON' and @content-desc='undefined-switchText']";
    public static final String mtc_Climate_Tile_Zones_Text_xpath="//*[@text='Off/Low/Med/High']";
    public static final String mtc_Batteries_xpath="//*[@text='Batteries']";
    public static final String mtc_Climate_Tile_Power_toggle_Status_xpath="//*[@text='ON']";
    public static final String mtc_Batteries_VoltageGraph_xpath="//*[@text='Voltage Graph']";
    public static final String mtc_Batteries_VoltageGraph_arrow_xpath="(//*[@content-desc='com.dometicapp:id/powerScreen-batteryCarousel-batteryNameCarousel']//following::android.widget.TextView)[2]";
    public static final String mtc_Batteries_VoltageText_xpath="//*[@text='Voltage']";
    public static final String mtc_Batteries_HistoryText_xpath="//*[@text='History']";
    public static final String mtc_Batteries_HOURText_xpath="//*[@text='HOUR']";
    public static final String mtc_Batteries_DAYText_xpath="//*[@text='DAY']";
    public static final String mtc_Batteries_WEEKText_xpath="//*[@text='WEEK']";
    public static final String mtc_Batteries_AlertsText_xpath="//*[contains(@text,'Alert')]";
    public static final String mtc_Batteries_Alerts_toggle_xpath="//*[@content-desc='com.dometicapp:id/batteryScreen-alertsBattery-switchComponent']";
    public static final String mtc_Batteries_Alerts_Status_Text_xpath="//*[contains(@text,'Alert')]//following::android.widget.TextView[1]";
    public static final String mtc_Batteries_Alerts_Status_On_Text_xpath="(//*[@text='ON'])[1]";
    public static final String mtc_Batteries_MONTHText_xpath="//*[@text='MONTH']";
    public static final String mtc_Batteries_Alerts_Battery_Voltage_BelowText_xpath="(//*[@text='Battery Voltage Below'])[1]";
    public static final String mtc_Batteries_Alerts_Battery_Voltage_BelowText_Apply_xpath="//*[@text='Apply']";
    public static final String mtc_Batteries_Set_LatencyText_xpath="(//*[contains(@text,'Latency')])[1]";
    public static final String mtc_Batteries_WarningsText_xpath="//*[contains(@text,'Warning')]";
    public static final String mtc_Batteries_Warnings_toggle_xpath="//*[@content-desc='com.dometicapp:id/batteryScreen-warningBattery-switchComponent']";
    public static final String mtc_Batteries_Warnings_Status_Text_xpath="//*[contains(@text,'Warning')]//following::android.widget.TextView[1]";
    public static final String mtc_Batteries_Warnings_Status_On_Text_xpath="(//*[@text='ON'])[2]";
    public static final String mtc_Batteries_Warnings_Battery_Voltage_BelowText_xpath="(//*[@text='Battery Voltage Below'])[2]";
    public static final String mtc_Batteries_Warnings_Battery_Voltage_BelowText_Apply_xpath="//*[@text='Apply']";
    public static final String mtc_Batteries_Warnings_Set_LatencyText_xpath="(//*[contains(@text,'Latency')])[2]";
    public static final String mtc_Batteries_Alerts_Battery_Voltage_Below_FirstValue_xpath="(//*[@content-desc='com.dometicapp:id/batteryScreen-alertsBatteryBelowVoltage-carousalValue']//following::android.widget.TextView)[1]";
    public static final String mtc_Batteries_Alerts_Battery_Voltage_Below_SecondValue_xpath="(//*[@content-desc='com.dometicapp:id/batteryScreen-alertsBatteryBelowVoltage-carousalValue']//following::android.widget.TextView)[3]";
    public static final String mtc_Batteries_Alerts_Battery_Voltage_Below_ThirdValue_xpath="(//*[@content-desc='com.dometicapp:id/batteryScreen-alertsBatteryBelowVoltage-carousalValue']//following::android.widget.TextView)[5]";
    public static final String mtc_Batteries_Alerts_Updated_Value_xpath="(//*[@text='Battery Voltage Below']//following::android.widget.TextView)[1]";
    public static final String mtc_Batteries_Alerts_Set_Latency_FirstValue_xpath="(//*[@content-desc='com.dometicapp:id/batteryScreen-alertSetLatency-carousalValue']//following::android.widget.TextView)[1]";
    public static final String mtc_Batteries_Alerts_Set_Latency_SecondValue_xpath="(//*[@content-desc='com.dometicapp:id/batteryScreen-alertSetLatency-carousalValue']//following::android.widget.TextView)[3]";
    public static final String mtc_Batteries_Alerts_Set_Latency_ThirdValue_xpath="(//*[@content-desc='com.dometicapp:id/batteryScreen-alertSetLatency-carousalValue']//following::android.widget.TextView)[5]";
    public static final String mtc_Batteries_Alerts_Set_Latency_Updated_Value_xpath="(//*[@text='Latency']//following::android.widget.TextView)[1]";
    public static final String mtc_Batteries_Warnings_Battery_Voltage_Below_FirstValue_xpath="(//*[@content-desc='com.dometicapp:id/batteryScreen-warningsBatteryBelowVoltage-carousalValue']//following::android.widget.TextView)[1]";
    public static final String mtc_Batteries_Warnings_Battery_Voltage_Below_SecondValue_xpath="(//*[@content-desc='com.dometicapp:id/batteryScreen-warningsBatteryBelowVoltage-carousalValue']//following::android.widget.TextView)[3]";
    public static final String mtc_Batteries_Warnings_Battery_Voltage_Below_ThirdValue_xpath="(//*[@content-desc='com.dometicapp:id/batteryScreen-warningsBatteryBelowVoltage-carousalValue']//following::android.widget.TextView)[5]";
    public static final String mtc_Batteries_Warnings_Battery_Voltage_Below_Updated_Value_xpath="((//*[@text='Battery Voltage Below'])[2]//following::android.widget.TextView)[1]";
    public static final String mtc_Batteries_Warnings_Set_Latency_FirstValue_xpath="(//*[@content-desc='com.dometicapp:id/batteryScreen-warningSetLatency-carousalValue']//following::android.widget.TextView)[1]";
    public static final String mtc_Batteries_Warnings_Set_Latency_Below_SecondValue_xpath="(//*[@content-desc='com.dometicapp:id/batteryScreen-warningSetLatency-carousalValue']//following::android.widget.TextView)[3]";
    public static final String mtc_Batteries_Warnings_Set_Latency_ThirdValue_xpath="(//*[@content-desc='com.dometicapp:id/batteryScreen-warningSetLatency-carousalValue']//following::android.widget.TextView)[5]";
    public static final String mtc_Batteries_Warnings_Set_Latency_Updated_Value_xpath="((//*[@text='Latency'])[2]//following::android.widget.TextView)[1]";
    public static final String mtc_Batteries_title_template_xpath="//*[@resource-id='android:id/title_template']";
    public static final String mtc_Batteries_button1_xpath="//*[@resource-id='android:id/button1']";
    public static final String mtc_Batteries_Alerts_Battery_Voltage_BelowText_Maximum_Value="//*[contains(@content-desc,'com.dometicapp:id/batteryScreen-alertsBatteryBelowVoltage-carousalItemValue-')]";
    public static final String mtc_Batteries_Back_Button_Xpath="";

    //---------------------------Data----------------------------//
    public static final String mtc_Batteries="BATTERIES";
    public static final String mtc_Climate_Tile_Power_toggle_Status="OFF";
    public static final String mtc_Batteries_VoltageGraph_text="Voltage Graph";
    public static final String mtc_Batteries_VoltageText_text="Voltage";
    public static final String mtc_Batteries_HistoryText_text="History";
    public static final String mtc_Batteries_HOURText="HOUR";
    public static final String mtc_Batteries_DAYText_text="DAY";
    public static final String mtc_Batteries_WEEKText_text="WEEK";
    public static final String mtc_Batteries_MONTHText_text="MONTH";
    public static final String mtc_Batteries_AlertsText="Alert";
    public static final String mtc_Batteries_WarningsText="Warning";
    public static final String mtc_Batteries_Alerts_Battery_Voltage_BelowText="Battery Voltage Below";
    public static final String mtc_Batteries_Alerts_Battery_Voltage_BelowText_Apply="Apply";
    public static final String mtc_Batteries_Set_LatencyText="Set Latency";
    public static final String LandingPage_MTC_Batteries_portEngine_Text="Port Engine";
    public static final String LandingPage_MTC_Batteries_stbdEngine_Text="Stbd Engine";
    public static final String LandingPage_MTC_Batteries_port_center_Engine_Text="Port-Center Engine";
}
