package com.dometic.L2.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.Apollo.qa.Pages.Constant_AccountSettings;
import com.dometic.L2.qa.util.Baseclass;
import com.dometic.L2.qa.Pages.Constant_climate_ac;
import com.dometic.L2.qa.Pages.Constant_landingscreen;
import com.dometic.L2.qa.Pages.Constant_settings;
import com.dometic.MTC.qa.Pages.Constant_BilgePump_MTC;
import com.dometic.MTC.qa.Pages.Constant_DeviceManagement;
import com.dometic.MTC.qa.Pages.Constant_ManagementNotifications;
import com.google.common.collect.ImmutableMap;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

public class Settings extends Baseclass {
    public static String fahrenheitText, celciusText;
    public static String EditedNameValue = "";
    String emojis = Constant_DeviceManagement.grinning_face_with_smiling_eyes + Constant_DeviceManagement.face_with_tears_of_joy +
            Constant_DeviceManagement.smiling_face_with_open_mouth_and_cold_sweat + Constant_DeviceManagement.smiling_face_with_open_mouth_and_tightly_closed_eyes +
            Constant_DeviceManagement.winking_face;

    @Then("I Tap on hamburger menu in landing screen")
    public void iTapOnHamburgerMenuInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on hamburger menu in landing screen");
        if (driver.findElementsByAccessibilityId(Constant_landingscreen.LandingPage_hamburger_menu_access_id).size() != 0) {
            TaponbuttonaccessabilityID(Constant_landingscreen.LandingPage_hamburger_menu_access_id);
            Thread.sleep(2000);
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
//        Basestepdefinition.verticalSwipe(0.3, 0.7, 0.5);
//        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_landingscreen.LandingPage_hamburger_menu_access_id));
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
        Thread.sleep(2000);
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

    @Then("I Tap on Logout in Settings screen")
    public void iTapOnLogoutInSettingsScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Logout in Settings screen");
        TaponbuttonaccessabilityID(com.dometic.MTC.qa.Pages.Constant_settings.Settings_Logout_text_access_id);
    }

    @Then("I click on Device Management")
    public void iClickOnDeviceManagement() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click on Device Management");
        TaponbuttonaccessabilityID(Constant_settings.Device_Management_access_id);
        Thread.sleep(2000);
        System.out.println("Clicked Device Management");

    }

    @Then("I tap on the onboarded device")
    public void iTapOnTheOnboardedDevice() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the onboarded device");
        TaponbuttonaccessabilityID(Constant_settings.Device_Management_Device_name_access_id);
        Thread.sleep(2000);
        System.out.println("clicked onboarded device");
    }

    @Then("I verify Device management title")
    public void iVerifyDeviceManagementTitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Device management title");
        asserttextValidation(Constant_settings.Device_Management_header_text, Constant_settings.Device_Management_header_Xpath_OR_Operator);
        System.out.println("Device management title verified");
    }

    @Then("I verify Device management back button")
    public void iVerifyDeviceManagementBackButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Device management back button");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Device_Management_back_button_Xpath));
        System.out.println("Device management back button verified");
    }

    @Then("I verify Device management image")
    public void iVerifyDeviceManagementImage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Device management image");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_image_access_id));
        System.out.println("Device management image verified");
    }

    @Then("I verify if device name is displayed")
    public void iVerifyIfDeviceNameIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if device name is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_page_Device_name_access_id));
        System.out.println("Device name is displayed");
    }

    @Then("I verify vessel information")
    public void iVerifyVesselInformation() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify vessel information");
        asserttextValidation(Constant_settings.Vessel_information_text, Constant_settings.Device_Management_Vessel_information_text_Xpath_OR_Operator);
        System.out.println("Vessel information text verified");
    }

    @Then("I verify Name text")
    public void iVerifyNameText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Name text");
        asserttextValidation(Constant_settings.Name_text, Constant_settings.Device_Management_Name_text_Xpath_OR_Operator);
        System.out.println("Name text verified");
    }

    @Then("I verify if the device name is displayed")
    public void iVerifyIfTheDeviceNameIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if the device name is displayed");
        String string1 = driver.findElementByAccessibilityId(Constant_settings.Device_Management_page_Device_name_access_id).getAttribute("text");
        String string2 = driver.findElementByAccessibilityId(Constant_settings.Device_Management_Name_access_id).getAttribute("text");
        System.out.println(string1);
        System.out.println(string2);
        if (string1.equals(string2)) {
            System.out.println("Given device name text verified");
        } else {
            System.out.println("Device Name mismatching");
        }
    }

    @Then("I verify MAC address text")
    public void iVerifyMACAddressText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Name text");
        asserttextValidationAccessibility(Constant_settings.MAC_address_text, Constant_settings.Device_Management_MAC_address_text_access_id);
        System.out.println("MAC address text verified");
    }

    @Then("I verify if MAC address is displayed")
    public void iVerifyIfMACAddressIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if MAC address is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_MAC_address_access_id));
        System.out.println("MAC address is displayed");
    }

    @Then("I verify Edit vessel text")
    public void iVerifyEditVesselText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit vessel text");
        asserttextValidation(Constant_settings.Edit_vessel_text, Constant_settings.Device_Management_Edit_vessel_text_Xpath_OR_Operator);
        System.out.println("Edit vessel text verified");
    }

    @Then("I verify Edit vessel navigation button")
    public void iVerifyEditVesselNavigationButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit vessel navigation button");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Device_Management_Edit_vessel_navigation_Xpath));
        System.out.println("Edit vessel navigation button displayed");
    }

    @Then("I tap on Edit vessel")
    public void iTapOnEditVessel() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Edit vessel");
        Taponbutton(Constant_settings.Device_Management_Edit_vessel_navigation_Xpath);
        Thread.sleep(2000);
        System.out.println("clicked Edit vessel");
    }

    @Then("I verify Edit vessel header")
    public void iVerifyEditVesselHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit vessel header");
        asserttextValidation(Constant_settings.Edit_vessel_header_text, Constant_settings.Device_Management_Edit_vessel_header_Xpath_OR_Operator);
        System.out.println("Edit vessel header verified");
    }

    @Then("I verify Edit vessel close button")
    public void iVerifyEditVesselCloseButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit vessel close button");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Device_Management_Edit_vessel_close_button_xpath));
        System.out.println("Edit vessel close button verified");
    }

    @Then("I verify Edit vessel image is displayed")
    public void iVerifyEditVesselImageIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit vessel image is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_Edit_vessel_image_access_id));
        System.out.println("Edit vessel image displayed");
    }

    @Then("I verify Edit vessel name text")
    public void iVerifyEditVesselNameText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit vessel name text");
        asserttextValidation(Constant_settings.Edit_vessel_name_text, Constant_settings.Device_Management_Edit_vessel_name_text_OR_Operator);
        System.out.println("Edit vessel name text verified");
    }

    @Then("I verify if vessel name is displayed")
    public void iVerifyIfVesselNameIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if vessel name is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_Edit_vessel_name_access_id));
        System.out.println("Edit vessel name is displayed");
    }

    @Then("I verify Edit vessel Mac address text")
    public void iVerifyEditVesselMacAddressText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Edit vessel Mac address text");
        asserttextValidation(Constant_settings.Edit_vessel_MAC_address_text, Constant_settings.Device_Management_Edit_vessel_MAC_address_text_Xpath);
        System.out.println(" Edit vessel Mac address text verified");

    }

    @Then("I verify if Edit vessel Mac address is displayed")
    public void iVerifyIfEditVesselMacAddressIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if Edit vessel Mac address is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_Edit_vessel_MAC_address_access_id));
        System.out.println("Edit vessel Mac address is displayed");
    }

    @Then("I verify if Save button is displayed")
    public void iVerifyIfSaveButtonIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if Save button is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_Edit_vessel_Save_button_access_id));
        System.out.println("Save button is displayed");
    }

    @Then("I verify Save text")
    public void iVerifySaveText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Save text");
        asserttextValidation(Constant_settings.Save_text, Constant_settings.Device_Management_Edit_vessel_Save_text_Xpath_OR_Operator);
        System.out.println("Save text verified");
    }

    @Then("I tap on close button in Edit vessel screen")
    public void iTapOnCloseButtonInEditVesselScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on close button in Edit vessel screen");
        Taponbutton(Constant_settings.Device_Management_Edit_vessel_close_button_xpath);
    }

    @Then("I verify Advanced text")
    public void iVerifyAdvancedText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Advanced text");
        asserttextValidation(Constant_settings.Advanced_text, Constant_settings.Device_Management_Advanced_text_Xpath_OR_Operator);
        System.out.println("Advanced text verified");
    }

    @Then("I verify Check Updates text")
    public void iVerifyCheckUpdatesText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Check Updates text");
        asserttextValidation(Constant_settings.Check_updates_text, Constant_settings.Device_Management_Check_updates_text_Xpath_OR_Operator);
        System.out.println("Check Updates text verified");
    }

    @Then("I verify check updates navigation button")
    public void iVerifyCheckUpdatesNavigationButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify check updates navigation button");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Device_Management_Check_updates_navigation_Xpath_OR_Operator));
        System.out.println("check updates navigation button is displayed");
    }

    @Then("I verify Unregister Delete Offboard text")
    public void iVerifyUnregisterDeleteOffboardText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Unregister/Delete/Offboard text");
        asserttextValidation(Constant_settings.Unregister_Offboard_Delete_text, Constant_settings.Device_Management_Unregister_Delete_offboard_text_Xpath_OR_Operator);
        System.out.println("Unregister/Delete/Offboard text verified");
    }

    @Then("I verify Unregister Delete Offboard navigation button")
    public void iVerifyUnregisterDeleteOffboardNavigationButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify I verify Unregister/Delete/Offboard navigation button");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Device_Management_Unregister_Delete_offboard_navigation_Xpath_OR_Operator));
        System.out.println("Unregister/Delete/Offboard navigation button is displayed");

    }

    @Then("I Tap on view Edit Account option")
    public void iTapOnViewEditAccountOption() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on view Edit Account option");
        TaponbuttonaccessabilityID(Constant_settings.Settings_ViewEditAccount_accessid);
        Thread.sleep(2000);
    }

    @Then("I verify the Header of the account settings")
    public void iVerifyTheHeaderOfTheAccountSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Header of the account settings");
        asserttextValidation(Constant_settings.Settings_AccountSettings_header_text, Constant_settings.Settings_AccountSettings_header_Xpath_OR_Operator);
        System.out.println("Account settings Header text is verified");
    }

    @Then("I verify the profile photo of the account settings")
    public void iVerifyTheProfilePhotoOfTheAccountSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the profile photo of the account settings");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_AccountSettings_profilePhoto_accessid));
        System.out.println("Account settings profile photo is verified");
    }

    @Then("I Verify the UserName of account settings")
    public void iVerifyTheUserNameOfAccountSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the UserName of account settings");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_AccountSettings_userName_accessid));
        System.out.println("Account settings UserName is verified");
    }

    @Then("I Verify the UserEmail of account settings")
    public void iVerifyTheUserEmailOfAccountSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the UserEmail of account settings");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_AccountSettings_user_email_accessid));
        System.out.println("Account settings UserEmail is verified");
    }

    @Then("I Verify the profile text of account settings")
    public void iVerifyTheProfileTextOfAccountSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the profile text of account settings");
        asserttextValidation(Constant_settings.Settings_AccountSettings_profile_text, Constant_settings.Settings_AccountSettings_profile_Text_Xpath_OR_Operator);
        System.out.println("Account settings Profile text is verified");
    }

    @Then("I verify the subscription text of account settings")
    public void iVerifyTheSubscriptionTextOfAccountSettings() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the subscription text of account settings");
        asserttextValidation(Constant_settings.Settings_AccountSettings_Subscription_text, Constant_settings.Settings_AccountSettings_Subscription_text_Xpath_OR_Operator);
        System.out.println("Account settings subscription text is verified");
    }

    @Then("I Tap on the Profile card icon")
    public void iTapOnTheProfileCardIcon() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Profile card icon");
        TaponbuttonaccessabilityID(Constant_settings.Settings_AccountSettings_profile_cardicon_accessid);
        Thread.sleep(2000);

    }

    @Then("I Verify the Header of the profile page")
    public void iVerifyTheHeaderOfTheProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the subscription text of account settings");
        asserttext(Constant_settings.Settings_profile_header, Constant_settings.Settings_profile_header_xpath_or_operator);
        System.out.println("Header of the profile title text is verified successfully");
    }

    @Then("I verify the personal information text in profile page")
    public void iVerifyThePersonalInformationTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal information text in profile page");
        asserttext(Constant_settings.Settings_profile_Persolnal_information, Constant_settings.Settings_profile_Persolnal_information_xpath_or_operator);
        System.out.println("personal information text in profile page is verified successfully");
    }

    @Then("I verify the name text in profile page")
    public void iVerifyTheNameTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal name text in profile page");
        asserttext(Constant_settings.Settings_profile_Name_label, Constant_settings.Settings_profile_Name_label_xpath_or_operator);
        System.out.println("name text in profile page is verified successfully");
    }

    @Then("I verify the name value in profile page")
    public void iVerifyTheNameValueInProfilePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal name value in profile page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_profile_namevalues_accessid));
    }

    @Then("I verify the email text in profile page")
    public void iVerifyTheEmailTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal email text in profile page");
        asserttext(Constant_settings.Settings_profile_email_label, Constant_settings.Settings_profile_email_label_xpath_or_operator);
        System.out.println("email text in profile page is verified successfully");
    }

    @Then("I verify the email value in profile page")
    public void iVerifyTheEmailValueInProfilePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal email value in profile page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_profile_emailvalues_accessid));
    }

    @Then("I verify the mobile text in profile page")
    public void iVerifyTheMobileTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal mobile text in profile page");
        asserttext(Constant_settings.Settings_profile_mobile_label, Constant_settings.Settings_profile_mobile_label_xpath_or_operator);
        System.out.println("mobile text in profile page is verified successfully");
    }

    @Then("I verify the mobile value in profile page")
    public void iVerifyTheMobileValueInProfilePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal mobile value in profile page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_profile_mobilevalues_accessid));
    }

    @Then("I verify the Address text in profile page")
    public void iVerifyTheAddressTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal Address text in profile page");
        asserttext(Constant_settings.Settings_profile_address_label, Constant_settings.Settings_profile_address_label_xpath_or_operator);
        System.out.println("Address text in profile page is verified successfully");

    }

    @Then("I verify the Address value text in profile page")
    public void iVerifyTheAddressValueTextInProfilePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal Address value text in profile page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_profile_addressvalues_accessid));
    }

    @Then("I verify the Edit profile text in profile page")
    public void iVerifyTheEditProfileTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal Edit profile text in profile page");
        asserttext(Constant_settings.Settings_profile_Editprofile_label, Constant_settings.Settings_profile_Editprofile_label_xpath_or_operator);
        System.out.println("Edit profile text in profile page is verified successfully");
    }

    @Then("I verify the Security text in profile page")
    public void iVerifyTheSecurityTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal Security text in profile page");
        asserttext(Constant_settings.Settings_profile_Security_text, Constant_settings.Settings_profile_Security_text_xpath_or_operator);
        System.out.println("Security text in profile page is verified successfully");
    }

    @Then("I verify the Password text in profile page")
    public void iVerifyThePasswordTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal Password text in profile page");
        asserttext(Constant_settings.Settings_profile_Password_text, Constant_settings.Settings_profile_Password_text_xpath_or_operator);
        System.out.println("Password text in profile page is verified successfully");
    }

    @Then("I verify the Renew text in profile page")
    public void iVerifyTheRenewTextInProfilePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the personal Renew text in profile page");
        asserttext(Constant_settings.Settings_profile_Renew_text, Constant_settings.Settings_profile_Renew_text_xpath_or_operator);
        System.out.println("Renew text in profile page is verified successfully");
    }

    @Then("I verify the Renew Card icon")
    public void iVerifyTheRenewCardIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Renew Card icon");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Profile_Renew_card_icon_access_id));
    }

    @Then("I tap on the back button in profile page")
    public void iTapOnTheBackButtonInProfilePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the back button in profile page");
        Taponbutton(Constant_settings.Settings_Profile_Back_Button_xpath);
    }

    @Then("I Tap on the Subscription navigation icon")
    public void iTapOnTheSubscriptionNavigationIcon() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Subscription navigation icon");
        TaponbuttonaccessabilityID(Constant_settings.Settings_AccountSettings_Subscription_cardicon_accessid);
        Thread.sleep(2000);
    }

    @Then("I verify the header of the subscription page")
    public void iVerifyTheHeaderOfTheSubscriptionPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the header of the subscription page");
        asserttext(Constant_settings.Settings_Subscription_Header_text, Constant_settings.Settings_Subscription_Header_xpath_or_operator);
        System.out.println("header of the subscription page is verified successfully");
    }


    @Then("I tap on Edit profile in profile screen")
    public void iTapOnEditProfileInProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Edit profile in profile screen");
        TaponbuttonaccessabilityID(Constant_settings.Settings_profile_Editprofile_cardicon_accessid);
    }

    @Then("I Verify Edit profile header text")
    public void iVerifyEditProfileHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Edit profile header text");
        // 823 asserttext(Constant_settings.Settings_Edit_profile_Header_text, Constant_settings.Settings_Edit_profile_Header_text_xpath_or_operator);
        System.out.println("Edit profile header text is verified successfully");
    }


    @Then("I Verify user profile photo in edit profile screen")
    public void iVerifyUserProfilePhotoInEditProfileScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify user profile photo in edit profile screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Edit_profile_photo_accessid));
    }

    @Then("I Verify user email value is displayed")
    public void iVerifyUserEmailValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify user email value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Edit_profile_emailvalue_accessid));
    }

    @Then("I Verify Firstname label is displayed")
    public void iVerifyFirstnameLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Firstname label is displayed");
        // 850 asserttext(Constant_settings.Settings_Edit_profile_firstname_text, Constant_settings.Settings_Edit_profile_firstname_text_xpath_or_operator);
        System.out.println("Firstname label is verified successfully");
    }

    @Then("I Verify Firstname Value is displayed")
    public void iVerifyFirstnameValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Firstname Value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Edit_profile_firstname_value_accessid));
    }

    @Then("I Verify Lastname label is displayed")
    public void iVerifyLastnameLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Lastname label is displayed");
        asserttext(Constant_settings.Settings_Edit_profile_lastname_text, Constant_settings.Settings_Edit_profile_lastname_text_xpath_or_operator);
        System.out.println("Lastname label is verified successfully");
    }

    @Then("I Verify Lastname Value is displayed")
    public void iVerifyLastnameValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Lastname Value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Edit_profile_lastname_value_accessid));
    }

    @Then("I Verify Primary Mobile label is displayed")
    public void iVerifyPrimaryMobileLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Primary Mobile label is displayed");
        asserttext(Constant_settings.Settings_Edit_profile_primaryMobile_text, Constant_settings.Settings_Edit_profile_primaryMobile_text_xpath_or_operator);
        System.out.println("Primary Mobile label is verified successfully");
    }

    @Then("I Verify Primary Mobile Value is displayed")
    public void iVerifyPrimaryMobileValueIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Primary Mobile Value is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Edit_profile_primaryMobile_value_accessid));
    }

    @Then("I Verify Address label is displayed in Edit profile screen")
    public void iVerifyAddressLabelIsDisplayedInEditProfileScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Address label is displayed in Edit profile screen");
        asserttext(Constant_settings.Settings_Edit_profile_address_text, Constant_settings.Settings_Edit_profile_address_text_xpath_or_operator);
        System.out.println("Address label is displayed in Edit profile screen is verified successfully");

    }

    @Then("I Verify Address value is displayed in Edit profile screen")
    public void iVerifyAddressValueIsDisplayedInEditProfileScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), " Verify Address value is displayed in Edit profile screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Edit_profile_address_value_accessid));
    }

    @Then("I Verify Save Button is displayed")
    public void iVerifySaveButtonIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Save Button is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Edit_profile_saveButton_accessid));
    }

    @Then("I Verify the Close Button is Edit profile Page")
    public void iVerifyTheCloseButtonIsEditProfilePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Close Button is Edit profile Page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_Edit_profile_CloseButton_accessid));
    }

    @Then("I Enter an empty in First name Field in Edit profile screen")
    public void iEnterAnEmptyInFirstNameFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an empty in First name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I Enter an empty in Last name Field in Edit profile screen")
    public void iEnterAnEmptyInLastNameFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an empty in Last name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I Enter an empty in Primary Field Mobile in Edit profile screen")
    public void iEnterAnEmptyInPrimaryFieldMobileInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an empty in Primary Field Mobile in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_primaryMobile_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_primaryMobile_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I Enter an empty in Address field in Edit profile screen")
    public void iEnterAnEmptyInAddressFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an empty in Address field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_address_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_address_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I tap on Save button")
    public void iTapOnSaveButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Save button");
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_saveButton_accessid);
    }

    @Then("I Enter an Emoji's in First name Field in Edit profile screen")
    public void iEnterAnEmojiSInFirstNameFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Emoji's in First name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        String emojis = Constant_settings.grinning_face_with_smiling_eyes + Constant_settings.face_with_tears_of_joy +
                Constant_settings.smiling_face_with_open_mouth_and_cold_sweat + Constant_settings.smiling_face_with_open_mouth_and_tightly_closed_eyes +
                Constant_settings.winking_face;
        entertextaccessabilityId(emojis, Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I Enter an Emoji's in Last name Field in Edit profile screen")
    public void iEnterAnEmojiSInLastNameFieldInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Emoji's in Last name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        String emojis = Constant_settings.grinning_face_with_smiling_eyes + Constant_settings.face_with_tears_of_joy +
                Constant_settings.smiling_face_with_open_mouth_and_cold_sweat + Constant_settings.smiling_face_with_open_mouth_and_tightly_closed_eyes +
                Constant_settings.winking_face;
        entertextaccessabilityId(emojis, Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I Enter an Primary Mobile in Edit profile screen")
    public void iEnterAnPrimaryMobileInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Primary Mobile in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_primaryMobile_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_primaryMobile_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_settings.editProfile_phoneValue, Constant_settings.Settings_Edit_profile_primaryMobile_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));


    }

    @Then("I Enter an Emoji's in Address field in Edit profile screen")
    public void iEnterAnEmojiSInAddressFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Emoji's in Address field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_address_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_address_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        String emojis = Constant_settings.grinning_face_with_smiling_eyes + Constant_settings.face_with_tears_of_joy +
                Constant_settings.smiling_face_with_open_mouth_and_cold_sweat + Constant_settings.smiling_face_with_open_mouth_and_tightly_closed_eyes +
                Constant_settings.winking_face;
        entertextaccessabilityId(emojis, Constant_settings.Settings_Edit_profile_address_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I tap on Ok button")
    public void iTapOnOkButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Ok button");
        if (driver.findElements(By.xpath(Constant_settings.Settings_Edit_profile_ok_button_xpath)).size() != 0) {
            Taponbutton(Constant_settings.Settings_Edit_profile_ok_button_xpath);
        }
    }

    @Then("I Enter an Special character in First name Field in Edit profile screen")
    public void iEnterAnSpecialCharacterInFirstNameFieldInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Special character in First name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_settings.editProfile_firstNameValue_SpecialCharacter, Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I Enter an Special character in Last name Field in Edit profile screen")
    public void iEnterAnSpecialCharacterInLastNameFieldInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Special character in Last name Field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_settings.editProfile_lastameValue_SpecialCharacter, Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I Enter an Special character in Address field in Edit profile screen")
    public void iEnterAnSpecialCharacterInAddressFieldInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Special character in Address field in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_address_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_address_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_settings.editProfile_addressValue_SpecialCharacter, Constant_settings.Settings_Edit_profile_address_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I Enter an First name in Edit profile screen")
    public void iEnterAnFirstNameInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an First name in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_settings.editProfile_firstNameValue, Constant_settings.Settings_Edit_profile_firstname_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I Enter an Last name in Edit profile screen")
    public void iEnterAnLastNameInEditProfileScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Last name in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_settings.editProfile_lastameValue, Constant_settings.Settings_Edit_profile_lastname_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I Enter an Address in Edit profile screen")
    public void iEnterAnAddressInEditProfileScreen() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter an Address in Edit profile screen");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_address_value_accessid);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Settings_Edit_profile_address_value_accessid);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_settings.editProfile_addressValue, Constant_settings.Settings_Edit_profile_address_value_accessid);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I tap on Edit vessel Name")
    public void iTapOnEditVesselName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Edit vessel Name");
        TaponbuttonaccessabilityID(Constant_settings.Device_Management_Edit_vessel_name_access_id);
        System.out.println("clicked Edit vessel Name");
    }

    @Then("I change Edit vessel name")
    public void iChangeEditVesselName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I change Edit vessel name");
        entertextaccessabilityId(Constant_settings.Device_name_New_data, Constant_settings.Device_Management_Edit_vessel_name_access_id);
        EditedNameValue = Constant_settings.Device_name_New_data;
    }

    @Then("I click on Edit vessel image")
    public void iClickOnEditVesselImage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click on Edit vessel image");
        TaponbuttonaccessabilityID(Constant_settings.Device_Management_Edit_vessel_image_access_id);
        System.out.println("clicked Edit vessel image");
    }

    @Then("I click on Save button")
    public void iClickOnSaveButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I click on Save button");
        TaponbuttonaccessabilityID(Constant_settings.Device_Management_Edit_vessel_Save_button_access_id);
        System.out.println("clicked Save button");
    }

    @Then("I verify the given new device name under the image")
    public void iVerifyTheGivenNewDeviceNameUnderTheImage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the given new device name under the image");
//        String string1 = driver.findElementByAccessibilityId(Constant_settings.Device_Management_page_Device_name_access_id).getText();
//        System.out.println(string1);
        asserttextValidationAccessibility(Constant_settings.Device_name_New_data, Constant_settings.Device_Management_page_Device_name_access_id);
        System.out.println("Given new device name under the image verified");
    }

    @Then("I verify the given new device name in the Name field")
    public void iVerifyTheGivenNewDeviceNameInTheNameField() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the given new device name under the image");
        asserttextValidationAccessibility(Constant_settings.Device_name_New_data, Constant_settings.Device_Management_Name_access_id);
        System.out.println("Given new device name in the Name field verified");
    }

    @Then("I Tap on back button in Device Management page")
    public void iTapOnBackButtonInDeviceManagementPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on back button in Device Management page");
        TaponbuttonaccessabilityID(Constant_settings.Device_Management_back_button_access_id);
        System.out.println("clicked back button in Device Management page");
    }

    @Then("I verify edited device name in device list page")
    public void iVerifyEditedDeviceNameInDeviceListPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify edited device name in device list page");
        asserttextValidationAccessibility(EditedNameValue, Constant_settings.Device_Management_1st_device_name_access_id);
        System.out.println("Given edited device name in device list page");
    }

    @Then("I enter an invalid vessel name")
    public void iEnterAnInvalidVesselName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a valid vessel name");
        entertextaccessabilityId(Constant_settings.Device_name_invalid_data, Constant_settings.Device_Management_Edit_vessel_name_access_id);
        EditedNameValue = Constant_settings.Device_name_invalid_data;
    }

    @Then("I enter a vessel name with emojis")
    public void iEnterAVesselNameWithEmojis() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a vessel name with emojis");
        entertextaccessabilityId(emojis, Constant_settings.Device_Management_Edit_vessel_name_access_id);
        EditedNameValue = emojis;
    }

    @Then("I enter a valid vessel name")
    public void iEnterAValidVesselName() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a valid vessel name");
        entertextaccessabilityId(Constant_settings.Device_name_valid_data, Constant_settings.Device_Management_Edit_vessel_name_access_id);
        EditedNameValue = Constant_settings.Device_name_valid_data;
    }

    @Then("I Tap on App Settings")
    public void iTapOnAppSettings() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on App Settings");
        TaponbuttonaccessabilityID(com.dometic.MTC.qa.Pages.Constant_settings.Settings_appSettings_text_access_id);
        Thread.sleep(2000);
    }

    @Then("I verify the App setting header text")
    public void iVerifyTheAppSettingHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the App setting header text");
        asserttext(Constant_settings.Settings_App_setting_header_text_expected, Constant_settings.App_settings_header_xpath_OR_operator);
        System.out.println("App settings header text verified");
    }

    @Then("I verify the language text on the app setting page")
    public void iVerifyTheLanguageTextOnTheAppSettingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the language text on the app setting page");
        asserttext(Constant_settings.Settings_App_setting_language_text_expected, Constant_settings.Language_text_xpath);
        System.out.print("Language text verified");
    }

    @Then("I verify the Temperature text on the setting page")
    public void iVerifyTheTemperatureTextOnTheSettingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Temperature text on the setting page");
        asserttext(Constant_settings.Settings_App_setting_temperature_text_expected, Constant_settings.Temperature_text_xpath_OR_operator);
        System.out.print("Temperature text verified");
    }

    @Then("I verify the celcius temperature unit")
    public void iVerifyTheCelciusTemperatureUnit() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the celcius temperature unit");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_App_settings_Temperature_celcius_text_access_id));
        System.out.print("Celcius temperature unit verified");
    }

    @Then("I verify the fahrenheit temperature unit")
    public void iVerifyTheFahrenheitTemperatureUnit() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the fahrenheit temperature unit");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_App_settings_Temperature_fahrenheit_text_access_id));
        System.out.print("Fahrenheit temperature unit verified");
    }

    @Then("I verify the app version name card title")
    public void iVerifyTheAppVersionNameCardTitle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the app version name card title");
        asserttext(Constant_settings.Settings_App_setting_app_version_text_expected, Constant_settings.App_version_text_xpath_OR_operator);
        System.out.print("App version text verified");
    }

    @Then("I tap on the language collapse button")
    public void iTapOnTheLanguageCollapseButton() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the language collapse button");
        TaponbuttonaccessabilityID(Constant_settings.Settings_App_settings_language_text_collapse_button_access_id);
        Thread.sleep(2000);
        System.out.println("Lanuage navigation icon is selected");
    }

    @Then("I verify the language page header text")
    public void iVerifyTheLanguagePageHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the language page header text");
        asserttext(Constant_settings.Settings_App_setting_Language_page_header_text_expected, Constant_settings.Language_header_xpath_OR_operator);
        System.out.print("Language page header text verified");
    }

    @Then("I verify the english language text")
    public void iVerifyTheEnglishLanguageText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the english language text");
        //asserttextValidationAccessibility(Constant_settings.Settings_App_setting_Language_page_English_text_expected,Constant_settings.Settings_App_settings_english_language_text_access_id);
        asserttext(Constant_settings.Settings_App_setting_Language_page_English_text_expected,Constant_settings.Language_English_text_xpath_OR_operator);
        System.out.print("English text verified");
    }

    @Then("I verify the spanish language text")
    public void iVerifyTheSpanishLanguageText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the spanish language text");
//        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_settings.Settings_App_settings_spanish_language_text_access_id);
//        if (elementsByAccessibilityId.size() != 0) {
//            asserttextValidationAccessibility(Constant_settings.Settings_App_setting_Language_page_Spanish_text_expected, Constant_settings.Settings_App_settings_spanish_language_text_access_id);
//        }
    }

    @Then("I verify the french language text")
    public void iVerifyTheFrenchLanguageText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the french language text");
//        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_settings.Settings_App_settings_french_language_text_access_id);
//        if (elementsByAccessibilityId.size() != 0) {
//            asserttextValidationAccessibility(Constant_settings.Settings_App_setting_Language_page_French_text_expected, Constant_settings.Settings_App_settings_french_language_text_access_id);
//        }
    }

    @Then("I verify the german language text")
    public void iVerifyTheGermanLanguageText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the german language text");
        asserttext(Constant_settings.Settings_App_setting_Language_page_German_text_expected,Constant_settings.Language_German_text_xpath_OR_operator);
        System.out.print("German text verified");
    }

    @Then("I tap on the back button icon on language page")
    public void iTapOnTheBackButtonIconOnLanguagePage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the back button icon on language page");
        Taponbutton(Constant_settings.Language_back_button_xpath);
        Thread.sleep(2000);
    }

    @Then("I tap on the back button icon on app setting page")
    public void iTapOnTheBackButtonIconOnAppSettingPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the back button icon on app setting page");
        Taponbutton(Constant_settings.App_settings_back_button_xpath);
        Thread.sleep(2000);
    }

    @Then("I update Temperature Unit in Settings to fahrenheit")
    public void iUpdateTemperatureUnitInSettingsToFahrenheit() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I update Temperature Unit in Settings to fahrenheit");
        fahrenheitText = driver.findElementByAccessibilityId(Constant_settings.Settings_App_settings_Temperature_fahrenheit_text_access_id).getText();
        celciusText = driver.findElementByAccessibilityId(Constant_settings.Settings_App_settings_Temperature_celcius_text_access_id).getText();
        TaponbuttonaccessabilityID(Constant_settings.Settings_App_settings_Temperature_fahrenheit_text_access_id);
        System.out.println("Fahrenheit is selected");
    }

    @Then("I validate updated value displayed inside the climate tile")
    public void iValidateUpdatedValueDisplayedInsideTheClimateTile() {
        String actualString = driver.findElementByAccessibilityId(Constant_settings.Climate_tile_Units_access_id).getText();
        if (actualString.contains(fahrenheitText)) {
            System.out.println("Fahrenheit is displayed");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I update the Temperature Unit in Settings to Celcius")
    public void iUpdateTheTemperatureUnitInSettingsToCelcius() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I update the Temperature Unit in Settings to Celcius");
        TaponbuttonaccessabilityID(Constant_settings.Settings_App_settings_Temperature_celcius_text_access_id);
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

    @Then("I validated updated value displayed inside the climate tile")
    public void iValidatedUpdatedValueDisplayedInsideTheClimateTile() {
        String actualString = driver.findElementByAccessibilityId(Constant_settings.Climate_main_tile_inside_temp).getText();
        if (actualString.contains(celciusText)) {
            System.out.println("Text comparison is Successful");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }
    @Then("I verify settings screen back button")
    public void iVerifySettingsScreenBackButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify settings screen back button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(com.dometic.SDB.qa.Pages.Constant_settings.Settings_headerBackButtonIcon_access_id));
        System.out.println("Settings screen back button is verified");
    }

    @Then("I verify user profile photo is displayed")
    public void iVerifyUserProfilePhotoIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify user profile photo is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(com.dometic.SDB.qa.Pages.Constant_settings.Settings_userProfilePhoto_access_id));
        System.out.println("User profile photo is verified");
    }

    @Then("I verify username is displayed")
    public void iVerifyUsernameIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify username is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(com.dometic.SDB.qa.Pages.Constant_settings.Settings_userName_access_id));
        System.out.println("Username text is verified");
    }

    @Then("I verify user email is displayed")
    public void iVerifyUserEmailIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify user email is displayed");
        Assert.assertTrue(iselementdisplayedaccessabilityId(com.dometic.SDB.qa.Pages.Constant_settings.Settings_userEmail_access_id));
        System.out.println("User email text is verified");
    }

    @Then("I verify Home text is displayed")
    public void iVerifyHomeTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Home text is displayed");
        asserttext(com.dometic.SDB.qa.Pages.Constant_settings.Settings_home_text, com.dometic.SDB.qa.Pages.Constant_settings.Settings_home_text_xpath_OR_operator);
        System.out.println("Home text is verified");
    }

    @Then("I verify Notification Settings text is displayed")
    public void iVerifyNotificationSettingsTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Notification Settings text is displayed");
        asserttext(com.dometic.SDB.qa.Pages.Constant_settings.Settings_notificationSettings_text, com.dometic.SDB.qa.Pages.Constant_settings.Settings_notificationSettings_text_xpath_OR_operator);
        System.out.println("Notification Settings text is verified");
    }

    @Then("I verify Device Management is displayed")
    public void iVerifyDeviceManagementIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Device Management is displayed");
        asserttext(com.dometic.SDB.qa.Pages.Constant_settings.Settings_deviceMangagement_text, com.dometic.SDB.qa.Pages.Constant_settings.Settings_deviceMangagement_text_xpath_OR_operator);
        System.out.println("Device Management text is verified");
    }

    @Then("I verify App Settings is displayed")
    public void iVerifyAppSettingsIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify App Settings is displayed");
        asserttext(com.dometic.SDB.qa.Pages.Constant_settings.Settings_appSettings_text, com.dometic.SDB.qa.Pages.Constant_settings.Settings_appSettings_text_xpath_OR_operator);
        System.out.println("App Settings text is verified");
    }

    @Then("I verify Logout is displayed")
    public void iVerifyLogoutIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Logout is displayed");
        asserttext(com.dometic.SDB.qa.Pages.Constant_settings.Settings_Logout_text, com.dometic.SDB.qa.Pages.Constant_settings.Settings_Logout_text_xpath_OR_operator);
        System.out.println("Logout text is verified");
    }

    @Then("I verify Version {double} is displayed")
    public void iVerifyVersionIsDisplayed(double arg) throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Version 1.6 is displayed");
        asserttext(com.dometic.SDB.qa.Pages.Constant_settings.Settings_Version_16_text, com.dometic.SDB.qa.Pages.Constant_settings.Settings_Version_16_text_xpath_OR_operator);
        System.out.println("Version 1.7.4 text is verified");
    }
    @Then("I Tap on Home in Settings screen")
    public void iTapOnHomeInSettingsScreen() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Home in Settings screen");
        Taponbutton(Constant_settings.Settings_home_text_xpath_OR_operator);
        Thread.sleep(2000);
    }

    @Then("I Tap on Notification Settings")
    public void iTapOnNotificationSettings() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Notification Settings");
        Taponbutton(Constant_settings.Settings_notificationSettings_text_xpath_OR_operator);
        Thread.sleep(2000);
    }

    @Then("I Tap on Device Management")
    public void iTapOnDeviceManagement() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Device Management");
        Taponbutton(Constant_settings.Settings_deviceMangagement_text_xpath_OR_operator);
        Thread.sleep(2000);

    }

    @Then("I verify View Edit Account text is displayed")
    public void iVerifyViewEditAccountTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify View/Edit Account text is displayed");
        asserttext(Constant_settings.Settings_viewEditButtonText, Constant_settings.Settings_viewEditButtonText_xpath_OR_operator);
        System.out.println("View Edit Account text is verified");
    }

    @Then("I tap on close button in Edit profile screen")
    public void iTapOnCloseButtonInEditProfileScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on close button in Edit profile screen");
        TaponbuttonaccessabilityID(Constant_settings.Settings_Edit_profile_CloseButton_accessid);
    }

    @Then("I tap on View Edit option")
    public void iTapOnViewEditOption() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on View Edit option");
        Taponbutton(Constant_settings.Settings_viewEditButtonText_xpath_OR_operator);
    }

    @Then("I tap on account settings back button")
    public void iTapOnAccountSettingsBackButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on account settings back button");
        TaponbuttonaccessabilityID(Constant_settings.Header_menu_button_access_id);
    }

    @Then("I Tap on Back Button in manage notifications")
    public void iTapOnBackButtonInManageNotifications() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back Button in manage notifications");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_back_button_access_id);
    }

    @Then("I Tap on back button in Device Management")
    public void iTapOnBackButtonInDeviceManagement() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on back button in Device Management");
        TaponbuttonaccessabilityID(Constant_settings.Device_Management_back_button_access_id);
    }

    @Then("I Tap on Back Button in App settings page")
    public void iTapOnBackButtonInAppSettingsPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Back Button in App settings page");
        TaponbuttonaccessabilityID(Constant_settings.app_Settings_Back_Button_Access_Id);
    }

    @Then("I tap on AMTH tile")
    public void iTapOnAMTHTile() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on AMTH tile");
        Taponbutton(com.dometic.L2.qa.Pages.Constant_HomePage.homePage_AMTH_device_xpath);
    }

    @Then("I verify App setting back button")
    public void iVerifyAppSettingBackButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify App setting back button");
        iselementdisplayed(Constant_settings.App_settings_back_button_xpath);
        System.out.println("Back button in App settings is displayed");
    }

    @Then("I verify Language navigation button is displayed")
    public void iVerifyLanguageNavigationButtonIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Language navigation button is displayed");
        iselementdisplayedaccessabilityId(Constant_settings.Language_navigation_button_access_id);
        System.out.println("Language navigation button is displayed");
    }

    @Then("I verify German language in the selected language")
    public void iVerifyGermanLanguageInTheSelectedLanguage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify German language in the selected language");
        asserttext(Constant_settings.Settings_App_setting_Language_page_German_text_expected,Constant_settings.Selected_Language_text_German_xpath_OR_operator);
        System.out.println("German language verified");
    }

    @Then("I tap on English language option")
    public void iTapOnEnglishLanguageOption() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on English language option");
        Taponbutton(Constant_settings.Language_English_text_xpath_OR_operator);
    }

    @Then("I verify English language in selected language")
    public void iVerifyEnglishLanguageInSelectedLanguage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify German language in the selected language");
        asserttext(Constant_settings.Settings_App_setting_Language_page_English_text_expected, Constant_settings.Selected_Language_text_English_xpath_OR_operator);
        System.out.println("English language verified");
    }

    @Then("I validate updated value displayed in the climate tile")
    public void iValidateUpdatedValueDisplayedInTheClimateTile() {
        String actualString = driver.findElementByAccessibilityId(Constant_settings.Climate_tile_Units_access_id).getText();
        if (actualString.contains(fahrenheitText)) {
            System.out.println("Fahrenheit is displayed");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I validated updated value displayed in the climate tile")
    public void iValidatedUpdatedValueDisplayedInTheClimateTile() {
        String actualString = driver.findElementByAccessibilityId(Constant_settings.Climate_tile_Units_access_id).getText();
        if (actualString.contains(celciusText)) {
            System.out.println("Celsius is displayed");
        } else {
            System.out.println("Both Actual and Expected text is mismatching");
        }
    }

    @Then("I tap on German language in language")
    public void iTapOnGermanLanguageInLanguage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on German language in language");
        Taponbutton(Constant_settings.Language_German_text_xpath_OR_operator);
    }

    @Then("I tap on English language option in language page")
    public void iTapOnEnglishLanguageOptionInLanguagePage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on English language option in language page");
        Taponbutton(Constant_settings.Language_English_text_xpath_OR_operator);
    }

    @Then("I Tap on the Hamburger menu button")
    public void iTapOnTheHamburgerMenuButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Hamburger menu button");
        TaponbuttonaccessabilityID(Constant_settings.Header_menu_button_access_id);
    }

    @Then("I tap on the Notification settings")
    public void iTapOnTheNotificationSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the Notification settings");
        Taponbutton(Constant_settings.Notification_Settings_text_xpath_or_operator);
    }

    @Then("I verify the Manage notification header")
    public void iVerifyTheManageNotificationHeader() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Manage notification header");
        asserttext(Constant_settings.ManageNotification_Manage_Notification_text_expected, Constant_settings.ManageNotifications_title_xpath_or_operator);
        System.out.println("Manage Notification header is verified successfully");
    }

    @Then("I verify back arrow image in the manage notification screen")
    public void iVerifyBackArrowImageInTheManageNotificationScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify back arrow image in the manage notification screen");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_Back_button_access_id));
    }

    @Then("I verify the Manage notification logo")
    public void iVerifyTheManageNotificationLogo() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Manage notification logo");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_Logo_access_id));
    }

    @Then("I verify the Global settings text")
    public void iVerifyTheGlobalSettingsText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Global settings text");
        asserttext(Constant_settings.ManageNotifications_Global_settings_Text_expected, Constant_settings.ManageNotifications_Global_Settings_xpath_or_operator);
        System.out.println("Global settings text is verified Successfully");
    }

    @Then("I Verify the Push Notification text")
    public void iVerifyThePushNotificationText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Push Notification text");
        asserttext(Constant_settings.ManageNotifications_Push_Notification_text_Expected, Constant_settings.ManageNotifications_PushNotification_text_xpath_or_operator);
    }

    @Then("I verify the Push Notifications toggle button")
    public void iVerifyThePushNotificationsToggleButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Push Notifications toggle button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_PushNotifications_Toggle_access_id));
    }

    @Then("I verify the E-mail text on the page")
    public void iVerifyTheEMailTextOnThePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the E-mail text on the page");
        asserttext(Constant_settings.ManageNotifications_Email_text_expected, Constant_settings.ManageNotifications_Email_text_xpath_or_operator);
    }

    @Then("I verify the E-mail toggle button")
    public void iVerifyTheEMailToggleButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the E-mail toggle button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_email_toggle_access_id));
    }

    @Then("I tap on the Email toggle button")
    public void iTapOnTheEmailToggleButton() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the Email toggle button");
        //TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_email_toggle_access_id);
//        List<AndroidElement> id =driver.findElementsByAccessibilityId(Constant_settings.Manage_Notifications_Email_show_more_text_xpath_or_operator).size()!=1){
//            TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_email_toggle_access_id);

        List<AndroidElement> id = driver.findElementsByAccessibilityId(Constant_settings.Manage_Notifications_Email_show_more_text_access_id);
        if (id.size() != 1) {
            TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_email_toggle_access_id);
            Thread.sleep(1000);
        }

    }


    @Then("I verify SMS text in the page")
    public void iVerifySMSTextInThePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify SMS text in the page");
        asserttext(Constant_settings.ManageNotifications_SMS_text_expected, Constant_settings.ManageNotifications_SMS_text_xpath_or_operator);
        System.out.println(" Manage Notification sms text is verified successfully");
    }

    @Then("I verify the SMS toggle button")
    public void iVerifyTheSMSToggleButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the SMS toggle button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.ManageNotifications_SMS_toggle_access_id));

    }

    @Then("I verify Advanced title text")
    public void iVerifyAdvancedTitleText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Advanced title text");
        asserttext(Constant_settings.ManageNotifications_Advanced_text_Expected, Constant_settings.ManageNotifications_Advanced_Text_xpath_or_operator);
        System.out.println("Advanced title text is verified successfully");
    }

    @Then("I verify the push show more text")
    public void iVerifyThePushShowMoreText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the push show more text");
        asserttext(Constant_settings.push_show_more_text_expected, Constant_settings.push_show_more_text_xpath_or_operator);
        System.out.println("Manage notifications push show more text is verified successfully");
    }

    @Then("I tap on the push show more navigation icon")
    public void iTapOnThePushShowMoreNavigationIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the push show more navigation icon");
        TaponbuttonaccessabilityID(Constant_settings.push_show_more_navigation_icon_access_id);
    }

    @Then("I verify the push show less text")
    public void iVerifyThePushShowLessText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the push show less text");
        asserttext(Constant_settings.push_show_less_text_expected, Constant_settings.push_show_less_text_xpath_or_operator);
        System.out.println("Manage notifications push show less text is verified successfully");
    }

    @Then("I verify the push alerts text")
    public void iVerifyThePushAlertsText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the push alerts text");
        asserttext(Constant_settings.push_Alerts_text_expected, Constant_settings.push_Alerts_text_xpath_or_operator);
        System.out.println("Manage notifications push alerts text is verified successfully");
    }

    @Then("I verify the push alerts toggle button")
    public void iVerifyThePushAlertsToggleButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the push alerts toggle button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Manage_Notifications_push_alerts_toggle_access_id));

    }

    @Then("I verify the push warnings text")
    public void iVerifyThePushWarningsText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the push warnings text");
        asserttext(Constant_settings.push_Warnings_text_expected, Constant_settings.Manage_Notifications_push_Warnings_text_xpath_or_operator);
        System.out.println("Manage notifications push warnings text is verified successfully");

    }

    @Then("I verify the push warnings toggle button")
    public void iVerifyThePushWarningsToggleButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the push warnings toggle button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Manage_Notifications_push_warnings_toggle_access_id));
    }

    @Then("I tap on the push show less expand icon")
    public void iTapOnThePushShowLessExpandIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the push show less expand icon");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_push_show_less_expand_icon_access_id);
    }

    @Then("I verify the Email show more text")
    public void iVerifyTheEmailShowMoreText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email show more text");
        asserttext(Constant_settings.Email_show_more_text_expected,Constant_settings.Manage_Notifications_Email_show_more_text_xpath_or_operator);
        System.out.println("Manage notifications Email show more text is verified successfully");

    }

    @Then("I verify the Email show more navigation icon")
    public void iVerifyTheEmailShowMoreNavigationIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email show more navigation icon");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Manage_Notifications_Email_show_more_navigation_icon_access_id));
    }

    @Then("I tap on the Email show more navigation icon")
    public void iTapOnTheEmailShowMoreNavigationIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the Email show more navigation icon");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_show_more_navigation_icon_access_id);

    }

    @Then("I verify the Email show less text")
    public void iVerifyTheEmailShowLessText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email show less text");
        asserttext(Constant_settings.Email_show_less_text_expected, Constant_settings.Manage_Notifications_Email_show_less_text_xpath_or_operator);
        System.out.println("Email show less text is verified successfully");
    }

    @Then("I verify the Email list text")
    public void iVerifyTheEmailListText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email list text");
        asserttext(Constant_settings.Email_List_text_Expected, Constant_settings.Manage_Notifications_Email_List_text_xpath_or_operator);
        System.out.println("Email list text is verified successfully");
    }

    @Then("I verify the Email list Email text")
    public void iVerifyTheEmailListEmailText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email list Email text");
        asserttext(Constant_settings.Email_list_Email_text_expected, Constant_settings.Manage_Notifications_Email_List_Email_text_xpath_or_operator);
        System.out.println("Manage notifications Email list Email text is verified successfully");
    }

    @Then("I verify the Email list Email toggle button")
    public void iVerifyTheEmailListEmailToggleButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email list Email toggle button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Manage_Notifications_Email_List_Email_toggle_access_id));
    }

    @Then("I verify the Email Edit list text")
    public void iVerifyTheEmailEditListText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email Edit list text");
        asserttext(Constant_settings.Email_Edit_list_expected,Constant_settings.Manage_Notifications_Email_Editlist_text_xpath_or_operator);
        System.out.println("Manage notifications Email Edit list text is verified successfully");
    }

    @Then("I tap on the Email edit list expand icon")
    public void iTapOnTheEmailEditListExpandIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the Email edit list expand icon");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_Edit_List_Expand_icon_access_id);
    }

    @Then("I verify the Email list title text")
    public void iVerifyTheEmailListTitleText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email list title text");
        asserttext(Constant_settings.Email_list_title_text_expected,Constant_settings.Manage_Notifications_Email_List_title_text_xpath_or_operator);
        System.out.println("Manage notifications Email list title text is verified successfully");
    }

    @Then("I verify the Email list cancel button")
    public void iVerifyTheEmailListCancelButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email list cancel button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Manage_Notifications_Email_list_cancel_button_access_id));
    }

    @Then("I verify the Email list Email Account text")
    public void iVerifyTheEmailListEmailAccountText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email list Email Account text");
        asserttext(Constant_settings.Email_list_Email_Account_text_expected, Constant_settings.Manage_Notifications_Email_list_Email_Account_text_xpath_or_operator);
        System.out.println("Manage notifications Email list Email Account text is verified successfully");
    }

    @Then("I verify the Email list Additional Emails text")
    public void iVerifyTheEmailListAdditionalEmailsText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email list Additional Emails text");
        asserttext(Constant_settings.Email_list_Additional_Emails_text_expected, Constant_settings.Manage_Notifications_Email_list_Additional_Emails_text_xpath_or_opertaor);
        System.out.println("Manage notifications Email list Additional Emails text is verified successfully");
    }

    @Then("I verify the Email list Add new + symbol image")
    public void iVerifyTheEmailListAddNewSymbolImage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email list Add new + symbol image");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Manage_Notifications_Email_list_Add_new_symbol_image_access_id));
    }

    @Then("I verify the Email list save text")
    public void iVerifyTheEmailListSaveText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email list save text");
        asserttext(Constant_settings.Email_list_save_text_expected, Constant_settings.Manage_Notifications_Email_list_save_text_xpath_or_operator);
        System.out.println("Manage notifications Email list save text is verified successfully");
    }

    @Then("I Tap on the Email list close button")
    public void iTapOnTheEmailListCloseButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Email list close button");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_List_close_button_access_id);
    }

    @Then("I verify the Email list Alerts text")
    public void iVerifyTheEmailListAlertsText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email list Alerts text");
        asserttext(Constant_settings.Email_list_Alerts_text_expected, Constant_settings.Manage_Notifications_Email_list_Alerts_text_xpath_or_operator);
        System.out.println("Manage notifications Email list Alerts  text is verified successfully");
    }

    @Then("I verify the Email list Alerts toggle button")
    public void iVerifyTheEmailListAlertsToggleButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email list Alerts toggle button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Manage_Notifications_Email_list_Alerts_toggle_access_id));

    }

    @Then("I verify the Email list warnings text")
    public void iVerifyTheEmailListWarningsText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email list warnings text");
        asserttextValidation(Constant_settings.Email_list_warnings_text_expected, Constant_settings.Manage_Notifications_Email_list_Warnings_text_xpath_or_operator);
        System.out.println("Manage notifications Email list warnings text is verified successfully");

    }

    @Then("I verify the Email list warnings toggle button")
    public void iVerifyTheEmailListWarningsToggleButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Email list warnings toggle button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Manage_Notifications_Email_list_Warnings_toggle_access_id));
    }

    @Then("I tap on the Email show less expand")
    public void iTapOnTheEmailShowLessExpand() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the Email show less expand");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_show_less_expand_icon_access_id);
    }

    @Then("I tap on the SMS toggle button")
    public void iTapOnTheSMSToggleButton() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the SMS toggle button");
//        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_SMS_toggle_button_access_id);
//        if(driver.findElementsByAccessibilityId(Constant_settings.Manage_Notifications_SMS_show_more_text_xpath_or_operator).size()!=1){
//            TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_SMS_toggle_button_access_id);
//            System.out.println("SMS toggle turned on");

        List<AndroidElement> id = driver.findElementsByAccessibilityId(Constant_settings.Manage_Notifications_SMS_show_more_text_access_id);
        if (id.size() != 1) {
            TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_SMS_toggle_button_access_id);
            Thread.sleep(1000);
        }
    }


    @Then("I verify the SMS show more text")
    public void iVerifyTheSMSShowMoreText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the SMS show more text");
        asserttext(Constant_settings.SMS_show_more_text_expected, Constant_settings.Manage_Notifications_SMS_show_more_text_xpath_or_operator);
        System.out.println("Manage notifications SMS show more text is verified successfully");

    }

    @Then("I tap on the SMS show more expand icon")
    public void iTapOnTheSMSShowMoreExpandIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the SMS show more expand icon");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_SMS_show_more_expand_icon_access_id);
    }

    @Then("I verify the SMS show less text")
    public void iVerifyTheSMSShowLessText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the SMS show less text");
        asserttextValidation(Constant_settings.SMS_Show_less_text_expected, Constant_settings.Manage_Notifications_SMS_Show_less_text_xpath_or_operator);
        System.out.println("SMS show less text");
    }

//    @Then("I tap on the SMS show less text")
//    public void iTapOnTheSMSShowLessText() throws Throwable {
//        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the SMS show less text");
//        asserttext(Constant_settings.SMS_show_less_text_expected,Constant_settings.Manage_Notifications_SMS_show_less_text_xpath_or_operator);
//        System.out.println("Manage notifications SMS show less text is verified successfully");
//
//    }

    @Then("I verify the SMS lIST text")
    public void iVerifyTheSMSLISTText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the SMS lIST text");
        asserttext(Constant_settings.SMS_list_text_expected,Constant_settings.Manage_Notifications_SMS_list_text_xpath_or_operator);
        System.out.println("Manage notifications SMS lIST text is verified successfully");

    }

    @Then("I verify the SMS Edit list text")
    public void iVerifyTheSMSEditListText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the SMS Edit list text");
        if(driver.findElements(By.xpath(Constant_settings.Manage_Notifications_SMS_Edit_list_text_xpath_or_operator)).size()!=0){
            asserttextValidation(Constant_settings.SMS_Edit_list_text_expected, Constant_settings.Manage_Notifications_SMS_Edit_list_text_xpath_or_operator);
        }
        System.out.println("Manage notifications SMS Edit list text is verified successfully");

    }

    @Then("I tap on the SMS Edit list naviagtion icon")
    public void iTapOnTheSMSEditListNaviagtionIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the SMS Edit list naviagtion icon");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_SMS_Edit_list_Text_Access_ID);

    }

    @Then("I verify the SMS LIST title text")
    public void iVerifyTheSMSLISTTitleText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the SMS LIST title text");
        asserttext(Constant_settings.SMS_list_title_text_expected, Constant_settings.Manage_Notifications_SMS_list_title_text_xpath_or_operator);
        System.out.println("SMS LIST title text is verified successfully");
    }

    @Then("I verify the SMS LIST cancel button")
    public void iVerifyTheSMSLISTCancelButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the SMS LIST cancel button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Manage_Notifications_SMS_List_cancel_button_access_id));

    }

    @Then("I verify the SMS LIST Mobile Account text")
    public void iVerifyTheSMSLISTMobileAccountText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the SMS LIST Mobile Account text");
        asserttext(Constant_settings.SMS_List_Mobile_Account_text_expected, Constant_settings.Manage_Notifications_SMS_List_Mobile_Account_text_xpath_or_operator);
        System.out.println("Manage notifications SMS LIST Mobile Account text is verified successfully");

    }

    @Then("I verify the SMS LIST Additional SMS text")
    public void iVerifyTheSMSLISTAdditionalSMSText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the SMS LIST Additional SMS text");
        asserttext(Constant_settings.SMS_List_Additional_SMS_text_expected, Constant_settings.Manage_Notifications_SMS_List_Additional_SMS_text_xpath_or_operator);
        System.out.println("Manage notifications SMS LIST Additional SMS text is verified successfully");
    }

    @Then("I verify the SMS lIST Mobile number text")
    public void iVerifyTheSMSLISTMobileNumberText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the SMS lIST Mobile number text");
        asserttext(Constant_settings.SMS_list_Mobile_number_text_expected, Constant_settings.Manage_Notifications_SMS_list_Mobile_number_text_xpath_or_operator);
        System.out.println("Manage notifications SMS lIST Mobile number text is verified successfully");


    }

    @Then("I Tap on the Add New button")
    public void iTapOnTheAddNewButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Add New button");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_list_Add_new_symbol_image_access_id);
    }

    @Then("I verify the SMS LIST Label text")
    public void iVerifyTheSMSLISTLabelText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the SMS LIST Label text");
        asserttext(Constant_settings.SMS_List_Label_text_expected,Constant_settings.ManageNotifications_SMS_List_Label_text_xpath_or_operator);
        System.out.println("Manage notifications SMS LIST Label text is verified successfully");

    }

    @Then("I verify the SMS LIST save text")
    public void iVerifyTheSMSLISTSaveText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the SMS LIST save text");
        asserttext(Constant_settings.SMS_List_save_text_expected,Constant_settings.Manage_Notifications_SMS_List_save_text_xpath_or_operator);
        System.out.println("SMS LIST save text is verified successfully");
    }

    @Then("I tap on the SMS LIST cancel arrow button")
    public void iTapOnTheSMSLISTCancelArrowButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the SMS LIST cancel arrow button");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_SMS_List_cancel_arrow_button_access_id);
    }

    @Then("I verify the SMS LIST Alerts text")
    public void iVerifyTheSMSLISTAlertsText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the SMS LIST Alerts text");
        asserttext(Constant_settings.SMS_List_Alerts_text_expected,Constant_settings.Manage_Notifications_SMS_List_Alerts_text_xpath_or_operator);
        System.out.println("SMS LIST Alerts text is verified successfully");
    }

    @Then("I verify the SMS LIST Alerts toggle button")
    public void iVerifyTheSMSLISTAlertsToggleButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the SMS LIST Alerts toggle button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Manage_Notifications_SMS_list_Alerts_toggle_access_id));
    }

    @Then("I verify the SMS LIST Warnings text")
    public void iVerifyTheSMSLISTWarningsText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the SMS LIST Warnings text");
        asserttext(Constant_settings.SMS_List_Warnings_text_expected,Constant_settings.Manage_Notifications_SMS_List_Warnings_text_xpath_or_operator);
        System.out.println("SMS LIST Warnings text is verified successfully");

    }

    @Then("I Verify the SMS LIST Warnings toggle button")
    public void iVerifyTheSMSLISTWarningsToggleButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the SMS LIST Warnings toggle button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Manage_Notifications_SMS_list_Warnings_toggle_access_id));

    }

    @Then("I tap on the SMS Show less navigation icon")
    public void iTapOnTheSMSShowLessNavigationIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the SMS Show less navigation icon");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_SMS_show_less_icon_access_id);

    }

    @Then("I tap on the Back button in manage notification screen")
    public void iTapOnTheBackButtonInManageNotificationScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the Back button in manage notification screen");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Back_button_access_id);
    }


    @Then("I verify the SMS LIST Add symbol icon")
    public void iVerifyTheSMSLISTAddSymbolIcon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the SMS LIST Add symbol icon");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Manage_Notifications_SMS_Add_Symbol_xpath));
    }


    @Then("I clear the texts in the vessel name field")
    public void iClearTheTextsInTheVesselNameField() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I clear the texts in the vessel name field");
        cleartextaccessabilityId(Constant_settings.Device_Management_Edit_vessel_name_access_id);

    }

    @Then("I verify Vessel name should not be empty error message is displayed")
    public void iVerifyVesselNameShouldNotBeEmptyErrorMessageIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Vessel name should not be empty error message is displayed");
        asserttext(Constant_settings.Edit_vessel_Vessel_name_should_not_be_empty_error_message_expected, Constant_settings.Edit_vessel_Vessel_name_should_not_be_empty_error_message_Xpath);
        System.out.println("Vessel name should not be empty error message is verified");

    }


    @Then("I verify edited device name in Home page")
    public void iVerifyEditedDeviceNameInHomePage() {

    }

    @Then("I verify the back button in profile")
    public void iVerifyTheBackButtonInProfile() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the back button in profile");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Settings_Profile_Back_Button_xpath));
    }

    @Then("I verify the profile photo")
    public void iVerifyTheProfilePhoto() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the profile photo");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Settings_profile_photo_access_id));

    }







    @Then("I verify the Check updates header text")
    public void iVerifyTheCheckUpdatesHeaderText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Check updates header text");
        asserttextValidation(Constant_settings.Check_updates_header_text, Constant_settings.Device_Management_Check_updates_header_Xpath_OR_Operator);
        System.out.println("Check updates header verified");

    }

    @Then("I verify check updates back button")
    public void iVerifyCheckUpdatesBackButton() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify check updates back button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_Check_updates_Back_button_accessid));
        System.out.println("Check updates back button verified");

    }

    @Then("I verify refresh button in check updates page")
    public void iVerifyRefreshButtonInCheckUpdatesPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify refresh button in check updates page");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Device_Management_Check_updates_Refresh_button_accessid));
        System.out.println("Check updates Refresh button verified");
    }

    @Then("I tap on check updates")
    public void iTapOnCheckUpdates() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on check updates");
        Taponbutton(Constant_settings.Device_Management_Check_updates_navigation_Xpath_OR_Operator);
        System.out.println("Tapped on check updates");
    }

    @Then("I tap on back button on onboardedd device page")
    public void iTapOnBackButtonOnOnboardeddDevicePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on back button on onboardedd device page");
        TaponbuttonaccessabilityID( Constant_settings.Settings_Device_Management_onboardedd_device_back_button_access_id);
        System.out.println("tapped on back button on onboardedd device page");
    }

    @Then("I verify Vessel name cannot include special characters error message is displayed")
    public void iVerifyVesselNameCannotIncludeSpecialCharactersErrorMessageIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Vessel name cannot include special characters error message is displayed");
        asserttext(Constant_settings.Edit_vessel_Vesse_name_cannot_include_special_characters_error_message_expected, Constant_settings.Edit_vessel_Vesse_name_cannot_include_special_characters_error_message_Xpath);
        System.out.println("Vessel name cannot include special characters error message is verified");
    }

    @Then("I Verify the Setting text of account setting")
    public void iVerifyTheSettingTextOfAccountSetting() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Setting text of account setting");
        asserttextValidation(Constant_settings.Settings_AccountSettings_Settings_text,Constant_settings.Settings_AccountSettings_profile_Settings_Xpath_OR_Operator);
        System.out.println("Account settings Settings text is verified");
    }

    @Then("I Verify the profile text of account setting")
    public void iVerifyTheProfileTextOfAccountSetting() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the profile text of account setting");
        asserttextValidation(Constant_settings.Settings_AccountSettings_profile_text, Constant_settings.Settings_AccountSettings_profile_Text_Xpath_OR_Operator);
        System.out.println("Account settings Profile text is verified");
    }

    @Then("I verify the profile card icn of account setting")
    public void iVerifyTheProfileCardIcnOfAccountSetting() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the profile card icn of account setting");
        iselementdisplayedaccessabilityId(Constant_settings.Settings_AccountSettings_profile_cardicon_accessid);
        System.out.println("Account settings profile card icon is verified");

    }

    @Then("I verify the subscription card icn of account setting")
    public void iVerifyTheSubscriptionCardIcnOfAccountSetting() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the subscription card icn of account setting");
        iselementdisplayedaccessabilityId(Constant_settings.Settings_AccountSettings_Subscription_cardicon_accessid);
        System.out.println("Account settings subscription card icon is verified");
    }

    @Then("I tap on back button in Account Settings screen")
    public void iTapOnBackButtonInAccountSettingsScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on back button in Account Settings screen");
        Taponbutton(Constant_settings.Settings_Account_settings_Back_button_xpath);
    }

    @Then("I verify the back button in subscriptions")
    public void iVerifyTheBackButtonInSubscriptions() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the back button in subscriptions");
        Assert.assertTrue(iselementdisplayed(Constant_settings.Settings_Subsriptions_Back_Button_xpath));
    }


    @Then("I tap on the Back Button in the subscriptions page")
    public void iTapOnTheBackButtonInTheSubscriptionsPage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the Back Button in the subscriptions page");
        Taponbutton(Constant_settings.Settings_Subsriptions_Back_Button_xpath);
    }

    @Then("I verify the Edit profile Cancel button")
    public void iVerifyTheEditProfileCancelButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Edit profile Cancel button");
        Assert.assertTrue(iselementdisplayedaccessabilityId(Constant_settings.Edit_Profile_Cancel_Button_access_id));
    }

    @Then("I tap on back button from the check updates screen")
    public void iTapOnBackButtonFromTheCheckUpdatesScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on back button from the check updates screen");
        TaponbuttonaccessabilityID(Constant_settings.Device_Management_Check_updates_Back_button_accessid);
        System.out.println("Tapped on check updates");
    }

    @Then("I Tap on Device Management back buton")
    public void iTapOnDeviceManagementBackButon() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Device Management back buton");
        TaponbuttonaccessabilityID(Constant_settings.Device_Management_back_button_access);
    }

    @Then("I verify the push notification toggle")
    public void iVerifyThePushNotificationToggle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the push notification toggle");
        if (driver.findElementByAccessibilityId(Constant_settings.manageNotifications_PushNotification_Show_More_Or_Show_Less_Access_ID).getAttribute("text").equalsIgnoreCase("Show less")) {
            System.out.println("Push Notification Toggle Already ON");
        } else if (driver.findElementByAccessibilityId(Constant_settings.manageNotifications_PushNotification_Show_More_Or_Show_Less_Access_ID).getAttribute("text").equalsIgnoreCase("Show more")) {
            System.out.println("Push Notification Toggle Already ON");
        }
    }

    @Then("I turn off the push notification toggle")
    public void iTurnOffThePushNotificationToggle() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn off the push notification toggle");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_PushNotifications_Toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I Turn Off The Push Notification Toggle");
    }

    @Then("I turn on the push notification toggle")
    public void iTurnOnThePushNotificationToggle() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn on the push notification toggle");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_PushNotifications_Toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I Turn On The Push Notification Toggle");
    }

    @Then("I turn off the push notification-alerts toggle")
    public void iTurnOffThePushNotificationAlertsToggle() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn off the push notification-alerts toggle");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_push_alerts_toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I Turn Off The Push Notification-Alerts Toggle");
    }

    @Then("I turn on the push notification-alerts toggle")
    public void iTurnOnThePushNotificationAlertsToggle() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn on the push notification-alerts toggle");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_push_alerts_toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I Turn On The Push Notification-Alerts Toggle");
    }

    @Then("I turn off the push notification-warnings toggle")
    public void iTurnOffThePushNotificationWarningsToggle() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn off the push notification-warnings toggle");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_push_warnings_toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I Turn Off The Push Notification-Warnings Toggle");
    }

    @Then("I turn on the push notification-warnings toggle")
    public void iTurnOnThePushNotificationWarningsToggle() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn on the push notification-warnings toggle");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_push_warnings_toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I Turn On The Push Notification-Warnings Toggle");
    }

    @Then("I verify the push notification-email toggle")
    public void iVerifyThePushNotificationEmailToggle() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the push notification-email toggle");
        if (driver.findElementByAccessibilityId(Constant_settings.Manage_Notifications_Email_show_more_text_access_id).getAttribute("text").equalsIgnoreCase("Show less")) {
            System.out.println("Push Notification Toggle Already ON");
        } else if (driver.findElementByAccessibilityId(Constant_settings.Manage_Notifications_Email_show_more_text_access_id).getAttribute("text").equalsIgnoreCase("Show more")) {
            System.out.println("Push Notification Toggle Already ON");
        }
    }

    @Then("I turn off the push notification-email toggle")
    public void iTurnOffThePushNotificationEmailToggle() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn off the push notification-email toggle");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_email_toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I Turn Off The Push Notification-Email Toggle");
    }

    @Then("I turn on the push notification-email toggle")
    public void iTurnOnThePushNotificationEmailToggle() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn on the push notification-email toggle");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_email_toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I Turn On The Push Notification-Email Toggle");
    }

    @Then("I Tap on Show more or Show less text in Push Notification")
    public void iTapOnShowMoreOrShowLessText() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Show more or Show less text");
        if(driver.findElementByAccessibilityId(Constant_settings.manageNotifications_PushNotification_Show_More_Or_Show_Less_Access_ID).getAttribute("text").equalsIgnoreCase("Show more")){
            TaponbuttonaccessabilityID(Constant_settings.manageNotifications_PushNotification_Show_More_Or_Show_Less_Access_ID);
            Thread.sleep(3000);
        }
        else if(driver.findElementByAccessibilityId(Constant_settings.manageNotifications_PushNotification_Show_More_Or_Show_Less_Access_ID).getAttribute("text").equalsIgnoreCase("Show less")){
            Thread.sleep(3000);
        }
        System.out.println("I Tap on Show more or Show less text");
    }

    @Then("I turn off the push notification-email-alerts toggle")
    public void iTurnOffThePushNotificationEmailAlertsToggle() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn off the push notification-email-alerts toggle");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_list_Alerts_toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I turn off the push notification-email-alerts toggle");
    }

    @Then("I turn on the push notification-email-alerts toggle")
    public void iTurnOnThePushNotificationEmailAlertsToggle() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn on the push notification-email-alerts toggle");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_list_Alerts_toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I turn on the push notification-email-alerts toggle");
    }

    @Then("I turn off the push notification-email-warnings toggle")
    public void iTurnOffThePushNotificationEmailWarningsToggle() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn off the push notification-email-warnings toggle");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_list_Warnings_toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I turn off the push notification-email-warnings toggle");
    }

    @Then("I turn on the push notification-email-warnings toggle")
    public void iTurnOnThePushNotificationEmailWarningsToggle() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn on the push notification-email-warnings toggle");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_list_Warnings_toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I turn on the push notification-email-warnings toggle");
    }

    @Then("I Tap on show more or show less text in email field")
    public void iTapOnShowMoreOrShowLessTextInEmailField() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on show more or show less text in email field");
        if(driver.findElementByAccessibilityId(Constant_settings.Manage_Notifications_Email_show_more_text_access_id).getAttribute("text").equalsIgnoreCase("Show more")){
            TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_show_more_text_access_id);
            Thread.sleep(2000);
        }
        else if(driver.findElementByAccessibilityId(Constant_settings.Manage_Notifications_Email_show_more_text_access_id).getAttribute("text").equalsIgnoreCase("Show less")){
            Thread.sleep(2000);
        }
        System.out.println("I Tap on show more or show less text in email field");
    }

    @Then("I Tap on edit list in email field")
    public void iTapOnEditListInEmailField() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on edit list in  email field");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_Editlist_Text_Access_ID);
        Thread.sleep(2000);
        System.out.println("I Tap on edit list in  email field");
    }

    @Then("I Tap on the add new button in email field")
    public void iTapOnTheAddNewButtonInEmailField() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the add new button in email field");
        TaponbuttonaccessabilityID(Constant_settings.Notification_Addnew_Button);
        Thread.sleep(2000);
        System.out.println("I Tap on the add new button in email field");
    }

    @Then("I Enter empty string into email field")
    public void iEnterEmptyStringIntoEmailField() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter empty string into email field");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Access_ID);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Access_ID);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        System.out.println("I Enter empty string into email field");
    }

    @Then("I Enter empty string into label field")
    public void iEnterEmptyStringIntoLabelField() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter empty string into label field");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_List_Label_Text_Field_Access_ID);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Manage_Notifications_Email_List_Label_Text_Field_Access_ID);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        System.out.println("I Enter empty string into label field");
    }

    @Then("I verify The email {int} field is required string is displayed")
    public void iVerifyTheEmailFieldIsRequiredStringIsDisplayed(int arg0) throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify The email 0 field is required string is displayed");
        System.out.println(driver.findElementByAccessibilityId(Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Subtitle_Validation).getText());
        System.out.println(Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Subtitle_Validation_Data);
        asserttextValidationAccessibility(Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Emojis_Subtitle_Validation_Data,Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Subtitle_Validation);
        System.out.println("I verify The email 0 field is required string is displayed");
    }

    @Then("I verify The Label {int} field is required string is displayed")
    public void iVerifyTheLabelFieldIsRequiredStringIsDisplayed(int arg0) throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify The Label 0 field is required string is displayed");
        System.out.println(driver.findElementByAccessibilityId(Constant_settings. Manage_Notifications_Email_List_Label_Text_Field_Subtitle_Validation).getText());
        System.out.println(Constant_settings. Manage_Notifications_Email_List_Label_Text_Field_Subtitle_Validation_Data);
        asserttextValidationAccessibility(Constant_settings. Manage_Notifications_Email_List_Label_Text_Field_Subtitle_Validation_Data,Constant_settings. Manage_Notifications_Email_List_Label_Text_Field_Subtitle_Validation);
        System.out.println("I verify The Label 0 field is required string is displayed");
    }

    @Then("I close the Email List")
    public void iCloseTheEmailList() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify The Label 0 field is required string is displayed");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_List_close_button_access_id);
        Thread.sleep(1000);
        System.out.println("I verify The Label 0 field is required string is displayed");
    }

    @Then("I Enter Emoji's as string into email field")
    public void iEnterEmojiSAsStringIntoEmailField() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter Emoji's as string into email field");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Access_ID);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Access_ID);
        Thread.sleep(1000);
        String emojis = Constant_settings.grinning_face_with_smiling_eyes + Constant_settings.face_with_tears_of_joy +
                Constant_settings.smiling_face_with_open_mouth_and_cold_sweat + Constant_settings.smiling_face_with_open_mouth_and_tightly_closed_eyes +
                Constant_settings.winking_face;
        entertextaccessabilityId(emojis, Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Access_ID);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        System.out.println("I Enter Emoji's as string into email field");
    }

    @Then("I Enter Emoji's as string into label field")
    public void iEnterEmojiSAsStringIntoLabelField() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter Emoji's as string into label field");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_List_Label_Text_Field_Access_ID);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Manage_Notifications_Email_List_Label_Text_Field_Access_ID);
        Thread.sleep(1000);
        String emojis = Constant_settings.grinning_face_with_smiling_eyes + Constant_settings.face_with_tears_of_joy +
                Constant_settings.smiling_face_with_open_mouth_and_cold_sweat + Constant_settings.smiling_face_with_open_mouth_and_tightly_closed_eyes +
                Constant_settings.winking_face;
        entertextaccessabilityId(emojis, Constant_settings.Manage_Notifications_Email_List_Label_Text_Field_Access_ID);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        System.out.println("I Enter Emoji's as string into label field");
    }

    @Then("I Enter Special character as string into email field")
    public void iEnterSpecialCharacterAsStringIntoEmailField() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter Special character as string into email field");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Access_ID);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Access_ID);
        Thread.sleep(1000);
        entertextaccessabilityId(Constant_settings.editProfile_firstNameValue_SpecialCharacter, Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Access_ID);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        System.out.println("I Enter Special character as string into email field");
    }

    @Then("I Enter Special character as string into label field")
    public void iEnterSpecialCharacterAsStringIntoLabelField() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter Special character as string into label field");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_List_Label_Text_Field_Access_ID);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Manage_Notifications_Email_List_Label_Text_Field_Access_ID);
        Thread.sleep(1000);
        entertextaccessabilityId(Constant_settings.editProfile_firstNameValue_SpecialCharacter, Constant_settings.Manage_Notifications_Email_List_Label_Text_Field_Access_ID);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        System.out.println("I Enter Special character as string into label field");
    }

    @Then("I verify the push notification-SMS toggle")
    public void iVerifyThePushNotificationSMSToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the push notification-email toggle");
        if (driver.findElementByAccessibilityId(Constant_settings.Manage_Notifications_SMS_show_more_text_access_id).getAttribute("text").equalsIgnoreCase("Show less")) {
            System.out.println("Push Notification Toggle Already ON");
        } else if (driver.findElementByAccessibilityId(Constant_settings.Manage_Notifications_SMS_show_more_text_access_id).getAttribute("text").equalsIgnoreCase("Show more")) {
            System.out.println("Push Notification Toggle Already ON");
        }
    }

    @Then("I turn off the push notification-SMS toggle")
    public void iTurnOffThePushNotificationSMSToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn off the push notification-SMS toggle");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_SMS_toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I turn off the push notification-SMS toggle");
    }

    @Then("I turn on the push notification-SMS toggle")
    public void iTurnOnThePushNotificationSMSToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn on the push notification-SMS toggle");
        TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_SMS_toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I turn on the push notification-SMS toggle");
    }

    @Then("I turn off the push notification-SMS-alerts toggle")
    public void iTurnOffThePushNotificationSMSAlertsToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn off the push notification-SMS-alerts toggle");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_SMS_list_Alerts_toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I turn off the push notification-SMS-alerts toggle");
    }

    @Then("I turn on the push notification-SMS-alerts toggle")
    public void iTurnOnThePushNotificationSMSAlertsToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn on the push notification-SMS-alerts toggle");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_SMS_list_Alerts_toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I turn on the push notification-SMS-alerts toggle");
    }

    @Then("I turn off the push notification-SMS-warnings toggle")
    public void iTurnOffThePushNotificationSMSWarningsToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn off the push notification-SMS-warnings toggle");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_SMS_list_Warnings_toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I turn off the push notification-SMS-warnings toggle");
    }

    @Then("I turn on the push notification-SMS-warnings toggle")
    public void iTurnOnThePushNotificationSMSWarningsToggle() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I turn on the push notification-SMS-warnings toggle");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_SMS_list_Warnings_toggle_access_id);
        Thread.sleep(1000);
        System.out.println("I turn on the push notification-SMS-warnings toggle");
    }

    @Then("I Tap on show more or show less text in SMS field")
    public void iTapOnShowMoreOrShowLessTextInSMSField() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on show more or show less text in SMS field");
        if(driver.findElementByAccessibilityId(Constant_settings.Manage_Notifications_SMS_show_more_text_access_id).getAttribute("text").equalsIgnoreCase("Show more")){
            TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_SMS_show_more_text_access_id);
            Thread.sleep(2000);
        }
        else if(driver.findElementByAccessibilityId(Constant_settings.Manage_Notifications_SMS_show_more_text_access_id).getAttribute("text").equalsIgnoreCase("Show less")){
            Thread.sleep(2000);
        }
        System.out.println("I Tap on show more or show less text in SMS field");
    }

    @Then("I Tap on edit list in SMS field")
    public void iTapOnEditListInSMSField() throws InterruptedException, ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on edit list in SMS field");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_SMS_Edit_list_Text_Access_ID);
        Thread.sleep(2000);
        System.out.println("I Tap on edit list in SMS field");
    }

    @Then("I Enter valid character as string into email field")
    public void iEnterValidCharacterAsStringIntoEmailField() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter valid character as string into email field");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Access_ID);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Access_ID);
        Thread.sleep(1000);
        entertextaccessabilityId(Constant_settings.Manage_Notifications_Email_List_Valid_Email_Address, Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Access_ID);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        System.out.println("I Enter valid character as string into email field");
    }

    @Then("I Enter valid character as string into label field")
    public void iEnterValidCharacterAsStringIntoLabelField() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter valid character as string into email field");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_List_Label_Text_Field_Access_ID);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Manage_Notifications_Email_List_Label_Text_Field_Access_ID);
        Thread.sleep(1000);
        entertextaccessabilityId(Constant_settings.Manage_Notifications_Email_List_Valid_Label, Constant_settings.Manage_Notifications_Email_List_Label_Text_Field_Access_ID);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        System.out.println("I Enter valid character as string into email field");
    }

    @Then("I Save the Details")
    public void iSaveTheDetails() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Save the Details");
        Taponbutton(Constant_settings.Manage_Notifications_Email_list_save_text_xpath_or_operator);
        Thread.sleep(1000);
        System.out.println("I Save the Details");
    }

    @Then("I validate the email field and label displayed in manage notification screen")
    public void iValidateTheEmailFieldAndLabelDisplayedInManageNotificationScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate the email field and label displayed in manage notification screen");
        asserttextValidationAccessibility(Constant_settings.Manage_Notifications_Email_List_Valid_Email_Address,Constant_settings.Manage_Notifications_Email_List_Valid_Email_Address_access_id);
        asserttextValidationAccessibility(Constant_settings.Manage_Notifications_Email_List_Valid_Label,Constant_settings.Manage_Notifications_Email_List_Valid_Label_access_id);
        System.out.println("I validate the email field and label displayed in manage notification screen");
    }

    @Then("I Tap on delete latest created details")
    public void iTapOnDeleteLatestCreatedDetails() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on delete latest created details");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_List_Delete_Icon_Access_ID);
        Thread.sleep(1000);
        System.out.println("I Tap on delete latest created details");

    }

    @Then("I Enter valid character as string into sms field")
    public void iEnterValidCharacterAsStringIntoSmsField() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter valid character as string into sms field");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Access_ID);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Access_ID);
        Thread.sleep(1000);
        entertextaccessabilityId(Constant_settings.Manage_Notifications_Email_List_Valid_Phone_Number, Constant_settings.Manage_Notifications_Email_List_Email_Text_Field_Access_ID);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        System.out.println("I Enter valid character as string into sms field");
    }

    @Then("I Enter valid character as string into sms label field")
    public void iEnterValidCharacterAsStringIntoSmsLabelField() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Enter valid character as string into sms label field");
        TaponbuttonaccessabilityID(Constant_settings.Manage_Notifications_Email_List_Label_Text_Field_Access_ID);
        Thread.sleep(1000);
        cleartextaccessabilityId(Constant_settings.Manage_Notifications_Email_List_Label_Text_Field_Access_ID);
        Thread.sleep(1000);
        entertextaccessabilityId(Constant_settings.Manage_Notifications_Email_List_Valid_Label, Constant_settings.Manage_Notifications_Email_List_Label_Text_Field_Access_ID);
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        System.out.println("I Enter valid character as string into sms label field");
    }

    @Then("I validate the sms field and label displayed in manage notification screen")
    public void iValidateTheSmsFieldAndLabelDisplayedInManageNotificationScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I validate the sms field and label displayed in manage notification screen");
        asserttextValidationAccessibility(Constant_settings.Manage_Notifications_Email_List_Valid_Phone_Number,Constant_settings.Manage_Notifications_Email_List_Valid_Phone_Number_access_id);
        asserttextValidationAccessibility(Constant_settings.Manage_Notifications_Email_List_Valid_Label,Constant_settings.Manage_Notifications_Email_List_Valid_Phone_Number_Label_access_id);
        System.out.println("I validate the sms field and label displayed in manage notification screen");
    }

    @Then("I check the push notification toggle status")
    public void iCheckThePushNotificationToggleStatus() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I check the push notification toggle status");
        if(driver.findElementsByAccessibilityId(Constant_settings.manageNotifications_PushNotification_Show_More_Or_Show_Less_Access_ID).size()==0){
            TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_PushNotifications_Toggle_access_id);
            Thread.sleep(2000);
        }
        System.out.println("I check the push notification toggle status");

    }

    @Then("I check the push notification-email toggle status")
    public void iCheckThePushNotificationEmailToggleStatus() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I check the push notification-email toggle status");
        if(driver.findElementsByAccessibilityId(Constant_settings.Manage_Notifications_Email_show_more_text_access_id).size()==0){
            TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_email_toggle_access_id);
            Thread.sleep(2000);
        }
        System.out.println("I check the push notification-email toggle status");
    }

    @Then("I check the push notification-sms toggle status")
    public void iCheckThePushNotificationSmsToggleStatus() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I check the push notification-sms toggle status");
        if(driver.findElementsByAccessibilityId(Constant_settings.Manage_Notifications_SMS_show_more_text_access_id).size()==0){
            TaponbuttonaccessabilityID(Constant_settings.ManageNotifications_SMS_toggle_access_id);
            Thread.sleep(2000);
        }
        System.out.println("I check the push notification-sms toggle status");

    }

    @Then("I verify the AMTH text for advanced")
    public void iVerifyTheAMTHTextForAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the AMTH text for advanced");
        asserttextAccessibility(Constant_settings.AMTH_text_expected, Constant_settings.AMTH_text_access_id);
        System.out.println("AMTH text for advanced is verified");
    }

    @Then("I verify Push notification text for advanced")
    public void iVerifyPushNotificationTextForAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Push notification text for advanced");
        asserttextAccessibility(Constant_settings.pushnotification_text_expected, Constant_settings.pushnotification_text_access_id);
        System.out.println("Push notification text in advanced is verified");
    }

    @Then("I verify E-mail text in advanced")
    public void iVerifyEMailTextInAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify E-mail text in advanced");
        asserttextAccessibility(Constant_settings.Email_text_expected, Constant_settings.Email_text_access_id);
        System.out.println("E-mail text in advanced is verified");
    }

    @Then("I verify SMS text in advanced")
    public void iVerifySMSTextInAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify SMS text in advanced");
        asserttextAccessibility(Constant_settings.sms_text_expected, Constant_settings.sms_text_access_id);
        System.out.println("SMS text in advanced is verified");
    }

    @Then("I verify Batteries text")
    public void iVerifyBatteriesText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Batteries text");
        asserttextAccessibility(Constant_settings.batteries_text_expected, Constant_settings.batteries_text_access_id);
        System.out.println("Batteries text in advanced is verified");
    }

    @Then("I tap on batteries show more navigation button")
    public void iTapOnBatteriesShowMoreNavigationButton() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on batteries show more navigation button");
        TaponbuttonaccessabilityID(Constant_settings.showmore_navigationbutton_access_id);
    }

    @Then("I verify batteries Push notification text")
    public void iVerifyBatteriesPushNotificationText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify batteries Push notification text");
        asserttextAccessibility(Constant_settings.batteries_pushnotification_text_expected, Constant_settings.batteries_pushnotification_text_access_id);
        System.out.println("batteries Push notification text in advanced is verified");
    }

    @Then("I verify tanks text in advanced")
    public void iVerifyTanksTextInAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify tanks text in advanced");
        asserttextAccessibility(Constant_settings.tanks_text_expected, Constant_settings.tanks_text_access_id);
        System.out.println("tanks text in advanced is verified");
    }

    @Then("I tap on tanks show more navigation button in advanced")
    public void iTapOnTanksShowMoreNavigationButtonInAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on tanks show more navigation button in advanced");
        TaponbuttonaccessabilityID(Constant_settings.showmore_navigationbutton_access_id1);
    }


    @Then("I verify temperature push notification text")
    public void iVerifyTemperaturePushNotificationText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify temperature push notification text");
        asserttextAccessibility(Constant_settings.temperature_pushnotification_text_expected, Constant_settings.temperature_pushnotification_text_access_id);
        System.out.println("temperature text in advanced is verified");

    }

    @Then("I tap on Temperature show more navigation button")
    public void iTapOnTemperatureShowMoreNavigationButton() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Temperature show more navigation button in advanced");
        TaponbuttonaccessabilityID(Constant_settings.showmore_navigationbutton_access_id2);


    }

    @Then("I tap on AMTH in manage notifications")
    public void iTapOnAMTHIcon() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on AMTH in manage notifications");
        TaponbuttonaccessabilityID(Constant_settings.AMTH_access_id);

    }


    @Then("I verify Temperature text in AMTH advanced")
    public void iVerifyTemperatureTextInAMTHAdvanced() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Temperature text in l{int} advanced");
        asserttextAccessibility(Constant_settings.temperature_text_expected, Constant_settings.temperature_text_access_id);
        System.out.println("Temperature text in advanced is verified");

    }

    @Then("I verify Advanced text in AMTH")
    public void iVerifyAdvancedTextInAMTH() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the AMTH text for advanced");
        asserttextAccessibility(Constant_settings.AMTH_text_expected, Constant_settings.AMTH_text_access_id);
        System.out.println("Advanced text in advanced is verified");
    }

    @Then("I verify tanks push notification text")
    public void iVerifyTanksPushNotificationText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify tanks push notification text");
        asserttextAccessibility(Constant_settings.tanks_pushnotification_text_expected, Constant_settings.tanks_pushnotification_text_access_id);
        System.out.println("tanks push notification text in advanced is verified");

    }

    @Then("I Tap on the back button on the advance screen")
    public void iTapOnTheBackButtonOnTheAdvanceScreen()throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on Temperature show more navigation button in advanced");
        TaponbuttonaccessabilityID(Constant_settings.Advance_back_button_accessid);
    }
}


