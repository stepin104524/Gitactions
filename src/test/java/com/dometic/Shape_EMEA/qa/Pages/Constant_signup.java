package com.dometic.Shape_EMEA.qa.Pages;

import com.dometic.MTC.qa.util.Baseclass;

public class Constant_signup extends Baseclass{

    //---------------------------Accessibility id-----------------------//
    public static final String SignUp_titlePage_access_id="com.dometicapp:id/signUp-createAccount";
    public static final String SignUp_email_text_access_id="com.dometicapp:id/signUp-email";
    public static final String SignUp_email_text_field_access_id="com.dometicapp:id/signUp-emailField";
    public static final String SignUp_password_text_access_id="com.dometicapp:id/signUp-password";
    public static final String SignUp_password_textField_access_id="com.dometicapp:id/signUp-securePwdField";
    public static final String SignUp_showPassword_button_access_id="com.dometicapp:id/signUp-viewPassword";
    public static final String SignUp_verifyPassword_text_access_id="com.dometicapp:id/signUp-verify";
    public static final String SignUp_verifyPassword_text_field_access_id="com.dometicapp:id/signUp-verifySecurePwd";
    public static final String Signup_email_value1 = "test12345@gmail.com";
    public static final String Signup_invalid_email_value1="123";
    public static final String Signup_password_value1 = "DoM@12345";
    public static final String Signup_confirmpassword_value1 = "DoM@12345";
    public static final String Signup_invalid_confirm_password="Dom@123";
    public static final String Signup_signupbutton = "com.dometicapp:id/signUp-signUpButton";
    public static final String Signup_term_and_condition_popup="//*[@resource-id='android:id/button1']";
    public static final String Signup_login_link_access_id="com.dometicapp:id/login-signUpText";
    public static final String Signup_blank_verify_password_field="";
    public static final String Signup_invalidSecurePwd_message_access_id = "com.dometicapp:id/signUp-invalidSecurePwd-message";
    public static final String Signup_showVerifyPasswordError_access_id = "com.dometicapp:id/signUp-showVerifyPasswordError";

    //-------------------Needed Accessibility Id-----------------//
    public static final String SignUp_info_button_access_id="";
    public static final String SignUp_checkBox_terms_condition_access_id="";
    public static final String SignUp_terms_condition_link_access_id="com.dometicapp:id/signUp-checkBoxMarketingContainer";
    public static final String SignUp_checkBox_offers_service_access_id="";
    public static final String SignUp_offers_service_text_access_id="";
    public static final String SignUp_offers_services_more_link_access_id="";
    public static final String SignUp_signup_button_access_id="";
    public static final String SignUp_login_link_access_id="com.dometicapp:id/signUp-loginText";

    // -------------------------------xPath--------------------------------------//
    public static final String SignUp_info_button_xpath="//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/signUp-container\"]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.widget.ImageView";
    public static final String SignUp_checkBox_terms_condition_xpath ="//android.view.ViewGroup[@content-desc='com.dometicapp:id/signUp-checkBoxMarketingContainer']/android.view.ViewGroup";
    public static final String SignUp_terms_condition_link_xpath ="//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/signUp-container\"]/android.view.ViewGroup/android.widget.TextView[6]";
    public static final String SignUp_checkBox_offers_service_xpath="//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/signUp-showOffers\"]/android.view.ViewGroup";
    public static final String SignUp_offers_service_text_xpath="//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/signUp-container\"]/android.view.ViewGroup/android.widget.TextView[8]";
    public static final String SignUp_offers_services_more_link_xpath="//android.view.ViewGroup[@content-desc=\"com.dometicapp:id/signUp-container\"]/android.view.ViewGroup/android.widget.TextView[9]";
    public static final String SignUp_signup_button_xpath="//android.view.ViewGroup[@content-desc='com.dometicapp:id/signUp-signUpButton']";
    public static final String SignUp_login_link_xpath="//android.widget.TextView[@content-desc='com.dometicapp:id/signUp-loginText']";
    public static final String Signup_accept_Terms_and_Conditions_xpath="//*[@resource-id='android:id/button1']";
    public static final String Signup_alomost_there_xpath="//android.widget.ImageView[@content-desc='com.dometicapp:id/signUp-closeButton']";
    public static final String Signup_parentPanel_xpath="//*[@resource-id='android:id/parentPanel']";
    public static final String Signup_OK_xpath="//*[@resource-id='android:id/button1']";
    public static final String Signup_invalidemail_message_access_id = "//android.widget.TextView[contains(@text,'The email must be a valid email address.') or @content-desc='com.dometicapp:id/forgot-invalidEmail-message']";


    public static final String Create_your_account_text_xpath_OR_operator = "//android.widget.TextView[contains(@text,'Create your account') or @content-desc=\"com.dometicapp:id/signUp-createAccount\"]";
    public static final String Create_your_account_text = "Create your account";
    public static final String Email_text_xpath_OR_operator = "//android.widget.TextView[contains(@text,'E-mail') or @content-desc=\"com.dometicapp:id/signUp-email\"]";
    public static final String Email_text = "E-mail";
    public static final String Password_text_xpath_OR_operator = "//android.widget.TextView[contains(@text,'Password') or @content-desc=\"com.dometicapp:id/signUp-securePwdLabel\"]";
    public static final String Password_text = "Password";
    public static final String Verify_Password_text_xpath_OR_operator = "//android.widget.TextView[contains(@text,'Verify Password') or @content-desc=\"com.dometicapp:id/signUp-verify\"]";
    public static final String Verify_Password_text = "Verify Password";
    public static final String Verify_password_icon_access_id = "com.dometicapp:id/signUp-tooltip";
    public static final String Agree_To_text_xpath_OR_operator = "//android.widget.TextView[contains(@text,'I agree to') or @content-desc=\"com.dometicapp:id/signUp-dometicMarketingContainer\"]";
    public static final String Agree_To_text = "I agree to";
    public static final String Dometic_Terms_text_xpath_OR_operator = "//android.widget.TextView[contains(@text,'Dometic´s Terms & Conditions.Password') or @content-desc=\"com.dometicapp:id/signUp-goToEula\"]";
    public static final String Dometic_Terms_text = "Dometic´s Terms & Conditions.";
    public static final String Marketing_text_xpath_OR_operator = "//android.widget.TextView[contains(@text,'Yes, I´d like to hear about offers and services...') or @content-desc=\"com.dometicapp:id/signUp-showOffers\"]";
    public static final String Marketing_text = "Yes, I´d like to hear about offers and services...";
    public static final String More_text_xpath_OR_operator = "//android.widget.TextView[contains(@text,'more') or @content-desc=\"com.dometicapp:id/signUp-showText\"]";
    public static final String More_text = "more";
    public static final String Already_have_an_account_text_xpath_OR_operator = "//android.widget.TextView[contains(@text,'Already have an account?') or @content-desc=\"com.dometicapp:id/signUp-haveAccount\"]";
    public static final String Already_have_an_account_text = "Already have an account?";
    public static final String Login_text_xpath_OR_operator = "//android.widget.TextView[contains(@text,'Log In') or @content-desc=\"com.dometicapp:id/signUp-loginText\"]";
    public static final String Login_text = "Log In";
    public static final String Signup_invalidemail_message_email_must_be_a_valid_email_address = "The email must be a valid email address.";

}
