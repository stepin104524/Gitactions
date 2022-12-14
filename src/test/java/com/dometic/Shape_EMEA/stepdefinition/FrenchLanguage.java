package com.dometic.Shape_EMEA.stepdefinition;

import com.aventstack.extentreports.GherkinKeyword;
import com.dometic.Shape_EMEA.qa.Pages.Constant_login;
import com.dometic.Shape_EMEA.qa.Pages.*;
import com.dometic.Shape_EMEA.qa.util.Baseclass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class FrenchLanguage extends Baseclass {
    com.dometic.L1.qa.Pages.Constant_signup signup_obj;
    com.dometic.L1.qa.Pages.Constant_login login_obj;

    @Then("I verify Forgot your password French text is displayed in Forgot password Page")
    public void iVerifyForgotYourPasswordFrenchTextIsDisplayedInForgotPasswordPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Forgot your password French text is displayed in Forgot password Page");
        Taponbutton(Constant_login.Login_forgot_password_link_Xpath_OR_Operator);
        asserttext(Constant_French_Language.ForgetPassword_forgot_header_French_text_expected, Constant_forgotpassword.ForgetPassword_page_title_xpath_OR_operator);

    }

    @Then("I verify Forgot your password content French text is displayed in Forgot password Page")
    public void iVerifyForgotYourPasswordContentFrenchTextIsDisplayedInForgotPasswordPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Forgot your password content French text is displayed in Forgot password Page");
        asserttext(Constant_French_Language.ForgetPassword_forgot_enterEmail_French_text_expected, Constant_forgotpassword.ForgetPassword_forgot_enterEmail_xpath_OR_operator);
        asserttext(Constant_French_Language.ForgetPassword_forgot_createPass_French_text_expected, Constant_forgotpassword.ForgetPassword_forgot_createPass_xpath_OR_operator);
        asserttext(Constant_French_Language.ForgetPassword_forgot_emailReceive_French_expected, Constant_forgotpassword.ForgetPassword_forgot_emailReceive_xpath_OR_operator);
        asserttext(Constant_French_Language.ForgetPassword_forgot_checkSpam_French_expected, Constant_forgotpassword.ForgetPassword_forgot_checkSpam_xpath_OR_operator);
        asserttext(Constant_French_Language.ForgetPassword_forgot_checkInbox_French_expected, Constant_forgotpassword.ForgetPassword_forgot_checkInbox_xpath_OR_operator);
        asserttext(Constant_French_Language.ForgetPassword_forgot_checkinMin_French_expected, Constant_forgotpassword.ForgetPassword_forgot_checkinMin_xpath_OR_operator);

    }

    @Then("I verify E-mail French label is displayed")
    public void iVerifyEMailFrenchLabelIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify E-mail French label is displayed");
        asserttext(Constant_French_Language.ForgetPassword_forgot_email_label_French_expected, Constant_forgotpassword.ForgetPassword_forgot_email_label_xpath_OR_operator);
    }

    @Then("Email field is required French text Error message is displayed")
    public void emailFieldIsRequiredFrenchTextErrorMessageIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "Email field is required French text Error message is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidemail_message_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            asserttextValidationAccessibility(Constant_French_Language.Signup_invalidemail_French_message_expected, signup_obj.Signup_invalidemail_message_access_id);
        }
    }

    @Then("Doesn't match French text Error message is displayed")
    public void doesnTMatchFrenchTextErrorMessageIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "Doesn't match French text Error message is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_showVerifyPasswordError_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            asserttextValidationAccessibility(Constant_French_Language.Signup_showVerifyPasswordError_French_Doesnt_match, signup_obj.Signup_showVerifyPasswordError_access_id);
        }
    }

    @Then("The verify password field is required French text Error message is displayed")
    public void theVerifyPasswordFieldIsRequiredFrenchTextErrorMessageIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "The verify password field is required French text Error message is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_showVerifyPasswordError_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            asserttextValidationAccessibility(Constant_French_Language.Signup_showVerifyPasswordError_French_expected, signup_obj.Signup_showVerifyPasswordError_access_id);
        }
    }

    @Then("The email must be a valid email address French text Error message is displayed")
    public void theEmailMustBeAValidEmailAddressFrenchTextErrorMessageIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "The email must be a valid email address French text Error message is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidemail_message_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            asserttextValidationAccessibility(Constant_French_Language.Signup_invalidemail_French_message_email_must_be_a_valid_email_address, signup_obj.Signup_invalidemail_message_access_id);
        }
    }

    @Then("The password doesn't satisfy the conditions French text Error message is displayed")
    public void thePasswordDoesnTSatisfyTheConditionsFrenchTextErrorMessageIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "The password doesn't satisfy the conditions French text Error message is displayed");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(signup_obj.Signup_invalidSecurePwd_message_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            asserttextValidationAccessibility(Constant_French_Language.Signup_The_password_doesnt_satisify_the_conditions_French_expected, signup_obj.Signup_invalidSecurePwd_message_access_id);
        }
    }

    @Then("I verify Welcome! Text\\(French) is displayed in login screen")
    public void iVerifyWelcomeTextFrenchIsDisplayedInLoginScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Welcome! Text is displayed in login screen");
        asserttextValidationAccessibility(Constant_French_Language.Login_welcome_French_text_expected, Constant_login.Login_welcome_text_Xpath_OR_Operator);
    }

    @Then("I verify Log In Text\\(French) is displayed in login screen")
    public void iVerifyLogInTextFrenchIsDisplayedInLoginScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Log In Text is displayed in login screen");
        asserttextValidationAccessibility(Constant_French_Language.Login_login_Frenchtext_expected, Constant_login.Login_login_text_Xpath_OR_Operator);
    }

    @Then("I verify Forgot password? link\\(French) is displayed in login page")
    public void iVerifyForgotPasswordLinkFrenchIsDisplayedInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Forgot password? link is displayed in login page");
        asserttextValidationAccessibility(Constant_French_Language.Login_forget_password_French_text_expected, Constant_login.Login_forgot_password_link_Xpath_OR_Operator);
    }

    @Then("I verify Don't have an account? text\\(French) is displayed in login page")
    public void iVerifyDonTHaveAnAccountTextFrenchIsDisplayedInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Don't have an account? text is displayed in login page");
        asserttextValidationAccessibility(Constant_French_Language.Login_Dont_have_an_account_French_text_expected, Constant_login.Login_Dont_have_an_account_Xpath_OR_Operator);
    }

    @Then("I verify Sign Up link\\(French) is displayed in login page")
    public void iVerifySignUpLinkFrenchIsDisplayedInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Sign Up link is displayed in login page");
        asserttextValidationAccessibility(Constant_French_Language.Login_Sign_Up_French_text_expected, Constant_login.Login_signup_link_Xpath_OR_Operator);
    }

    @Then("The Email field is required French Error message is displayed in login page")
    public void theEmailFieldIsRequiredFrenchErrorMessageIsDisplayedInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "The Email field is required French Error message is displayed in login page");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(login_obj.Login_invalidEmail_message_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            asserttextValidationAccessibility(Constant_French_Language.Login_invalidEmail_French_message_expected, login_obj.Login_invalidEmail_message_access_id);
        }
    }

    @Then("The Password field is required French Error message is displayed in login page")
    public void thePasswordFieldIsRequiredFrenchErrorMessageIsDisplayedInLoginPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "The Password field is required French Error message is displayed in login page");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(login_obj.Login_invalidsecurePwd_message_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            asserttextValidationAccessibility(Constant_French_Language.Login_invalidsecurePwd_French_message_expected, login_obj.Login_invalidsecurePwd_message_access_id);
        }
    }

    @Then("French Error message is displayed")
    public void frenchErrorMessageIsDisplayed() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "French Error message is displayed");
        List<AndroidElement> errorMessage = driver.findElements(By.xpath("//*[@text='Invalid Login']"));
        if (errorMessage.size() != 0) {
            Assert.assertTrue(iselementdisplayed(Constant_login.Login_error_text_xpath));
        }
    }

    @Then("The password must be at least {int} characters. French Error message is displayed in login page")
    public void thePasswordMustBeAtLeastCharactersFrenchErrorMessageIsDisplayedInLoginPage(int arg0) throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "The password must be at least 5 characters. French Error message is displayed in login page");
        List<AndroidElement> elementsByAccessibilityId = driver.findElementsByAccessibilityId(login_obj.Login_invalidsecurePwd_message_access_id);
        if (elementsByAccessibilityId.size() != 0) {
            asserttextValidationAccessibility(Constant_French_Language.Login_invalidsecurePwd_French_message_The_password_must_be_at_least_5_characters, login_obj.Login_invalidsecurePwd_message_access_id);
        }
    }

    @Then("I verify the text Climat in the Landing page")
    public void iVerifyTheTextClimatInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text Climat in the Landing page");
        asserttextValidation(Constant_French_Language.LandingPage_ClimateTile_Climate_French_Text, Constant_French_Language.LandingPage_ClimateTile_Climate_French_Text_xpath);
    }

    @Then("I verify the text La temp??rature est ?? l???ext??rieur de la plage in the Landing page")
    public void iVerifyTheTextLaTemp??ratureEst??LExt??rieurDeLaPlageInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text La temp??rature est ?? l???ext??rieur de la plage in the Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_French_Language.LandingPage_ClimateTile_Climate_La_temp??rature_est_??_l_ext??rieur_de_la_plage_xpath));
        if (elements.size() != 0) {
            asserttextValidation(Constant_French_Language.LandingPage_ClimateTile_Climate_La_temp??rature_est_??_l_ext??rieur_de_la_plage_text, Constant_French_Language.LandingPage_ClimateTile_Climate_La_temp??rature_est_??_l_ext??rieur_de_la_plage_xpath);
        }
    }

    @Then("I verify the text Alimentation in the Landing page")
    public void iVerifyTheTextAlimentationInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text Alimentation in the Landing page");
        asserttextValidation(Constant_French_Language.LandingPage_PowerTile_French_Text, Constant_French_Language.LandingPage_PowerTile_French_Text_xpath);
    }

    @Then("I verify the text Batterie de maison in the Landing page")
    public void iVerifyTheTextBatterieDeMaisonInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text Batterie de maison in the Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_French_Language.LandingPage_PowerTile_Batterie_de_maison_text_xpath));
        if (elements.size() != 0) {
            asserttextValidation(Constant_French_Language.LandingPage_PowerTile_Batterie_de_maison_text, Constant_French_Language.LandingPage_PowerTile_Batterie_de_maison_text_xpath);
        }
    }

    @Then("I verify the text Rechargez la batterie! in the Landing page")
    public void iVerifyTheTextRechargezLaBatterieInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text Rechargez la batterie! in the Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_French_Language.LandingPage_PowerTile_Rechargez_la_batterie_text_xpath));
        if (elements.size() != 0) {
            asserttextValidation(Constant_French_Language.LandingPage_PowerTile_Rechargez_la_batterie_text, Constant_French_Language.LandingPage_PowerTile_Rechargez_la_batterie_text_xpath);
        }
    }

    @Then("I verify the text Lampe in the Landing page")
    public void iVerifyTheTextLampeInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Forgot your password French text is displayed in Forgot password Page");
        asserttextValidation(Constant_French_Language.LandingPage_LightTile_French_Text, Constant_French_Language.LandingPage_LightTile_French_Text_xpath);
    }

    @Then("I verify the text Pr??sentement ALLUM?? in the Landing page")
    public void iVerifyTheTextPr??sentementALLUM??InTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text Pr??sentement ALLUM?? in the Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_French_Language.LandingPage_LightTile_Pr??sentement_ALLUM??_French_Text_xpath));
        if (elements.size() != 0) {
            asserttextValidation(Constant_French_Language.LandingPage_LightTile_Pr??sentement_ALLUM??_French_Text, Constant_French_Language.LandingPage_LightTile_Pr??sentement_ALLUM??_French_Text_xpath);
        }
    }

    @Then("I verify the text AGS in the Landing page")
    public void iVerifyTheTextAGSInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text AGS in the Landing page");
        asserttextValidation(Constant_French_Language.LandingPage_AGSTile_French_Text, Constant_French_Language.LandingPage_AGSTile_French_Text_xpath);
    }

    @Then("I verify the text Chargement automatique in the Landing page")
    public void iVerifyTheTextChargementAutomatiqueInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text Chargement automatique in the Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_French_Language.LandingPage_AGSTile_Chargement_automatique_Text_xpath));
        if (elements.size() != 0) {
            asserttextValidation(Constant_French_Language.LandingPage_AGSTile_Chargement_automatique_French_Text, Constant_French_Language.LandingPage_AGSTile_Chargement_automatique_Text_xpath);
        }
    }

    @Then("I verify the text MARCHE in the Landing page")
    public void iVerifyTheTextMARCHEinTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text MARCHE in the Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_French_Language.LandingPage_AGSTile_MARCHE_French_Text_xpath));
        if (elements.size() != 0) {
            asserttextValidation(Constant_French_Language.LandingPage_AGSTile_MARCHE_French_Text, Constant_French_Language.LandingPage_AGSTile_MARCHE_French_Text_xpath);
        }
    }

    @Then("I verify the text Fusibles in the Landing page")
    public void iVerifyTheTextFusiblesInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text Fusibles in the Landing page");
        asserttextValidation(Constant_French_Language.LandingPage_FUSeTile_French_Text, Constant_French_Language.LandingPage_FUSeTile_French_Text_xpath);
    }

    @Then("I verify the text Tout est OK in the Landing page")
    public void iVerifyTheTextToutEstOKInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text Tout est OK in the Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_French_Language.LandingPage_FUSeTile_Tout_est_OK_French_Text_xpath));
        if (elements.size() != 0) {
            asserttextValidation(Constant_French_Language.LandingPage_FUSeTile_Tout_est_OK_French_Text, Constant_French_Language.LandingPage_FUSeTile_Tout_est_OK_French_Text_xpath);
        }
    }

    @Then("I verify the text M??canique in the Landing page")
    public void iVerifyTheTextM??caniqueInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text M??canique in the Landing page");
        asserttextValidation(Constant_French_Language.LandingPage_MechanicalTile_French_Text, Constant_French_Language.LandingPage_MechanicalTile_French_Text_xpath);
    }

    @Then("I verify the text Auvent in the Landing page")
    public void iVerifyTheTextAuventInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text Auvent in the Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_French_Language.LandingPage_MechanicalTile_Auvent_French_Text_xpath));
        if (elements.size() != 0) {
            asserttextValidation(Constant_French_Language.LandingPage_MechanicalTile_Auvent_French_Text, Constant_French_Language.LandingPage_MechanicalTile_Auvent_French_Text_xpath);
        }
    }

    @Then("I verify the text R??servoir in the Landing page")
    public void iVerifyTheTextR??servoirInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text R??servoir in the Landing page");
        asserttextValidation(Constant_French_Language.LandingPage_TankTile_French_Text, Constant_French_Language.LandingPage_TankTile_French_Text_xpath);
    }

    @Then("I verify the text Fresh Water\\(French) in the Landing page")
    public void iVerifyTheTextFreshWaterFrenchInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text Fresh Water(French) in the Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_French_Language.LandingPage_TankTile_Fresh_Water_French_Text_xpath));
        if (elements.size() != 0) {
            asserttextValidation(Constant_French_Language.LandingPage_TankTile_Fresh_Water_French_Text, Constant_French_Language.LandingPage_TankTile_Fresh_Water_French_Text_xpath);
        }
    }

    @Then("I verify the text Eaux noires in the Landing page")
    public void iVerifyTheTextEauxNoiresInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text Eaux noires in the Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_French_Language.LandingPage_TankTile_Black_Water_Eaux_noires_French_Text_xpath));
        if (elements.size() != 0) {
            asserttextValidation(Constant_French_Language.LandingPage_TankTile_Black_Water_Eaux_noires_French_Text, Constant_French_Language.LandingPage_TankTile_Black_Water_Eaux_noires_French_Text_xpath);
        }
    }

    @Then("I verify the text Chauffe-eau in the Landing page")
    public void iVerifyTheTextChauffeEauInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text Chauffe-eau in the Landing page");
        asserttextValidation(Constant_French_Language.LandingPage_WaterHeater_French_Text, Constant_French_Language.LandingPage_WaterHeater_French_Text_xpath);
    }

    @Then("I verify the text Truma in the Landing page")
    public void iVerifyTheTextTrumaInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text Truma in the Landing page");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_French_Language.LandingPage_WaterHeater_Truma_French_Text_xpath));
        if (elements.size() != 0) {
            asserttextValidation(Constant_French_Language.LandingPage_WaterHeater_Truma_French_Text, Constant_French_Language.LandingPage_WaterHeater_Truma_French_Text_xpath);
        }
    }

    @Then("I verify the text Dispositifs in the Landing page")
    public void iVerifyTheTextDispositifsInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text Dispositifs in the Landing page");
        asserttextValidation(Constant_French_Language.LandingPage_WaterHeater_Truma_Dispositifs_French_Text, Constant_French_Language.LandingPage_WaterHeater_Truma_Dispositifs_French_Text_xpath);
    }

    @Then("I verify the text r??servoirs in the Landing page")
    public void iVerifyTheTextR??servoirsInTheLandingPage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the text r??servoirs in the Landing page");
        asserttextValidation(Constant_French_Language.LandingPage_WaterHeater_Truma_r??servoirs_French_Text, Constant_French_Language.LandingPage_WaterHeater_Truma_r??servoirs_French_Text_xpath);
    }

    @Then("I verify the Climate header French text displayed in Climate page")
    public void iVerifyTheClimateHeaderFrenchTextDisplayedInClimatePage() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Climate header French text displayed in Climate page");
        asserttextValidationAccessibility(Constant_French_Language.Climate_header_French_text, Constant_French_Language.Climate_header_French_text_access_id);
    }

    @Then("I Verify inside French text displayed")
    public void iVerifyInsideFrenchTextDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify inside French text displayed");
        asserttextValidationAccessibility(Constant_French_Language.Climate_inside_French_text, Constant_French_Language.Climate_inside_French_text_access_id);
    }

    @Then("I Verify outside French text displayed")
    public void iVerifyOutsideFrenchTextDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify outside French text displayed");
        asserttextValidationAccessibility(Constant_French_Language.Climate_outside_French_text, Constant_French_Language.Climate_outside_French_text_access_id);
    }

    @Then("I verify All Climate French text displayed")
    public void iVerifyAllClimateFrenchTextDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify All Climate French text displayed");
        asserttextValidationAccessibility(Constant_French_Language.Climate_AllClimate_French_text, Constant_French_Language.Climate_AllClimate_French_text_access_id);
    }

    @Then("I Tap on the Alimentation in Landing screen")
    public void iTapOnTheAlimentationInLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on the Alimentation in Landing screen");
        Taponbutton(Constant_French_Language.LandingPage_PowerTile_French_Text_xpath);
    }

    @Then("I Verify the power main screen header French text")
    public void iVerifyThePowerMainScreenHeaderFrenchText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the power main screen header French text");
        asserttextValidationAccessibility(Constant_French_Language.Powerpage_power_text_expected_French, Constant_French_Language.Powerpage_power_text_access_id);
    }

    @Then("I Verify the House Battery French text")
    public void iVerifyTheHouseBatteryTextFrenchText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the House Battery French text");
        asserttextValidationAccessibility(Constant_French_Language.Powerpage_houseBattery_expected, Constant_French_Language.Powerpage_houseBattery_text_access_id);
    }

    @Then("I Verify the Inverter French text")
    public void iVerifyTheInverterTextFrenchText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Inverter French text");
        asserttextValidationAccessibility(Constant_French_Language.L2_Inverter, Constant_French_Language.L2_Inverter_access_id);
    }

    @Then("I Verify the Operating Mode French text")
    public void iVerifyTheOperatingModeTextFrenchText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Operating Mode French text");
        asserttextValidationAccessibility(Constant_French_Language.L2_OperatingMode, Constant_French_Language.L2_OperatingMode_access_id);
    }

    @Then("I Verify the House Battery Voltage French text")
    public void iVerifyTheHouseBatteryVoltageTextFrenchText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the House Battery Voltage French text");
        asserttextValidationAccessibility(Constant_French_Language.L2_HouseBatteryVoltage, Constant_French_Language.L2_HouseBatteryVoltage_access_id);
    }

    @Then("I Verify the Load Wattage French text")
    public void iVerifyTheLoadWattageTextFrenchText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Load Wattage French text");
        asserttextValidationAccessibility(Constant_French_Language.L2_LoadWattage, Constant_French_Language.L2_LoadWattage_access_id);
    }

    @Then("I Verify the Chassis Battery Voltage French text")
    public void iVerifyTheChassisBatteryVoltageTextFrenchText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Chassis Battery Voltage French text");
        asserttextValidationAccessibility(Constant_French_Language.L2_ChassisBatteryVoltage, Constant_French_Language.L2_ChassisBatteryVoltage_access_id);
    }

    @Then("I Verify the Generator French text")
    public void iVerifyTheGeneratorTextFrenchText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Generator French text");
        asserttextValidationAccessibility(Constant_French_Language.L2_Generator, Constant_French_Language.L2_Generator_access_id);
    }

    @Then("I Verify the Charger French text")
    public void iVerifyTheChargerTextFrenchText() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Charger French text");
        asserttextValidationAccessibility(Constant_French_Language.L2_Charger, Constant_French_Language.L2_Charger_access_id);
    }

    @Then("I Verify the AGS French Text in power main screen")
    public void iVerifyTheAGSFrenchTextTextInPowerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the AGS French Text in power main screen");
        asserttextValidationAccessibility(Constant_French_Language.L2_AGS, Constant_French_Language.L2_AGS_access_id);
    }

    @Then("I Verify the Predictive data French text in power main screen")
    public void iVerifyThePredictiveDataFrenchTextInPowerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Predictive data French text in power main screen");
        asserttextValidationAccessibility(Constant_French_Language.L2_PredictiveData, Constant_French_Language.L2_PredictiveData_access_id);
    }

    @Then("I Verify control French text in Generator main screen")
    public void iVerifyControlFrenchTextInGeneratorMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify control French text in Generator main screen");
        asserttextValidationAccessibility(Constant_French_Language.L2_Control_Generator, Constant_French_Language.L2_Control_Generator_access_id);
    }

    @Then("I Verify the  status French text in Generator main screen")
    public void iVerifyTheStatusFrenchTextInGeneratorMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the  status French text in Generator main screen");
        asserttextValidationAccessibility(Constant_French_Language.L2_Status_Generator, Constant_French_Language.L2_Status_Generator_access_id);
    }

    @Then("I verify the Run time French text in Generator main screen")
    public void iVerifyTheRunTimeFrenchTextInGeneratorMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Run time French text in Generator main screen");
        asserttextValidationAccessibility(Constant_French_Language.L2_RunTime_Generator, Constant_French_Language.L2_RunTime_Generator_access_id);
    }

    @Then("I verify the charger state French text in  charger main screen")
    public void iVerifyTheChargerStateFrenchTextInChargerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the charger state French text in  charger main screen");
        asserttextValidationAccessibility(Constant_French_Language.L2_Charger_state, Constant_French_Language.L2_Charger_state_access_id);
    }

    @Then("I verify the AC Input Current French text in charger main screen")
    public void iVerifyTheACInputCurrentFrenchTextInChargerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the AC Input Current French text in charger main screen");
        asserttextValidationAccessibility(Constant_French_Language.L2_AC_Input_current, Constant_French_Language.L2_AC_Input_current_access_id);
    }

    @Then("I verify the AC Load Current French text in charger main screen")
    public void iVerifyTheACLoadCurrentFrenchTextInChargerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the AC Load Current French text in charger main screen");
        asserttextValidationAccessibility(Constant_French_Language.L2_AC_Load_current, Constant_French_Language.L2_AC_Load_current_access_id);
    }

    @Then("I verify the charger current French text in charger main screen")
    public void iVerifyTheChargerCurrentFrenchTextInChargerMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the charger current French text in charger main screen");
        asserttextValidationAccessibility(Constant_French_Language.L2_Charger_current, Constant_French_Language.L2_Charger_current_access_id);
    }

    @Then("I verify clear AGS French text in power AGS main screen")
    public void iVerifyClearAGSFrenchTextInPowerAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify clear AGS French text in power AGS main screen");
        asserttextValidationAccessibility(Constant_French_Language.L2_clear_AGS, Constant_French_Language.L2_clear_AGS_access_id);
    }

    @Then("I verify status French text in power AGs main screen")
    public void iVerifyStatusFrenchTextInPowerAGsMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify status French text in power AGs main screen");
        asserttextValidationAccessibility(Constant_French_Language.L2_status_AGS, Constant_French_Language.L2_status_AGS_access_id);
    }

    @Then("I verify the Chargement automatique in the AGS main screen")
    public void iVerifyTheChargementAutomatiqueInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Chargement automatique in the AGS main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_French_Text, Constant_French_Language.AutoChargerText_French_Text_accessid);
    }

    @Then("I verify the D??but de la p??riode d???inactivit?? in the AGS main screen")
    public void iVerifyTheD??butDeLaP??riodeDInactivit??InTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the D??but de la p??riode d???inactivit?? in the AGS main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_QuiteTimeStart_French_Text, Constant_French_Language.AutoChargerText_QuiteTimeStart_French_Text_accessid);
    }

    @Then("I verify the Fin de la p??riode d???inactivit?? in the AGS main screen")
    public void iVerifyTheFinDeLaP??riodeDInactivit??InTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Fin de la p??riode d???inactivit?? in the AGS main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_QuiteTimeEnds_French_Text, Constant_French_Language.AutoChargerText_QuiteTimeEnds_French_Text_accessid);
    }

    @Then("I verify the Tension de d??marrage in the AGS main screen")
    public void iVerifyTheTensionDeD??marrageInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Tension de d??marrage in the AGS main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_StartVoltage_French_Text, Constant_French_Language.AutoChargerText_StartVoltage_French_Text_accessid);
    }

    @Then("I verify the Temps en dessous de in the AGS main screen")
    public void iVerifyTheTempsEnDessousDeInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Temps en dessous de in the AGS main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_Time_Under_French_Text, Constant_French_Language.AutoChargerText_Time_Under_French_Text_accessid);
    }

    @Then("I verify the G??n??rateur d???exercices in the AGS main screen")
    public void iVerifyTheG??n??rateurDExercicesInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the G??n??rateur d???exercices in the AGS main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_GeneratorExerciser_French_Text, Constant_French_Language.AutoChargerText_GeneratorExerciser_French_Text_accessid);
    }

    @Then("I verify the Selected Days in the AGS main screen")
    public void iVerifyTheSelectedDaysInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Selected Days in the AGS main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_SelectedDays_French_Text, Constant_French_Language.AutoChargerText_SelectedDays_French_Text_accessid);
    }

    @Then("I verify the Heure de d??but in the AGS main screen")
    public void iVerifyTheHeureDeD??butInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Heure de d??but in the AGS main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_StartTime_French_Text, Constant_French_Language.AutoChargerText_StartTime_French_Text_accessid);
    }

    @Then("I verify the Dur??e de fonctionnement in the AGS main screen")
    public void iVerifyTheDur??eDeFonctionnementInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Dur??e de fonctionnement in the AGS main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_Runtime_French_Text, Constant_French_Language.AutoChargerText_Runtime_French_Text_accessid);
    }

    @Then("I verify the Climate AGS in the AGS main screen")
    public void iVerifyTheClimateAGSInTheAGSMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Climate AGS in the AGS main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_AGSClimate_French_Text, Constant_French_Language.AutoChargerText_AGSClimate_French_Text_accessid);
    }

    @Then("I Tap on D??but de la p??riode d???inactivit??")
    public void iTapOnD??butDeLaP??riodeDInactivit??() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on D??but de la p??riode d???inactivit??");
        TaponbuttonaccessabilityID(Constant_French_Language.AutoChargerText_QuiteTimeStart_French_Text_accessid);
    }

    @Then("I verify the D??but de la p??riode d???inactivit?? Header text in main screen")
    public void iVerifyTheD??butDeLaP??riodeDInactivit??HeaderTextInMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the D??but de la p??riode d???inactivit?? Header text in main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_QuiteTimeStart_Mainscreen_French_Text, Constant_French_Language.AutoChargerText_QuiteTimeStart_Mainscreen_French_Text_accessid);
    }

    @Then("I Verify the Apply button in the D??but de la p??riode d???inactivit?? main screen")
    public void iVerifyTheApplyButtonInTheD??butDeLaP??riodeDInactivit??MainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Apply button in the D??but de la p??riode d???inactivit?? main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_QuiteTimeStart_Mainscreen_ApplyButton_French_Text, Constant_French_Language.AutoChargerText_QuiteTimeStart_Mainscreen_ApplyButton_French_Text_accessid);
    }

    @Then("I Tap on Fin de la p??riode d???inactivit??")
    public void iTapOnFinDeLaP??riodeDInactivit??() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Fin de la p??riode d???inactivit??");
        TaponbuttonaccessabilityID(Constant_French_Language.AutoChargerText_QuiteTimeEnds_French_Text_accessid);
    }

    @Then("I verify the Fin de la p??riode d???inactivit?? Header text in main screen")
    public void iVerifyTheFinDeLaP??riodeDInactivit??HeaderTextInMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Fin de la p??riode d???inactivit?? Header text in main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_QuiteTimeEnds_Mainscreen_French_Text, Constant_French_Language.AutoChargerText_QuiteTimeEnds_Mainscreen_French_Text_accessid);
    }

    @Then("I Verify the Apply button in the Fin de la p??riode d???inactivit?? main screen")
    public void iVerifyTheApplyButtonInTheFinDeLaP??riodeDInactivit??MainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Apply button in the Fin de la p??riode d???inactivit?? main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_QuiteTimeEnds_Mainscreen_ApplyButton_French_Text, Constant_French_Language.AutoChargerText_QuiteTimeEnds_Mainscreen_ApplyButton_French_Text_accessid);
    }

    @Then("I Tap on Tension de d??marrage")
    public void iTapOnTensionDeD??marrage() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Tension de d??marrage");
        TaponbuttonaccessabilityID(Constant_French_Language.AutoChargerText_StartVoltage_French_Text_accessid);
    }

    @Then("I verify the Tension de d??marrage Header text in main screen")
    public void iVerifyTheTensionDeD??marrageHeaderTextInMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Tension de d??marrage Header text in main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_StartVoltage_Mainscreen_French_Text, Constant_French_Language.AutoChargerText_StartVoltage_Mainscreen_French_Text_accessid);
    }

    @Then("I Verify the Apply button in the Tension de d??marrage main screen")
    public void iVerifyTheApplyButtonInTheTensionDeD??marrageMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Apply button in the Tension de d??marrage main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_startVoltage_Mainscreen_ApplyButton_French_Text, Constant_French_Language.AutoChargerText_startVoltage_Mainscreen_ApplyButton_French_Text_accessid);
    }

    @Then("I Tap on Temps en dessous de")
    public void iTapOnTempsEnDessousDe() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Temps en dessous de");
        TaponbuttonaccessabilityID(Constant_French_Language.AutoChargerText_Time_Under_French_Text_accessid);
    }

    @Then("I verify the Temps en dessous de Header text in main screen")
    public void iVerifyTheTempsEnDessousDeHeaderTextInMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Temps en dessous de Header text in main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_TimeUnder_Mainscreen_French_Text, Constant_French_Language.AutoChargerText_TimeUnder_Mainscreen_French_Text_accessid);
    }

    @Then("I Verify the Apply button in the Temps en dessous de main screen")
    public void iVerifyTheApplyButtonInTheTempsEnDessousDeMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Apply button in the Temps en dessous de main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_TimeUnder_Mainscreen_ApplyButton_French_Text, Constant_French_Language.AutoChargerText_TimeUnder_Mainscreen_ApplyButton_French_Text_accessid);
    }

    @Then("I Tap on Heure de d??but")
    public void iTapOnHeureDeD??but() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Heure de d??but");
        TaponbuttonaccessabilityID(Constant_French_Language.AutoChargerText_StartTime_French_Text_accessid);
    }

    @Then("I verify the Heure de d??but Header text in main screen")
    public void iVerifyTheHeureDeD??butHeaderTextInMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Heure de d??but Header text in main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_StartTime_Mainscreen_French_Text, Constant_French_Language.AutoChargerText_StartTime_Mainscreen_French_Text_accessid);
    }

    @Then("I Verify the Apply button in the Heure de d??but main screen")
    public void iVerifyTheApplyButtonInTheHeureDeD??butMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Apply button in the Heure de d??but main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_StartTime_Mainscreen_ApplyButton_French_Text, Constant_French_Language.AutoChargerText_StartTime_Mainscreen_ApplyButton_French_Text_accessid);
    }

    @Then("I Tap on Dur??e de fonctionnement")
    public void iTapOnDur??eDeFonctionnement() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Dur??e de fonctionnement");
        TaponbuttonaccessabilityID(Constant_French_Language.AutoChargerText_Runtime_French_Text_accessid);
    }

    @Then("I verify the Dur??e de fonctionnement Header text in main screen")
    public void iVerifyTheDur??eDeFonctionnementHeaderTextInMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Dur??e de fonctionnement Header text in main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_Runtime_Mainscreen_French_Text, Constant_French_Language.AutoChargerText_Runtime_Mainscreen_French_Text_accessid);
    }

    @Then("I Verify the Apply button in the Dur??e de fonctionnement main screen")
    public void iVerifyTheApplyButtonInTheDur??eDeFonctionnementMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Apply button in the Dur??e de fonctionnement main screen");
        asserttextValidationAccessibility(Constant_French_Language.AutoChargerText_Runtimee_Mainscreen_ApplyButton_French_Text, Constant_French_Language.AutoChargerText_Runtimee_Mainscreen_ApplyButton_French_Text_accessid);
    }

    @Then("I Tap on M??canique in Landing screen")
    public void iTapOnM??caniqueInLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on M??canique in Landing screen");
        Taponbutton(Constant_French_Language.LandingPage_MechanicalTile_French_Text_xpath);
    }

    @Then("I Tap on R??servoir Fresh Water in Landing screen")
    public void iTapOnR??servoirFreshWaterInLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on R??servoir Fresh Water in Landing screen");
        Basestepdefinition.verticalSwipe(0.7, 0.3, 0.5);
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_Spanish_Language.LandingPage_L2Tank_Fresh_Water_Spanish_text_xpath));
        if (elements.size() == 0) {
            TouchAction action = new TouchAction(driver);
            action.press(PointOption.point(500, 1800)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                    .moveTo(PointOption.point(1000, 1800));
            action.release().perform();
        }
        Taponbutton(Constant_Spanish_Language.LandingPage_L2Tank_Fresh_Water_Spanish_text_xpath);
    }

    @Then("I verify the NIVEAU D???EAU POTABLE in the Fresh tank main screen")
    public void iVerifyTheNIVEAUDEAUPOTABLEInTheFreshTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the NIVEAU D???EAU POTABLE in the Fresh tank main screen");
        asserttextValidation(Constant_French_Language.FreshWater_Tank_FreshWaterLevel_French_text, Constant_French_Language.FreshWater_Tank_FreshWaterLevel_French_text_xpath);
    }

    @Then("I verify the Pompe ?? eau in the Fresh tank main screen")
    public void iVerifyThePompe??EauInTheFreshTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Pompe ?? eau in the Fresh tank main screen");
        asserttextValidationAccessibility(Constant_French_Language.FreshWater_Tank_WaterPump_Frenchtext, Constant_French_Language.FreshWater_Tank_WaterPump_Frenchtext_accessid);
    }

    @Then("I verify the Potable in the Fresh tank main screen")
    public void iVerifyThePotableInTheFreshTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Potable in the Fresh tank main screen");
        asserttextValidation(Constant_French_Language.FreshWater_Tank_Fresh_Frenchtext, Constant_French_Language.FreshWater_Tank_Fresh_Frenchtext_xpath);
    }

    @Then("I verify the Noires in the Fresh tank main screen")
    public void iVerifyTheNoiresInTheFreshTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Noires in the Fresh tank main screen");
        asserttextValidation(Constant_French_Language.FreshWater_Tank_Black_Frenchtext, Constant_French_Language.FreshWater_Tank_Black_Frenchtext_xpath);
    }

    @Then("I verify the Analyse pr??dictive in the Fresh tank main screen")
    public void iVerifyTheAnalysePr??dictiveInTheFreshTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Analyse pr??dictive in the Fresh tank main screen");
        asserttextValidation(Constant_French_Language.FreshWater_Tank_Predictive_Analysis_Frenchtext, Constant_French_Language.FreshWater_Tank_Predictive_Analysis_Frenchtext_xpath);
    }

    @Then("I Tap on R??servoir in Landing screen")
    public void iTapOnR??servoirInLandingScreen() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on R??servoir in Landing screen");
        Taponbutton(Constant_French_Language.LandingPage_TankTile_Black_Water_Text_xpath);
    }

    @Then("I verify the NIVEAU D???EAU POTABLE in the Black tank main screen")
    public void iVerifyTheNIVEAUDEAUPOTABLEInTheBlackTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the NIVEAU D???EAU POTABLE in the Black tank main screen");
        asserttextValidation(Constant_French_Language.BlackWater_Tank_BlackWaterLevel_Frenchtext, Constant_French_Language.BlackWater_Tank_BlackWaterLevel_Frenchtext_xpath);
    }

    @Then("I verify the Pompe ?? eau in the Black tank main screen")
    public void iVerifyThePompe??EauInTheBlackTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Pompe ?? eau in the Black tank main screen");
        asserttextValidationAccessibility(Constant_French_Language.BlackWater_Tank_WaterPump_Frenchtext, Constant_French_Language.BlackWater_Tank_WaterPump_Frenchtext_accessid);
    }

    @Then("I verify the Potable in the Black tank main screen")
    public void iVerifyThePotableInTheBlackTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Potable in the Black tank main screen");
        asserttextValidation(Constant_French_Language.BlackWater_Tank_Fresh_Frenchtext, Constant_French_Language.BlackWater_Tank_Fresh_Frenchtext_xpath);
    }

    @Then("I verify the Noires in the Black tank main screen")
    public void iVerifyTheNoiresInTheBlackTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Noires in the Black tank main screen");
        asserttextValidation(Constant_French_Language.BlackWater_Tank_Black_Frenchtext, Constant_French_Language.BlackWater_Tank_Black_Frenchtext_xpath);
    }

    @Then("I verify the Analyse pr??dictive in the Black tank main screen")
    public void iVerifyTheAnalysePr??dictiveInTheBlackTankMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Analyse pr??dictive in the Black tank main screen");
        asserttextValidation(Constant_French_Language.BlackWater_Tank_Predictive_Analysis_Frenchtext, Constant_French_Language.BlackWater_Tank_Predictive_Analysis_Frenchtext_xpath);
    }

    @Then("I Tap on Chauffe-eau")
    public void iTapOnChauffeEau() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Chauffe-eau");
        Taponbutton(Constant_French_Language.LandingPage_WaterHeater_French_Text_xpath);
    }

    @Then("I Verify the Mode French text in the Water Truma main screen")
    public void iVerifyTheModeFrenchTextInTheWaterTrumaMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the Mode French text in the Water Truma main screen");
        asserttextValidationAccessibility(Constant_French_Language.WaterHeater_Tank_Mode_Spanish_Frenchtext, Constant_French_Language.WaterHeater_Tank_Mode_Spanish_Frenchtext_accessid);
    }

    @Then("I Verify the CHANGER DE MODE French text in the Water Truma main screen")
    public void iVerifyTheCHANGERDEMODEFrenchTextInTheWaterTrumaMainScreen() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Verify the CHANGER DE MODE French text in the Water Truma main screen");
        asserttextValidationAccessibility(Constant_French_Language.WaterHeater_Tank_ChangeMode_French_text, Constant_French_Language.WaterHeater_Tank_ChangeMode_French_text_accessid);
    }

    @Then("I verify the Appliquer in apply button")
    public void iVerifyTheAppliquerInApplyButton() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify the Appliquer in apply button");
        List<AndroidElement> elements = driver.findElements(By.xpath(Constant_French_Language.WaterHeater_Tank_ApplyButton_French_text_xpath));
        if(elements.size()!=0){
            asserttextValidation(Constant_French_Language.WaterHeater_Tank_ApplyButton_French_text, Constant_French_Language.WaterHeater_Tank_ApplyButton_French_text_xpath);
        }
    }

    @Then("I verify Voir les options French text is displayed")
    public void iVerifyVoirLesOptionsFrenchTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Voir les options French text is displayed");
        asserttextValidationAccessibility(Constant_French_Language.viewOption_French_text, Constant_French_Language.viewOption_French_text_access_id);
    }

    @Then("I verify Affichage par vignettes French text is displayed")
    public void iVerifyAffichageParVignettesFrenchTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Affichage par vignettes French text is displayed");
        asserttextValidationAccessibility(Constant_French_Language.tileView_French_text, Constant_French_Language.tileView_French_access_id);
    }

    @Then("I verify Affichage par liste French text is displayed")
    public void iVerifyAffichageParListeFrenchTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Affichage par liste French text is displayed");
        asserttextValidationAccessibility(Constant_French_Language.listView_French_text, Constant_French_Language.listView_French_access_id);
    }

    @Then("I verify Display French text is displayed")
    public void iVerifyDisplayFrenchTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Display French text is displayed");
        asserttextValidationAccessibility(Constant_French_Language.Display_French_text, Constant_French_Language.Display_French_access_id);
    }

    @Then("I verify All Devices French text is displayed")
    public void iVerifyAllDevicesFrenchTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify All Devices French text is displayed");
        asserttextValidationAccessibility(Constant_French_Language.AllDevices_French_text, Constant_French_Language.AllDevices_French_access_id);
    }

    @Then("I verify Connected Devices French text is displayed")
    public void iVerifyConnectedDevicesFrenchTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Connected Devices French text is displayed");
        asserttextValidationAccessibility(Constant_French_Language.ConnectedDevices_French_text, Constant_French_Language.ConnectedDevices_French_tickIcon_access_id);
    }

    @Then("I verify Non Connected Devices French text is displayed")
    public void iVerifyNonConnectedDevicesFrenchTextIsDisplayed() throws Throwable {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I verify Non Connected Devices French text is displayed");
        asserttextValidationAccessibility(Constant_French_Language.NonConnectedDevices_French_text, Constant_French_Language.NonConnectedDevices_French_access_id);
    }

    @Then("I Tap on Affichage par vignettes")
    public void iTapOnAffichageParVignettes() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Affichage par vignettes");
        TaponbuttonaccessabilityID(Constant_French_Language.tileView_French_access_id);
    }

    @Then("I Tap on Affichage par liste")
    public void iTapOnAffichageParListe() throws ClassNotFoundException {
        ScenarioDef.createNode(new GherkinKeyword("Then"), "I Tap on Affichage par liste");
        TaponbuttonaccessabilityID(Constant_French_Language.listView_French_access_id);
    }

    @Then("I Verify BATTERIES header French text")
    public void iVerifyBATTERIESHeaderFrenchText() throws Throwable {
        asserttextValidationAccessibility(Constant_French_Language.BATTERIES_header_text, Constant_French_Language.BATTERIES_header_text_access_id);
    }

    @Then("I verify the Engine{int} French text")
    public void iVerifyTheEngineFrenchText(int arg0) throws Throwable {
        asserttextValidationAccessibility(Constant_French_Language.powerScreen_batteryCarousel_circle_Engine1_text, Constant_French_Language.powerScreen_batteryCarousel_circle_Engine1_text_access_id);
    }

    @Then("I verify the STBD French text")
    public void iVerifyTheSTBDFrenchText() throws Throwable {
        asserttextValidationAccessibility(Constant_French_Language.powerScreen_batteryCarousel_circle_STBD_text, Constant_French_Language.powerScreen_batteryCarousel_circle_STBD_text_access_id);
    }

    @Then("I verify the House French text")
    public void iVerifyTheHouseFrenchText() throws Throwable {
        asserttextValidationAccessibility(Constant_French_Language.powerScreen_batteryCarousel_circle_House_text, Constant_French_Language.powerScreen_batteryCarousel_circle_House_text_access_id);
    }

    @Then("I verify the Measured voltage French text")
    public void iVerifyTheMeasuredVoltageFrenchText() throws Throwable {
        asserttextValidationAccessibility(Constant_French_Language.powerScreen_Measured_Voltage_text, Constant_French_Language.powerScreen_Measured_Voltage_access_id);
    }

    @Then("I verify the Status French text")
    public void iVerifyTheStatusFrenchText() throws Throwable {
        asserttextValidationAccessibility(Constant_French_Language.powerScreen_status_text, Constant_French_Language.powerScreen_status_access_id);
    }

    @Then("I verify the UsageAnalysis French text")
    public void iVerifyTheUsageAnalysisFrenchText() throws Throwable {
        asserttextValidationAccessibility(Constant_French_Language.powerScreen_usage_text, Constant_French_Language.powerScreen_usage_access_id);
    }

    @Then("I verify the Alert French text")
    public void iVerifyTheAlertFrenchText() throws Throwable {
        asserttextValidationAccessibility(Constant_French_Language.powerScreen_alert_text, Constant_French_Language.powerScreen_alert_access_id);
    }

    @Then("I verify the Notify Me French text")
    public void iVerifyTheNotifyMeFrenchText() throws Throwable {
        asserttextValidationAccessibility(Constant_French_Language.powerScreen_notify_text, Constant_French_Language.powerScreen_notify_access_id);
    }

    @Then("I verify the Battery voltage French text")
    public void iVerifyTheBatteryVoltageFrenchText() throws Throwable {
        asserttextValidationAccessibility(Constant_French_Language.powerScreen_batteryVoltage_text, Constant_French_Language.powerScreen_batteryVoltage_access_id);
    }
}
