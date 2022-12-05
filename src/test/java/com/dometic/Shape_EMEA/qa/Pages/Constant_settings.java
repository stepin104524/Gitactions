package com.dometic.Shape_EMEA.qa.Pages;

public class Constant_settings {
    // --------------Accessibility_id-------------------//

    public static final String LandingPage_hamburger_menu_access_id = "com.dometicapp:id/header-menuButton";
    public static final String Settings_BackButtonIcon_access_id ="com.dometicapp:id/sidemenu-headerBackButtonIcon";
    public static final String Settings_ProfilePhoto_access_id ="com.dometicapp:id/sidemenu-userProfilePhoto";
    public static final String Settings_UserName_access_id ="com.dometicapp:id/sidemenu-userName";
    public static final String Settings_UserEmail_access_id = "com.dometicapp:id/sidemenu-userEmail";
    public static final String ViewEdit_text_xpath_OR_operator ="//android.widget.TextView[contains(@text,'View/Edit Account') or @content-desc=\"com.dometicapp:id/sidemenu-viewEditButtonText\"]";
    public static final String Home_text_xpath_OR_operator ="//android.widget.TextView[contains(@text,'Home') or @content-desc=\"com.dometicapp:id/sidemenu-home-text\"]";
    public static final String Notification_settings_text_xpath_OR_operator ="//android.widget.TextView[contains(@text,'Notification Settings') or @content-desc=\"com.dometicapp:id/sidemenu-notificationSettings-text\"]";
    public static final String Device_management_text_xpath_OR_operator ="//android.widget.TextView[contains(@text,'Device Management') or @content-desc=\"com.dometicapp:id/sidemenu-deviceMangagement-text\"]";
    public static final String AppSettings_text_xpath_OR_operator ="//android.widget.TextView[contains(@text,'App Settings') or @content-desc=\"com.dometicapp:id/sidemenu-appSettings-text\"]";
    public static final String Logout_text_xpath_OR_operator ="//android.widget.TextView[contains(@text,'Logout') or @content-desc=\"com.dometicapp:id/sidemenu-logout-text\"]";
    public static final String Version_text_xpath_OR_operator ="//android.widget.TextView[contains(@text,'Version 1.7.4') or @content-desc=\"com.dometicapp:id/sidemenu-versionText\"]";

    public static final String Account_settings_back_button_access_id = ", back";
    public static final String Account_settings_back_button_xpath = "//android.widget.Button[@content-desc=\" , back\"]";
    public static final String Manage_notifications_back_button_access_id = "com.dometicapp:id/NotificationScreen-leftButtonImage";
    public static final String Manage_notifications_back_button_xpath = "//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/NotificationScreen-leftButtonImage\"]";
    public static final String Device_management_back_button_access_id = "com.dometicapp:id/DeviceManagementScreen-leftButtonImage";
    public static final String Device_Management_back_button_xpath = "//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/DeviceManagementScreen-leftButtonImage\"]";
    public static final String App_settings_back_button_access_id = ", back";
    public static final String App_settings_back_button_xpath = "//android.widget.Button[@content-desc=\" , back\"]";

    // -------------- Data -------------------//
    public static final String Settings_View_Edit_Text = "View/Edit Account";
    public static final String Settings_Home_text = "Home";
    public static final String Settings_NotificationSettings_text = "Notification Settings";
    public static final String Settings_DeviceMangagement_text = "Device Management";
    public static final String Settings_AppSettings_text = "App Settings";
    public static final String Settings_Logout_text = "Logout";
    public static final String Settings_Version_text ="Version 1.7.5";
}
