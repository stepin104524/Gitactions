package com.dometic.MTC.qa.Pages;

public class Constant_DeviceManagement {
    public static final String mtc_DeviceManagement_title_access_id = "com.dometicapp:id/header-TitleText";
    public static final String mtc_DeviceManagement_backbutton_access_id = "com.dometicapp:id/tiles-backImage";
    public static final String mtc_addnew_button_access_id = "com.dometicapp:id/DeviceManagement-addNewButton";
    public static final String mtc_addnew_text_access_id = "com.dometicapp:id/DeviceManagement-addNewButtonText";
    public static final String mtc_devicemanagement_image_access_id =  "com.dometicapp:id/deviceManagement-deviceImage";
    public static final String mtc_image_devicename_access_id =  "com.dometicapp:id/deviceManagement-deviceName";
    public static final String mtc_vesselname_text_access_id = "com.dometicapp:id/deviceManagement-vesseltitleLabel";
    public static final String mtc_namelabel_access_id =  "com.dometicapp:id/deviceManagement-vesselNameLabel";
    public static final String mtc_name_value_access_id = "com.dometicapp:id/deviceManagement-vesselNameValue";
    public static final String mtc_hull_id_label_access_id = "com.dometicapp:id/deviceManagement-hullIdLabel";
    public static final String mtc_hull_id_value_access_id = "com.dometicapp:id/deviceManagement-hullIdValue";
    public static final String mtc_edit_vessel_access_id = "com.dometicapp:id/deviceManagement-editVessel-cardTitle";
    public static final String mtc_edit_vessel_navigation_access_id = "com.dometicapp:id/deviceManagement-editVessel-cardIcon";
    public static final String mtc_advanced_text_access_id = "com.dometicapp:id/deviceManagement-advancedTitleText";
    public static final String mtc_check_updates_text_access_id =  "com.dometicapp:id/deviceManagement-checkForUpdates-cardTitle";
    public static final String mtc_check_updates_navigation_access_id = "com.dometicapp:id/deviceManagement-checkForUpdates-cardIcon";
    public static final String mtc_unregister_text_access_id = "com.dometicapp:id/deviceManagement-unregisterDelete-cardTitle";
    public static final String mtc_unregister_navigation_access_id =  "com.dometicapp:id/deviceManagement-unregisterDelete-cardIcon";
    public static final String mtc_edit_title_access_id = "com.dometicapp:id/header-TitleText";
    public static final String mtc_edit_screen_image_access_id = "com.dometicapp:id/editVessel-deviceImage";
    public static final String mtc_edit_name_title_access_id =  "com.dometicapp:id/editVessel-vesselNameLabel";
    public static final String mtc_edit_name_value_access_id = "com.dometicapp:id/editVessel-vesselNameValue";
    public static final String mtc_edit_mac_text_access_id = "com.dometicapp:id/editVessel-hullIdLabel";
    public static final String mtc_edit_mac_value_access_id = "com.dometicapp:id/editVessel-hullIdValue";
    public static final String mtc_edit_save_button_access_id = "com.dometicapp:id/editVessel-saveButton";
    public static final String mtc_edit_save_text_access_id =  "com.dometicapp:id/editVessel-saveButtonText";
    public static final String mtc_name_valid_data = "Marine";
    public static final String mtc_name_invalid_data = "%$$$$$$$$$$$$$$$$$$$$$$";
    public static final String mtc_long_name_value = "SBDHSKHDGHSAD";
    public static final String mtc_long_mac_id_value = "SBDHSKHDGHSADASNDBASKHDSKHSDSAHKDGASHDGS";
    public static final String mtc_mac_id_invalid_data = "%$$$$$$$$$$$$$$$$$$$$$$";
    public static final String mtc_mac_id_valid_data = "AKDFJLKDLKHFDSK";

    public static final String[] EditedName = {"Marine","%$$$$$$$$$$$$$$$$$$$$$$","SBDHSKHDGHSADASNDBASKHDSKHSDSAHKDGASHDGS"};

    public static final String mtc_edit_mac_value_xpath = "//android.widget.EditText[@content-desc=\"com.dometicapp:id/editVessel-hullIdValue\"]";
    public static final String mtc_onboardeddevice_1_logo_xpath = "(//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/DeviceManagement-smallLogo\"])[1]";
    public static final String mtc_onboardeddevice_2_logo_xpath = "(//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/DeviceManagement-smallLogo\"])[2]";
    public static final String mtc_onboardeddevice_3_logo_xpath = "(//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/DeviceManagement-smallLogo\"])[3]";
    public static final String mtc_onboardeddevice_1_name_xpath = "(//android.widget.TextView[@content-desc=\"com.dometicapp:id/DeviceManagement-deviceName\"])[1]";
    public static final String mtc_onboardeddevice_2_name_xpath = "(//android.widget.TextView[@content-desc=\"com.dometicapp:id/DeviceManagement-deviceName\"])[2]";
    public static final String mtc_onboardeddevice_3_name_xpath = "(//android.widget.TextView[@content-desc=\"com.dometicapp:id/DeviceManagement-deviceName\"])[3]";
    public static final String mtc_onboardeddevice_1_navigation_xpath = "(//*[@content-desc='com.dometicapp:id/DeviceManagement-rightIcon'])[1]";
    public static final String mtc_onboardeddevice_2_navigation_xpath = "(//android.widget.TextView[@content-desc=\"com.dometicapp:id/DeviceManagement-rightIcon\"])[2]";
    public static final String mtc_onboardeddevice_3_navigation_xpath =  "(//android.widget.TextView[@content-desc=\"com.dometicapp:id/DeviceManagement-rightIcon\"])[3]";
    public static final String mtc_onboardeddevice_1_selection_xpath = "(//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/DeviceManagement-itemContainer\"])[1]";
    public static final String mtc_onboardeddevice_2_selection_xpath = "(//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/DeviceManagement-itemContainer\"])[2]";
    public static final String mtc_onboardeddevice_3_selection_xpath = "(//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/DeviceManagement-itemContainer\"])[3]";
    public static final String mtc_edit_emptyname_error_xpath = "(//*[@content-desc='com.dometicapp:id/editVessel-vesselNameValue']//following::android.widget.TextView)[1]";
    public static final String mtc_Device_Management_Title_Xpath="//*[@text='DEVICE MANAGEMENT' and @content-desc='com.dometicapp:id/header-TitleText']";
    public static final String mtc_Edit_Profile_Title_Xpath="//*[@text='EDIT PROFILE' and @content-desc='com.dometicapp:id/header-TitleText']";
    public static final String mtc_Profile_Title_Xpath="//*[@text='PROFILE' and @content-desc='com.dometicapp:id/header-TitleText']";
    public static final String mtc_Account_Settings_Title_Xpath="//*[@text='ACCOUNT SETTINGS' and @content-desc='com.dometicapp:id/header-TitleText']";
    public static final String mtc_App_Settings_Title_Xpath="//*[@text='APP SETTINGS' and @content-desc='com.dometicapp:id/header-TitleText']";


    public static final String grinning_face_with_smiling_eyes = new String(Character.toChars(0x1F601));
    public static final String face_with_tears_of_joy = new String(Character.toChars(0x1F602));
    public static final String smiling_face_with_open_mouth_and_cold_sweat = new String(Character.toChars(0x1F605));
    public static final String smiling_face_with_open_mouth_and_tightly_closed_eyes = new String(Character.toChars(0x1F606));
    public static final String winking_face = new String(Character.toChars(0x1F609));

}
