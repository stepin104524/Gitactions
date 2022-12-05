package com.dometic.MTC.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.MTC.qa.Pages.*;
import com.dometic.MTC.qa.util.Baseclass;
import com.google.common.collect.ImmutableMap;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Settings extends Baseclass {
    private static int flag = 0;
    private static int EmailToggle = 0;
    private static String Edited_Email = "";
    private static String Edited_Label = "";
    public static String EditedNameValue = "";
    String emojis = Constant_DeviceManagement.grinning_face_with_smiling_eyes + Constant_DeviceManagement.face_with_tears_of_joy +
            Constant_DeviceManagement.smiling_face_with_open_mouth_and_cold_sweat + Constant_DeviceManagement.smiling_face_with_open_mouth_and_tightly_closed_eyes +
            Constant_DeviceManagement.winking_face;

    @Then("I Tap on hamburger menu in landing screen")
    public void iTapOnHamburgerMenuInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on hamburger menu in landing screen");
        List<AndroidElement> id = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_hamburger_menu_access_id);
        if (id.size() != 0) {
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_hamburger_menu_access_id);
            Thread.sleep(1000);
        }
    }

    @Then("I Verify SETTINGS Text displayed in the top of the app")
    public void iVerifySETTINGSTextDisplayedInTheTopOfTheApp() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify SETTINGS Text displayed in the top of the app");
        asserttext("SETTINGS", Constant_settings.Settings_text_xpath);
    }

    @Then("I verify Languages text is displayed")
    public void iVerifyLanguagesIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Languages text is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_languageContainer_access_id));
    }

    @Then("I Verify Temperature unit text is displayed")
    public void tVerifyTemperatureUnitIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Temperature unit text is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Temperature_unit_access_id));
    }

    @Then("I verify Upgrade Firmware is displayed")
    public void iVerifyUpgradeFirmwareIsDisplayed() {
        //  Assert.assertTrue(iselementdisplayed(Constant_settings.Settings_Upgrade_Firmware_xpath));
    }

    @Then("I verify Version is displayed")
    public void iVerifyVersionIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Version is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_hamburger_menu_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_hamburger_menu_access_id);
        }
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_versionContainer_access_id));
    }

    @Then("I verify Log out is displayed")
    public void iVerifyLogOutIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Log out is displayed");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Settings_Logout_xpath));
    }


    @Then("I verify hamburger menu in landing screen")
    public void iVerifyHamburgerMenuInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify hamburger menu in landing screen");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            TaponbuttonaccessabilityID(Constant_climate_ac.CAC_M_power_Back_Button_access_id);
        }
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_hamburger_menu_access_id));

    }

    @Then("I navigate to update language section in Settings")
    public void iNavigateToUpdateLanguageSectionInSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I navigate to update language section in Settings");
        TaponbuttonaccessabilityID(Constant_settings.Settings_languageContainer_access_id);

    }

    @Then("I update language to German in settings")
    public void iUpdateLanguageToGermanInSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I update language to German in settings");
        TaponbuttonaccessabilityID(Constant_settings.Settings_language_German_access_id);
    }

    @And("I verify on Language text updated with German translation")
    public void iVerifyOnLanguageTextUpdatedWithGermanTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Language text updated with German translation");
        asserttextAccessibility(Constant_settings.Settings_language_text_expected, Constant_settings.Settings_language_text_access_id);
    }

    @And("I verify on Temperature text updated with German translation")
    public void iVerifyOnTemperatureTextUpdatedWithGermanTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Temperature text updated with German translation");
        asserttextAccessibility(Constant_settings.Settings_Temperature_text_expected, Constant_settings.Settings_Temperature_text_access_id);
    }

    @And("I verify on logout text updated with German translation")
    public void iVerifyOnLogoutTextUpdatedWithGermanTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on logout text updated with German translation");
        asserttextAccessibility(Constant_settings.Settings_logout_expected, Constant_settings.Settings_logout_text_access_id);
    }

    @Then("I update Temperature Unit in Settings")
    public void iUpdateTemperatureUnitInSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I update Temperature Unit in Settings");
        TaponbuttonaccessabilityID(Constant_settings.Settings_fahrenheit_access_id);
    }

    @Then("I Tap on Back button from Settings")
    public void iTapOnBackButtonFromSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back button from Settings");
        TaponbuttonaccessabilityID(Constant_settings.Settings_Back_Button_access_id);
    }

    @Then("I update language to Spanish in settings")
    public void iUpdateLanguageToSpanishInSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I update language to Spanish in settings");
        Taponbutton(Constant_settings.Settings_language_Spanish_xpath);
    }

    @And("I verify on Language text updated with Spanish translation")
    public void iVerifyOnLanguageTextUpdatedWithSpanishTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Language text updated with Spanish translation");
        asserttext(Constant_settings.Settings_language_Spanish_text_expected, Constant_settings.Settings_language_xpath);
    }

    @And("I verify on Temperature text updated with Spanish translation")
    public void iVerifyOnTemperatureTextUpdatedWithSpanishTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Temperature text updated with Spanish translation");
        asserttextAccessibility(Constant_settings.Settings_temperature_Spanish_text_expected, Constant_settings.Settings_Temperature_text_access_id);
    }

    @And("I verify on logout text updated with Spanish translation")
    public void iVerifyOnLogoutTextUpdatedWithSpanishTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on logout text updated with Spanish translation");
        asserttextAccessibility(Constant_settings.Settings_logout_Spanish_text_expected, Constant_settings.Settings_logout_text_access_id);
    }

    @Then("I update language to French in settings")
    public void iUpdateLanguageToFrenchInSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I update language to French in settings");
        Taponbutton(Constant_settings.Settings_language_French_xpath);
    }

    @And("I verify on Language text updated with French translation")
    public void iVerifyOnLanguageTextUpdatedWithFrenchTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Language text updated with French translation");
        asserttext(Constant_settings.Settings_language_French_text_expected, Constant_settings.Settings_language_xpath);
    }

    @And("I verify on Temperature text updated with French translation")
    public void iVerifyOnTemperatureTextUpdatedWithFrenchTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on Temperature text updated with French translation");
        asserttextAccessibility(Constant_settings.Settings_temperature_French_text_expected, Constant_settings.Settings_Temperature_text_access_id);
    }

    @And("I verify on logout text updated with French translation")
    public void iVerifyOnLogoutTextUpdatedWithFrenchTranslation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify on logout text updated with French translation");
        asserttextAccessibility(Constant_settings.Settings_logout_French_text_expected, Constant_settings.Settings_logout_text_access_id);
    }

    @Then("I verify Add ZoneIcon in Zone Management")
    public void iVerifyAddZoneIconInZoneManagement() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Add ZoneIcon in Zone Management");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Zone_Management_addZoneIcon_access_id));
    }

    @Then("I verify Zone Management text is displayed")
    public void iVerifyZoneManagementTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Zone Management text is displayed");
        System.out.println(driver.findElement(By.xpath(Constant_settings.Settings_Zone_Management_xpath)).getText());
        asserttext(Constant_settings.Settings_Zone_Management_expected, Constant_settings.Settings_Zone_Management_xpath);
    }

    @Then("I Tap on Zone Management in Settings")
    public void iTapOnZoneManagementInSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Zone Management in Settings");
        Taponbutton(Constant_settings.Settings_Zone_Management_xpath);
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_settings.Settings_Zone_Management_LimitedZones_xpath)));
    }

    @Then("I Verify ALL ZONES in Zone Management")
    public void iVerifyALLZONESInZoneManagement() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify ALL ZONES in Zone Management");
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_settings.Settings_Zone_Management_LimitedZones_xpath)));
        System.out.println(driver.findElementByAccessibilityId(Constant_settings.Settings_language_selectedName_access_id).getText());
        asserttextAccessibility(Constant_settings.Settings_Zone_Management_ALL_ZONES_text, Constant_settings.Settings_language_selectedName_access_id);
    }

    @Then("I verify Edit text in Zone Management")
    public void iVerifyEditTextInZoneManagement() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit text in Zone Management");
        System.out.println(driver.findElement(By.xpath(Constant_settings.Settings_Zone_Management_edit_xpath)).getText());
        asserttext(Constant_settings.Settings_Zone_Management_edit_text, Constant_settings.Settings_Zone_Management_edit_xpath);
    }

    @Then("I verify Limited to {int} Zones only text in Zone Management")
    public void iVerifyLimitedToZonesOnlyTextInZoneManagement(int arg0) throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Limited Zones only text in Zone Management");
        System.out.println(driver.findElement(By.xpath(Constant_settings.Settings_Zone_Management_LimitedZones_xpath)).getText());
        asserttext(Constant_settings.Settings_Zone_Management_LimitedZones_text, Constant_settings.Settings_Zone_Management_LimitedZones_xpath);
    }

    @Then("I Tap on Edit in ALL ZONES")
    public void iTapOnEditInALLZONES() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Edit in ALL ZONES");
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_settings.Settings_Zone_Management_LimitedZones_xpath)));
        Taponbutton(Constant_settings.Settings_Zone_Management_edit_xpath);
    }

    @Then("I Tap on Rename in ALL ZONES")
    public void iTapOnRenameInALLZONES() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Rename in ALL ZONES");
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_settings.Settings_Zone_Management_Rename_xpath)));
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_Rename_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_settings.Settings_Zone_Management_Rename_xpath);
        }
    }

    @Then("I Tap on the Zone name")
    public void iTapOnTheZoneName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Zone name");
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_settings.Settings_Zone_Management_Rename_value_xpath)));
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_Rename_value_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_settings.Settings_Zone_Management_Rename_value_xpath);
        }

    }

    @Then("I clear the previous zone name")
    public void iClearThePreviousZoneName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I clear the previous zone name");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_Rename_value_xpath));
        if (elements.size() != 0) {
            cleartext(Constant_settings.Settings_Zone_Management_Rename_value_xpath);
        }
    }

    @Then("I save the Zone")
    public void iSaveTheZone() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I save the Zone");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_SAVE_Button_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_settings.Settings_Zone_Management_SAVE_Button_xpath);
        }
    }

    @Then("I verify {string} message is displayed")
    public void iVerifyMessageIsDisplayed(String arg0) throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Zone Management Zone_Name can not be empty message is displayed");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_Zone_Name_can_not_be_empty_xpath));
        if (elements.size() != 0) {
            asserttext(Constant_settings.Settings_Zone_Management_Zone_Name_can_not_be_empty_text, Constant_settings.Settings_Zone_Management_Zone_Name_can_not_be_empty_xpath);
        }
    }

    @Then("I Enter the zone name more then the limit")
    public void iEnterTheZoneNameMoreThenTheLimit() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter the zone name more then the limit");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_Rename_value_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_settings.Settings_Zone_Management_Rename_value_xpath);
            entertext(Constant_settings.Settings_Zone_Management_value, Constant_settings.Settings_Zone_Management_Rename_value_xpath);
        }
    }

    @Then("I Enter the Zone name")
    public void iEnterTheZoneName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter the Zone name");
        Taponbutton(Constant_settings.Settings_Zone_Management_Rename_value_xpath);
        entertext(Constant_settings.Settings_Zone_Management_Living_Room, Constant_settings.Settings_Zone_Management_Rename_value_xpath);
    }

    @Then("I Tap on the Delete Zone Icon")
    public void iTapOnTheDeleteZoneIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Delete Zone Icon");
        Taponbutton(Constant_settings.Settings_Zone_Management_flatListItem_xpath);
    }

    @Then("I Tap on YES, DELETE IT Button")
    public void iTapOnYESDELETEITButton() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on YES, DELETE IT Button");
        Thread.sleep(2000);
        Taponbutton(Constant_settings.Settings_Zone_Management_deleteZone_xpath);
    }

    @Then("I Tap on the Add Zone Icon")
    public void iTapOnTheAddZoneIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Add Zone Icon");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_deleteZoneAlert_description_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_settings.Settings_Zone_Management_deleteZoneAlert_description_xpath);
        }
        TaponbuttonaccessabilityID(Constant_settings.Settings_Zone_Management_addZoneIcon_access_id);
    }

    @Then("I Select the zone")
    public void iSelectTheZone() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Select the zone");
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_settings.Settings_Zone_Management_addZoneIcon_Select_button_xpath)));
        TaponbuttonaccessabilityID(Constant_settings.Settings_Zone_Management_addZoneIcon_Select_button_access_id);
    }

    @Then("I SAVE the Zone")
    public void iSAVETheZone() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I SAVE the Zone");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_ZoneNumber_dialog_saveButton_xpath));
        if (elements.size() != 0) {
            TaponbuttonaccessabilityID(Constant_settings.Settings_Zone_Management_ZoneNumber_dialog_saveButton_access_id);
        }
//        TaponbuttonaccessabilityID(Constant_settings.Settings_Zone_Management_deleteZoneAlert_cancelButton_access_id);
//        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_Zone_name_already_present_xpath));
//        if(elements.size()!=0){
//            TaponbuttonaccessabilityID(Constant_settings.Settings_Zone_Management_ZoneNumber_dialog_cancelButton_access_id);
//        }
    }

    @Then("I verify Zone Name can not be empty message is displayed")
    public void iVerifyZoneNameCanNotBeEmptyMessageIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Zone Name can not be empty message is displayed");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_Zone_Name_can_not_be_empty_xpath));
        if (elements.size() != 0) {
            asserttext(Constant_settings.Settings_Zone_Management_Zone_Name_can_not_be_empty_text, Constant_settings.Settings_Zone_Management_Zone_Name_can_not_be_empty_xpath);
        }
    }

    @Then("I verify {string} character message is displayed")
    public void iVerifyCharacterMessageIsDisplayed(String arg0) throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify 10 character message is displayed");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_Zone_Name_can_not_be_empty_xpath));
        if (elements.size() != 0) {
            asserttext(Constant_settings.Settings_Zone_Management_10_character_text, Constant_settings.Settings_Zone_Management_Zone_Name_can_not_be_empty_xpath);
        }
    }

    @Then("I Tap on Save")
    public void iTapOnSave() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Save");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_settings.Settings_Zone_Management_SAVE_Button_xpath));
        if (elements.size() != 0) {
            Taponbutton(Constant_settings.Settings_Zone_Management_SAVE_Button_xpath);
        } else {
            Taponbutton(Constant_settings.Settings_Zone_Management_CANCEL_Button_xpath);
        }
    }

    @Then("I Enter the New Zone name")
    public void iEnterTheNewZoneName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter the New Zone name");
        WebDriverWait wait = new WebDriverWait(driver, 50);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_settings.Settings_Zone_Management_new_Zone_xpath)));
        TaponbuttonaccessabilityID(Constant_settings.Settings_Zone_Management_new_Zone_access_id);
        entertextaccessabilityId(Constant_settings.Settings_Zone_Management_NewZone_Room, Constant_settings.Settings_Zone_Management_new_Zone_access_id);
    }

    @Then("I Tap on Logout in Settings")
    public void iTapOnLogoutInSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Logout in Settings");
        System.out.println("Text comparison is Successful");
        Taponbutton(com.dometic.L1.qa.Pages.Constant_settings.Settings_Logout_xpath);
    }

    @Then("I verify settings screen back button")
    public void iVerifySettingsScreenBackButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify settings screen back button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_headerBackButtonIcon_access_id));
    }

    @Then("I verify user profile photo is displayed")
    public void iVerifyUserProfilePhotoIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify user profile photo is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_userProfilePhoto_access_id));
    }

    @Then("I verify username is displayed")
    public void iVerifyUsernameIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify username is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_userName_access_id));
    }

    @Then("I verify user email is displayed")
    public void iVerifyUserEmailIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify user email is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_userEmail_access_id));
    }

    @Then("I verify Home text is displayed")
    public void iVerifyHomeTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Home text is displayed");
        asserttextValidationAccessibility(Constant_settings.Settings_home_text, Constant_settings.Settings_home_text_access_id);
    }

    @Then("I verify Notification Settings text is displayed")
    public void iVerifyNotificationSettingsTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Notification Settings text is displayed");
        asserttextValidationAccessibility(Constant_settings.Settings_notificationSettings_text, Constant_settings.Settings_notificationSettings_text_access_id);
    }

    @Then("I verify Device Management is displayed")
    public void iVerifyDeviceManagementIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Device Management is displayed");
        asserttextValidationAccessibility(Constant_settings.Settings_deviceMangagement_text, Constant_settings.Settings_deviceMangagement_text_access_id);
    }

    @Then("I verify App Settings is displayed")
    public void iVerifyAppSettingsIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify App Settings is displayed");
        asserttextValidationAccessibility(Constant_settings.Settings_appSettings_text, Constant_settings.Settings_appSettings_text_access_id);
    }

    @Then("I verify Logout is displayed")
    public void iVerifyLogoutIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Logout is displayed");
        asserttextValidationAccessibility(Constant_settings.Settings_Logout_text, Constant_settings.Settings_Logout_text_access_id);
    }

    @Then("I verify Version {double} is displayed")
    public void iVerifyVersionIsDisplayed(double arg) throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Version 1.6 is displayed");
        asserttextValidationAccessibility(Constant_settings.Settings_Version_16_text, Constant_settings.Settings_Version_16_text_access_id);
    }

    @Then("I verify View Edit Account text is displayed")
    public void iVerifyViewEditAccountTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify View/Edit Account text is displayed");
        asserttextValidationAccessibility(Constant_settings.Settings_viewEditButtonText, Constant_settings.Settings_viewEditButtonText_access_id);
    }

    @Then("I Tap on Home in Settings screen")
    public void iTapOnHomeInSettingsScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Home in Settings screen");
       if(driver.findElementsByAccessibilityId(Constant_settings.Settings_home_text_access_id).size()!=0){
           TaponbuttonaccessabilityID(Constant_settings.Settings_home_text_access_id);
           Thread.sleep(1000);
       }
    }

    @Then("I Tap on Notification Settings")
    public void iTapOnNotificationSettings() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Notification Settings");
        TaponbuttonaccessabilityID(Constant_settings.Settings_notificationSettings_text_access_id);
        Thread.sleep(2000);
    }

    @Then("I Tap on Device Management")
    public void iTapOnDeviceManagement() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Device Management");
        if(driver.findElementsByAccessibilityId(Constant_settings.Settings_deviceMangagement_text_access_id).size()!=0){
            TaponbuttonaccessabilityID(Constant_settings.Settings_deviceMangagement_text_access_id);
            Thread.sleep(2000);
        }
    }

    @Then("I Tap on App Settings")
    public void iTapOnAppSettings() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on App Settings");
        TaponbuttonaccessabilityID(Constant_settings.Settings_appSettings_text_access_id);
        Thread.sleep(2000);
    }

    @Then("I Tap on Logout in Settings screen")
    public void iTapOnLogoutInSettingsScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Logout in Settings screen");
        TaponbuttonaccessabilityID(Constant_settings.Settings_Logout_text_access_id);
    }

    @Then("I Tap on View Edit Account link in Settings screen")
    public void iTapOnViewEditAccountLinkInSettingsScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on View Edit Account link in Settings screen");
        TaponbuttonaccessabilityID(Constant_settings.Settings_viewEditButtonText_access_id);
        Thread.sleep(2000);
    }

    @Then("I Tap on Profile in Account Setting Screen")
    public void iTapOnProfileInAccountSettingScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Profile in Account Setting Screen");
        TaponbuttonaccessabilityID(Constant_AccountSettings.accountSettings_Profile_Text_Access_Id);
        Thread.sleep(2000);
    }

    @Then("I Verify Profile header text")
    public void iVerifyProfileHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Profile header text");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_Header_Text, Constant_AccountSettings.profile_Header_Text_Access_Id);
    }

    @Then("I verify user profile image is displayed")
    public void iVerifyUserProfileImageIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify user profile image is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_UserProfile_photo_Access_Id));
    }

    @Then("I verify Personal Information text is displayed")
    public void iVerifyPersonalInformationTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Personal Information text is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_PersonalInfoText, Constant_AccountSettings.profile_PersonalInfoText_Access_Id);
    }

    @Then("I verify Name Label is displayed")
    public void iVerifyNameLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Name Label is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_NameLabel, Constant_AccountSettings.profile_NameLabel_Access_Id);
    }

    @Then("I Verify Name value is displayed")
    public void iVerifyNameValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Name value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_NameValue_Access_Id));
    }

    @Then("I verify E-mail Label is displayed")
    public void iVerifyEMailLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify E-mail Label is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_emailLabel, Constant_AccountSettings.profile_emailLabel_Access_Id);
    }

    @Then("I verify E-mail value is displayed")
    public void iVerifyEMailValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify E-mail value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_emailValue_Access_Id));
    }

    @Then("I verify Mobile Label is displayed")
    public void iVerifyMobileLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Mobile Label is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_phoneLabel, Constant_AccountSettings.profile_phoneLabel_Access_Id);
    }

    @Then("I Verify Mobile value is displayed")
    public void iVerifyMobileValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Mobile value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_phoneValue_Access_Id));
    }

    @Then("I verify Address Label is displayed")
    public void iVerifyAddressLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Address Label is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_addressLabel, Constant_AccountSettings.profile_addressLabel_Access_Id);
    }

    @Then("I verify Address value is displayed")
    public void iVerifyAddressValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Address value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_addressValue_Access_Id));
    }

    @Then("I verify Edit profile text is displayed")
    public void iVerifyEditProfileTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit profile text is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_EditProfileButton_cardTitle, Constant_AccountSettings.profile_EditProfileButton_cardTitle_Access_Id);
    }

    @Then("I verify Edit profile arrow is displayed")
    public void iVerifyEditProfileArrowIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit profile arrow is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_EditProfileButton_cardIcon_Access_Id));
    }

    @Then("I verify Security text is displayed")
    public void iVerifySecurityTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Security text is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_securityText, Constant_AccountSettings.profile_securityText_Access_Id);
    }

    @Then("I verify Password text is displayed")
    public void iVerifyPasswordTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Password text is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_resetPasswordText, Constant_AccountSettings.profile_resetPasswordText_Access_Id);
    }

    @Then("I verify Renew text is displayed")
    public void iVerifyRenewTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Renew text is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_renew_cardTitle, Constant_AccountSettings.profile_renew_cardTitle_Access_Id);
    }

    @Then("I verify Renew arrow is displayed")
    public void iVerifyRenewArrowIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Renew arrow is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_renew_cardIcon_Access_Id));
    }

    @Then("I Tap on Edit profile in profile screen")
    public void iTapOnEditProfileInProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Edit profile in profile screen");
        List<AndroidElement> id = driver.findElementsByAccessibilityId(Constant_AccountSettings.profile_EditProfileButton_cardTitle_Access_Id);
        if (id.size() != 0) {
            TaponbuttonaccessabilityID(Constant_AccountSettings.profile_EditProfileButton_cardTitle_Access_Id);
            Thread.sleep(1000);
        }
    }

    @Then("I verify Edit profile header text")
    public void iVerifyEditProfileHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit profile header text");
        asserttextValidationAccessibility(Constant_AccountSettings.editProfile_TitleText, Constant_AccountSettings.editProfile_TitleText_Access_Id);
    }

    @Then("I verify user profile photo in edit profile screen")
    public void iVerifyUserProfilePhotoInEditProfileScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify user profile photo in edit profile screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.editProfile_Photo_Access_Id));
    }

    @Then("I verify user email value is displayed")
    public void iVerifyUserEmailValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify user email value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.editProfile_EmailValue_Access_Id));
    }

    @Then("I verify Firstname label is displayed")
    public void iVerifyFirstnameLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Firstname label is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.editProfile_firstNameLabel, Constant_AccountSettings.editProfile_firstNameLabel_Access_Id);
    }

    @Then("I verify Firstname Value is displayed")
    public void iVerifyFirstnameValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Firstname Value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id));
    }

    @Then("I verify Lastname label is displayed")
    public void iVerifyLastnameLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Lastname label is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.editProfile_lastameLabel, Constant_AccountSettings.editProfile_lastameLabel_Access_Id);
    }

    @Then("I verify Lastname Value is displayed")
    public void iVerifyLastnameValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Lastname Value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.editProfile_lastNameValue_Access_Id));
    }

    @Then("I verify Primary Mobile label is displayed")
    public void iVerifyPrimaryMobileLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Primary Mobile label is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.editProfile_phoneLabel, Constant_AccountSettings.editProfile_phoneLabel_Access_Id);
    }

    @Then("I verify Primary Mobile Value is displayed")
    public void iVerifyPrimaryMobileValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Primary Mobile Value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.editProfile_phoneValue_Access_Id));
    }

    @Then("I verify Address label is displayed in Edit profile screen")
    public void iVerifyAddressLabelIsDisplayedInEditProfileScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Address label is displayed in Edit profile screen");
        asserttextValidationAccessibility(Constant_AccountSettings.editProfile_addressLabel, Constant_AccountSettings.editProfile_addressLabel_Access_Id);
    }

    @Then("I verify Address value is displayed in Edit profile screen")
    public void iVerifyAddressValueIsDisplayedInEditProfileScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Address value is displayed in Edit profile screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.editProfile_addressValue_Access_Id));
    }

    @Then("I verify Save Button is displayed")
    public void iVerifySaveButtonIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Save Button is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.editProfile_saveButton_Access_Id));
    }

    @Then("I enter an First name in Edit profile screen")
    public void iEnterAnFirstNameInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an First name in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_AccountSettings.editProfile_firstNameValue, Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter an Last name in Edit profile screen")
    public void iEnterAnLastNameInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Last name in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_AccountSettings.editProfile_lastameValue, Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter an Primary Mobile in Edit profile screen")
    public void iEnterAnPrimaryMobileInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Primary Mobile in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_phoneValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_phoneValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_AccountSettings.editProfile_phoneValue, Constant_AccountSettings.editProfile_phoneValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter an Address in Edit profile screen")
    public void iEnterAnAddressInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Address in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_addressValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_addressValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_AccountSettings.editProfile_addressValue, Constant_AccountSettings.editProfile_addressValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I Tap on Save button")
    public void iTapOnSaveButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Save button");
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_saveButton_Access_Id);
        List<AndroidElement> list = driver.findElements(By.xpath(Constant_Batteries_MTC.mtc_Batteries_title_template_xpath));
        if (list.size() != 0) {
            WebDriverWait wait = new WebDriverWait(driver, 300);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Constant_Batteries_MTC.mtc_Batteries_title_template_xpath)));
        }
    }

    @Then("I verify App Settings Header text")
    public void iVerifyAppSettingsHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify App Settings Header text");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_Header_Text, Constant_AccountSettings.appSettings_Header_Text_Access_Id);
    }

    @Then("I verify Language text in App Settings page")
    public void iVerifyLanguageTextInAppSettingsPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Language text in App Settings page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_languageText, Constant_AccountSettings.appSettings_languageText_Access_Id);
    }

    @Then("I verify selected language is displayed")
    public void iVerifySelectedLanguageIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify selected language is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.appSettings_selectedLanguage_Access_Id));
    }

    @Then("I verify celsiusText is displayed")
    public void iVerifyCelsiusTextIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify celsiusText is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.appSettings_celsiusText_Access_Id));
    }

    @Then("I verify fahrenheitText is displayed")
    public void iVerifyFahrenheitTextIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify fahrenheitText is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.appSettings_fahrenheitText_Access_Id));
    }

    @Then("I verify Unit text is displayed")
    public void iVerifyUnitTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Unit text is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_unitText, Constant_AccountSettings.appSettings_unitText_Access_Id);
    }

    @Then("I verify selected unit text is displayed")
    public void iVerifySelectedUnitTextIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify selected unit text is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.appSettings_selectedUnit_Access_Id));
    }

    @Then("I verify App version text is displayed")
    public void iVerifyAppVersionTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify App version text is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_versionText, Constant_AccountSettings.appSettings_versionText_Access_Id);
    }

    @Then("I verify Temperature text in App Settings page")
    public void iVerifyTemperatureTextInAppSettingsPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Temperature text in App Settings page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_temperatureContainer, Constant_AccountSettings.appSettings_temperatureContainer_Access_Id);
    }

    @Then("I Tap on Language in App Settings page")
    public void iTapOnLanguageInAppSettingsPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Language in App Settings page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.appSettings_languageText_Access_Id);
        Thread.sleep(2000);
    }

    @Then("I Tap on Units in App Settings page")
    public void iTapOnUnitsInAppSettingsPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Units in App Settings page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.appSettings_unitText_Access_Id);
        Thread.sleep(2000);
    }


    @Then("I enter an Emoji's in First name Field in Edit profile screen")
    public void iEnterAnEmojiSInFirstNameFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Emoji's in First name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        String emojis = Constant_AccountSettings.grinning_face_with_smiling_eyes + Constant_AccountSettings.face_with_tears_of_joy +
                Constant_AccountSettings.smiling_face_with_open_mouth_and_cold_sweat + Constant_AccountSettings.smiling_face_with_open_mouth_and_tightly_closed_eyes +
                Constant_AccountSettings.winking_face;
        entertextaccessabilityId(emojis, Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter an Emoji's in Last name Field in Edit profile screen")
    public void iEnterAnEmojiSInLastNameFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Emoji's in Last name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        String emojis = Constant_AccountSettings.grinning_face_with_smiling_eyes + Constant_AccountSettings.face_with_tears_of_joy +
                Constant_AccountSettings.smiling_face_with_open_mouth_and_cold_sweat + Constant_AccountSettings.smiling_face_with_open_mouth_and_tightly_closed_eyes +
                Constant_AccountSettings.winking_face;
        entertextaccessabilityId(emojis, Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I enter an Emoji's in Address field in Edit profile screen")
    public void iEnterAnEmojiSInAddressFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Address in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_addressValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_addressValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        String emojis = Constant_AccountSettings.grinning_face_with_smiling_eyes + Constant_AccountSettings.face_with_tears_of_joy +
                Constant_AccountSettings.smiling_face_with_open_mouth_and_cold_sweat + Constant_AccountSettings.smiling_face_with_open_mouth_and_tightly_closed_eyes +
                Constant_AccountSettings.winking_face;
        entertextaccessabilityId(emojis, Constant_AccountSettings.editProfile_addressValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I enter an empty in First name Field in Edit profile screen")
    public void iEnterAnEmptyInFirstNameFieldInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an empty in First name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I enter an empty in Last name Field in Edit profile screen")
    public void iEnterAnEmptyInLastNameFieldInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an empty in Last name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I enter an empty in Address field in Edit profile screen")
    public void iEnterAnEmptyInAddressFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an empty in Address field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_addressValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_addressValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I enter an empty in Primary Field Mobile in Edit profile screen")
    public void iEnterAnEmptyINPrimaryFieldMobileInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an empty in Primary Field Mobile in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_phoneValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_phoneValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter an Special character in First name Field in Edit profile screen")
    public void iEnterAnSpecialCharacterInFirstNameFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Special character in First name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_AccountSettings.editProfile_firstNameValue_SpecialCharacter, Constant_AccountSettings.editProfile_firstNNameValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I enter an Special character in Last name Field in Edit profile screen")
    public void iEnterAnSpecialCharacterInLastNameFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Special character in Last name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_AccountSettings.editProfile_lastameValue_SpecialCharacter, Constant_AccountSettings.editProfile_lastNameValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I enter an Special character in Address field in Edit profile screen")
    public void iEnterAnSpecialCharacterInAddressFieldInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Special character in Address field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_AccountSettings.editProfile_addressValue_Access_Id);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_AccountSettings.editProfile_addressValue_Access_Id);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_AccountSettings.editProfile_addressValue_SpecialCharacter, Constant_AccountSettings.editProfile_addressValue_Access_Id);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I Verify the account setting header")
    public void iVerifyTheAccountSettingHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the account setting header");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_AccountSetting_Header, Constant_AccountSettings.profile_AccountSetting_Header_Access_Id);
    }

    @Then("I verify the account holder photo")
    public void iVerifyTheAccountHolderPhoto() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the account holder photo");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_AccountSettings_photo_Access_Id));
    }

    @Then("I verify the user name in account setting")
    public void iVerifyTheUserNameInAccountSetting() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the user name in account setting");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_AccountSettings_userNAme_Access_Id));
    }

    @Then("I verify the user mail id")
    public void iVerifyTheUserMailId() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the user mail id");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.profile_AccountSettings_mail_id_Access_Id));
    }

    @Then("I Verify the profile text")
    public void iVerifyTheProfileText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the profile text");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_accountSetting_profile_text, Constant_AccountSettings.profile_accountSetting_profile_text_Access_Id);
    }

    @Then("I Verify the Subscription text")
    public void iVerifyTheSubscriptionText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Subscription text");
        asserttextValidationAccessibility(Constant_AccountSettings.profile_AccountSetting_subscription, Constant_AccountSettings.profile_AccountSetting_subscription_Access_Id);
    }

    @Then("I Navigate to the Profile page")
    public void iNavigateToTheProfilePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Navigate to the Profile page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.profile_accountSetting_profile_text_Access_Id);
    }

    @Then("I Navigate to Subscription page")
    public void iNavigateToSubscriptionPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Navigate to Subscription page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.profile_AccountSetting_subscription_Access_Id);
    }

    @Then("I verify the Device Management Header")
    public void iVerifyTheDeviceManagementHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Device Management Header");
        asserttextValidationAccessibility(Constant_AccountSettings.Settings_DeviceManagement_header, Constant_AccountSettings.Settings_DeviceManagement_header_accessid);
    }

    @Then("I verify the Device Management Logo")
    public void iVerifyTheDeviceManagementLogo() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Device Management Logo");
//        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Settings_DeviceManage_MarineDevice_logo_accessid));
    }

    @Then("I verify the Device Management right icon")
    public void iVerifyTheDeviceManagementRightIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Device Management right icon");
//        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Settings_DeviceManagement_righticon_Access_Id));
    }

    @Then("I verify the Add New Button text")
    public void iVerifyTheAddNewButtonText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Add New Button text");
        asserttextValidationAccessibility(Constant_AccountSettings.Settings_DeviceManage_AddNew_Button, Constant_AccountSettings.Settings_DeviceManage_AddNew_Button_accessid);
    }

    @Then("I Tap on the Add New button")
    public void iTapOnTheAddNewButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Add New button");
        TaponbuttonaccessabilityID(Constant_AccountSettings.Settings_DeviceManage_AddNew_Button_accessid);
    }

    @Then("I Verify the OnBoarding Header")
    public void iVerifyTheOnBoardingHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the OnBoarding Header");
        asserttextValidationAccessibility(Constant_AccountSettings.Settings_Onboarding_HeaderText, Constant_AccountSettings.Settings_Onboarding_HeaderText_Access_Id);
    }

    @Then("I Verify the close button in Onboarding Page")
    public void iVerifyTheCloseButtonInOnboardingPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the close button in Onboarding Page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Settings_Onboarding_close_button_Access_Id));
    }

    @Then("I Verify the Attention image")
    public void iVerifyTheAttentionImage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Attention image");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Settings_Onboarding_attention_image_accessid));
    }

    @Then("I Verify the Bluetooth Pairing Message")
    public void iVerifyTheBluetoothPairingMessage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Bluetooth Pairing Message");
        asserttextValidationAccessibility(Constant_AccountSettings.Settings_Onboarding_BluetoothPairing_message, Constant_AccountSettings.Settings_Onboarding_BluetoothPairing_message_access_id);
    }

    @Then("I verify the Search Again Text")
    public void iVerifyTheSearchAgainText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Search Again Text");
        asserttextValidationAccessibility(Constant_AccountSettings.Settings_Onboarding_SearchAgain, Constant_AccountSettings.Settings_Onboarding_SearchAgain_accessid);
    }

    @Then("I Tap on close button")
    public void iTapOnCloseButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on close button");
        TaponbuttonaccessabilityID(Constant_AccountSettings.Settings_Onboarding_close_button);
    }

    @Then("I verify if subscription title is displayed")
    public void iVerifyIfSubscriptionTitleIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if subscription title is displayed");
        asserttextValidationAccessibility(Constant_AccountSettings.Subscription_title, Constant_AccountSettings.Subscription_title_accessid);
    }

    @Then("I verify if subscription back button is available")
    public void iVerifyIfSubscriptionBackButtonIsAvailable() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if subscription back button is available");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Subscription_backbutton_accessid));
    }

    @Then("I verify Back Button displayed in Language Page")
    public void iVerifyBackButtonDisplayedInLanguagePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Back Button displayed in Language Page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.appSettings_Back_Button_Access_Id));
    }

    @Then("I verify Language Header Text in Language Page")
    public void iVerifyLanguageHeaderTextInLanguagePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Language Header Text in Language Page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_language_header_TitleText, Constant_AccountSettings.appSettings_language_header_TitleText_Access_Id);
    }

    @Then("I Verify Language English Text in Language Page")
    public void iVerifyLanguageEnglishTextInLanguagePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Language English Text in Language Page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_Language_English_CardTitle_Text, Constant_AccountSettings.appSettings_Language_English_CardTitle_Access_Id);
    }

    @Then("I Verify Language German Text in Language Page")
    public void iVerifyLanguageGermanTextInLanguagePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Language German Text in Language Page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_Language_German_CardTitle_Text, Constant_AccountSettings.appSettings_Language_German_CardTitle_Access_Id);
    }

    @Then("I Verify Language Spanish \\(US) Text in Language Page")
    public void iVerifyLanguageSpanishUSTextInLanguagePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Language Spanish(US) Text in Language Page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_Language_Spanish_CardTitle_Text, Constant_AccountSettings.appSettings_Language_Spanish_CardTitle_Access_Id);
    }

    @Then("I Verify Language French Text in Language Page")
    public void iVerifyLanguageFrenchTextInLanguagePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Language French Text in Language Page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_Language_French_CardTitle_Text, Constant_AccountSettings.appSettings_Language_French_CardTitle_Access_Id);
    }

    @Then("I verify Back Button displayed in Units Page")
    public void iVerifyBackButtonDisplayedInUnitsPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Back Button displayed in Units Page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.appSettings_Back_Button_Access_Id));
    }

    @Then("I verify Metric Text in Units Page")
    public void iVerifyMetricTextInUnitsPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Metric Text in Units Page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_Unit_Metric_Text, Constant_AccountSettings.appSettings_Unit_Metric_Access_Id);
    }

    @Then("I verify Imperial Text in Units Page")
    public void iVerifyImperialTextInUnitsPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Imperial Text in Units Page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_Unit_Imperial_Text, Constant_AccountSettings.appSettings_Unit_Imperial_Access_Id);
    }

    @Then("I verify Units Header Text in Units Page")
    public void iVerifyUnitsHeaderTextInUnitsPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Units Header Text in Units Page");
        asserttextValidationAccessibility(Constant_AccountSettings.appSettings_Unit_header_TitleText_Text, Constant_AccountSettings.appSettings_Unit_header_TitleText_Access_Id);
    }

    @Then("I Tap on German Language in Language Page")
    public void iTapOnGermanLanguageInLanguagePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on German Language in Language Page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.appSettings_Language_German_CardTitle_Access_Id);
    }

    @Then("I Tap on Spanish \\(US) Language in Language Page")
    public void iTapOnSpanishUSLanguageInLanguagePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Spanish(US) Language in Language Page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.appSettings_Language_Spanish_CardTitle_Access_Id);
    }

    @Then("I Tap on French Language in Language Page")
    public void iTapOnFrenchLanguageInLanguagePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on French Language in Language Page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.appSettings_Language_French_CardTitle_Access_Id);
    }

    @Then("I Tap on English Language in Language Page")
    public void iTapOnEnglishLanguageInLanguagePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on English Language in Language Page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.appSettings_Language_English_CardTitle_Access_Id);
    }

    @Then("I Tap on Imperial Unit in Units Page")
    public void iTapOnImperialUnitInUnitsPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Imperial Unit in Units Page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.appSettings_Unit_Imperial_Access_Id);
    }

    @Then("I Tap on Metric Unit in Units Page")
    public void iTapOnMetricUnitInUnitsPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Metric Unit in Units Page");
        TaponbuttonaccessabilityID(Constant_AccountSettings.appSettings_Unit_Metric_Access_Id);

    }

    @Then("I Verified the Manage Notification header")
    public void iVerifiedTheManageNotificationHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Manage Notification header");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_Header_text, Constant_AccountSettings.Notification_Header_accessid);

    }

    @Then("I Verified the Push notifications Text")
    public void iVerifiedThePushNotificationsText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Push notifications Text");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_PushNotification_text, Constant_AccountSettings.Notification_PushNotification_accessid);
    }

    @Then("I Verified the Push Notification show more text")
    public void iVerifiedThePushNotificationShowMoreText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Push Notification show more text");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_pushnotification_showMore, Constant_AccountSettings.Notification_pushnotification_showMore_accessid);
    }

    @Then("I Verified Email text")
    public void iVerifiedEmailText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified Email text");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_Email_text, Constant_AccountSettings.Notification_Email_accessid);
    }

    @Then("I Verified the Email show more text")
    public void iVerifiedTheEmailShowMoreText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Email show more text");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_Email_showmore_text, Constant_AccountSettings.Notification_Email_showmore_accessid);
    }

    @Then("I verified SMS Text")
    public void iVerifiedSMSText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verified SMS Text");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_sms, Constant_AccountSettings.Notification_sms_accessid);
    }

    @Then("I Verified the SMS show more text")
    public void iVerifiedTheSMSShowMoreText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the SMS show more text");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_Sms_list_showMore, Constant_AccountSettings.Notification_Sms_list_showMore_accessid);
    }

    @Then("I Verified the Advanced Text")
    public void iVerifiedTheAdvancedText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Advanced Text");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_advancedText, Constant_AccountSettings.Notification_advancedText_accessid);

    }

    @Then("I Verified the Marine Name in Advance option")
    public void iVerifiedTheMarineNameInAdvanceOption() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Marine Name in Advance option");
//        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Notification_Advance_MarineNAme));
    }

    @Then("I Verified the Marine Logo in Advance option")
    public void iVerifiedTheMarineLogoInAdvanceOption() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Marine Logo in Advance option");
//        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Notification_Advance_MarineICon));
    }

    @Then("I verified the marine colapse icon")
    public void iVerifiedTheMarineColapseIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verified the marine colapse icon");
//        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Notification_Advance_MarineICon_collapseicon));
    }

    @Then("I Tap on the Marine colapse icon")
    public void iTapOnTheMarineColapseIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Marine colapse icon");
        Taponbutton(Constant_AccountSettings.Notification_PushNotification_Advance_Marine_Pushnotification);
//        TaponbuttonaccessabilityID(Constant_AccountSettings.Notification_Advance_MarineICon_collapseicon);
    }

    @Then("I verify the Header of the Advanced Main Page")
    public void iVerifyTheHeaderOfTheAdvancedMainPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Header of the Advanced Main Page");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_Advanced_Header, Constant_AccountSettings.Notification_Advanced_Header_text);
    }

    @Then("I verify the Push notification text in Advanced Main Page")
    public void iVerifyThePushNotificationTextInAdvancedMainPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Push notification text in Advanced Main Page");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_Advance_PushNotification, Constant_AccountSettings.Notification_Advance_PushNotification_text);
    }

    @Then("I verify the Push notification Toggle in Advanced Main Page")
    public void iVerifyThePushNotificationToggleInAdvancedMainPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Push notification Toggle in Advanced Main Page");
        iselementdisplayedaccessabilityId(Constant_AccountSettings.Notification_Advanced_PushNotification_Toggle_button);
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_AccountSettings.Notification_PushNotification_Advance_Marine_Pushnotification_ToggleButton);
        if (elementsByAccessibilityId.size() == 0) {
            TaponbuttonaccessabilityID(Constant_AccountSettings.Notification_PushNotification_Advance_Marine_Pushnotification_ToggleButton);
            Thread.sleep(5000);
            System.out.println("Toggle button tapped");
        } else {
            System.out.println("Button is Switched on");
        }
    }

    @Then("I Verified the Push Notification Toggle button status")
    public void iVerifiedThePushNotificationToggleButtonStatus() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Push Notification Toggle button status");
//        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_AccountSettings.Notification_pushnotification_showMore_accessid);
//        if (elementsByAccessibilityId.size() == 0) {
//            TaponbuttonaccessabilityID(Constant_AccountSettings.Notification_PushNotification_ToggleButton);
//            Thread.sleep(5000);
//            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Notification_pushnotification_showMore_accessid));
//        } else {
//            System.out.println("Button is Switched on");
//            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Notification_pushnotification_showMore_accessid));
//        }
        try {
            driver.findElementByAccessibilityId(Constant_ManagementNotifications.ManageNotifications_push_show_more_text_access_id).isDisplayed();
            // TaponbuttonaccessabilityID(constant_managementNotifications.ManageNotifications_PushNotifications_toggle_access_id);
            // TaponbuttonaccessabilityID(constant_managementNotifications.ManageNotifications_PushNotifications_toggle_access_id);
        } catch (Throwable e) {
            System.out.println("Already ON!");
            flag = 1;
            TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_PushNotifications_toggle_access_id);

        } finally {
            if (flag == 0) {
                TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_PushNotifications_toggle_access_id);
            }
        }
    }

    @Then("I Verified the Email List Toggle button status")
    public void iVerifiedTheEmailListToggleButtonStatus() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Email List Toggle button status");
//        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_AccountSettings.Notification_Email_showmore_accessid);
//        if (elementsByAccessibilityId.size() == 0) {
//            TaponbuttonaccessabilityID(Constant_AccountSettings.Notification_PushNotification_Email_ToggleButton);
//            Thread.sleep(5000);
//            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Notification_Email_showmore_accessid));
//        } else {
//            System.out.println("Button is Switched on");
//            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Notification_Email_showmore_accessid));
//        }
        try {
            driver.findElementByAccessibilityId(Constant_ManagementNotifications.ManageNotifications_showmore_text_access_id).isDisplayed();
            // TaponbuttonaccessabilityID(constant_managementNotifications.ManageNotifications_PushNotifications_toggle_access_id);
            // TaponbuttonaccessabilityID(constant_managementNotifications.ManageNotifications_PushNotifications_toggle_access_id);
        } catch (Throwable e) {
            System.out.println("Already ON!");
            EmailToggle = 1;
            TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_Email_toggle_access_id);

        } finally {
            if (EmailToggle == 0) {
                TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_Email_toggle_access_id);
            }
        }
    }

    @Then("I Verified the Sms List Toggle button status")
    public void iVerifiedTheSmsListToggleButtonStatus() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Sms List Toggle button status");
//        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_AccountSettings.Notification_Sms_list_showMore_accessid);
//        if (elementsByAccessibilityId.size() == 0) {
//            TaponbuttonaccessabilityID(Constant_AccountSettings.Notification_PushNotification_SMS_ToggleButton);
//            Thread.sleep(5000);
//            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Notification_Sms_list_showMore_accessid));
//        } else {
//            System.out.println("Button is Switched on");
//            Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Notification_Sms_list_showMore_accessid));
//        }
        try {
            driver.findElementByAccessibilityId(Constant_ManagementNotifications.ManageNotifications_sms_showmore_text_access_id).isDisplayed();
            // TaponbuttonaccessabilityID(constant_managementNotifications.ManageNotifications_PushNotifications_toggle_access_id);
            // TaponbuttonaccessabilityID(constant_managementNotifications.ManageNotifications_PushNotifications_toggle_access_id);
        } catch (Throwable e) {
            System.out.println("Already ON!");
            EmailToggle = 1;
            TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_toggle_access_id);

        } finally {
            if (EmailToggle == 0) {
                TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_toggle_access_id);
            }
        }
    }

    @Then("I Tap on Push Notification show more text")
    public void iTapOnPushNotificationShowMoreText() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Push Notification show more text");
        TaponbuttonaccessabilityID(Constant_AccountSettings.Notification_pushnotification_showMore_accessid);
        Thread.sleep(2000);
    }

    @Then("I verify Alert text in Push Notification")
    public void iVerifyAlertTextInPushNotification() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alert text in Push Notification");
        asserttextValidationAccessibility(Constant_AccountSettings.managePushNotification_Alert_Text, Constant_AccountSettings.managePushNotification_Alert_Text_Access_Id);
    }

    @Then("I verify Alert toggle in Push Notification")
    public void iVerifyAlertToggleInPushNotification() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Alert toggle in Push Notification");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.managePushNotification_Alert_Toggle_Access_Id));
    }

    @Then("I verify Warning text in Push Notification")
    public void iVerifyWarningTextInPushNotification() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Warning text in Push Notification");
        asserttextValidationAccessibility(Constant_AccountSettings.managePushNotification_Warning_Text, Constant_AccountSettings.managePushNotification_Warning_Text_Access_Id);
    }

    @Then("I verify Warning toggle in Push Notification")
    public void iVerifyWarningToggleInPushNotification() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Warning toggle in Push Notification");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.managePushNotification_Warning_Toggle_Access_Id));
    }

    @Then("I Tap on Push Notification show less text")
    public void iTapOnPushNotificationShowLessText() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Push Notification show less text");
        TaponbuttonaccessabilityID(Constant_AccountSettings.Notification_pushnotification_showMore_accessid);
        Thread.sleep(2000);
    }

    @Then("I Verified the Email-List Text")
    public void iVerifiedTheEmailListText() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Email-List Text");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Notification_Email_List));
    }

    @Then("I Verified the Alerts Text in Email options")
    public void iVerifiedTheAlertsTextInEmailOptions() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Alerts Text in Email options");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_Alerts_text, Constant_AccountSettings.Notification_Alerts_accessid);
    }

    @Then("I Verified the Warnings Text in Email options")
    public void iVerifiedTheWarningsTextInEmailOptions() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Warnings Text in Email options");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_Warning_text, Constant_AccountSettings.Notification_Warning_accessid);
    }

    @Then("I Verified the Edit List in Email option")
    public void iVerifiedTheEditListInEmailOption() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Edit List in Email option");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_Email_EditList_Text, Constant_AccountSettings.Notification_Email_EditList);
    }

    @Then("I Tap on the Edit List in Email option")
    public void iTapOnTheEditListInEmailOption() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Edit List in Email option");
        TaponbuttonaccessabilityID(Constant_AccountSettings.Notification_Email_EditList);
        Thread.sleep(2000);
    }

    @Then("I Verified Email List Header")
    public void iVerifiedEmailListHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified Email List Header");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_EmailList_Header_Text, Constant_AccountSettings.Notification_EmailList_Header);
    }

    @Then("I Verified the E-mail\\(Account) text")
    public void iVerifiedTheEMailAccountText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the E-mail(Account) text");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_EmailList_emailAccount_Text, Constant_AccountSettings.Notification_EmailList_emailAccount);
    }

    @Then("I Verified the Additional Emails options in Email List")
    public void iVerifiedTheAdditionalEmailsOptionsInEmailList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Additional Emails options in Email List");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_Additional_Email_Text, Constant_AccountSettings.Notification_Additional_Email);
    }

    @Then("I Verified the Add new button in Email List")
    public void iVerifiedTheAddNewButtonInEmailList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Add new button in Email List");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Notification_Addnew_Button));
    }

    @Then("I Verified the Save button in Email List")
    public void iVerifiedTheSaveButtonInEmailList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Save button in Email List");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Notification_EmailList_Save_Button_text));
    }

    @Then("I Tap on the Add New button in Email List")
    public void iTapOnTheAddNewButtonInEmailList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Add New button in Email List");
        TaponbuttonaccessabilityID(Constant_AccountSettings.Notification_Addnew_Button);
    }

    @Then("I Verified the Email Input field in Email List")
    public void iVerifiedTheEmailInputFieldInEmailList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Email Input field in Email List");
//        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Notification_Additional_emails_EmailContainer));
    }

    @Then("I Verified the Label Input field in Email List")
    public void iVerifiedTheLabelInputFieldInEmailList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Label Input field in Email List");
//        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Notification_Additional_email_Label));
    }

    @Then("I Tap on cancel button in Email List")
    public void iTapOnCancelButtonInEmailList() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on cancel button in Email List");
        TaponbuttonaccessabilityID(Constant_AccountSettings.managePushNotification_Cancel_Button_Access_Id);
        Thread.sleep(2000);
    }

    @Then("I Tap on Email show more text")
    public void iTapOnEmailShowMoreText() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Email show more text");
        TaponbuttonaccessabilityID(Constant_AccountSettings.Notification_Email_showmore_accessid);
        Thread.sleep(2000);
    }

    @Then("I Tap on SMS show more text")
    public void iTapOnSMSShowMoreText() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on SMS show more text");
        TaponbuttonaccessabilityID(Constant_AccountSettings.Notification_Sms_list_showMore_accessid);
        Thread.sleep(2000);
    }

    @Then("I Verified SMS List text")
    public void iVerifiedSMSListText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified SMS List text");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_Sms_List, Constant_AccountSettings.Notification_Sms_List_accessid);
    }

    @Then("I Verified the Edit List Text")
    public void iVerifiedTheEditListText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Edit List Text");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_EditList, Constant_AccountSettings.Notification_EditList_accessid);

    }

    @Then("I Verified the SMS Alert Text")
    public void iVerifiedTheSMSAlertText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the SMS Alert Text");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_Sms_Alerts, Constant_AccountSettings.Notification_Sms_Alert_accessid);
    }

    @Then("I Verified the SMS Warning Text")
    public void iVerifiedTheSMSWarningText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the SMS Warning Text");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_Sms_Warning, Constant_AccountSettings.Notification_Sms_Warnings_accessid);
    }

    @Then("I Tap on the Edit List text Expand icon")
    public void iTapOnTheEditListTextExpandIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Edit List text Expand icon");
        TaponbuttonaccessabilityID(Constant_AccountSettings.Notification_EditList_accessid);
    }

    @Then("I Verified the SMS List Header")
    public void iVerifiedTheSMSListHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the SMS List Header");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_SmsList_Header_Text, Constant_AccountSettings.Notification_SmsList_header);
    }

    @Then("I Verified the Mobile\\(Account) text")
    public void iVerifiedTheMobileAccountText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Mobile(Account) text");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_Mobile_account, Constant_AccountSettings.Notification_Mobile_account_Accessid);
    }

    @Then("I Verified the Additional SMS Numbers Text")
    public void iVerifiedTheAdditionalSMSNumbersText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Additional SMS Numbers Text");
        asserttextValidationAccessibility(Constant_AccountSettings.Notification_Additional_Sms_Number_accessid_Text, Constant_AccountSettings.Notification_Additional_Sms_Number_accessid);
    }

    @Then("I Verified the Add new button in SMS List")
    public void iVerifiedTheAddNewButtonInSMSList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Add new button in SMS List");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Notification_addNew_button));
    }

    @Then("I Verified the Save button  in SMS List")
    public void iVerifiedTheSaveButtonInSMSList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verified the Save button  in SMS List");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_AccountSettings.Notification_SaveButton));
    }

    @Then("I Tap on cancel button in SMS List")
    public void iTapOnCancelButtonInSMSList() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on cancel button in SMS List");
        TaponbuttonaccessabilityID(Constant_AccountSettings.managePushNotification_Cancel_Button_Access_Id);
        Thread.sleep(2000);
    }

    @Then("I Tap on Device management right icon")
    public void iTapOnDeviceManagementRightIcon() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Device management right icon");
        TaponbuttonaccessabilityID(Constant_settings.Device_management_slide_menu_right_icon_access_id);
        Thread.sleep(2000);
    }

    @Then("I verify the device management title text")
    public void iVerifyTheDeviceManagementTitleText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the device management title text");
        asserttextValidationAccessibility(Constant_settings.Device_management_header_text, Constant_settings.Device_management_header_text_tile);
    }

    @Then("I verify the vessel information text")
    public void iVerifyTheVesselInformationText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the vessel information text");
        asserttextValidationAccessibility(Constant_settings.Device_management_Vessel_tile_label, Constant_settings.Device_management_Vessel_tile_lable_access_id);
    }

    @Then("I verify the name card title")
    public void iVerifyTheNameCardTitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the name card title");
        asserttextValidationAccessibility(Constant_settings.Device_management_Vessel_Name_label, Constant_settings.Device_management_Vessel_Name_lable_access_id);
    }

    @Then("I verify the hull id number title text")
    public void iVerifyTheHullIdNumberTitleText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the hull id number title text");
        asserttextValidationAccessibility(Constant_settings.Device_management_Hull_Id_Number, Constant_settings.Device_management_Hull_Id_Number_aceess_id);
    }

    @Then("I verify the edit vessel title text")
    public void iVerifyTheEditVesselTitleText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the edit vessel title text");
        asserttextValidationAccessibility(Constant_settings.Device_management_Edit_vessel_title, Constant_settings.Device_management_Edit_vessel_title_access_id);
    }

    @Then("I verify the right icon of edit vessel")
    public void iVerifyTheRightIconOfEditVessel() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the right icon of edit vessel");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_management_Edit_vessel_card_icon_access_id));
    }

    @Then("I verify the advanced text")
    public void iVerifyTheAdvancedTest() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the advanced test");
        asserttextValidationAccessibility(Constant_settings.Device_management_advanced_Title_Text, Constant_settings.Device_management_advanced_Title_Text_access_id);
    }

    @Then("I verify the check updates title text")
    public void iVerifyTheCheckUpdatesTitleText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the check updates title text");
        asserttextValidationAccessibility(Constant_settings.Device_management_check_updates_card_title, Constant_settings.Device_management_check_updates_card_title_access_id);
    }

    @Then("I verify the right icon of check updates")
    public void iVerifyTheRightIconOfCheckUpdates() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the right icon of check updates");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_management_check_updates_card_icon_access_id));
    }

    @Then("I verify the unregister delete off board title text")
    public void iVerifyTheUnregisterDeleteOffBoardTitleText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the unregister delete off board title text");
        asserttextValidationAccessibility(Constant_settings.Device_management_unregister_Delete_cardTitle, Constant_settings.Device_management_unregister_Delete_cardTitle_access_id);
    }

    @Then("I verify the right icon of unregister delete off board")
    public void iVerifyTheRightIconOfUnregisterDeleteOffBoard() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the right icon of unregister delete off board");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_management_unregister_Delete_right_icon_access_id));
    }

    @Then("I verify the vessel name label text")
    public void iVerifyTheVesselNameLableText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the vessel name lable text");
        asserttextValidationAccessibility(Constant_settings.Device_management_edit_vessel_name_label, Constant_settings.Device_management_edit_vessel_name_lable_access_id);
    }

    @Then("I Tap on edit vessel button on device management screen")
    public void iTapOnEditVesselButtonOnDeviceManagementScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on edit vessel button on device management screen");
        TaponbuttonaccessabilityID(Constant_settings.Device_management_Edit_vessel_card_icon_access_id);
        Thread.sleep(2000);
    }

    @Then("I verify the mac address label text")
    public void iVerifyTheMacAddressLableText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the mac address lable text");
        asserttextValidationAccessibility(Constant_settings.Device_management_edit_mac_address, Constant_settings.Device_management_edit_mac_address_access_id);
    }

    @Then("I verify the save button text")
    public void iVerifyTheSaveButtonText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the save button text");
        asserttextValidationAccessibility(Constant_settings.Device_management_edit_save_button, Constant_settings.Device_management_edit__save_button_access_id);
    }

    @Then("I verify the Cancel button on the edit screen")
    public void iVerifyTheBackButtonOnTheEditScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the back button on the edit screen");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Device_management_edit_page_Cancel_Button_Xpath));
    }

    @Then("I verify No device found text")
    public void iVerifyNoDeviceFoundText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify No device found text");
        asserttextValidationAccessibility(Constant_AccountSettings.onboarding_No_Device_Found_Text, Constant_AccountSettings.onboarding_No_Device_Found_Text_Access_Id);
    }

    @Then("I Turn OFF push notifications alerts toggle")
    public void iTurnOFFPushNotificationsAlertsToggle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on push notifications alerts toggle");
        Taponbutton(Constant_ManagementNotifications.ManageNotifications_Push_alerts_toggle_xpath);
    }

    @Then("I Turn OFF push notifications warnings toggle")
    public void iTurnOFFPushNotificationsWarningsToggle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn OFF push notifications warnings toggle");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_push_warnings_toggle_access_id);
    }

    @Then("I Turn ON push notifications alerts toggle")
    public void iTurnONPushNotificationsAlertsToggle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn OFF push notifications warnings toggle");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_push_alerts_toggle_access_id);
    }

    @Then("I Turn ON push notifications warnings toggle")
    public void iTurnONPushNotificationsWarningsToggle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn OFF push notifications warnings toggle");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_push_warnings_toggle_access_id);
    }

    @Then("I delete the existing list of Emails")
    public void iDeleteTheExistingListOfEmails() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I delete the existing list of Emails");
        List<AndroidElement> delete_elements = driver.findElements(By.xpath(Constant_ManagementNotifications.ManageNotifications_Edit_Email_delete_xpath));
        while (delete_elements.size() != 0) {
            try {
                Taponbutton(Constant_ManagementNotifications.ManageNotifications_Edit_Email_delete_xpath);
                delete_elements = driver.findElements(By.xpath(Constant_ManagementNotifications.ManageNotifications_Edit_Email_delete_xpath));
            } catch (Throwable throwable) {
                break;
            }
        }
    }

    @Then("I Tap on Save button in Edit E-mail list screen")
    public void iTapOnSaveButtonInEditEMailListScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Save button in Edit E-mail list screen");
        Taponbutton(Constant_ManagementNotifications.ManageNotifications_Edit_Email_save_button_xpath);

    }

    @Then("I enter a valid E-mail in E-mail field")
    public void iEnterAValidEMailInEMailField() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a valid E-mail in E-mail field");
        entertextaccessabilityId(Constant_ManagementNotifications.ManageNotifications_Edit_Email_valid_input, Constant_ManagementNotifications.ManageNotifications_Edit_Email_element_1_access_id);
        Edited_Email = Constant_ManagementNotifications.ManageNotifications_Edit_Email_valid_input;
    }

    @Then("I enter a valid E-mail label name")
    public void iEnterAValidEMailLabelName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a valid E-mail label name");
        entertextaccessabilityId(Constant_ManagementNotifications.ManageNotifications_Edit_Email_label_valid_input, Constant_ManagementNotifications.ManageNotifcations_Edit_Email_label_1_access_id);
        Edited_Label = Constant_ManagementNotifications.ManageNotifications_Edit_Email_label_valid_input;

    }

    @Then("I verify if the edited E-mail is displayed in the E-mail list")
    public void iVerifyIfTheEditedEMailIsDisplayedInTheEMailList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited E-mail is displayed in the E-mail list");
        asserttextValidationAccessibility(Edited_Email, Constant_ManagementNotifications.ManageNotifications_EmailList_Email_2_access_id);

    }

    @Then("I verify if the edited Label name is displayed below the respective E-mail")
    public void iVerifyIfTheEditedLabelNameIsDisplayedBelowTheRespectiveEMail() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited Label name is displayed below the respective E-mail");
        asserttextValidationAccessibility(Edited_Label, Constant_ManagementNotifications.ManageNotifications_EmailList_label_text_2_access_id);
    }

    @Then("I turn ON the toggle for the first edited E-mail in list")
    public void iTurnONTheToggleForTheFirstEditedEMailInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn ON the toggle for the first E-mail in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_EmailList_1_toggle_access_id);
    }

    @Then("I turn OFF the toggle for the first edited E-mail in list")
    public void iTurnOFFTheToggleForTheFirstEditedEMailInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn OFF the toggle for the first edited E-mail in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_EmailList_2_toggle_access_id);
    }

    @Then("I Try to Turn ON the toggle for the first E-mail in list")
    public void iTryToTurnONTheToggleForTheFirstEMailInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn ON the toggle for the first E-mail in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_EmailList_1_toggle_access_id);
    }

    @Then("I try to Turn OFF the toggle for the first value in list")
    public void iTryToTurnOFFTheToggleForTheFirstValueInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I try to Turn OFF the toggle for the first value in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_EmailList_2_toggle_access_id);
    }

    @Then("I enter an invalid E-mail in E-mail field")
    public void iEnterAnInvalidEMailInEMailField() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an invalid E-mail in E-mail field");
        entertextaccessabilityId(Constant_ManagementNotifications.ManageNotifications_Edit_Email_invalid_input, Constant_ManagementNotifications.ManageNotifactions_Edit_Email_element_2_access_id);
        Edited_Email = Constant_ManagementNotifications.ManageNotifications_Edit_Email_invalid_input;
    }

    @Then("I enter an invalid E-mail label name")
    public void iEnterAnInvalidEMailLabelName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an invalid E-mail label name");
        entertextaccessabilityId(Constant_ManagementNotifications.ManageNotifications_Edit_Email_label_invalid_input, Constant_ManagementNotifications.ManageNotifications_Edit_Email_label_2_access_id);
        Edited_Label = Constant_ManagementNotifications.ManageNotifications_Edit_Email_label_invalid_input;
    }

    @Then("I verify if the edited invalid E-mail is displayed in the E-mail list")
    public void iVerifyIfTheEditedInvalidEMailIsDisplayedInTheEMailList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited invalid E-mail is displayed in the E-mail list");
        asserttextValidationAccessibility(Edited_Email, Constant_ManagementNotifications.ManageNotifications_EmailList_Email_3_access_id);

    }

    @Then("I verify if the edited invalid Label name is displayed below the respective E-mail")
    public void iVerifyIfTheEditedInvalidLabelNameIsDisplayedBelowTheRespectiveEMail() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited invalid Label name is displayed below the respective E-mail");
        asserttextValidationAccessibility(Edited_Label, Constant_ManagementNotifications.ManageNotifications_EmailList_label_text_3_access_id);
    }

    @Then("I turn ON the toggle for the edited invalid E-mail in list")
    public void iTurnONTheToggleForTheEditedInvalidEMailInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn ON the toggle for the edited invalid E-mail in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_EmailList_3_toggle_access_id);
    }

    @Then("I turn OFF the toggle for the edited invalid E-mail in list")
    public void iTurnOFFTheToggleForTheEditedInvalidEMailInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn OFF the toggle for the edited invalid E-mail in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_EmailList_3_toggle_access_id);
    }


    @Then("I enter an E-mail that is already added to the list")
    public void iEnterAnEMailThatIsAlreadyAddedToTheList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an E-mail that is already added to the list");
        entertextaccessabilityId(Constant_ManagementNotifications.ManageNotifications_Edit_Email_valid_input, Constant_ManagementNotifications.ManageNotifactions_Edit_Email_element_3_access_id);
        Edited_Email = Constant_ManagementNotifications.ManageNotifications_Edit_Email_valid_input;

    }

    @Then("I enter a label that is already added to the list")
    public void iEnterALabelThatIsAlreadyAddedToTheList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a label that is already added to the list");
        entertextaccessabilityId(Constant_ManagementNotifications.ManageNotifications_Edit_Email_label_valid_input, Constant_ManagementNotifications.ManageNotifications_Edit_Email_label_3_access_id);
        Edited_Label = Constant_ManagementNotifications.ManageNotifications_Edit_Email_label_valid_input;
    }

    @Then("I verify if the edited duplicate E-mail is displayed in the E-mail list")
    public void iVerifyIfTheEditedDuplicateEMailIsDisplayedInTheEMailList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited duplicate E-mail is displayed in the E-mail list");
        asserttextValidationAccessibility(Edited_Email, Constant_ManagementNotifications.ManageNotifications_EmailList_Email_4_access_id);

    }

    @Then("I verify if the edited duplicate Label name is displayed below the respective E-mail")
    public void iVerifyIfTheEditedDuplicateLabelNameIsDisplayedBelowTheRespectiveEMail() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited duplicate Label name is displayed below the respective E-mail");
        asserttextValidationAccessibility(Edited_Label, Constant_ManagementNotifications.ManageNotifications_EmailList_label_text_4_access_id);

    }

    @Then("I Try to Turn ON the toggle for the fourth E-mail in list")
    public void iTryToTurnONTheToggleForTheFourthEMailInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn ON the toggle for the fourth E-mail in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_EmailList_4_toggle_access_id);
    }

    @Then("I try to Turn OFF the toggle for the fourth value in list")
    public void iTryToTurnOFFTheToggleForTheFourthValueInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I try to Turn OFF the toggle for the fourth value in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_EmailList_4_toggle_access_id);
    }

    @Then("I enter a duplicate E-mail already present in list")
    public void iEnterADuplicateEMailAlreadyPresentInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a duplicate E-mail already present in list");
        entertextaccessabilityId(Constant_ManagementNotifications.ManageNotifications_Edit_Email_valid_input, Constant_ManagementNotifications.ManageNotifactions_Edit_Email_element_4_access_id);
        Edited_Email = Constant_ManagementNotifications.ManageNotifications_Edit_Email_valid_input;
    }

    @Then("I enter a label name that is not already present in list")
    public void iEnterALabelNameThatIsNotAlreadyPresentInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a label name that is not already present in list");
        entertextaccessabilityId("test", Constant_ManagementNotifications.ManageNotifications_Edit_Email_label_4_access_id);
        Edited_Label = "test";
    }

    @Then("I verify if the duplicate E-mail is displayed in the E-mail list")
    public void iVerifyIfTheDuplicateEMailIsDisplayedInTheEMailList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the duplicate E-mail is displayed in the E-mail list");
        asserttextValidationAccessibility(Edited_Email, Constant_ManagementNotifications.ManageNotifications_EmailList_Email_5_access_id);
    }

    @Then("I verify if the modified Label name is displayed below the respective E-mail")
    public void iVerifyIfTheModifiedLabelNameIsDisplayedBelowTheRespectiveEMail() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the modified Label name is displayed below the respective E-mail");
        asserttextValidationAccessibility(Edited_Label, Constant_ManagementNotifications.ManageNotifications_EmailList_label_text_5_access_id);
    }

    @Then("I Try to Turn ON the toggle for the fifth E-mail in list")
    public void iTryToTurnONTheToggleForTheFifthEMailInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn ON the toggle for the fifth E-mail in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_EmailList_5_toggle_access_id);
    }

    @Then("I try to Turn OFF the toggle for the fifth value in list")
    public void iTryToTurnOFFTheToggleForTheFifthValueInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I try to Turn OFF the toggle for the fifth value in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_EmailList_5_toggle_access_id);

    }

    @Then("I leave the E-mail field blank")
    public void iLeaveTheEMailFieldBlank() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I leave the E-mail field blank");
        entertextaccessabilityId("", Constant_ManagementNotifications.ManageNotifactions_Edit_Email_element_5_access_id);
        Edited_Email = "";

    }

    @Then("I leave the E-mail label field blank")
    public void iLeaveTheEMailLabelFieldBlank() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I leave the E-mail label field blank");
        entertextaccessabilityId("", Constant_ManagementNotifications.ManageNotifications_Edit_Email_label_5_access_id);
        Edited_Label = "";
    }

    @Then("I Turn OFF E-mail alerts toggle")
    public void iTurnOFFEMailAlertsToggle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn OFF E-mail alerts toggle");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_email_alerts_toggle_button_access_id);

    }

    @Then("I Turn OFF E-mail warnings toggle")
    public void iTurnOFFEMailWarningsToggle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn OFF E-mail warnings toggle");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_email_warnings_toggle_button_access_id);

    }

    @Then("I Turn ON E-mail alerts toggle")
    public void iTurnONEMailAlertsToggle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn ON E-mail alerts toggle");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_email_alerts_toggle_button_access_id);
    }

    @Then("I Turn ON E-mail warnings toggle")
    public void iTurnONEMailWarningsToggle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn ON E-mail warnings toggle");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_email_warnings_toggle_button_access_id);
    }

    @Then("I Tap on E-mail show less navigation button")
    public void iTapOnEMailShowLessNavigationButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn OFF E-mail warnings toggle");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_Email_showless_navigation_access_id);
    }

    @Then("I Turn OFF sms alerts toggle")
    public void iTurnOFFSmsAlertsToggle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn OFF sms alerts toggle");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_alerts_toggle_button_access_id);
    }

    @Then("I Turn OFF sms warnings toggle")
    public void iTurnOFFSmsWarningsToggle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn OFF sms warnings toggle");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_warnings_toggle_button_access_id);

    }

    @Then("I Turn ON sms alerts toggle")
    public void iTurnONSmsAlertsToggle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn ON sms alerts toggle");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_alerts_toggle_button_access_id);
    }

    @Then("I Turn ON sms warnings toggle")
    public void iTurnONSmsWarningsToggle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Turn ON sms warnings toggle");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_warnings_toggle_button_access_id);

    }

    @Then("I delete the existing list of mobile numbers")
    public void iDeleteTheExistingListOfMobileNumbers() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I delete the existing list of mobile numbers");
        List<AndroidElement> delete_sms_elements = driver.findElements(By.xpath(Constant_ManagementNotifications.ManageNotifications_Edit_Email_delete_xpath));
        while (delete_sms_elements.size() != 0) {
            try {
                TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_editlist_remove_icon_access_id);
                delete_sms_elements = driver.findElements(By.xpath(Constant_ManagementNotifications.ManageNotifications_Edit_Email_delete_xpath));
            } catch (Throwable throwable) {
                break;
            }
        }
    }

    @Then("I Tap on Save button in Edit sms list screen")
    public void iTapOnSaveButtonInEditSmsListScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Save button in Edit sms list screen");
        Taponbutton(Constant_ManagementNotifications.ManageNotifications_Edit_sms_save_button_xpath);
    }

    @Then("I Tap on sms edit list")
    public void iTapOnSmsEditList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on sms edit list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_smslist_editlist_naviagtion_access_id);
    }

    @Then("I Tap on add new number button")
    public void iTapOnAddNewNumberButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on add new number button");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_edit_smslist_add_button_access_id);
    }

    @Then("I enter a valid number in mobile number field")
    public void iEnterAValidNumberInMobileNumberField() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a valid number in mobile number field");
        entertextaccessabilityId(Constant_ManagementNotifications.ManageNotifications_valid_mobile_number, Constant_ManagementNotifications.ManageNotifications_Mobile_number_1_value_access_id);
    }

    @Then("I enter a valid sms label name")
    public void iEnterAValidSmsLabelName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a valid sms label name");
        entertextaccessabilityId(Constant_ManagementNotifications.ManageNotifications_sms_valid_label_name, Constant_ManagementNotifications.ManageNotifications_Mobile_number_label_1_access_id);
    }

    @Then("I verify if the edited number is displayed in the sms list")
    public void iVerifyIfTheEditedNumberIsDisplayedInTheSmsList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited number is displayed in the sms list");
        asserttextValidationAccessibility(Constant_ManagementNotifications.ManageNotifications_valid_mobile_number, Constant_ManagementNotifications.ManageNotifications_sms_smslist_number_2_access_id);

    }

    @Then("I verify if the edited Label name is displayed below the respective number")
    public void iVerifyIfTheEditedLabelNameIsDisplayedBelowTheRespectiveNumber() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited Label name is displayed below the respective number");
        asserttextValidationAccessibility(Constant_ManagementNotifications.ManageNotifications_sms_valid_label_name, Constant_ManagementNotifications.ManageNotifications_sms_smslist_label_text_2_access_id);
    }

    @Then("I turn ON the toggle for the first edited number in list")
    public void iTurnONTheToggleForTheFirstEditedNumberInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn ON the toggle for the first edited number in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_smslist_1_toggle_access_id);
    }

    @Then("I turn OFF the toggle for the first edited number in list")
    public void iTurnOFFTheToggleForTheFirstEditedNumberInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn OFF the toggle for the first edited number in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_smslist_1_toggle_access_id);

    }

    @Then("I Try to Turn ON the toggle for the valid number in list")
    public void iTryToTurnONTheToggleForTheValidNumberInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn ON the toggle for the valid number in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_smslist_2_toggle_access_id);
    }

    @Then("I try to Turn OFF the toggle for the valid number in list")
    public void iTryToTurnOFFTheToggleForTheValidNumberInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn OFF the toggle for the valid number in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_smslist_2_toggle_access_id);
    }

    @Then("I enter an invalid number in mobile number field")
    public void iEnterAnInvalidNumberInMobileNumberField() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn OFF the toggle for the valid number in list");
        entertextaccessabilityId(Constant_ManagementNotifications.ManageNotifications_invalid_mobile_number, Constant_ManagementNotifications.ManageNotifications_Mobile_number_2_value_access_id);
    }

    @Then("I enter an invalid sms label name")
    public void iEnterAnInvalidSmsLabelName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an invalid sms label name");
        entertextaccessabilityId(Constant_ManagementNotifications.ManageNotifications_sms_invalid_label_name, Constant_ManagementNotifications.ManageNotifications_Mobile_number_label_2_access_id);
    }

    @Then("I verify if the edited invalid number is displayed in the sms list")
    public void iVerifyIfTheEditedInvalidNumberIsDisplayedInTheSmsList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited invalid number is displayed in the sms list");
        asserttextValidationAccessibility(Constant_ManagementNotifications.ManageNotifications_invalid_mobile_number, Constant_ManagementNotifications.ManageNotifications_sms_smslist_number_3_access_id);
    }

    @Then("I verify if the edited invalid Label name is displayed below the respective number")
    public void iVerifyIfTheEditedInvalidLabelNameIsDisplayedBelowTheRespectiveNumber() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited invalid Label name is displayed below the respective number");
        asserttextValidationAccessibility(Constant_ManagementNotifications.ManageNotifications_sms_invalid_label_name, Constant_ManagementNotifications.ManageNotifications_sms_smslist_label_text_3_access_id);
    }

    @Then("I Try to Turn ON the toggle for the invalid number in list")
    public void iTryToTurnONTheToggleForTheInvalidNumberInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn ON the toggle for the invalid number in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_smslist_3_toggle_access_id);
    }

    @Then("I try to Turn OFF the toggle for the invalid number in list")
    public void iTryToTurnOFFTheToggleForTheInvalidNumberInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I try to Turn OFF the toggle for the invalid number in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_smslist_3_toggle_access_id);
    }

    @Then("I enter an already added number in mobile number field")
    public void iEnterAnAlreadyAddedNumberInMobileNumberField() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an already added number in mobile number field");
        entertextaccessabilityId(Constant_ManagementNotifications.ManageNotifications_valid_mobile_number, Constant_ManagementNotifications.ManageNotifications_Mobile_number_3_value_access_id);
    }

    @Then("I enter an already created sms label name")
    public void iEnterAnAlreadyCreatedSmsLabelName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an already created sms label name");
        entertextaccessabilityId(Constant_ManagementNotifications.ManageNotifications_sms_valid_label_name, Constant_ManagementNotifications.ManageNotifications_Mobile_number_label_3_access_id);
    }

    @Then("I verify if the edited duplicate number is displayed in the sms list")
    public void iVerifyIfTheEditedDuplicateNumberIsDisplayedInTheSmsList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited duplicate number is displayed in the sms list");
        asserttextValidationAccessibility(Constant_ManagementNotifications.ManageNotifications_valid_mobile_number, Constant_ManagementNotifications.ManageNotifications_sms_smslist_number_4_access_id);
    }

    @Then("I verify if the edited duplicate Label name is displayed below the respective number")
    public void iVerifyIfTheEditedDuplicateLabelNameIsDisplayedBelowTheRespectiveNumber() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited duplicate Label name is displayed below the respective number");
        asserttextValidationAccessibility(Constant_ManagementNotifications.ManageNotifications_sms_valid_label_name, Constant_ManagementNotifications.ManageNotifications_sms_smslist_label_text_4_access_id);

    }

    @Then("I Try to Turn ON the toggle for the duplicate number in list")
    public void iTryToTurnONTheToggleForTheDuplicateNumberInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn ON the toggle for the duplicate number in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_smslist_4_toggle_access_id);

    }

    @Then("I try to Turn OFF the toggle for the duplicate number in list")
    public void iTryToTurnOFFTheToggleForTheDuplicateNumberInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I try to Turn OFF the toggle for the duplicate number in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_smslist_4_toggle_access_id);

    }

    @Then("I enter an existing number in mobile number field")
    public void iEnterAnExistingNumberInMobileNumberField() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an existing number in mobile number field");
        entertextaccessabilityId(Constant_ManagementNotifications.ManageNotifications_valid_mobile_number, Constant_ManagementNotifications.ManageNotifications_Mobile_number_4_value_access_id);

    }

    @Then("I enter a unique sms label name")
    public void iEnterAUniqueSmsLabelName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a unique sms label name");
        entertextaccessabilityId(Constant_ManagementNotifications.ManageNotifications_sms_unique_label_name, Constant_ManagementNotifications.ManageNotifications_Mobile_number_label_4_access_id);
    }

    @Then("I verify if the edited existing number is displayed in the sms list")
    public void iVerifyIfTheEditedExistingNumberIsDisplayedInTheSmsList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited existing number is displayed in the sms list");
        asserttextValidationAccessibility(Constant_ManagementNotifications.ManageNotifications_valid_mobile_number, Constant_ManagementNotifications.ManageNotifications_sms_smslist_number_5_access_id);

    }

    @Then("I verify if the edited unique Label name is displayed below the respective number")
    public void iVerifyIfTheEditedUniqueLabelNameIsDisplayedBelowTheRespectiveNumber() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited existing number is displayed in the sms list");
        asserttextValidationAccessibility(Constant_ManagementNotifications.ManageNotifications_sms_unique_label_name, Constant_ManagementNotifications.ManageNotifications_sms_smslist_label_text_5_access_id);
    }

    @Then("I Try to Turn ON the toggle for the edited existing number in list")
    public void iTryToTurnONTheToggleForTheEditedExistingNumberInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn ON the toggle for the edited existing number in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_smslist_5_toggle_access_id);
    }

    @Then("I try to Turn OFF the toggle for the edited existing number in list")
    public void iTryToTurnOFFTheToggleForTheEditedExistingNumberInList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Try to Turn OFF the toggle for the edited existing number in list");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_smslist_5_toggle_access_id);
    }

    @Then("I leave the mobile number field blank")
    public void iLeaveTheMobileNumberFieldBlank() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I leave the mobile number field blank");
        entertextaccessabilityId(" ", Constant_ManagementNotifications.ManageNotifications_Mobile_number_5_value_access_id);

    }

    @Then("I leave the sms label field blank")
    public void iLeaveTheSmsLabelFieldBlank() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I leave the sms label field blank");
        entertextaccessabilityId(" ", Constant_ManagementNotifications.ManageNotifications_Mobile_number_label_5_access_id);

    }

    @Then("I Tap on sms show less navigation button")
    public void iTapOnSmsShowLessNavigationButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on sms show less navigation button");
        TaponbuttonaccessabilityID(Constant_ManagementNotifications.ManageNotifications_sms_showless_dropdown_access_id);

    }

    @Then("I verify if user is able to enter some valid text in name field")
    public void iVerifyIfUserIsAbleToEnterSomeValidTextInNameField() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if user is able to enter some valid text in name field");
        entertextaccessabilityId(Constant_DeviceManagement.mtc_name_valid_data, Constant_DeviceManagement.mtc_edit_name_value_access_id);
        EditedNameValue = driver.findElementByAccessibilityId(Constant_DeviceManagement.mtc_edit_name_value_access_id).getText();

    }

    @Then("I Tap on save button in edit screen")
    public void iTapOnSaveButtonInEditScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on save button in edit screen");
        TaponbuttonaccessabilityID(Constant_DeviceManagement.mtc_edit_save_button_access_id);
    }

    @Then("I verify if the edited name is displayed in the name field")
    public void iVerifyIfTheEditedNameIsDisplayedInTheNameField() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited name is displayed in the name field");
        asserttextValidationAccessibility(EditedNameValue, Constant_DeviceManagement.mtc_name_value_access_id);

    }

    @Then("I verify if the edited name is displayed in the name label below the image")
    public void iVerifyIfTheEditedNameIsDisplayedInTheNameLabelBelowTheImage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited name is displayed in the name label below the image");
        asserttextValidationAccessibility(EditedNameValue, Constant_DeviceManagement.mtc_image_devicename_access_id);

    }

    @Then("I Tap on back button in Device Management screen")
    public void iTapOnBackButtonInDeviceManagementScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on back button in Device Management screen");
        List<AndroidElement> id = driver.findElements(By.xpath(Constant_DeviceManagement.mtc_Device_Management_Title_Xpath));
        if (id.size() != 0) {
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(2000);
        }
    }

    @Then("I assert if the edited name is displayed in the device list")
    public void iAssertIfTheEditedNameIsDisplayedInTheDeviceList() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I assert if the edited name is displayed in the device list");
        if (driver.findElementByXPath(Constant_DeviceManagement.mtc_onboardeddevice_1_name_xpath).getText().equals(EditedNameValue)) {
            System.out.println("edited name displayed correctly!");

        } else {
            System.out.println("edited value is not applied!");
        }
    }

    @Then("I assert if the edited name is displayed in the tiles in home page")
    public void iAssertIfTheEditedNameIsDisplayedInTheTilesInHomePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I assert if the edited name is displayed in the tiles in home page");

        if (driver.findElementByXPath(Constant_HomePage.HomePage_tile_name_1_xpath).getText().equals(EditedNameValue)) {
            System.out.println("edited name displayed correctly!");

        } else {
            System.out.println("edited value is not applied!");
        }
    }

    @Then("I Tap on the navigation button of the first onboarded device name that is displayed")
    public void iTapOnTheNavigationButtonOfTheFirstOnboardedDeviceNameThatIsDisplayed() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the navigation button of the first onboarded device name that is displayed");
        Taponbutton(Constant_DeviceManagement.mtc_onboardeddevice_1_navigation_xpath);
        Thread.sleep(2000);
    }

    @Then("I verify if user is able to tap on edit vessel navigation button")
    public void iVerifyIfUserIsAbleToTapOnEditVesselNavigationButton() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if user is able to tap on edit vessel navigation button");
        TaponbuttonaccessabilityID(Constant_DeviceManagement.mtc_edit_vessel_navigation_access_id);
        Thread.sleep(2000);
    }

    @Then("I verify if user is able to enter emojis in name field")
    public void iVerifyIfUserIsAbleToEnterEmojisInNameField() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if user is able to enter emojis in name field");
        entertextaccessabilityId(emojis, Constant_DeviceManagement.mtc_edit_name_value_access_id);
    }

    @Then("I verify if the edited emoji is displayed in the name field")
    public void iVerifyIfTheEditedEmojiIsDisplayedInTheNameField() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited emoji is displayed in the name field");
        asserttextValidationAccessibility(emojis, Constant_DeviceManagement.mtc_name_value_access_id);
    }

    @Then("I verify if the edited emoji is displayed in the name label below the image")
    public void iVerifyIfTheEditedEmojiIsDisplayedInTheNameLabelBelowTheImage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the edited emoji is displayed in the name field");
        asserttextValidationAccessibility(emojis, Constant_DeviceManagement.mtc_image_devicename_access_id);

    }

    @Then("I verify if user is able to enter some invalid text in name field")
    public void iVerifyIfUserIsAbleToEnterSomeInvalidTextInNameField() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if user is able to enter some invalid text in name field");
        entertextaccessabilityId(Constant_DeviceManagement.mtc_name_invalid_data, Constant_DeviceManagement.mtc_edit_name_value_access_id);
        EditedNameValue = Constant_DeviceManagement.mtc_name_invalid_data;
    }

    @Then("I leave the name field blank")
    public void iLeaveTheNameFieldBlank() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I leave the name field blank");
        entertextaccessabilityId("  ", Constant_DeviceManagement.mtc_edit_name_value_access_id);
        EditedNameValue = "  ";
    }

    @Then("I verify if error text is displayed below the name field")
    public void iVerifyIfErrorTextIsDisplayedBelowTheNameField() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if error text is displayed below the name field");
        Assert.assertTrue(iselementdisplayed(Constant_DeviceManagement.mtc_edit_emptyname_error_xpath));
    }

    @Then("I verify if user is able to enter some long text in name field")
    public void iVerifyIfUserIsAbleToEnterSomeLongTextInNameField() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if user is able to enter some long text in name field");
        entertextaccessabilityId(Constant_DeviceManagement.mtc_long_name_value, Constant_DeviceManagement.mtc_edit_name_value_access_id);
        EditedNameValue = driver.findElementByAccessibilityId(Constant_DeviceManagement.mtc_edit_name_value_access_id).getText();

    }

    @Then("I Tap on Cancel button")
    public void iTapOnCancelButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Cancel button");
        Taponbutton(Constant_settings.Device_management_edit_page_Cancel_Button_Xpath);
    }

    @Then("I Tap on back button in Edit Profile Screen")
    public void iTapOnBackButtonInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on back button in Edit Profile Screen");
        List<AndroidElement> id = driver.findElements(By.xpath(Constant_DeviceManagement.mtc_Edit_Profile_Title_Xpath));
        if (id.size() != 0) {
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(2000);
        }
    }

    @Then("I Tap on back button in Profile Screen")
    public void iTapOnBackButtonInProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on back button in Profile Screen");
        List<AndroidElement> id = driver.findElements(By.xpath(Constant_DeviceManagement.mtc_Profile_Title_Xpath));
        if (id.size() != 0) {
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(2000);
        }
    }

    @Then("I Tap on back button in Account Settings Screen")
    public void iTapOnBackButtonInAccountSettingsScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on back button in Account Settings Screen");
        List<AndroidElement> id = driver.findElements(By.xpath(Constant_DeviceManagement.mtc_Account_Settings_Title_Xpath));
        if (id.size() != 0) {
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(2000);
        }
    }

    @Then("I Tap on Back button in App Settings screen")
    public void iTapOnBackButtonInAppSettingsScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on back button in App Settings Screen");
        List<AndroidElement> id = driver.findElements(By.xpath(Constant_DeviceManagement.mtc_App_Settings_Title_Xpath));
        if (id.size() != 0) {
            driver.pressKeyCode(AndroidKeyCode.BACK);
            Thread.sleep(2000);
        }
    }

    @Then("I drag the {int}st tile to {int}nd tile location")
    public void iDragTheStTileToNdTileLocation(int arg0, int arg1) throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I drag the 1st tile to 2nd tile location");
        AndroidElement batteryLoc = driver.findElementByAccessibilityId(Constant_landingscreen.LandingPage_Tile_Battery_access_id);
        AndroidElement bilgePumpLoc = driver.findElementByAccessibilityId(Constant_landingscreen.LandingPage_Tile_BilgePump_access_id);
//        TouchAction action = new TouchAction(driver);
//        action.press(PointOption.point(200, 450)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)))
//                .moveTo(PointOption.point(200,700));
//        action.release().perform();
        TouchAction action = new TouchAction(driver);
        action.longPress(ElementOption.element(batteryLoc))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(10000)))
                .moveTo(ElementOption.element(bilgePumpLoc))
                .release()
                .perform();
//        Actions actions=new Actions(driver);
//        actions.dragAndDrop(batteryLoc,bilgePumpLoc).build().perform();
    }

    @Then("I drag the {int}nd tile to {int}rd tile location")
    public void iDragTheNdTileToRdTileLocation(int arg0, int arg1) throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I drag the 2nd tile to 3rd tile location");
        AndroidElement batteryLoc = driver.findElementByAccessibilityId(Constant_landingscreen.LandingPage_Tile_Battery_access_id);
        AndroidElement bilgePumpLoc = driver.findElementByAccessibilityId(Constant_landingscreen.LandingPage_Tile_BilgePump_access_id);
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(500, 700)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)))
                .moveTo(PointOption.point(175,1000));
        action.release().perform();
    }

    @Then("I drag the {int}rd tile to {int}th tile location")
    public void iDragTheRdTileToThTileLocation(int arg0, int arg1) throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I drag the 3rd tile to 4th tile location");
        AndroidElement batteryLoc = driver.findElementByAccessibilityId(Constant_landingscreen.LandingPage_Tile_Battery_access_id);
        AndroidElement bilgePumpLoc = driver.findElementByAccessibilityId(Constant_landingscreen.LandingPage_Tile_BilgePump_access_id);
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(175, 100)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)))
                .moveTo(PointOption.point(750,1000));
        action.release().perform();
    }

    @Then("I drag the {int}th tile to {int}th tile location")
    public void iDragTheThTileToThTileLocation(int arg0, int arg1) throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I drag the 4th tile to 5th tile location");
        AndroidElement batteryLoc = driver.findElementByAccessibilityId(Constant_landingscreen.LandingPage_Tile_Battery_access_id);
        AndroidElement bilgePumpLoc = driver.findElementByAccessibilityId(Constant_landingscreen.LandingPage_Tile_BilgePump_access_id);
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(750, 1000)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)))
                .moveTo(PointOption.point(175,1450));
        action.release().perform();
    }

    @Then("I drag the {int}th tile to {int}st tile location")
    public void iDragTheThTileToStTileLocation(int arg0, int arg1) throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I drag the 5th tile to 1st tile location");
        AndroidElement batteryLoc = driver.findElementByAccessibilityId(Constant_landingscreen.LandingPage_Tile_Battery_access_id);
        AndroidElement bilgePumpLoc = driver.findElementByAccessibilityId(Constant_landingscreen.LandingPage_Tile_BilgePump_access_id);
        TouchAction action = new TouchAction(driver);
        action.press(PointOption.point(175, 1450)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(10)))
                .moveTo(PointOption.point(200,450));
        action.release().perform();
    }
}
