package com.dometic.L1.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.L1.qa.Pages.Constant_forgotpassword;
import com.dometic.L1.qa.Pages.Constant_login;
import com.dometic.L1.qa.Pages.Constant_signup;
import com.dometic.L1.qa.util.Baseclass;
import com.dometic.MTC.qa.Pages.Constant_AccountSettings;
import com.google.common.collect.ImmutableMap;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import org.testng.Assert;

import java.util.List;

public class Forgotpassword extends Baseclass {
    com.dometic.L1.qa.Pages.Constant_forgotpassword forgotpassword_obj;
    @Then("I Verify Forgot Email Input text field is displayed in Login Page")
    public void Forgotpassword_Page_EmailInputbox() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Forgot Email Input textfield is displayed in Login Page");
//        Taponbutton(Constant_login.Login_forgot_password_link_xpath);
        Assert.assertTrue(iselementdisplayedaccessabilityId(forgotpassword_obj.Forgot_password_email));

    }
    @Then("I Verify Send button is displayed in Forgot password Page")
    public void Forgotpassword_Page_PasswordInputbox() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify Send button is displayed in Forgot password Page");
        Assert.assertTrue(iselementdisplayed(forgotpassword_obj.Forgot_password_send));
        System.out.println("Send button in forgot password page is verified");
    }

    @And("I enter Email in Login Page")
    public void Forgotpassword_enter_invalid_credentials() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter Email in Login Page");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(forgotpassword_obj.Forgot_password_email);
        Thread.sleep(1000);
        cleartextaccessabilityId(forgotpassword_obj.Forgot_password_email);
        Thread.sleep(1000);
        entertextaccessabilityId(forgotpassword_obj.Forgot_password_email1, forgotpassword_obj.Forgot_password_email);
    }
    @Then("I Tap on Send button in Forgot Password Page")
    public void Forgotpassword_enter_credentials_Forgotpassword() throws Throwable
    {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Send button in Forgot Password Page");
        TaponbuttonaccessabilityID(forgotpassword_obj.Forgot_password_send1);
    }

    @Then("I verify Forgot your password text is displayed in Forgot password Page")
    public void iVerifyForgotYourPasswordTextIsDisplayeddInForgotPasswordPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Forgot your password text is displayedd in Forgot password Page");
        Taponbutton(Constant_login.Login_forgot_password_link_access_id);
        asserttext(Constant_forgotpassword.ForgetPassword_page_title_text_expected,Constant_forgotpassword.ForgetPassword_page_title_access_id);
        System.out.println("Forgot your password text is verified");

    }

    @Then("I verify Forgot your password content text is displayed in Forgot password Page")
    public void iVerifyForgotYourPasswordContentTextIsDisplayedInForgotPasswordPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Forgot your password content text is displayed in Forgot password Page");
        asserttext(Constant_forgotpassword.ForgetPassword_forgot_enterEmail_text_expected,Constant_forgotpassword.ForgetPassword_forgot_enterEmail_access_id);
        asserttext(Constant_forgotpassword.ForgetPassword_forgot_createPass_text_expected,Constant_forgotpassword.ForgetPassword_forgot_createPass_access_id);
        asserttext(Constant_forgotpassword.ForgetPassword_forgot_emailReceive_expected,Constant_forgotpassword.ForgetPassword_forgot_emailReceive_access_id);
        asserttext(Constant_forgotpassword.ForgetPassword_forgot_checkSpam_expected,Constant_forgotpassword.ForgetPassword_forgot_checkSpam_access_id);
        asserttext(Constant_forgotpassword.ForgetPassword_forgot_checkInbox_expected,Constant_forgotpassword.ForgetPassword_forgot_checkInbox_access_id);
        asserttext(Constant_forgotpassword.ForgetPassword_forgot_checkinMin_expected,Constant_forgotpassword.ForgetPassword_forgot_checkinMin_access_id);
        System.out.println("Forgot your password content text verified");
    }

    @Then("I verify E-mail \\(case sensitive) label is displayed")
    public void iVerifyEMailCaseSensitiveLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify E-mail (case sensitive) label is displayed");
        asserttextAccessibility(Constant_forgotpassword.ForgetPassword_forgot_email_label_expected,Constant_forgotpassword.ForgetPassword_forgot_email_label_access_id);
        System.out.println("I verify E-mail \\(case sensitive) label is displayed");
    }

    @Then("I enter an Emoji's in Email Field in Forgot Password Page")
    public void iEnterAnEmojiSInEmailFieldInForgotPasswordPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Emoji's in Email Field in Forgot Password Page");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(forgotpassword_obj.Forgot_password_email);
        Thread.sleep(1000);
        cleartextaccessabilityId(forgotpassword_obj.Forgot_password_email);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        String emojis = Constant_AccountSettings.grinning_face_with_smiling_eyes + Constant_AccountSettings.face_with_tears_of_joy+
                Constant_AccountSettings.smiling_face_with_open_mouth_and_cold_sweat+Constant_AccountSettings.smiling_face_with_open_mouth_and_tightly_closed_eyes+
                Constant_AccountSettings.winking_face;
        entertextaccessabilityId(emojis,forgotpassword_obj.Forgot_password_email );
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I enter an Special Character in Email Field in Forgot Password Page")
    public void iEnterAnSpecialCharacterInEmailFieldInForgotPasswordPage() throws ClassNotFoundException, InterruptedException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter an Special Character in Email Field in Forgot Password Page");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(forgotpassword_obj.Forgot_password_email);
        Thread.sleep(1000);
        cleartextaccessabilityId(forgotpassword_obj.Forgot_password_email);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_login.email_SpecialCharacter,forgotpassword_obj.Forgot_password_email );
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I enter less then {int} characters in Email Field in Forgot Password Page")
    public void iEnterLessThenCharactersInEmailFieldInForgotPasswordPage(int arg0) throws ClassNotFoundException, InterruptedException{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter less then 8 characters in Email Field in Forgot Password Page");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(forgotpassword_obj.Forgot_password_email);
        Thread.sleep(1000);
        cleartextaccessabilityId(forgotpassword_obj.Forgot_password_email);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_signup.Signup_below_8_Character,forgotpassword_obj.Forgot_password_email );
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }

    @Then("I enter more then {int} characters in Email Field in Forgot Password Page")
    public void iEnterMoreThenCharactersInEmailFieldInForgotPasswordPage(int arg0) throws ClassNotFoundException, InterruptedException{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter more then 8 characters in Email Field in Forgot Password Page");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(forgotpassword_obj.Forgot_password_email);
        Thread.sleep(1000);
        cleartextaccessabilityId(forgotpassword_obj.Forgot_password_email);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
       entertextaccessabilityId(Constant_signup.Signup_above_8_Character,forgotpassword_obj.Forgot_password_email );
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));

    }
    @Then("I Tap on Successfully email send popup")
    public void iTapOnSuccessfullyEmailSendPopup() throws InterruptedException {
        List<AndroidElement> elements = driver.findElements(By.xpath(com.dometic.L2.qa.Pages.Constant_forgotpassword.ForgetPassword_parentPanel_xpath));
        if(elements.size()!=0){
            Thread.sleep(2000);
            Taponbutton(com.dometic.L2.qa.Pages.Constant_forgotpassword.ForgetPassword_OK_xpath);
        }
    }

    @Then("I tap on forgot password in the login page")
    public void iTapOnForgotPasswordInTheLoginPage()throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I tap on forgot password in the login page");
        Taponbutton(Constant_login.Login_forgot_password_link_access_id);
    }

    @Then("I enter a invalid email address in Email Field in Forgot Password Page")
    public void iEnterAInvalidEmailAddressInEmailFieldInForgotPasswordPage()throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I enter a invalid email address in Email Field in Forgot Password Page");
        Thread.sleep(1000);
        TaponbuttonaccessabilityID(forgotpassword_obj.Forgot_password_email);
        Thread.sleep(1000);
        cleartextaccessabilityId(forgotpassword_obj.Forgot_password_email);
        //  entertext(login_obj.ValidUser,login_obj.Login_Email_Xpath);
        entertextaccessabilityId(Constant_signup.Signup_invalid_email_value1,forgotpassword_obj.Forgot_password_email );
        Thread.sleep(1000);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
    }

    @Then("I verify blank email in email text field in forgot password page")
    public void iVerifyBlankEmailInEmailTextFieldInForgotPasswordPage() throws Throwable{
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify blank email in email text field in forgot password page");
        TaponbuttonaccessabilityID(forgotpassword_obj.Forgot_password_email);
        Thread.sleep(1000);
        cleartextaccessabilityId(forgotpassword_obj.Forgot_password_email);
        driver.executeScript("mobile: performEditorAction", ImmutableMap.of("action", "search"));
        System.out.println("blank email in email text field in forgot password page text is verified");

    }

    @Then("I verify E-mail field is required Error message is displayed")
    public void iVerifyEMailFieldIsRequiredErrorMessageIsDisplayed()throws Throwable {
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(Constant_signup.Signup_invalidemail_message_access_id);
        if(elementsByAccessibilityId.size()!=0){
            asserttextValidationAccessibility(Constant_signup.Signup_invalidemail_message_expected,Constant_signup.Signup_invalidemail_message_access_id);
        }
        System.out.println("E-mail field is required Error message is verified");
    }
}

