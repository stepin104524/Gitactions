package com.dometic.MTC.qa.Pages;

public class Constant_BilgePump_MTC {
    // ---------------------Accesibility_Id-----------------------//
    public static final String mtc_Bilge_Pump_Title_Access_ID = "com.dometicapp:id/header-TitleText";
    public static final String mtc_Bilge_Pump_status_Access_ID = "com.test.circleCarousel-statusValue";
    public static final String mtc_Bilge_Pump_Max_Cycles_Per_Hour_Applied_Value_access_id = "com.dometicapp:id/bilgePumpScreen-alertMaxCycleHour-cardSubText";
    public static final String mtc_Bilge_Pump_Max_Daily_Cycles_Applied_Value_access_id = "com.dometicapp:id/bilgePumpScreen-alertMaxCycleDaily-cardSubText";
    public static final String mtc_Bilge_Pump_Continuous_Applied_Value_access_id = "com.dometicapp:id/bilgePumpScreen-alertContinious-cardSubText";
    public static final String mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_Applied_Value_access_id = "com.dometicapp:id/bilgePumpScreen-warningMaxCycleHour-cardSubText";
    public static final String mtc_Bilge_Pump_Warnings_Max_Daily_Cycles_Applied_Value_access_id = "com.dometicapp:id/bilgePumpScreen-warningMaxCycleDaily-cardSubText";
    public static final String mtc_Bilge_Pump_Warnings_Continuous_Applied_Value_access_id = "com.dometicapp:id/bilgePumpScreen-warningContinuous-cardSubText";
    public static final String MTC_BilgePump_Batteries_accessid = "com.dometicapp:id/tile-bilgepump-titleView";
    public static final String Mtc_Bilge_Pump_firstInstance_accessid = "com.dometicapp:id/tile-bilgepump-mainCardSubText-0";
    public static final String Mtc_Bilge_Pump_SecondInstance_accessid = "com.dometicapp:id/tile-bilgepump-mainCardSubText-1";
    public static final String Mtc_Bilge_Pump_ThirdInstance_accessid = "com.dometicapp:id/tile-bilgepump-mainCardSubText-2";
    public static final String mtc_Bilge_Pump_Alert_Max_Cycle_Text_Aceess_Id="com.dometicapp:id/bilgePumpScreen-alertMaxCycleHour-cardTitle";
    public static final String mtc_Bilge_Pump_Warning_Max_Cycle_Text_Aceess_Id="com.dometicapp:id/bilgePumpScreen-warningMaxCycleHour-cardTitle";

    //---------------------------xPath----------------------------//
    public static final String mtc_Bilge_Pump_tile_xpath = "//*[@text='Bilge Pump']";
    public static final String mtc_Bilge_Pump_RunCycles_xpath = "//*[@text='Run cycles']";
    public static final String mtc_Bilge_Pump_RunCyclesGraph_arrow_xpath = "(//*[@text='Run cycles']//following::android.widget.TextView)[1]";
    public static final String mtc_Bilge_Pump_VoltageText_xpath = "//*[@text='Voltage']";
    public static final String mtc_Bilge_Pump_HistoryText_xpath = "//*[@text='History']";
    public static final String mtc_Bilge_Pump_DAYText_xpath = "//*[@text='DAY']";
    public static final String mtc_Bilge_Pump_WEEKText_xpath = "//*[@text='WEEK']";
    public static final String mtc_Bilge_Pump_MONTHText_xpath = "//*[@text='MONTH']";
    public static final String mtc_Bilge_Pump_AlertsText_xpath = "//*[@text='Alerts']";
    public static final String mtc_Bilge_Pump_Alerts_toggle_xpath = "//*[@content-desc='com.dometicapp:id/bilgePumpScreen-alerts-switchComponent']";
    public static final String mtc_Bilge_Pump_Alerts_Status_Text_xpath = "(//*[@text='OFF'])[1]";
    public static final String mtc_Bilge_Pump_WarningsText_xpath = "//*[@text='Warnings']";
    public static final String mtc_Bilge_Pump_Warnings_toggle_xpath = "//*[@content-desc='com.dometicapp:id/bilgePumpScreen-warning-switchComponent']";
    public static final String mtc_Bilge_Pump_Warnings_Status_Text_xpath = "(//*[@text='OFF'])[1]";
    public static final String mtc_Bilge_Pump_Alerts_Warnings_Apply_xpath = "//*[@text='Apply']";
    public static final String mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_xpath = "(//*[contains(@text,'Max Cycle')])[1]";
    public static final String mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_First_Value_Xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-alertMaxCycleHour-carousalValue']//following::android.widget.TextView)[1]";
    public static final String mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_SecondValue_xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-alertMaxCycleHour-carousalValue']//following::android.widget.TextView)[3]";
    public static final String mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_ThirdValue_xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-alertMaxCycleHour-carousalValue']//following::android.widget.TextView)[5]";
    public static final String mtc_Bilge_Pump_Alerts_Max_Cycle_Hour_Updated_Value_xpath = "(//*[@text='Max Cycles/Hour']//following::android.widget.TextView)[1]";
    public static final String mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_xpath = "(//*[contains(@text,'Max Daily')])[1]";
    public static final String mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_First_Value_Xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-alertMaxCycleDaily-carousalValue']//following::android.widget.TextView)[1]";
    public static final String mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_SecondValue_xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-alertMaxCycleDaily-carousalValue']//following::android.widget.TextView)[3]";
    public static final String mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_ThirdValue_xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-alertMaxCycleDaily-carousalValue']//following::android.widget.TextView)[5]";
    public static final String mtc_Bilge_Pump_Alerts_Max_Daily_Cycle_Updated_Value_xpath = "(//*[@text='Max Daily Cycles']//following::android.widget.TextView)[1]";
    public static final String mtc_Bilge_Pump_Alerts_Continuous_xpath = "(//*[@text='Continuous'])[1]";
    public static final String mtc_Bilge_Pump_Alerts_Continuous_First_Value_Xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-alertContinious-carousalValue']//following::android.widget.TextView)[1]";
    public static final String mtc_Bilge_Pump_Alerts_Continuous_SecondValue_xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-alertContinious-carousalValue']//following::android.widget.TextView)[3]";
    public static final String mtc_Bilge_Pump_Alerts_Continuous_ThirdValue_xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-alertContinious-carousalValue']//following::android.widget.TextView)[5]";
    public static final String mtc_Bilge_Pump_Alerts_Continuous_Updated_Value_xpath = "(//*[@text='Continuous']//following::android.widget.TextView)[1]";
    public static final String mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_xpath = "(//*[contains(@text,'Max Cycle')])[2]";
    public static final String mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_First_Value_Xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-warningMaxCycleHour-carousalValue']//following::android.widget.TextView)[1]";
    public static final String mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_SecondValue_xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-warningMaxCycleHour-carousalValue']//following::android.widget.TextView)[3]";
    public static final String mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_ThirdValue_xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-warningMaxCycleHour-carousalValue']//following::android.widget.TextView)[5]";
    public static final String mtc_Bilge_Pump_Warnings_Max_Cycle_Hour_Updated_Value_xpath = "((//*[@text='Max Cycles/Hour'])[2]//following::android.widget.TextView)[1]";
    public static final String mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_xpath = "(//*[contains(@text,'Max Daily')])[2]";
    public static final String mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_First_Value_Xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-warningMaxCycleDaily-carousalValue']//following::android.widget.TextView)[1]";
    public static final String mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_SecondValue_xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-warningMaxCycleDaily-carousalValue']//following::android.widget.TextView)[3]";
    public static final String mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_ThirdValue_xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-warningMaxCycleDaily-carousalValue']//following::android.widget.TextView)[5]";
    public static final String mtc_Bilge_Pump_Warnings_Max_Daily_Cycle_Updated_Value_xpath = "((//*[@text='Max Daily Cycles'])[2]//following::android.widget.TextView)[1]";
    public static final String mtc_Bilge_Pump_Warnings_Continuous_xpath = "(//*[@text='Continuous'])[2]";
    public static final String mtc_Bilge_Pump_Warnings_Continuous_First_Value_Xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-warningContinuous-carousalValue']//following::android.widget.TextView)[1]";
    public static final String mtc_Bilge_Pump_Warnings_Continuous_SecondValue_xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-warningContinuous-carousalValue']//following::android.widget.TextView)[3]";
    public static final String mtc_Bilge_Pump_Warnings_Continuous_ThirdValue_xpath = "(//*[@content-desc='com.dometicapp:id/bilgePumpScreen-warningContinuous-carousalValue']//following::android.widget.TextView)[5]";
    public static final String mtc_Bilge_Pump_Warnings_Continuous_Updated_Value_xpath = "((//*[@text='Continuous'])[2]//following::android.widget.TextView)[1]";
    public static final String mtc_Bilge_Pump_Cycles_Xpath="//*[@text='Cycles']";
    //---------------------------Data----------------------------//
    public static final String mtc_Bilge_Pump = "BILGE PUMP";
    public static final String mtc_Bilge_toggle_Status = "OFF";
    public static final String mtc_Bilge_Pump_Runcycles_text = "Run cycles";
    public static final String mtc_Bilge_Pump_VoltageText_text = "Voltage";
    public static final String mtc_Bilge_Pump_HistoryText_text = "History";
    public static final String mtc_Bilge_Pump_DAYText_text = "DAY";
    public static final String mtc_Bilge_Pump_WEEKText_text = "WEEK";
    public static final String mtc_Bilge_Pump_MONTHText_text = "MONTH";
    public static final String mtc_Bilge_Pump_AlertsText = "Alerts";
    public static final String mtc_Bilge_Pump_WarningsText = "Warnings";
    public static final String mtc_Bilge_Pump_Alerts_Max_Cycle_Hour = "Max Cycles/Hour";
    public static final String mtc_Bilge_Pump_Alerts_Max_Daily_Cycle = "Max Daily Cycles";
    public static final String mtc_Bilge_Pump_Alerts_Continuous = "Continuous";
    public static final String Mtc_Bilge_Pump_firstInstance_Text = "Aft Bilge 1";
    public static final String Mtc_Bilge_Pump_SecondInstance_text = "Fwd Bilge 1";
    public static final String Mtc_Bilge_Pump_ThirdInstance_Text = "Port Bilge";
    public static final String mtc_Bilge_Pump_Cycles="Cycles";
}