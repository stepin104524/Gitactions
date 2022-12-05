Feature: Verifying application Setting Screen in Dometic SDB application

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
    Then I Tap on Home in Settings screen
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen
    Then I tap on View edit account text
    Then I Wait short period for Page to Load
    Then I tap on back button in account settings
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I Wait short period for Page to Load
    Then I Tap on Back Button in Manage notifications page
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Device Management
    Then I Wait short period for Page to Load
    Then I Tap on back button in Device Mangement screen
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on App Settings
    Then I Wait short period for Page to Load
    Then I Tap on Back Button in app settings
    Then I Wait short period for Page to Load
#    Then I Tap on Marine Tile

  @sanity1 @Regression1
  Scenario: Verifying application App Settings UI
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App Settings
    Then I Wait short period for Page to Load
    Then I verify App Settings title text
    Then I verify back button in App settings
    Then I verify Language text
    Then I verify language navigation icon
    Then I verify selected language
    Then I tap on language
    Then I Wait short period for Page to Load
    Then I verify language header
    Then I verify language back button
    Then I verify English text
    Then I verify German text
    Then I tap on language back button
    Then I verify temperature text
    Then I verify celsius unit
    Then I verify Fahrenheit unit
    Then I verify App version
    Then I verify version number
    Then I Tap on Back Button in app settings

  @sanity1 @Regression1
  Scenario: Verifying application App Settings language and temperature functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App Settings
    Then I Wait short period for Page to Load
    Then I verify App Settings title text
    Then I tap on language
    Then I Wait short period for Page to Load
    Then I verify language header
    Then I tap on German language
    Then I Wait short period for Page to Load
    Then I verify if German language is selected
    Then I tap on language
    Then I Wait short period for Page to Load
    Then I tap on English language in language
    Then I Wait short period for Page to Load
    Then I verify if English language is selected
    Then I Wait short period for Page to Load
    Then I tap on Fahrenheit
    Then I Wait short period for Page to Load
    Then I tap on Celsius
    Then I Wait short period for Page to Load
    Then I Tap on Back Button in app settings

  @sanity1 @Regression1
  Scenario: Verifying UI for Device Management screen
    Then I Tap on hamburger menu in landing screen
    Then I Wait for Page to Load
    Then I Tap on Device Management
    Then I Wait for Page to Load
    Then I Tap on SDB
    Then I Wait for Page to Load
    Then I verify the Device Management Header
    Then I verify back button in Device Management screen
    Then I verify Device management image is displayed
    Then I verify device name
    Then I verify Product information text
    Then I verify Name
    Then I verify given device name text
    Then I verify Edit text
    Then I verify the edit navigation button
    Then I verify PIN CODES text
    Then I verify Master pin text
    Then I verify Master Pin navigation button is displayed
    Then I verify Guest PIN list text
    Then I verify Guest PIN list navigation button is displayed
    Then I verify the Advanced text
    Then I verify Temperature settings text
    Then I verify Temperature settings navigation button is displayed
    Then I verify Check updates text
    Then I verify Check updates navigation button is displayed
    Then I Scroll up the page
    Then I verify Unregister,Delete,Off board text
    Then I verify Unregister,Delete,Off board navigation button
    Then I Wait for Page to Load
    Then I tap on back button on device management main screen
    Then I Wait for Page to Load
    Then I tap on back button on device management device selection page


  @sanity1 @Regression1
  Scenario: Verifying the device management Edit name UI
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Device Management
    Then I Tap on SDB
    Then I tap on vessel edit card button
    Then I verify the edit header text in the edit vessel page
    Then I verify the vessel image
    Then I verify the vessel name card title
    Then I verify the save button text
    Then I Tap on close button in edit screen
    Then I tap on back button on device management main screen
    Then I Wait short period for Page to Load
    Then I tap on back button on device management device selection page


  @Regression11
  Scenario: Verify device management Edit name functionality-invalid name(Special characters)
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Device Management
    Then I Wait short period for Page to Load
    Then I Tap on SDB
    Then I Wait short period for Page to Load
    Then I tap on vessel edit card button
    Then I Wait short period for Page to Load
    Then I enter an invalid name in edit name field
    Then I Wait short period for Page to Load
    Then I Tap on save button in edit screen
    Then I Wait for Page to Load
    Then I verify vessel name cannot include special characters error message is displayed


  @Regression1
  Scenario: Verify device management edit name functionality-blank name
    Then I leave the edit name field blank
    Then I Tap on save button in edit screen
    Then I Wait for Page to Load
    Then I Verify Vessel name should not be empty text is displayed

  @Regression1
  Scenario: Verify device management edit name functionality-valid name
    Then I enter a valid name in edit name field
    Then I Tap on save button in edit screen
    Then I Wait short period for Page to Load
    Then I verify if the edited valid name is displayed under name field
    Then I tap on back button on device management main screen
    Then I Wait short period for Page to Load
    Then I verify if the edited valid name is displayed under device management device selection page
    Then I tap on back button on device management device selection page
    Then I Wait short period for Page to Load
    Then I verify if the edited name is displayed in the home page tile
    Then I Wait for Page to Load
    Then I tap on back button on device management device selection page
    Then I Wait for Page to Load

  @First1 @sanity1 @Regression1
  Scenario: Verifying application Device Management Set Master Pin UI
    Then I Tap on hamburger menu in landing screen
    Then I Wait for Page to Load
    Then I Tap on Device Management
    Then I Wait for Page to Load
    Then I Tap on SDB
    Then I Wait for Page to Load
    Then I Tap on the Master PIN option
    Then I Verified the Master PIN Password popup
    Then I enter the correct password
    Then I Tap on the alert popup Enter button
    Then I tap on Alert Ok button
    Then I tap on Alert Ok button
#    Then I verify the Master PIn Header
#    Then I Verify the Set Master Pin text
#    Then I Verify the text "Pin Must be 4 digit"
#    Then I have tap on the close button in master Pin Main screen
#    Then I Wait short period for Page to Load
    Then I tap on back button on device management main screen
    Then I tap on back button on device management device selection page

  @Regression1
  Scenario: Master Pin Password blank field
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Device Management
    Then I Tap on SDB
    Then I Tap on the Master PIN option
    Then I Tap on the alert popup Enter button
    Then I tap on Alert Ok button
    Then I tap on Alert Ok button

  @Regression1
  Scenario: Master Pin Password with Wrong password
    Then I Tap on the Master PIN option
    Then I enter the wrong password in the Password field
    Then I Tap on the alert popup Enter button
    Then I tap on Alert Ok button
    Then I tap on Alert Ok button

  @Regression1
  Scenario: Master Pin Password with Correct password
    Then I Tap on the Master PIN option
    Then I enter the correct password
    Then I Tap on the alert popup Enter button
    Then I tap on Alert Ok button
    Then I tap on Alert Ok button

  @Regression1
  Scenario: Set Master PIN functionality
#    Then I Tap on the set master pin Input Field
#    Then I Enter the PIN less then 4 Digit
#    Then I Hide the Device Keypad
#    Then I Wait for Page to Load
#    Then I Enter the PIN as 4 Digit
#    Then I Verify the Text Message for Re-Enter PIN
#    Then I Re-Enter the PIN as 4 Digit
#    Then I Wait short period for Page to Load

  @First1 @sanity1 @Regression1
  Scenario: Verifying the guest pin list UI
#    Then I tap on Alert Ok button
#    Then I Tap on hamburger menu in landing screen
#    Then I Tap on Device Management
#    Then I Tap on SDB
    Then I tap on guest pin list right icon button
    Then I verify the back button for guest pin list page
    Then I verify the guest pin header text
    Then I verify the edit header text
    Then I tap on the edit text
    Then I verify the close symbol on edit guest list page
    Then I verify the add button symbol on edit guest list page
    Then I tap on the add button symbol on edit guest list page
    Then I verify the edit pin header text
    Then I verify the close symbol on edit pin page
    Then I verify the pin name text
    Then I verify the pin code text
    Then I verify the Mail box text
    Then I verify the Mail box toggle button
    Then I verify the refrigerated compartment text
    Then I verify the refrigerated compartment toggle button
    Then I tap on the close button symbol on edit pin page
    Then I tap on the close button symbol on guest list page
    Then I Wait short period for Page to Load
    Then I Tap on Back Button in guest List Page

  @First1 @sanity1 @Regression1
  Scenario:Verify the temperature setting screen UI
    Then I tap on the temperature settings text
    Then I Wait short period for Page to Load
    Then I Verify the temperature settings header text tile
    Then I Verify the current temperature text on the temperature page
    Then I Verify the outside text on the temperature page
    Then I Verify the lower compartment on the temperature page
    Then I Verify the temperature alert text on the temperature page
    Then I Verify the temperature threshold text on the temperature page
    Then I Verify the temperature control text on the temperature page
    Then I Verify the scheduler title text on the temperature page
    Then I Verify the scheduler text on the temperature page
    Then I Tap on the back button on the temperature page
    Then I tap on back button on device management main screen
    Then I tap on back button on device management device selection page

  @Regression1
  Scenario: Verifying the guest pin list functionality
#    Then I tap on guest pin list right icon button
#    Then I tap on the edit text
#    Then I tap on the add button symbol on edit guest list page
#    Then I Wait short period for Page to Load
#    Then I enter the name for pin name
#    Then I enter the pincode
#    Then I tap on the save button for edit pin
#    Then I Wait for Page to Load
#    Then I tap on the edit text
#    Then I tap on the add button symbol on edit guest list page
#    Then I enter the name for pin name
#    Then I enter the pincode
#    Then I tap on the save button for edit pin
#    Then I Wait for Page to Load
#    Then I tap on the edit text
#    Then I tap on the add button symbol on edit guest list page
#    Then I enter the combination for name field
#    Then I enter the combination for pincode
#    Then I tap on the save button for edit pin
#    Then I Wait for Page to Load
#    Then I tap on the edit text
#    Then I tap on the add button symbol on edit guest list page
#    Then I enter the long length for name field
#    Then I enter the long length for pincode
#    Then I tap on the save button for edit pin
#    Then I Wait for Page to Load
#    Then I tap on the edit text
#    Then I tap on the add button symbol on edit guest list page
#    Then I enter the short for name field
#    Then I enter the short for pincode
#    Then I tap on the save button for edit pin
#    Then I Wait for Page to Load
#    Then I tap on the guest list right icon
#    Then I tap on back button on device management main screen
#    Then I Wait short period for Page to Load
#    Then I tap on back button on device management device selection page
#    Then I Wait short period for Page to Load

  @Regression1
  Scenario: Verifying the cooler setting UI implementation
#    Then I Verify the main cooler setting text
#    Then I tap on right icon of cooler setting
#    Then I verify the header text for cooler settings
#    Then I verify the cooler status card title
#    Then I verify the cooler status toggle button
#    Then I verify the scheduler card title
#    Then I verify the scheduler card toggle button
#    Then I verify the scheduled at card title
#    Then I verify the scheduled at right icon
#    Then I verify the temperature card title
#    Then I verify the temperature card right icon
#    Then I tap on the back button on cooler setting screen
#    Then I tap on the back button cooler settings
#    Then I Wait short period for Page to Load
#    Then I tap on back button on device management main screen
#    Then I Wait short period for Page to Load
#    Then I tap on back button on device management device selection page
#    Then I Wait short period for Page to Load

  @sanity1 @Regression1
  Scenario: Verify Version Functionality
    Then I verify Version is displayed
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @sanity1 @Regression1
  Scenario: Verify Profile page UI
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on App view and edit account
    Then I Wait short period for Page to Load
    Then I Tap on profile setting right icon
    Then I Wait short period for Page to Load
    Then I verify the profile Header
    Then I verify the back button in profile screen
    Then I verify the Profile photo image
    Then I verify the personal information text
    Then I verify the name text
    Then I verify the email text
    Then I verify the mobile text
    Then I verify the address text
    Then I Scroll up the page
    Then I verify Edit profile text
    Then I scroll up the screen
    Then I verify Edit profile right icon text
    Then I verify Security text
    Then I verify Password text
    Then I verify the renew text
    Then I verify the renew card icon
    Then I scroll down the screen
    Then I Wait short period for Page to Load
    Then I Tap on Back Button in profile screen
    Then I Wait short period for Page to Load
    Then I Tap on Back button in Accounts settings page
    Then I Wait short period for Page to Load

  @sanity1 @Regression1
  Scenario: Verify the Subscription Page UI
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on App view and edit account
    Then I Wait short period for Page to Load
    Then I tap on the Subscriptions Navigation icon
    Then I Wait short period for Page to Load
    Then I verify the Header of the Subscriptions
    Then I verify the back button in Subscriptions
    Then I Tap on Back Button in subscriptions Page
    Then I Wait short period for Page to Load
    Then I Tap on Back button in Accounts settings page

  @First1 @sanity1 @Regression1
  Scenario: Verify the Edit profile page UI
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on App view and edit account
    Then I Wait short period for Page to Load
    Then I Tap on profile setting right icon
    Then I Wait short period for Page to Load
    Then I Tap on Edit profile in profile screen
    Then I Wait short period for Page to Load
    Then I verify Edit profile header text
    Then I verify user profile photo in edit profile screen
#    Then I verify user email value is displayed
    Then I verify Firstname label is displayed
#    Then I verify Firstname Value is displayed
    Then I verify Lastname label is displayed
#    Then I verify Lastname Value is displayed
    Then I verify Primary Mobile label is displayed
#    Then I verify Primary Mobile Value is displayed
    Then I verify Address label is displayed in Edit profile screen
#    Then I verify Address value is displayed in Edit profile screen
    Then I verify Save Button is displayed
    Then I verify the Cancel Button image
    Then I tap on cancel image icon
    Then I Wait short period for Page to Load
    Then I Tap on Back Button in profile screen
    Then I Wait short period for Page to Load
    Then I Tap on Back button in Accounts settings page


  @Regression1
  Scenario: Verifying application Settings screen Edit profile screen(Checking text field allowing Empty text) Functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App view and edit account
    Then I Tap on profile setting right icon
    Then I Tap on Edit profile in profile screen
    Then I Wait short period for Page to Load
    Then I enter an empty in First name Field in Edit profile screen
    Then I enter an empty in Last name Field in Edit profile screen
    Then I enter an empty in Primary Field Mobile in Edit profile screen
    Then I enter an empty in Address field in Edit profile screen
    Then I Wait short period for Page to Load
    Then I Tap on Save button
    Then I Wait short period for Page to Load
    Then I tap on Ok button

  @Regression1
  Scenario: Verifying application Settings screen Edit profile screen(Checking text field allowing Emoji's) Functionality
    Then I enter an Emoji's in First name Field in Edit profile screen
    Then I enter an Emoji's in Last name Field in Edit profile screen
    Then I enter an Primary Mobile in Edit profile screen
    Then I enter an Emoji's in Address field in Edit profile screen
    Then I Wait short period for Page to Load
    Then I Tap on Save button
    Then I Wait short period for Page to Load
    Then I tap on Ok button

  @Regression1
  Scenario: Verifying application Settings screen Edit profile screen(Checking text field allowing Special Characters) Functionality
    Then I enter an Special character in First name Field in Edit profile screen
    Then I enter an Special character in Last name Field in Edit profile screen
    Then I enter an Primary Mobile in Edit profile screen
    Then I enter an Special character in Address field in Edit profile screen
    Then I Wait short period for Page to Load
    Then I Tap on Save button
    Then I Wait short period for Page to Load
    Then I tap on Ok button

  @Regression1
  Scenario: Verifying application Settings screen Edit profile screen Functionality
    Then I enter an First name in Edit profile screen
    Then I enter an Last name in Edit profile screen
    Then I enter an Primary Mobile in Edit profile screen
    Then I enter an Address in Edit profile screen
    Then I Wait short period for Page to Load
    Then I Tap on Save button
    Then I Wait short period for Page to Load
    Then I tap on Ok button
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Back Button



  @First1 @sanity1 @Regression1
  Scenario: Verifying application Settings screen(logout) functionality
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Logout in Settings screen

  @First1 @sanity1 @Regression1
  Scenario:Verify the manage Notification main screen UI
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Notification Settings
    Then I Wait short period for Page to Load
    Then I verify the Manage Notification header
    Then I verify back button in Manage Notification
    Then I verify the Manage Notification logo
    Then I verify Global Settings text in Manage notification page
    Then I verify Push notification text in Manage notification page
    Then I verify Push notification toggle in Manage notification page
    Then I verify the push notifications show more text
    Then I verify E-mail text
    Then I verify E-mail toggle button
    Then I verify show more text for Email
    Then I verify show more navigation button in Email
    Then I verify SMS text
    Then I verify if SMS toggle is displayed
    Then I verify show more text for SMS
    Then I verify show more navigation button for SMS
    Then I verified the Advanced text
#    Then I scroll up the screen
#    Then I verify Advanced notification icon
#    Then I verify the SDB text in Advanced
#    Then I verify the Advanced navigation icon for SMS
#    Then I scroll down the screen
    Then I Tap on back button in manage notifications screen
    Then I Wait short period for Page to Load


  @sanity1
  Scenario: Verifying Push Notification UI in Manage Notification screen
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Notification Settings
    Then I Wait short period for Page to Load
    Then I verify the Manage Notification header
    Then I verify back button in Manage Notification
    Then I verify the Manage Notification logo
    Then I verify Global Settings text in Manage notification page
    Then I verify Push notification text in Manage notification page
    Then I verify Push notification toggle in Manage notification page
    Then I verify the push notifications show more text
    Then I click show more text
    Then I Wait short period for Page to Load
    Then I verify show less text for Push notification
    Then I verify show less text navigation button
    Then I verify Alerts text for Push notification
    Then I verify Alerts toggle button for Push notification
    Then I verify Warnings text for Push Notification
    Then I verify Warnings toggle button for Push notification
    Then I click show less
    Then I Wait short period for Page to Load
    Then I Tap on back button in manage notifications screen
    Then I Wait short period for Page to Load

  @sanity
  Scenario: Verifying Push Notification functionality in Manage Notification screen(Disabling)
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Notification Settings
    Then I Wait short period for Page to Load
    Then I Tap on the push notification toogle button in the manage notification screen
    Then I verify Show less text is displayed in the manage notification screen
    Then I verify Alerts text is displayed in the manage notification screen
    Then I verify Warnings text is displayed in the manage notification screen
    Then I Wait short period for Page to Load
    Then I Tap on back button in manage notifications screen
    Then I Wait short period for Page to Load

  @sanity
  Scenario: Verifying Push Notification functionality in Manage Notification screen(Enabling)
    Then I tap on back button
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Notification Settings
    Then I Enable the push notification toogle button in the manage notification screen
    Then I verify Show less text is displayed in the manage notification screen
    Then I verify Alerts text is displayed in the manage notification screen
    Then I verify Warnings text is displayed in the manage notification screen
    Then I verify Alert toogle button is displayed in the manage notification screen
    Then I verify warning toogle button is displayed in the manage notification screen
    Then I diasble the alert toogle button in displayed in the manage notification screen
    Then I diasble the warning toogle button in displayed in the manage notification screen
    Then I enable the alert toogle button in displayed in the manage notification screen
    Then I enable the warning toogle button in displayed in the manage notification screen
    Then I Wait short period for Page to Load
    Then I Tap on back button in manage notifications screen
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verifying Email UI in Manage Notification screen
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Notification Settings
    Then I Wait short period for Page to Load
    Then I verify the Manage Notification header
    Then I verify back button in Manage Notification
    Then I verify the Manage Notification logo
    Then I verify Global Settings text in Manage notification page
    Then I verify E-mail text
    Then I verify E-mail toggle button
    Then I verify show more text for Email
    Then I verify show more navigation button in Email
    Then I Tap on email show more text
    Then I Wait short period for Page to Load
    Then I verify show less text in Email
    Then I verify show less text navigation button in Email
    Then I verify Email list text
    Then I verify edit list text
    Then I verify edit list navigation button
    Then I Tap on E-mail edit list
    Then I Wait short period for Page to Load
    Then I verify Email list header
    Then I verify Email account text
    Then I verify additional emails text
    Then I verify the add new button
    Then I verify save button
    Then I verify close button is displayed
    Then I click close button
    Then I Wait short period for Page to Load
    Then I Scroll up the page
    Then I Wait short period for Page to Load
    Then I verify Alerts text for Email
    Then I verify Alerts toggle button for Email
    Then I verify Warnings text for Email
    Then I verify Warnings toggle button for Email
    Then I scroll up the screen
    Then I click show less in Email
    Then I Wait short period for Page to Load
    Then I Tap on back button in manage notifications screen
    Then I Wait short period for Page to Load


  @sanity1
  Scenario: Verifying SMS UI in Manage Notification screen
    Then I Tap on hamburger menu in landing screen
    Then I Wait short period for Page to Load
    Then I Tap on Notification Settings
    Then I Wait short period for Page to Load
    Then I verify the Manage Notification header
    Then I verify back button in Manage Notification
    Then I verify the Manage Notification logo
    Then I verify Global Settings text in Manage notification page
    Then I verify SMS text
    Then I verify if SMS toggle is displayed
    Then I verify show more text for SMS
    Then I verify show more navigation button for SMS
    Then I click show more button
    Then I Wait for Page to Load
    Then I scroll up the screen
    Then I verify show less text for SMS
    Then I verify show less navigation button for SMS
    Then I verify the SMS list text in SMS
    Then I verify Edit list text for SMS
    Then I verify Edit list navigation button for SMS
    Then I click on Edit list for SMS
    Then I Wait for Page to Load
    Then I verify SMS List header
    Then I verify SMS list close button
    Then I verify Mobile account text
    Then I verify Additional SMS text
    Then I verify add new button for SMS List
    Then I verify save button is displayed for SMS list
    Then I verify Save button text for SMS list
    Then I click on close button
    Then I Wait short period for Page to Load
    Then I scroll up the screen
    Then I verify Alerts text for SMS
    Then I scroll up the screen
    Then I scroll up the screen
    Then I scroll up the screen
    Then I Wait short period for Page to Load
    Then I verify Alerts toggle for SMS
    Then I verify Warnings text for SMS
    Then I verify Warnings toggle for SMS
    Then I scroll down the screen
    Then I Wait short period for Page to Load
    Then I click show less in SMS
    Then I Wait short period for Page to Load
    Then I Tap on back button in manage notifications screen
    Then I Wait short period for Page to Load
    #Then I Tap on Back Button
    #Then I Wait short period for Page to Load


  @First @sanity @Regression
  Scenario: Verify Manage notification Email toggle functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I verify E-mail toggle button
    Then I tap on the Email toggle if its in the OFF state
    Then I tap on Email show more text in Manage notifications if its visible
    Then I Wait short period for Page to Load
    Then I tap on Email edit list toggle to turn it OFF
    Then I tap on Email toggle
    Then I Wait short period for Page to Load
    Then I tap on the alerts toggle in Email
    Then I tap on the alerts toggle in Email to turn it ON
    Then I tap on the warnings toggle in Email
    Then I tap on the warnings toggle in Email to turn it ON
    Then I tap on email show less text
    Then I tap on the Email toggle to turn it off
    Then I tap on the Email toggle to turn it on
    Then I Tap on back button in manage notifications screen

  @First @sanity @Regression
  Scenario: Verify Manage notification Email Edit functionality - empty name and empty label
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I tap on the Email toggle if its in the OFF state
    Then I tap on Email show more text in Manage notifications if its visible
    Then I Tap on E-mail edit list
    Then I Wait short period for Page to Load
    Then I verify Email list header
    Then I tap on Add new button in Email Edit list
    Then I enter an empty Email in Email list
    Then I enter an empty Label in Email list
    Then I verify Email ID warning disclaimer in Email Edit list
    Then I verify Label warning disclaimer in Email Edit list
    Then I click close button
    Then I Wait short period for Page to Load
    Then I Tap on back button in manage notifications screen

  @First @sanity @Regression
  Scenario: Verify Manage notification Email Edit functionality - invalid Email ID with special characters
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I tap on the Email toggle if its in the OFF state
    Then I tap on Email show more text in Manage notifications if its visible
    Then I Wait short period for Page to Load
    Then I Tap on E-mail edit list
    Then I Wait short period for Page to Load
    Then I verify Email list header
    Then I tap on Add new button in Email Edit list
    Then I enter an invalid Email with special characters in Email list
    Then I enter label name in Email Edit list
    Then I verify Email ID warning disclaimer in Email Edit list
    Then I click close button
    Then I Wait short period for Page to Load
    Then I Tap on back button in manage notifications screen

  @First @sanity @Regression
  Scenario: Verify Manage notification Email Edit functionality - invalid Email ID with smileys
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I tap on the Email toggle if its in the OFF state
    Then I tap on Email show more text in Manage notifications if its visible
    Then I Wait short period for Page to Load
    Then I Tap on E-mail edit list
    Then I verify Email list header
    Then I tap on Add new button in Email Edit list
    Then I enter an invalid Email with smileys in Email list
    Then I enter label name in Email Edit list
    Then I verify Email ID warning disclaimer in Email Edit list
    Then I click close button
    Then I Wait short period for Page to Load
    Then I Tap on back button in manage notifications screen

  @First @sanity @Regression
  Scenario: Verify Manage notification Email Edit functionality - valid Email ID and valid Label
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I tap on the Email toggle if its in the OFF state
    Then I tap on Email show more text in Manage notifications if its visible
    Then I Wait short period for Page to Load
    Then I Tap on E-mail edit list
    Then I Wait short period for Page to Load
    Then I tap on Add new button in Email Edit list
    Then I enter a valid email in Email edit list
    Then I enter a valid label in Email edit list
    Then I tap on Save button in Email edit list
    Then I Wait short period for Page to Load
    Then I verify if valid email is updated
    Then I verify if valid label is updated
    Then I turn on Email-0 toggle
    Then I Wait short period for Page to Load
    Then I turn off Email-0 toggle
    Then I Tap on back button in manage notifications screen


  @First @sanity @Regression
  Scenario: Verify Manage notification Email Edit functionality - Delete functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I tap on the Email toggle if its in the OFF state
    Then I tap on Email show more text in Manage notifications if its visible
    Then I Wait short period for Page to Load
    Then I Tap on E-mail edit list
    Then I Wait short period for Page to Load
    Then I tap on delete icon in Email edit list
    Then I tap on Save button in Email edit list
    Then I Tap on back button in manage notifications screen

  @First @sanity @Regression
  Scenario: Verify Manage notification SMS toggle functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I verify if SMS toggle is displayed
    Then I tap on the SMS toggle if its in the OFF state
    Then I tap on SMS show more text in Manage notifications if its visible
    Then I Wait short period for Page to Load
    # Then I tap on SMS edit list toggle to turn it OFF
    # Then I tap on SMS toggle
    Then I scroll up the screen in Manage notifications
    Then I verify Alerts toggle for SMS
    Then I tap on the alerts toggle in SMS
    Then I tap on the alerts toggle in SMS to turn it ON
    Then I tap on the warnings toggle in SMS
    Then I tap on the warnings toggle in SMS to turn it ON
    Then I Wait short period for Page to Load
    Then I tap on SMS show less text
    Then I tap on the SMS toggle to turn it off
    Then I tap on the SMS toggle to turn it on
    Then I Tap on back button in manage notifications screen

  @First @sanity @Regression
  Scenario: Verify Manage notification SMS Edit functionality - empty number and empty label
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I tap on the SMS toggle if its in the OFF state
    Then I tap on SMS show more text in Manage notifications if its visible
    Then I scroll up the screen in Manage notifications
    Then I tap on Edit list in SMS
    Then I Wait short period for Page to Load
    Then I tap on Add new button in SMS edit list
    Then I enter an empty mobile number in SMS list
    Then I enter an empty Label in SMS list
    Then I verify SMS warning disclaimer in SMS Edit list
    Then I verify Label warning disclaimer in SMS Edit list
    Then I click close button in SMS edit list
    Then I Wait short period for Page to Load
    Then I Tap on back button in manage notifications screen

  @First @sanity @Regression
  Scenario: Verify Manage notification SMS Edit functionality - invalid numbers with special characters
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I tap on the SMS toggle if its in the OFF state
    Then I tap on SMS show more text in Manage notifications if its visible
    Then I tap on Edit list in SMS
    Then I Wait short period for Page to Load
    Then I tap on Add new button in SMS edit list
    Then I enter a special characters mobile number in SMS list
    Then I enter valid Label in SMS list
    Then I verify SMS warning disclaimer in SMS Edit list
    Then I click close button in SMS edit list
    Then I Wait short period for Page to Load
    Then I Tap on back button in manage notifications screen

  @First @sanity @Regression
  Scenario: Verify Manage notification SMS Edit functionality - valid details
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I tap on the SMS toggle if its in the OFF state
    Then I tap on SMS show more text in Manage notifications if its visible
    Then I tap on Edit list in SMS
    Then I Wait short period for Page to Load
    Then I tap on Add new button in SMS edit list
    Then I enter a valid mobile number in SMS list
    Then I enter valid Label in SMS list
    Then I tap on Save in SMS edit list
    Then I scroll up the screen in Manage notifications
    Then I scroll up in the screen
    Then I verify if valid mobile number is updated
    Then I verify if valid label is updated in SMS edit list
    Then I turn on SMS-0 toggle
    Then I Wait short period for Page to Load
    Then I turn off SMS-0 toggle
    Then I Wait short period for Page to Load
    Then I Tap on back button in manage notifications screen

  @First @sanity @Regression
  Scenario: Verify Manage notification SMS Edit functionality - Delete functionality
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I tap on the SMS toggle if its in the OFF state
    Then I tap on SMS show more text in Manage notifications if its visible
    Then I scroll up the screen in Manage notifications
    Then I tap on Edit list in SMS
    Then I Wait short period for Page to Load
    Then I tap on delete icon in SMS edit list
    Then I tap on Save in SMS edit list
    Then I Wait short period for Page to Load
    Then I scroll up the screen in Manage notifications
    Then I Tap on back button in manage notifications screen



  @sanity1
  Scenario: Verifying Advanced UI in Manage Notification screen
#    Then I Tap on hamburger menu in landing screen
#    Then I Tap on Notification Settings
#    Then I verify the Manage Notification header
#    Then I verify back button in Manage Notification
#    Then I verify the Manage Notification logo
#    Then I verify Global Settings text in Manage notification page

#    Then I verify Advanced text in Manage notification page
#    Then I verify SDB icon
#    Then I verify SDB name
#    Then I verify SDB Device navigation button
#    Then I click on Dometic device
#    Then I Wait for Page to Load
#    Then I verify Advanced header
#    Then I verify back button in Advanced screen
#    Then I verify the logo
#    Then I verify Push notification text in Advanced
#    Then I verify Push notification toggle in Advanced
#    Then I verify email text in advanced
#    Then I verify email toggle in advanced
#    Then I verify Tank text in advanced
#    Then I verify Tank toggle in advanced
#    Then I verify show more text in advanced
#    Then I verify show more navigation button in advanced
#    Then I click on show more
#    Then I verify Alerts text for advanced
#    Then I verify Alerts Push notification text in advanced
#    Then I verify Alerts Push notification toggle in advanced
#    Then I tap on show less
#    Then I verify Batteries text in advanced
#    Then I verify Batteries toggle in advanced
#    Then I verify batteries show more text in advanced
#    Then I verify batteries show more navigation button in advanced
#    Then I click on batteries show more
#    Then I verify batteries show less text in advanced
#    Then I verify batteries show less navigation button in advanced
#    Then I scroll down the screen
#    Then I verify batteries Alerts text for advanced
#    Then I verify batteries Push notification text in advanced
#    Then I verify batteries Push notification toggle in advanced
#    Then I verify Temperature text in advanced
#    Then I verify Temperature toggle in advanced
#    Then I verify Temperature show more text in advanced
#    Then I verify Temperature show more navigation button in advanced
#    Then I click on Temperature show more
#    Then I scroll down the screen
#    Then I verify Temperature Alerts text for advanced
#    Then I verify Temperature Push notification text in advanced
#    Then I verify Temperature Push notification toggle in advanced

  @sanity1 @Regression1
  Scenario: Verify the Account Settings UI
    Then I Tap on hamburger menu in landing screen
    Then I Wait for Page to Load
    Then I Tap on App view and edit account
    Then I Wait for Page to Load
    Then I verify the Header of the account settings
    Then I verify the profile photo of the account settings
    Then I Verify the UserName of account settings
    Then I Verify the UserEmail of account settings
    Then I Verify the Setting text of account settings
    Then I Verify the profile text of account settings
    Then I verify the profile card icon of account setting
    Then I verify the subscription text of account settings
    Then I verify the subscription card icon of account setting
    Then I Wait short period for Page to Load
    Then I tap on back button in account settings

