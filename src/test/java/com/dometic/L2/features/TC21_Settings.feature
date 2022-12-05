Feature: Verifying application Settings Screen in Dometic USLTV application

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Settings screen UI
    Then I verify hamburger menu in landing screen
    Then I Tap on hamburger menu in landing screen
    Then I verify settings screen back button
    Then I verify user profile photo is displayed
    Then I verify username is displayed
    Then I verify user email is displayed
    Then I verify View Edit Account text is displayed
    Then I verify Home text is displayed
    Then I verify Notification Settings text is displayed
    Then I verify Device Management is displayed
    Then I verify App Settings is displayed
    Then I verify Logout is displayed
    Then I verify Version 1.6 is displayed
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying application Settings screen Functionality
    Then I tap on View Edit option
    Then I tap on account settings back button
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Home in Settings screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I Tap on Back Button in manage notifications
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Device Management
    Then I Tap on back button in Device Management
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App Settings
    Then I Tap on Back Button in App settings page
    Then I Wait short period for Page to Load
#    Then I Tap on Marine Tile.

  @First @sanity @Regression
  Scenario:Verify the Manage Notification main screen UI
    Then I Tap on the Hamburger menu button
    Then I Wait short period for Page to Load
#    Then I tap on the Notification settings
    Then I Tap on Notification Settings
    Then I Wait short period for Page to Load
    Then I verify the Manage notification header
    Then I verify back arrow image in the manage notification screen
    Then I verify the Manage notification logo
    Then I verify the Global settings text
    Then I Verify the Push Notification text
    Then I verify the Push Notifications toggle button
    Then I verify the push show more text
    Then I tap on the push show more navigation icon
    Then I Wait short period for Page to Load
    Then I verify the push show less text
    Then I verify the push alerts text
    Then I verify the push alerts toggle button
    Then I verify the push warnings text
    Then I verify the push warnings toggle button
    Then I tap on the push show less expand icon
    Then I Wait short period for Page to Load
    Then I verify the E-mail text on the page
    Then I verify the E-mail toggle button
    Then I tap on the Email toggle button
    Then I Wait short period for Page to Load
#    Then I verify the Email list Toggle button status
    Then I verify the Email show more text
    Then I verify the Email show more navigation icon
    Then I tap on the Email show more navigation icon
    Then I Wait short period for Page to Load
    Then I verify the Email show less text
    Then I verify the Email list text
    Then I verify the Email list Email text
    Then I verify the Email list Email toggle button
    Then I verify the Email Edit list text
    Then I tap on the Email edit list expand icon
    Then I Wait short period for Page to Load
    Then I verify the Email list title text
    Then I verify the Email list cancel button
    Then I verify the Email list Email Account text
    Then I verify the Email list Additional Emails text
    Then I verify the Email list Add new + symbol image
    Then I verify the Email list save text
    Then I Tap on the Email list close button
    Then I Wait short period for Page to Load
    Then I verify the Email list Alerts text
    Then I verify the Email list Alerts toggle button
    Then I verify the Email list warnings text
    Then I verify the Email list warnings toggle button
    Then I Scroll up the page
    Then I tap on the Email show less expand
    Then I Wait short period for Page to Load
    Then I verify SMS text in the page
    Then I verify the SMS toggle button
    Then I tap on the SMS toggle button
    Then I Wait short period for Page to Load
    Then I verify the SMS show more text
    Then I tap on the SMS show more expand icon
    Then I Wait short period for Page to Load
    Then I verify the SMS show less text
    Then I verify the SMS lIST text
    Then I scroll up the screen
    Then I verify the SMS Edit list text
    Then I Wait short period for Page to Load
    Then I tap on the SMS Edit list naviagtion icon
    Then I Wait short period for Page to Load
    Then I verify the SMS LIST title text
    Then I verify the SMS LIST cancel button
    Then I verify the SMS LIST Mobile Account text
    Then I verify the SMS LIST Additional SMS text
    Then I Tap on the Add New button
    Then I verify the SMS lIST Mobile number text
    Then I verify the SMS LIST Label text
    Then I verify the SMS LIST Add symbol icon
    Then I verify the SMS LIST save text
    Then I tap on the SMS LIST cancel arrow button
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I verify the SMS LIST Alerts text
    Then I verify the SMS LIST Alerts toggle button
    Then I verify the SMS LIST Warnings text
    Then I Verify the SMS LIST Warnings toggle button
    Then I tap on the SMS Show less navigation icon
    Then I Wait short period for Page to Load
    Then I verify Advanced title text
    Then I Wait short period for Page to Load
    Then I Scroll down the page
    Then I tap on the Back button in manage notification screen
    Then I Wait short period for Page to Load

  @First @sanity @Regression
  Scenario:Verify the Manage Notification Push Notification Functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I check the push notification toggle status
    Then I verify the push notification toggle
    Then I turn off the push notification toggle
    Then I turn on the push notification toggle
    Then I Tap on Show more or Show less text in Push Notification
    Then I turn off the push notification-alerts toggle
    Then I turn on the push notification-alerts toggle
    Then I turn off the push notification-warnings toggle
    Then I turn on the push notification-warnings toggle
    Then I Tap on Back Button in manage notifications

  @sanity @Regression
  Scenario:Verify the Manage Notification Push Notification-Email Functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I check the push notification-email toggle status
    Then I verify the push notification-email toggle
    Then I turn off the push notification-email toggle
    Then I turn on the push notification-email toggle
    Then I Tap on show more or show less text in email field
    Then I Scroll up the page
    Then I turn off the push notification-email-alerts toggle
    Then I turn on the push notification-email-alerts toggle
    Then I turn off the push notification-email-warnings toggle
    Then I turn on the push notification-email-warnings toggle
    Then I Tap on Back Button in manage notifications

  @sanity @Regression
  Scenario:Verify the Manage Notification Push Notification-Email Edit List Empty String Functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I check the push notification-email toggle status
    Then I Tap on show more or show less text in email field
    Then I Tap on edit list in email field
    Then I Tap on the add new button in email field
    Then I Enter empty string into email field
    Then I Enter empty string into label field
    Then I verify The email 0 field is required string is displayed
    Then I verify The Label 0 field is required string is displayed
    Then I close the Email List
    Then I Tap on Back Button in manage notifications

  @sanity @Regression
  Scenario:Verify the Manage Notification Push Notification-Email Edit List Emoji's Functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I check the push notification-email toggle status
    Then I Tap on show more or show less text in email field
    Then I Tap on edit list in email field
    Then I Tap on the add new button in email field
    Then I Enter Emoji's as string into email field
    Then I Enter Emoji's as string into label field
    Then I verify The email 0 field is required string is displayed
    Then I close the Email List
    Then I Tap on Back Button in manage notifications

  @sanity @Regression
  Scenario:Verify the Manage Notification Push Notification-Email Edit List Special character Functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I check the push notification-email toggle status
    Then I Tap on show more or show less text in email field
    Then I Tap on edit list in email field
    Then I Tap on the add new button in email field
    Then I Enter Special character as string into email field
    Then I Enter Special character as string into label field
    Then I verify The email 0 field is required string is displayed
    Then I close the Email List
    Then I Tap on Back Button in manage notifications

  @sanity @Regression
  Scenario:Verify the Manage Notification Push Notification-Email Edit List valid character Functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I check the push notification-email toggle status
    Then I Tap on show more or show less text in email field
    Then I Tap on edit list in email field
    Then I Tap on the add new button in email field
    Then I Enter valid character as string into email field
    Then I Enter valid character as string into label field
    Then I Save the Details
    Then I Wait for Page to Load
    Then I validate the email field and label displayed in manage notification screen
    Then I Tap on Back Button in manage notifications

  @sanity @Regression
  Scenario:Verify the Manage Notification Push Notification-Email Edit List Delete Functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I check the push notification-email toggle status
    Then I Tap on show more or show less text in email field
    Then I Tap on edit list in email field
    Then I Tap on delete latest created details
    Then I Save the Details
    Then I Wait for Page to Load
    Then I Tap on Back Button in manage notifications

  @sanity @Regression
  Scenario:Verify the Manage Notification Push Notification-SMS Functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I check the push notification-sms toggle status
    Then I verify the push notification-SMS toggle
    Then I turn off the push notification-SMS toggle
    Then I turn on the push notification-SMS toggle
    Then I Tap on show more or show less text in SMS field
    Then I Scroll up the page
    Then I turn off the push notification-SMS-alerts toggle
    Then I turn on the push notification-SMS-alerts toggle
    Then I turn off the push notification-SMS-warnings toggle
    Then I turn on the push notification-SMS-warnings toggle
    Then I Tap on Back Button in manage notifications

  @sanity @Regression
  Scenario:Verify the Manage Notification Push Notification-SMS Edit List Empty String Functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I check the push notification-sms toggle status
    Then I Tap on show more or show less text in SMS field
    Then I Scroll up the page
    Then I Tap on edit list in SMS field
    Then I Tap on the add new button in email field
    Then I Enter empty string into email field
    Then I Enter empty string into label field
    Then I verify The email 0 field is required string is displayed
    Then I verify The Label 0 field is required string is displayed
    Then I close the Email List
    Then I Tap on Back Button in manage notifications

  @sanity @Regression
  Scenario:Verify the Manage Notification Push Notification-SMS Edit List Special character Functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I check the push notification-sms toggle status
    Then I Tap on show more or show less text in SMS field
    Then I Scroll up the page
    Then I Tap on edit list in SMS field
    Then I Tap on the add new button in email field
    Then I Enter Special character as string into email field
    Then I Enter Special character as string into label field
    Then I verify The email 0 field is required string is displayed
    Then I close the Email List
    Then I Tap on Back Button in manage notifications

  @sanity @Regression
  Scenario:Verify the Manage Notification Push Notification-SMS Edit List valid character Functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I check the push notification-sms toggle status
    Then I Tap on show more or show less text in SMS field
    Then I Scroll up the page
    Then I Tap on edit list in SMS field
    Then I Tap on the add new button in email field
    Then I Enter valid character as string into sms field
    Then I Enter valid character as string into sms label field
    Then I Save the Details
    Then I Wait for Page to Load
    Then I validate the sms field and label displayed in manage notification screen
    Then I Tap on Back Button in manage notifications

  @sanity @Regression
  Scenario:Verify the Manage Notification Push Notification-SMS Edit List Delete character Functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I check the push notification-sms toggle status
    Then I Tap on show more or show less text in SMS field
    Then I Scroll up the page
    Then I Tap on edit list in SMS field
    Then I Tap on delete latest created details
    Then I Save the Details
    Then I Wait for Page to Load
    Then I Tap on Back Button in manage notifications

  @sanity1 @Regression1
  Scenario: Verify the Account Settings UI
    Then I Tap on hamburger menu in landing screen
    Then I Tap on view Edit Account option
    Then I verify the Header of the account settings
    Then I verify the profile photo of the account settings
    Then I Verify the UserName of account settings
    Then I Verify the UserEmail of account settings
    Then I Verify the Setting text of account setting
    Then I Verify the profile text of account setting
    Then I verify the profile card icn of account setting
    Then I verify the subscription text of account settings
    Then I verify the subscription card icn of account setting
    Then I Wait short period for Page to Load
    Then I tap on back button in Account Settings screen

  @sanity1 @Regression1
  Scenario: Verify the application Profile Page UI
    Then I Tap on the Hamburger menu button
    Then I Wait short period for Page to Load
    Then I Tap on view Edit Account option
    Then I Wait short period for Page to Load
    Then I Tap on the Profile card icon
    Then I Wait short period for Page to Load
    Then I Verify the Header of the profile page
    Then I verify the back button in profile
    Then I verify the profile photo
    Then I verify the personal information text in profile page
    Then I verify the name text in profile page
#    Then I verify the name value in profile page
    Then I verify the email text in profile page
#    Then I verify the email value in profile page
    Then I verify the mobile text in profile page
#    Then I verify the mobile value in profile page
    Then I verify the Address text in profile page
#    Then I verify the Address value text in profile page
    Then I verify the Edit profile text in profile page
    Then I scroll up the screen
    Then I verify the Security text in profile page
    Then I verify the Password text in profile page
    Then I verify the Renew text in profile page
    Then I verify the Renew Card icon
    Then I scroll down the screen
    Then I tap on the back button in profile page
    Then I Wait short period for Page to Load
    Then I tap on back button in Account Settings screen

  @sanity1 @Regression1
  Scenario: Verify the application Subscription Page UI
    Then I Tap on the Hamburger menu button
    Then I Wait short period for Page to Load
    Then I Tap on view Edit Account option
    Then I Wait short period for Page to Load
    Then I Tap on the Subscription navigation icon
    Then I verify the header of the subscription page
    Then I verify the back button in subscriptions
#    Then I Tap on Back Button
    Then  I tap on the Back Button in the subscriptions page
    Then I Wait short period for Page to Load
    Then I tap on back button in Account Settings screen

  @First1 @sanity1 @Regression1
  Scenario: Verify the Edit profile page UI
    Then I Tap on the Hamburger menu button
    Then I Wait short period for Page to Load
    Then I Tap on view Edit Account option
    Then I Wait short period for Page to Load
    Then I Tap on the Profile card icon
    Then I Wait short period for Page to Load
    Then I tap on Edit profile in profile screen
    Then I Wait for Page to Load
    Then I Verify Edit profile header text
    Then I verify the Edit profile Cancel button
    Then I Verify user profile photo in edit profile screen
    Then I Verify Firstname label is displayed
    Then I Verify Lastname label is displayed
    Then I Verify Primary Mobile label is displayed
    Then I Verify Address label is displayed in Edit profile screen
    Then I Verify Save Button is displayed
    Then I Verify the Close Button is Edit profile Page
    Then I tap on close button in Edit profile screen
    Then I Wait short period for Page to Load
    Then I tap on the back button in profile page
    Then I Wait short period for Page to Load
    Then I tap on back button in Account Settings screen

  @Regression1
  Scenario: Verifying application Settings screen Edit profile screen(Checking text field allowing Empty text) Functionality
    Then I Wait short period for Page to Load
    Then I Enter an empty in First name Field in Edit profile screen
    Then I Enter an empty in Last name Field in Edit profile screen
    Then I Enter an empty in Primary Field Mobile in Edit profile screen
    Then I Enter an empty in Address field in Edit profile screen
    Then I Wait short period for Page to Load
    Then I tap on Save button
    Then I Wait short period for Page to Load
    Then I tap on Ok button

  @Regression1
  Scenario: Verifying application Settings screen Edit profile screen(Checking text field allowing Emoji's) Functionality
    Then I Enter an Emoji's in First name Field in Edit profile screen
    Then I Enter an Emoji's in Last name Field in Edit profile screen
    Then I Enter an Primary Mobile in Edit profile screen
    Then I Enter an Emoji's in Address field in Edit profile screen
    Then I Wait short period for Page to Load
    Then I tap on Save button
    Then I Wait short period for Page to Load
    Then I tap on Ok button

  @Regression1
  Scenario: Verifying application Settings screen Edit profile screen(Checking text field allowing Special Characters) Functionality
    Then I Enter an Special character in First name Field in Edit profile screen
    Then I Enter an Special character in Last name Field in Edit profile screen
    Then I Enter an Primary Mobile in Edit profile screen
    Then I Enter an Special character in Address field in Edit profile screen
    Then I Wait short period for Page to Load
    Then I tap on Save button
    Then I Wait short period for Page to Load
    Then I Tap on Ok button

  @Regression1
  Scenario: Verifying application Settings screen Edit profile screen Functionality
    Then I Enter an First name in Edit profile screen
    Then I Enter an Last name in Edit profile screen
    Then I Enter an Primary Mobile in Edit profile screen
    Then I Enter an Address in Edit profile screen
    Then I Wait short period for Page to Load
    Then I tap on Save button
    Then I Wait short period for Page to Load
    Then I tap on Ok button
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @sanity1 @Regression1
  Scenario: Verifying Device Management and Edit vessel UI
    Then I Tap on hamburger menu in landing screen
    Then I click on Device Management
    Then I tap on the onboarded device
    Then I verify Device management title
    Then I verify Device management back button
    Then I verify Device management image
    Then I verify if device name is displayed
    Then I verify vessel information
    Then I verify Name text
    Then I verify if the device name is displayed
    Then I verify Edit vessel text
    Then I verify Edit vessel navigation button
    Then I tap on Edit vessel
    Then I Wait short period for Page to Load
    Then I verify Edit vessel header
    Then I verify Edit vessel close button
    Then I verify Edit vessel image is displayed
    Then I verify Edit vessel name text
    Then I verify if vessel name is displayed
    Then I verify Edit vessel Mac address text
    Then I verify if Edit vessel Mac address is displayed
    Then I verify if Save button is displayed
    Then I verify Save text
    Then I tap on close button in Edit vessel screen
    Then I verify Advanced text
    Then I verify Check Updates text
    Then I verify check updates navigation button
    Then I tap on check updates
    Then I Wait short period for Page to Load
    Then I verify the Check updates header text
    Then I verify check updates back button
    Then I verify refresh button in check updates page
    Then I tap on back button from the check updates screen
    Then I Wait short period for Page to Load
    Then I verify Unregister Delete Offboard text
    Then I verify Unregister Delete Offboard navigation button
    Then I Wait for Page to Load
    Then I Tap on Device Management back buton
    Then I Wait short period for Page to Load
    Then I tap on back button on onboardedd device page
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying Device Management Edit device - Blank Vessel name field
    Then I Tap on hamburger menu in landing screen
    Then I click on Device Management
    Then I tap on the onboarded device
    Then I tap on Edit vessel
    Then I verify Edit vessel header
    Then I tap on Edit vessel Name
    Then I clear the texts in the vessel name field
    Then I click on Edit vessel image
    Then I click on Save button
    Then I verify Vessel name should not be empty error message is displayed
    Then I tap on close button in Edit vessel screen
    Then I Tap on Device Management back buton
    Then I Wait short period for Page to Load
    Then I tap on back button on onboardedd device page
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying Device Management Edit device - Vessel name with more characters
    Then I Tap on hamburger menu in landing screen
    Then I click on Device Management
    Then I tap on the onboarded device
    Then I tap on Edit vessel
    Then I verify Edit vessel header
    Then I tap on Edit vessel Name
    Then I change Edit vessel name
    Then I click on Edit vessel image
    Then I click on Save button
    Then I Wait for Page to Load
    Then I verify the given new device name under the image
    Then I verify the given new device name in the Name field
    Then I Tap on Device Management back buton
    Then I Wait short period for Page to Load
    Then I Wait for Page to Load
    Then I verify edited device name in device list page
    Then I tap on back button on onboardedd device page
    Then I Wait short period for Page to Load
    Then I verify edited device name in Home page
    Then I Wait short period for Page to Load


  @Regression1
  Scenario: Verifying Device Management Edit device - Vessel name with invalid characters
    Then I Tap on hamburger menu in landing screen
    Then I click on Device Management
    Then I Wait short period for Page to Load
    Then I tap on the onboarded device
    Then I tap on Edit vessel
    Then I verify Edit vessel header
    Then I tap on Edit vessel Name
    Then I enter an invalid vessel name
    Then I click on Edit vessel image
    Then I click on Save button
    Then I Wait for Page to Load
    Then I verify Vessel name cannot include special characters error message is displayed
    Then I tap on close button in Edit vessel screen
    Then I Wait short period for Page to Load
    Then I Tap on Device Management back buton
    Then I Wait short period for Page to Load
    Then I tap on back button on onboardedd device page
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying Device Management Edit device - vessel name with emojis
    Then I Tap on hamburger menu in landing screen
    Then I click on Device Management
    Then I Wait short period for Page to Load
    Then I tap on the onboarded device
    Then I tap on Edit vessel
    Then I verify Edit vessel header
    Then I tap on Edit vessel Name
    Then I enter a vessel name with emojis
    Then I click on Edit vessel image
    Then I click on Save button
    Then I verify Vessel name cannot include special characters error message is displayed
    Then I tap on close button in Edit vessel screen
    Then I Tap on Device Management back buton
    Then I Wait short period for Page to Load
    Then I tap on back button on onboardedd device page
    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying Device Management Edit device - valid vessel name
    Then I Tap on hamburger menu in landing screen
    Then I click on Device Management
    Then I Wait short period for Page to Load
    Then I tap on the onboarded device
    Then I tap on Edit vessel
    Then I verify Edit vessel header
    Then I tap on Edit vessel Name
    Then I enter a valid vessel name
    Then I click on Edit vessel image
    Then I click on Save button
    Then I Wait for Page to Load
    #Then I verify the given new device name under the image
    Then I verify the given new device name in the Name field
    Then I Tap on Device Management back buton
    Then I Wait for Page to Load
    Then I verify edited device name in device list page
    Then I Wait for Page to Load
    Then I tap on back button on onboardedd device page
    Then I Wait for Page to Load
    Then I verify edited device name in Home page
    Then I Wait short period for Page to Load
    Then I Tap on back button in Device Management screen

  @First1 @sanity1 @Regression1
  Scenario: Verify app setting UI implementation
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App Settings
    Then I Wait short period for Page to Load
    Then I verify the App setting header text
    Then I verify App setting back button
    Then I verify the language text on the app setting page
    Then I verify Language navigation button is displayed
    Then I verify the Temperature text on the setting page
    Then I verify the celcius temperature unit
    Then I verify the fahrenheit temperature unit
    Then I verify the app version name card title

  @sanity1 @Regression1
  Scenario: Verify app setting UI implementation for language
    Then I tap on the language collapse button
    Then I verify the language page header text
    Then I Wait short period for Page to Load
    Then I verify the english language text
    #Then I verify the spanish language text
    #Then I verify the french language text
    Then I verify the german language text
    Then I tap on the back button icon on language page
    Then I tap on the back button icon on app setting page

  @First1 @sanity1 @Regression1
  Scenario: Verifying Language Functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App Settings
    Then I verify the App setting header text
    Then I tap on the language collapse button
    Then I Wait short period for Page to Load
    Then I tap on German language in language
    Then I Wait short period for Page to Load
    Then I verify German language in the selected language
    Then I Wait short period for Page to Load
    Then I tap on the language collapse button
    Then I Wait short period for Page to Load
    Then I tap on English language option in language page
    Then I Wait short period for Page to Load
    Then I verify English language in selected language
    Then I Wait short period for Page to Load
    Then I tap on the back button icon on app setting page

  @First1 @sanity1 @Regression1
  Scenario: Verify Temperature Functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App Settings
    Then I verify the App setting header text
    Then I verify the celcius temperature unit
    Then I verify the fahrenheit temperature unit
    Then I update Temperature Unit in Settings to fahrenheit
    Then I tap on the back button icon on app setting page
    Then I tap on AMTH tile
#    Then I Tap on Marine Tile.
    #Then I Scroll down the page
    Then I Wait for Page to Load
    #Then I Tap on Climate in Landing screen
    Then I validate updated value displayed in the climate tile
#    Then I Tap on Back Button
#    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App Settings
    Then I update the Temperature Unit in Settings to Celcius
    Then I tap on the back button icon on app setting page
#    Then I Tap on Climate in Landing screen
    Then I validated updated value displayed in the climate tile
#    Then I Tap on Back Button


  @First1 @sanity1 @Regression1
  Scenario: Verifying application Settings screen functionality
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Logout in Settings screen.
#    Then I Verify SETTINGS Text displayed in the top of the app

  @sanity1
  Scenario: Verify Zone Management UI validation
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I verify Zone Management text is displayed
    Then I Tap on Zone Management in Settings
    Then I Wait short period for Page to Load
    Then I Verify ALL ZONES in Zone Management
    Then I verify Edit text in Zone Management
    Then I verify Limited to 4 Zones only text in Zone Management
    Then I verify Add ZoneIcon in Zone Management

  @sanity1
  Scenario: Verify Zone Management Functionality with Empty Zone name
    Then I Wait short period for Page to Load
    Then I Tap on Edit in ALL ZONES
    Then I Wait short period for Page to Load
    Then I Tap on Rename in ALL ZONES
    Then I Tap on the Zone name
    Then I clear the previous zone name
    Then I save the Zone
    Then I verify Zone Name can not be empty message is displayed

  @sanity1
  Scenario: Verify Zone Management Functionality with more then 10 character
    Then I Wait short period for Page to Load
    Then I Enter the zone name more then the limit
    Then I verify "10/10" character message is displayed

  @sanity1
  Scenario: Verify Zone Management Functionality with Zone name
    Then I Wait short period for Page to Load
    Then I Tap on the Zone name
    Then I clear the previous zone name
    Then I Enter the Zone name
    Then I Tap on Save

  @sanity1
  Scenario: Verify Zone Management Delete Zone Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Edit in ALL ZONES
    Then I Wait short period for Page to Load
    Then I Tap on the Delete Zone Icon
    Then I Wait short period for Page to Load
    Then I Tap on YES, DELETE IT Button

  @sanity1
  Scenario: Verify Zone Management Add Zone Functionality
    Then I Wait short period for Page to Load
    Then I Tap on the Add Zone Icon
    Then I Select the zone
    Then I Enter the New Zone name
    Then I SAVE the Zone
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario: Verify Spanish Language Functionality
    Then I Wait short period for Page to Load
    Then I verify Languages text is displayed
    Then I navigate to update language section in Settings
    Then I update language to Spanish in settings
    And I verify on Language text updated with Spanish translation
    And I verify on Temperature text updated with Spanish translation
    And I verify on logout text updated with Spanish translation
#    Then I Tap on Back Button
    Then I Wait short period for Page to Load
#    Then I Tap on hamburger menu in landing screen

  @sanity1
  Scenario: Verify French Language Functionality
    Then I verify Languages text is displayed
    Then I navigate to update language section in Settings
    Then I update language to French in settings
    And I verify on Language text updated with French translation
    And I verify on Temperature text updated with French translation
    And I verify on logout text updated with French translation
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen

  @sanity1
  Scenario: Verify Temperature Functionality
    Then I Verify Temperature unit text is displayed
    Then I update Temperature Unit in Settings
    Then I Tap on Back button from Settings
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen

  @sanity1
  Scenario: Verify Version Functionality
    Then I verify Version is displayed

  @sanity1
  Scenario: Verify application Logout Functionality
    Then I verify Log out is displayed
#    Then I navigate to update language section in Settings
#    Then I update language to Spanish in settings
    Then I Wait short period for Page to Load
    Then I Tap on Logout in Settings

  @sanity
  Scenario:Verify advanced screen UI
    Then I Tap on hamburger menu in landing screen
    Then I Wait for Page to Load
    Then I Tap on Notification Settings
    Then I Wait for Page to Load
    Then I tap on AMTH in manage notifications
    Then I Wait for Page to Load
    Then I verify Advanced text in AMTH
    Then I verify the AMTH text for advanced
    Then I verify Push notification text for advanced
    Then I verify E-mail text in advanced
#    Then I verify SMS text in advanced
    Then I verify Batteries text
    Then I tap on batteries show more navigation button
    Then I verify batteries Push notification text
    Then I scroll up the screen
    Then I verify tanks text in advanced
    Then I tap on tanks show more navigation button in advanced
    Then I scroll up the screen
    Then I verify tanks push notification text
    Then I scroll up the screen
    Then I verify Temperature text in AMTH advanced
    Then I tap on Temperature show more navigation button
    Then I scroll up the screen
    Then I verify temperature push notification text
    Then I Wait for Page to Load
    Then I Tap on the back button on the advance screen
    Then I Wait for Page to Load
    Then I Tap on Back Button in manage notifications








