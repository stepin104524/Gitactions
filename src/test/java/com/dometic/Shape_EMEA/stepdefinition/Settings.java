package com.dometic.Shape_EMEA.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.Shape_EMEA.qa.Pages.*;
import com.dometic.Shape_EMEA.qa.util.Baseclass;
import com.google.common.collect.ImmutableMap;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class Settings extends Baseclass {

    @Then("I Tap on the hamburger menu in landing screen")
    public void iTapOnTheHamburgerMenuInLandingScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on hamburger menu in landing screen");
        TaponbuttonaccessabilityID(Constant_settings.LandingPage_hamburger_menu_access_id);
        Thread.sleep(2000);
    }

    @Then("I verify the hamburger menu in landing screen")
    public void iVerifyTheHamburgerMenuInLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the hamburger menu in landing screen");
        iselementdisplayedaccessabilityId(Constant_settings.LandingPage_hamburger_menu_access_id);
        System.out.println("Hamburger icon is displayed");
    }

    @Then("I verify the settings screen back button")
    public void iVerifyTheSettingsScreenBackButton() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the settings screen back button");
        iselementdisplayedaccessabilityId(Constant_settings.Settings_BackButtonIcon_access_id );
        System.out.println("Settings screen back button is displayed");
    }

    @Then("I verify if user profile photo is displayed")
    public void iVerifyIfUserProfilePhotoIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if user profile photo is displayed");
        iselementdisplayedaccessabilityId(Constant_settings.Settings_ProfilePhoto_access_id);
        System.out.println("User profile photo is displayed");
    }

    @Then("I verify if username is displayed")
    public void iVerifyIfUsernameIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if username is displayed");
        iselementdisplayedaccessabilityId(Constant_settings.Settings_UserName_access_id);
        System.out.println("Username is displayed");
    }

    @Then("I verify if user email is displayed")
    public void iVerifyIfUserEmailIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify if user email is displayed");
        iselementdisplayedaccessabilityId(Constant_settings.Settings_UserEmail_access_id);
        System.out.println("User email ID is displayed");
    }


    @Then("I verify View Edit Account text in Settings page")
    public void iVerifyViewEditAccountTextInSettingsPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify View Edit Account text in Settings page");
        asserttext(Constant_settings.Settings_View_Edit_Text,Constant_settings.ViewEdit_text_xpath_OR_operator);
        System.out.println("View Edit Account text verified");
    }

    @Then("I verify Home text in Settings page")
    public void iVerifyHomeTextInSettingsPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Home text in Settings page");
        asserttext(Constant_settings.Settings_Home_text,Constant_settings.Home_text_xpath_OR_operator);
        System.out.println("Home text verified");
    }

    @Then("I verify Notification Settings text in Settings page")
    public void iVerifyNotificationSettingsTextInSettingsPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Notification Settings text in Settings page");
        asserttext(Constant_settings.Settings_NotificationSettings_text,Constant_settings.Notification_settings_text_xpath_OR_operator);
        System.out.println("Notification Settings text verified");
    }

    @Then("I verify Device Management text in Settings page")
    public void iVerifyDeviceManagementTextInSettingsPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Device Management text in Settings page");
        asserttext(Constant_settings.Settings_DeviceMangagement_text,Constant_settings.Device_management_text_xpath_OR_operator);
        System.out.println("Device Management text verified");
    }

    @Then("I verify App Settings text in Settings page")
    public void iVerifyAppSettingsTextInSettingsPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify App Settings text in Settings page");
        asserttext(Constant_settings.Settings_AppSettings_text,Constant_settings.AppSettings_text_xpath_OR_operator);
        System.out.println("App Settings text verified");
    }

    @Then("I verify Logout text in Settings page")
    public void iVerifyLogoutTextInSettingsPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Logout text in Settings page");
        asserttext(Constant_settings.Settings_Logout_text,Constant_settings.Logout_text_xpath_OR_operator);
        System.out.println("Logout text verified");
    }

    @Then("I verify Version text in Settings page")
    public void iVerifyVersionTextInSettingsPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Version text in Settings page");
        asserttext(Constant_settings.Settings_Version_text,Constant_settings.Version_text_xpath_OR_operator);
        System.out.println("Version text verified");
    }

    @Then("I Tap on Home option in Settings screen")
    public void iTapOnHomeOptionInSettingsScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Home option in Settings screen");
        Taponbutton(Constant_settings.Home_text_xpath_OR_operator);
        System.out.println("Clicked Home");
    }

    @Then("I tap on the View edit account option")
    public void iTapOnTheViewEditAccountOption() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the View edit account option");
        Taponbutton(Constant_settings.ViewEdit_text_xpath_OR_operator);
        System.out.println("Clicked View edit account");
    }

    @Then("I tap on the back button in Account settings")
    public void iTapOnTheBackButtonInAccountSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the back button in Account settings");
        Taponbutton(Constant_settings.Account_settings_back_button_xpath);
        System.out.println("Clicked back button in Account settings");

    }

    @Then("I tap on the Notification Settings option")
    public void iTapOnTheNotificationSettingsOption() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the Notification Settings option");
        Taponbutton(Constant_settings.Notification_settings_text_xpath_OR_operator);
        System.out.println("Clicked Notification Settings");
    }

    @Then("I tap on the back button in Manage notifications")
    public void iTapOnTheBackButtonInManageNotifications() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the back button in Manage notifications");
        TaponbuttonaccessabilityID(Constant_settings.Manage_notifications_back_button_access_id);
        System.out.println("Clicked back button in Manage notifications");
    }

    @Then("I tap on the Device Management option")
    public void iTapOnTheDeviceManagementOption() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the Device Management option");
        Taponbutton(Constant_settings.Device_management_text_xpath_OR_operator);
        System.out.println("Clicked Device Management");
    }

    @Then("I tap on the back button in Device Management")
    public void iTapOnTheBackButtonInDeviceManagement() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the back button in Device Management");
        TaponbuttonaccessabilityID(Constant_settings.Device_management_back_button_access_id);
        System.out.println("Clicked back button in Device Management");
    }

    @Then("I tap on the App Settings option")
    public void iTapOnTheAppSettingsOption() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the App Settings option");
        Taponbutton(Constant_settings.AppSettings_text_xpath_OR_operator);
        System.out.println("Clicked App Settings");
    }

    @Then("I tap on the back button in app settings")
    public void iTapOnTheBackButtonInAppSettings() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the back button in app settings");
        Taponbutton(Constant_settings.App_settings_back_button_xpath);
        System.out.println("Clicked back button in app settings");
    }

    @Then("I tap on the Logout option")
    public void iTapOnTheLogoutOption() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on the Logout option");
        Taponbutton(Constant_settings.Logout_text_xpath_OR_operator);
    }

}