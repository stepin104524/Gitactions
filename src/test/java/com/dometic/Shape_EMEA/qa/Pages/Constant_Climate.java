package com.dometic.Shape_EMEA.qa.Pages;

import com.dometic.Shape_EMEA.qa.util.Baseclass;

public class Constant_Climate extends Baseclass {
    //-----------------Accessibility ID-----------------//
    public static final String Climate_Tile_Temperature_Access_Id = "com.dometicapp:id/tile-climate-mainCardText-0";
    public static final String Climate_Tile_Temperature_Unit_Access_Id = "com.dometicapp:id/tile-climate-cardUnitText-0";
    public static final String Climate_Tile_Temperature_Unit_Sub_Text_Access_Id = "com.dometicapp:id/tile-climate-mainCardSubText-0";
    public static final String Climate_Tile_Maximum_Temperature_In_Celcius_Access_Id = "com.dometicapp:id/ClimateShapeScreen-temperatureCarouselItem-15";
    public static final String Climate_Tile_Minimum_Temperature_In_Celcius_Access_Id = "com.dometicapp:id/ClimateShapeScreen-temperatureCarouselItem-0";
    public static final String Climate_Tile_Temperature_Apply_button_Access_Id = "com.dometicapp:id/climate-applyText";
    public static final String Climate_Tile_Temperature_Back_button_Access_Id = "undefined-header-leftComponent";
    public static final String Climate_Tile_Hamburger_Button_Access_Id = "com.dometicapp:id/header-menuButton";
    public static final String Climate_Tile_App_Settings_Access_Id = "com.dometicapp:id/sidemenu-appSettings-button";
    public static final String Climate_Tile_Fahrenheit_Text_Access_Id = "com.dometicapp:id/setting-fahrenheitText";
    public static final String Climate_Tile_App_Settings_Back_Button_Access_Id = "com.dometicapp:id/tiles-backImage";
    public static final String Climate_Tile_Celcius_Text_Access_Id = "com.dometicapp:id/setting-celsiusText";
    public static final String Onboarded_device_access_id = "com.dometicapp:id/Dashboard-cardText";
    public static final String Climate_Tile_Access_Id = "com.dometicapp:id/tile-climate-titleView";
    public static final String Inside_temp_access_id = "com.dometicapp:id/ClimateShapeScreen-temperatureValueText";
    public static final String Inside_temp_unit_access_id = "com.dometicapp:id/ClimateShapeScreen-temperatureUnitText";
    public static final String Fan_speed_icon_under_temp_access_id = "com.dometicapp:id/ClimateShapeScreen-fanModeIcon";
    public static final String Fan_speed_option_under_temp_access_id = "com.dometicapp:id/ClimateShapeScreen-fanModeText";
    public static final String Power_toggle_access_id = "com.dometicapp:id/ClimateShapeScreen-power";
    public static final String Climate_mode_options_access_id = "com.dometicapp:id/ClimateShapeScreen-climateMode-dropDownButtonText";
    public static final String Fan_speed_options_access_id = "com.dometicapp:id/ClimateShapeScreen-fanSpeed-dropDownButtonText";
    public static final String Sleep_toggle_access_id = "com.dometicapp:id/ClimateShapeScreen-sleep";
    public static final String Internal_toggle_access_id = "com.dometicapp:id/ClimateShapeScreen-internalLight";
    public static final String Internal_brightness_options_access_id = "com.dometicapp:id/ClimateShapeScreen-internalBrightness-dropDownButtonText";
    public static final String Status_togge_access_id = "com.dometicapp:id/ClimateShapeScreen-status";


    //-----------------Xpath-----------------//
    public static final String Climate_Tile_Temperature_In_Celcius_Xpath = "//*[contains(@content-desc,'com.dometicapp:id/ClimateShapeScreen-temperatureCarouselItem-')]";
    public static final String Climate_Tile_Temperature_In_Celcius_1st_Element_Xpath = "(//*[contains(@content-desc,'com.dometicapp:id/ClimateShapeScreen-temperatureCarouselItem-')])[1]";
    public static final String Climate_Tile_Temperature_In_Celcius = "//*[contains(@content-desc,'com.dometicapp:id/ClimateShapeScreen-temperatureCarouselItem-') and @bounds='[362,431][718,749]']";
    public static final String Climate_Tile_Temperature_In_Fahrenheit = "//*[contains(@content-desc,'com.dometicapp:id/ClimateShapeScreen-temperatureCarouselItem-') and @bounds='[362,431][718,749]']";
    public static final String Climate_header_text_xpath = "//android.widget.TextView[contains(@text,'CLIMATE') or @content-desc='undefined-header-centerTitleText']";
    public static final String Climate_back_button_xpath = "//android.view.ViewGroup[@content-desc='undefined-header-leftButton']/android.view.ViewGroup";
    public static final String Inside_text_xpath_OR_operator = "//android.widget.TextView[contains(@text,'Inside') or @content-desc='com.dometicapp:id/ClimateShapeScreen-temperatureInsideText']";
    public static final String Power_text_xpath = "//android.widget.TextView[contains(@text,'Power')]";
    public static final String Climate_mode_text_xpath = "//android.widget.TextView[contains(@text,'Climate Mode')]";
    public static final String Fan_speed_text_xpath = "//android.widget.TextView[contains(@text,'Fan Speed')]";
    public static final String Sleep_text_xpath = "//android.widget.TextView[contains(@text,'Sleep')]";
    public static final String Lights_text_xpath = "//android.widget.TextView[contains(@text,'LIGHTS')]";
    public static final String Internal_text_xpath = "//android.widget.TextView[contains(@text,'Internal')]";
    public static final String Internal_brightness_text_xpath = "//android.widget.TextView[contains(@text,'Internal Brightness')]";
    public static final String Timer_text_xpath = "//android.widget.TextView[contains(@text,'TIMER')]";
    public static final String Auto_ON_text_xpath = "//android.widget.TextView[contains(@text,'Auto On')]";
    public static final String Auto_OFF_text_xpath = "//android.widget.TextView[contains(@text,'Auto Off')]";
    public static final String Status_text_xpath = "//android.widget.TextView[contains(@text,'Status')]";
    public static final String Scheduled_AT_text_xpath = "//android.widget.TextView[contains(@text,'SCHEDULED AT')]";


    //-----------------Data-----------------//
    public static final int Climate_Tile_Minimum_Temperature_Value = 16;
    public static final int Climate_Tile_Maximum_Temperature_Value = 31;
    public static final int Climate_Tile_Random_Temperature_Value = 10;
    public static final int Climate_Tile_Minimum_Fahrenheit_Temperature_Value = 61;
    public static final int Climate_Tile_Maximum_Fahrenheit_Temperature_Value = 88;
    public static final String Climate_header_text = "CLIMATE";
    public static final String Inside_text = "Inside";
    public static final String Power_text = "Power";
    public static final String Climate_mode_text = "Climate Mode";
    public static final String Fan_speed_text = "Fan Speed";
    public static final String Sleep_text = "Sleep";
    public static final String Lights_text = "LIGHTS";
    public static final String Internal_text = "Internal";
    public static final String Internal_Brightness_text = "Internal Brightness";
    public static final String Timer_text = "TIMER";
    public static final String Auto_ON_text = "Auto On";
    public static final String Auto_OFF_text = "Auto Off";
    public static final String Status_text = "Status";
    public static final String Scheduled_At_text = "SCHEDULED AT";
}
