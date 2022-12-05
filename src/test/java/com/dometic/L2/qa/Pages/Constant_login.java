package com.dometic.L2.qa.Pages;

import com.dometic.L2.qa.util.Baseclass;

public class Constant_login extends Baseclass {
        public static final String Login_Allow_popup = "//*[@resource-id='com.android.packageinstaller:id/permission_allow_button']";
        public static final String Login_pagetitle = "com.dometicapp:id/login-welcomeText";
        public static final String Login_Email = "com.dometicapp:id/login-email-textInput";
        public static final String Login_Password = "com.dometicapp:id/login-password-textInput";
        public static final String ValidUser = "purnendu25@yopmail.com";
        public static final String Validpassword = "Dom@1234";
        public static final String new_user_email = "purnendu25@yopmail.com";
        public static final String new_user_password = "Dom@1234";
        public static final String invaliduser1 = "dsasdddfd@gmail.com";
        public static final String loginbutton = "com.dometicapp:id/login-loginButton";
        public static final String ForgotPassword = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[1]/android.widget.TextView";
        public static final String Signup = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView";
        public static final String invalidpassword = "123";
        public static final String Login_welcome_text_expected = "Welcome!";
        public static final String Login_login_text_expected="Log In";
        public static final String Login_email_text_expected="E-mail";
        public static final String Login_password_text_expected="Password";
        public static final String Login_forget_password_text_expected="Forgot password?";
        public static final String Login_Dont_have_an_account_text_expected="Don't have an account?";
        public static final String Login_Sign_Up_text_expected="Sign Up";
        public static final String Login_invalidEmail_message_access_id="com.dometicapp:id/login-invalidEmail-message";
        public static final String Login_invalidEmail_message_expected="The email field is required.";
        public static final String Login_invalidsecurePwd_message_access_id="com.dometicapp:id/login-invalidsecurePwd-message";
        public static final String Login_invalidsecurePwd_message_expected="The password field is required.";
        public static final String Login_invalidsecurePwd_message_The_password_must_be_at_least_5_characters="The password must be at least 8 characters.";
        public static final String email_SpecialCharacter="!@#$%^&*()_+";
        public static final String View_password_access_id = "com.dometicapp:id/login-password-viewPasswordImage";
        public static final String Dont_have_an_account_text = "Don't have an account?";

        //----------------------Accessibility_id--------------------------------------//
        public static final String Login_Allow_popup_access_id="com.android.permissioncontroller:id/permission_allow_button";
        public static final String Login_welcome_text_OR_operator_xpath = "//android.widget.TextView[contains(@text,'Welcome!') or @content-desc='com.dometicapp:id/login-welcomeText']";
        public static final String Login_login_text_OR_operator_xpath= "//android.widget.TextView[contains(@text,'Log In') or @content-desc='com.dometicapp:id/login-loginButtonText']\n";
        public static final String Login_login_text_access_id = "com.dometicapp:id/login-loginText";
        public static final String Login_email_text_OR_operator_xpath = "//android.widget.TextView[contains(@text,'E-mail') or @content-desc=\"com.dometicapp:id/login-email-textLabel\"]";
        public static final String Login_email_field_access_id= "com.dometicapp:id/login-email-textInput";
        public static final String Login_password_text_OR_operator_xpath = "//android.widget.TextView[contains(@text,'Password') or @content-desc=\"com.dometicapp:id/login-password-textLabel\"]";
        public static final String Login_password_field_access_id = "com.dometicapp:id/login-password-textInput";
        public static final String login_signUpText="com.dometicapp:id/login-signUpText";
        public static final String Login_login_button_text_access_id="com.dometicapp:id/login-loginButtonText";
        public static final String Login_login_button_access_id="com.dometicapp:id/login-loginButton";
        public static final String Login_signup_link_OR_operator_xpath="//android.widget.TextView[contains(@text,'Sign Up') or @content-desc='com.dometicapp:id/login-signUpText']";
        public static final String Login_forgot_password_link_OR_operator_xpath ="//android.widget.TextView[contains(@text,'Forgot password?') or @content-desc=\"com.dometicapp:id/login-forgotText\"]";
        public static final String Login_Dont_have_an_account_OR_operator_xpath="//android.widget.TextView[contains(@text,'Don't have an account?') or @content-desc='com.dometicapp:id/login-noAccountText']";
        public static final String Login_Dont_have_an_account_access_id = "com.dometicapp:id/login-noAccountText";

        // --------------------- xPath---------------------//
        public static final String Login_welcome_text_xpath="//*[@content-desc='com.dometicapp:id/login-welcomeText']";
        public static final String Login_Email_Xpath="//android.widget.EditText[@content-desc=\"com.dometicapp:id/login-email-textInput\"]";
        public static final String Login_Password_Xpath="//android.widget.EditText[@content-desc=\"com.dometicapp:id/login-password-textInput\"]";
        public static final String Login_background_image_xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout";
        public static final String Login_forgot_password_link_xpath="//android.widget.TextView[@content-desc='com.dometicapp:id/login-forgotText']";
        public static final String Login_signup_link_xpath="//android.widget.TextView[@content-desc='com.dometicapp:id/login-signUpText']";
        public static String Login_login_button_xpath = "//*[@content-desc='com.dometicapp:id/login-loginButton']";
        public static final String Login_error_text_xpath="//*[@text='Invalid Login']";
}

