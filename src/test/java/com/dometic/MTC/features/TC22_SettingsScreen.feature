Feature: Verifying application Settings Screen in Dometic Marine application

  @First @sanity
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

  @sanity1
  Scenario: Verifying application Settings screen Functionality
    Then I Tap on Home in Settings screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Notification Settings
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Device Management
    Then I Tap on back button in Device Management screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App Settings
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Marine Tile
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen

  @sanity1
  Scenario: Verify the Manage Notification(Push Notification)Main screen UI
#    Then I Tap on Notification Settings
#    Then I Verified the Manage Notification header
#    Then I Verified the Push notifications Text
#    Then I Verified the Push Notification Toggle button status
#    Then I Wait short period for Page to Load
#    Then I Verified the Push Notification Toggle button status
#    Then I Wait short period for Page to Load
#    Then I Verified the Email List Toggle button status
#    Then I Wait short period for Page to Load
#    Then I Verified the Email List Toggle button status
#    Then I Wait short period for Page to Load
#    Then I Verified the Sms List Toggle button status
#    Then I Wait short period for Page to Load
#    Then I Verified the Sms List Toggle button status
#    Then I Wait short period for Page to Load
#    Then I Verified the Push Notification show more text
#    Then I Tap on Push Notification show more text
#    Then I verify Alert text in Push Notification
#    Then I verify Alert toggle in Push Notification
#    Then I verify Warning text in Push Notification
#    Then I verify Warning toggle in Push Notification

  @sanity1
  Scenario: Verify the Manage Notification(Push Notification)Main screen Functionality
#    Then I Turn OFF push notifications alerts toggle
#    Then I Wait short period for Page to Load
#    Then I Turn OFF push notifications warnings toggle
#    Then I Wait short period for Page to Load
#    Then I Turn ON push notifications alerts toggle
#    Then I Wait short period for Page to Load
#    Then I Turn ON push notifications warnings toggle
#    Then I Wait short period for Page to Load
#    Then I Tap on Push Notification show less text

  @sanity1
  Scenario: Verify the Manage Notification(Email Notification)Main screen UI
#    Then I Verified Email text
#    Then I Verified the Email show more text
#    Then I Tap on Email show more text
#    Then I Verified the Email-List Text
#    Then I Scroll up the page
#    Then I Scroll up the page
#    Then I Verified the Alerts Text in Email options
#    Then I Verified the Warnings Text in Email options
#    Then I Verified the Edit List in Email option
#    Then I Tap on the Edit List in Email option
#    Then I Wait short period for Page to Load
#    Then I Verified Email List Header
#    Then I Verified the E-mail(Account) text
#    Then I Verified the Additional Emails options in Email List

  @sanity1
  Scenario: Verify the application Manage Notification Edit E-mail list functionality with valid inputs
#    Then I delete the existing list of Emails
#    Then I Tap on Save button in Edit E-mail list screen
#    Then I Tap on the Edit List in Email option
#    Then I Tap on the Add New button in Email List
#    Then I Verified the Add new button in Email List
#    Then I enter a valid E-mail in E-mail field
#    Then I enter a valid E-mail label name
#    Then I Tap on Save button in Edit E-mail list screen
#    Then I Wait for Page to Load
#    Then I verify if the edited E-mail is displayed in the E-mail list
#    Then I verify if the edited Label name is displayed below the respective E-mail
#    Then I turn ON the toggle for the first edited E-mail in list
#    Then I Wait short period for Page to Load
#    Then I turn OFF the toggle for the first edited E-mail in list
#    Then I Wait short period for Page to Load
#    Then I Try to Turn ON the toggle for the first E-mail in list
#    Then I Wait short period for Page to Load
#    Then I try to Turn OFF the toggle for the first value in list

  @sanity1
  Scenario: Verify the application Manage Notification Edit Email list Functionality with invalid inputs
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Tap on the Edit List in Email option
#    Then I Wait short period for Page to Load
#    Then I Tap on the Add New button in Email List
#    Then I enter an invalid E-mail in E-mail field
#    Then I enter an invalid E-mail label name
#    Then I Tap on Save button in Edit E-mail list screen
#    Then I Wait for Page to Load
#    Then I verify if the edited invalid E-mail is displayed in the E-mail list
#    Then I verify if the edited invalid Label name is displayed below the respective E-mail
#    Then I turn ON the toggle for the edited invalid E-mail in list
#    Then I Wait short period for Page to Load
#    Then I turn OFF the toggle for the edited invalid E-mail in list
#    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verify the application Manage Notification Edit Email list Functionality with two same E-mail ID's
#    Then I Scroll up the page
#    Then I Tap on the Edit List in Email option
#    Then I Wait short period for Page to Load
#    Then I Tap on the Add New button in Email List
#    Then I enter an E-mail that is already added to the list
#    Then I Scroll up the page
#    Then I enter a label that is already added to the list
#    Then I Tap on Save button in Edit E-mail list screen
#    Then I Wait for Page to Load
#    Then I verify if the edited duplicate E-mail is displayed in the E-mail list
#    Then I verify if the edited duplicate Label name is displayed below the respective E-mail
#    Then I Try to Turn ON the toggle for the fourth E-mail in list
#    Then I Wait short period for Page to Load
#    Then I try to Turn OFF the toggle for the fourth value in list
#    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verify the application Manage Notification Edit Email list Functionality with duplicate email and different label
#    Then I Scroll up the page
#    Then I Tap on the Edit List in Email option
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Tap on the Add New button in Email List
#    Then I enter a duplicate E-mail already present in list
#    Then I Scroll up the page
#    Then I enter a label name that is not already present in list
#    Then I Tap on Save button in Edit E-mail list screen
#    Then I Wait for Page to Load
#    Then I verify if the duplicate E-mail is displayed in the E-mail list
#    Then I verify if the modified Label name is displayed below the respective E-mail
#    Then I Try to Turn ON the toggle for the fifth E-mail in list
#    Then I Wait short period for Page to Load
#    Then I try to Turn OFF the toggle for the fifth value in list
#    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verify the application Manage Notification Edit Email list Functionality with empty inputs
#    Then I Scroll up the page
#    Then I Tap on the Edit List in Email option
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Tap on the Add New button in Email List
#    Then I leave the E-mail field blank
#    Then I Scroll up the page
#    Then I leave the E-mail label field blank
#    Then I Tap on Save button in Edit E-mail list screen

  @sanity1
  Scenario: Verify the application Manage Notification E-mail alerts and warnings functionality
#    Then I Wait short period for Page to Load
#    Then I Turn OFF E-mail alerts toggle
#    Then I Wait short period for Page to Load
#    Then I Turn OFF E-mail warnings toggle
#    Then I Wait short period for Page to Load
#    Then I Turn ON E-mail alerts toggle
#    Then I Wait short period for Page to Load
#    Then I Turn ON E-mail warnings toggle
#    Then I Wait short period for Page to Load
#    Then I Scroll down the page
#    Then I Tap on E-mail show less navigation button
#    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verify the Manage Notification(SMS Notification)Main screen UI
#    Then I verified SMS Text
#    Then I Verified the SMS show more text
#    Then I Tap on SMS show more text
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Verified SMS List text
#    Then I Verified the Edit List Text
#    Then I Verified the SMS Alert Text
#    Then I Verified the SMS Warning Text
#    Then I Tap on the Edit List text Expand icon
#    Then I Wait short period for Page to Load
#    Then I Verified the SMS List Header
#    Then I Verified the Mobile(Account) text
#    Then I Verified the Additional SMS Numbers Text
#    Then I Scroll up the page
#    Then I Verified the Add new button in SMS List
#    Then I Verified the Save button  in SMS List
#    Then I Tap on cancel button in SMS List

  @sanity1
  Scenario: Verify the application Manage Notification sms alerts and warnings functionality
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Wait short period for Page to Load
#    Then I Turn OFF sms alerts toggle
#    Then I Wait short period for Page to Load
#    Then I Turn OFF sms warnings toggle
#    Then I Wait short period for Page to Load
#    Then I Turn ON sms alerts toggle
#    Then I Wait for Page to Load
#    Then I Turn ON sms warnings toggle
#    Then I Wait short period for Page to Load

  @sanity1
  Scenario:Verify the application Manage Notification sms list functionality with valid inputs
#    Then I Scroll up the page
#    Then I Tap on the Edit List text Expand icon
#    Then I Wait short period for Page to Load
#    Then I delete the existing list of mobile numbers
#    Then I Tap on Save button in Edit sms list screen
#    Then I Wait short period for Page to Load
#    Then I Tap on sms edit list
#    Then I Wait short period for Page to Load
#    Then I Tap on add new number button
#    Then I enter a valid number in mobile number field
#    Then I enter a valid sms label name
#    Then I Tap on Save button in Edit sms list screen
#    Then I Wait for Page to Load
#    Then I verify if the edited number is displayed in the sms list
#    Then I verify if the edited Label name is displayed below the respective number
#    Then I turn ON the toggle for the first edited number in list
#    Then I Wait short period for Page to Load
#    Then I turn OFF the toggle for the first edited number in list
#    Then I Wait short period for Page to Load
#    Then I Try to Turn ON the toggle for the valid number in list
#    Then I Wait short period for Page to Load
#    Then I try to Turn OFF the toggle for the valid number in list
#    Then I Wait short period for Page to Load

  @sanity1
  Scenario:Verify the application Manage Notification sms list functionality with invalid inputs
#    Then I Scroll up the page
#    Then I Tap on the Edit List text Expand icon
#    Then I Wait short period for Page to Load
#    Then I Tap on add new number button
#    Then I enter an invalid number in mobile number field
#    Then I enter an invalid sms label name
#    Then I Tap on Save button in Edit sms list screen
#    Then I Wait for Page to Load
#    Then I verify if the edited invalid number is displayed in the sms list
#    Then I verify if the edited invalid Label name is displayed below the respective number
#    Then I Try to Turn ON the toggle for the invalid number in list
#    Then I Wait short period for Page to Load
#    Then I try to Turn OFF the toggle for the invalid number in list
#    Then I Wait short period for Page to Load

  @sanity1
  Scenario:Verify the application Manage Notification sms list functionality with two same mobile numbers
#    Then I Tap on the Edit List text Expand icon
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Tap on add new number button
#    Then I enter an already added number in mobile number field
#    Then I Scroll up the page
#    Then I enter an already created sms label name
#    Then I Tap on Save button in Edit sms list screen
#    Then I Wait for Page to Load
#    Then I verify if the edited duplicate number is displayed in the sms list
#    Then I verify if the edited duplicate Label name is displayed below the respective number
#    Then I Try to Turn ON the toggle for the duplicate number in list
#    Then I Wait short period for Page to Load
#    Then I try to Turn OFF the toggle for the duplicate number in list
#    Then I Wait short period for Page to Load

  @sanity1
  Scenario:Verify the application Manage Notification sms list functionality with duplicate mobile unique label
#    Then I Tap on the Edit List text Expand icon
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Tap on add new number button
#    Then I enter an existing number in mobile number field
#    Then I Scroll up the page
#    Then I enter a unique sms label name
#    Then I Tap on Save button in Edit sms list screen
#    Then I Wait for Page to Load
#    Then I verify if the edited existing number is displayed in the sms list
#    Then I verify if the edited unique Label name is displayed below the respective number
#    Then I Try to Turn ON the toggle for the edited existing number in list
#    Then I Wait short period for Page to Load
#    Then I try to Turn OFF the toggle for the edited existing number in list
#    Then I Wait short period for Page to Load

  @sanity1
  Scenario:Verify the application Manage Notification sms list functionality with empty fields
#    Then I Tap on the Edit List text Expand icon
#    Then I Wait short period for Page to Load
#    Then I Scroll up the page
#    Then I Tap on add new number button
#    Then I leave the mobile number field blank
#    Then I Scroll up the page
#    Then I leave the sms label field blank
#    Then I Tap on Save button in Edit sms list screen
#    Then I Wait for Page to Load
#    Then I Scroll down the page
#    Then I Tap on sms show less navigation button

  @sanity1
  Scenario: Verify Advance section UI in manage notifications main screen
#    Then I Verified the Advanced Text
#    Then I Scroll up the page
#    Then I Verified the Marine Name in Advance option
#    Then I Verified the Marine Logo in Advance option
#    Then I verified the marine colapse icon
#    Then I Tap on the Marine colapse icon
#    Then I Wait short period for Page to Load
#    Then I verify the Header of the Advanced Main Page
#    Then I verify the Push notification text in Advanced Main Page
#    Then I verify the Push notification Toggle in Advanced Main Page
#    Then I Tap on Back Button
#    Then I Wait short period for Page to Load
#    Then I Tap on Back Button

  @sanity1
  Scenario: Verifying application Settings screen(Account settings) UI
    Then I Tap on hamburger menu in landing screen
    Then I Tap on View Edit Account link in Settings screen
    Then I Verify the account setting header
    Then I verify the account holder photo
    Then I verify the user name in account setting
    Then I verify the user mail id
    Then I Verify the profile text
    Then I Verify the Subscription text

  @sanity1
  Scenario: Verifying application Settings screen(Account settings)Functionality
    Then I Navigate to the Profile page
    Then I Tap on Back Button
    Then I Wait for Page to Load
    Then I Navigate to Subscription page
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verifying application Settings screen(Subscriptions) UI& Functionality
    Then I verify if subscription title is displayed
    Then I verify if subscription back button is available
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Back Button

  @sanity1
  Scenario:Verifying application Settings screen(Device Management) UI
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Device Management
    Then I verify the Device Management Header
    Then I verify the Device Management Logo
    Then I verify the Device Management right icon
    Then I verify the Add New Button text
    Then I Tap on the Add New button
    Then I Wait for Page to Load
    Then I Tap on Ok button
    Then I Verify the OnBoarding Header
    Then I Verify the close button in Onboarding Page
    Then I verify No device found text
    Then I Verify the Attention image
    Then I Verify the Bluetooth Pairing Message
    Then I verify the Search Again Text
    Then I Tap on close button

  @sanity1
  Scenario: Verifying Device management(Vessel Information) UI
    Then I Wait short period for Page to Load
    Then I Tap on Device management right icon
    Then I verify the device management title text
    Then I verify the vessel information text
    Then I verify the name card title
    Then I verify the hull id number title text
    Then I verify the edit vessel title text
    Then I verify the right icon of edit vessel
    Then I verify the advanced text
    Then I verify the check updates title text
    Then I verify the right icon of check updates
    Then I verify the unregister delete off board title text
    Then I verify the right icon of unregister delete off board

  @sanity1
  Scenario: Verifying the Edit vessel screen UI
    Then I Wait short period for Page to Load
    Then I Tap on edit vessel button on device management screen
    Then I verify the vessel name label text
    Then I verify the mac address label text
    Then I verify the save button text
    Then I verify the Cancel button on the edit screen
    Then I Tap on Cancel button
    Then I Wait short period for Page to Load
    Then I Tap on back button in Device Management screen

  @sanity1
  Scenario: Editing a vessel name with an emojis
    Then I Tap on the navigation button of the first onboarded device name that is displayed
    Then I verify if user is able to tap on edit vessel navigation button
    Then I verify if user is able to enter emojis in name field
    Then I Tap on save button in edit screen
    Then I Wait for Page to Load
    Then I verify if the edited emoji is displayed in the name field
    Then I verify if the edited emoji is displayed in the name label below the image
    Then I Tap on back button in Device Management screen
    Then I assert if the edited name is displayed in the device list
    Then I Tap on back button in Device Management screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Home in Settings screen
    Then I assert if the edited name is displayed in the tiles in home page

  @sanity1
  Scenario: Editing a vessel name with an invalid input
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Device Management
    Then I Tap on the navigation button of the first onboarded device name that is displayed
    Then I verify if user is able to tap on edit vessel navigation button
    Then I verify if user is able to enter some invalid text in name field
    Then I Tap on save button in edit screen
    Then I Wait for Page to Load
    Then I verify if the edited name is displayed in the name field
    Then I verify if the edited name is displayed in the name label below the image
    Then I Tap on back button in Device Management screen
    Then I assert if the edited name is displayed in the device list
    Then I Tap on back button in Device Management screen
    Then I assert if the edited name is displayed in the tiles in home page

  @sanity1
  Scenario: Editing a vessel name with no input
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Device Management
    Then I Tap on the navigation button of the first onboarded device name that is displayed
    Then I verify if user is able to tap on edit vessel navigation button
    Then I leave the name field blank
    #Then I verify if user is able to tap on Mac address field
    #Then I leave the mac field blank
    Then I Tap on save button in edit screen
    Then I Wait for Page to Load
    Then I verify if error text is displayed below the name field

  @sanity1
  Scenario: Editing a vessel name with a very long input
    Then I verify if user is able to enter some long text in name field
    Then I Tap on save button in edit screen
    Then I Wait for Page to Load
    Then I verify if the edited name is displayed in the name field
    Then I verify if the edited name is displayed in the name label below the image
    Then I Tap on back button in Device Management screen
    Then I assert if the edited name is displayed in the device list
    Then I Tap on back button in Device Management screen
    Then I assert if the edited name is displayed in the tiles in home page

  @sanity1
  Scenario: Verifying the Edit vessel screen with valid inputs
    Then I Tap on hamburger menu in landing screen
    Then I Tap on Device Management
    Then I Tap on Device management right icon
    Then I Tap on edit vessel button on device management screen
    Then I verify if user is able to enter some valid text in name field
    Then I Tap on save button in edit screen
    Then I Wait for Page to Load
    Then I verify if the edited name is displayed in the name field
    Then I verify if the edited name is displayed in the name label below the image
    Then I Tap on back button in Device Management screen
    Then I assert if the edited name is displayed in the device list
    Then I Tap on back button in Device Management screen
    Then I assert if the edited name is displayed in the tiles in home page

  @sanity1
  Scenario: Verifying application Settings screen(View/Edit Account) Functionality
    Then I Tap on back button in Device Management screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on View Edit Account link in Settings screen
    Then I Tap on Profile in Account Setting Screen
    Then I Scroll up the page
    Then I Verify Profile header text
    Then I verify user profile image is displayed
    Then I verify Personal Information text is displayed
    Then I verify Name Label is displayed
    Then I Verify Name value is displayed
    Then I verify E-mail Label is displayed
    Then I verify E-mail value is displayed
    Then I verify Mobile Label is displayed
    Then I Verify Mobile value is displayed
    Then I verify Address Label is displayed
    Then I verify Address value is displayed
    Then I verify Edit profile text is displayed
    Then I verify Edit profile arrow is displayed
    Then I verify Security text is displayed
    Then I verify Password text is displayed
    Then I verify Renew text is displayed
    Then I verify Renew arrow is displayed
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verifying application Settings screen Edit profile screen UI
    Then I Tap on Edit profile in profile screen
    Then I verify Edit profile header text
    Then I verify user profile photo in edit profile screen
    Then I verify user email value is displayed
    Then I verify Firstname label is displayed
    Then I verify Firstname Value is displayed
    Then I verify Lastname label is displayed
    Then I verify Lastname Value is displayed
    Then I verify Primary Mobile label is displayed
    Then I verify Primary Mobile Value is displayed
    Then I verify Address label is displayed in Edit profile screen
    Then I verify Address value is displayed in Edit profile screen
    Then I verify Save Button is displayed

  @sanity1
  Scenario: Verifying application Settings screen Edit profile screen(Checking text field allowing Empty text) Functionality
    Then I Wait short period for Page to Load
    Then I enter an empty in First name Field in Edit profile screen
    Then I enter an empty in Last name Field in Edit profile screen
    Then I enter an empty in Primary Field Mobile in Edit profile screen
    Then I enter an empty in Address field in Edit profile screen
    Then I Wait short period for Page to Load
    Then I Tap on Save button
    Then I Wait short period for Page to Load
    Then I Tap on Ok button

  @sanity1
  Scenario: Verifying application Settings screen Edit profile screen(Checking text field allowing Emoji's) Functionality
    Then I Wait short period for Page to Load
    Then I Tap on Edit profile in profile screen
    Then I enter an Emoji's in First name Field in Edit profile screen
    Then I enter an Emoji's in Last name Field in Edit profile screen
    Then I enter an Primary Mobile in Edit profile screen
    Then I enter an Emoji's in Address field in Edit profile screen
    Then I Wait short period for Page to Load
    Then I Tap on Save button
    Then I Wait short period for Page to Load
    Then I Tap on Ok button
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
#    Then I Tap on Marine Tile
    Then I Tap on hamburger menu in landing screen

  @sanity1
  Scenario: Verifying application Settings screen Edit profile screen(Checking text field allowing Special Characters) Functionality
    Then I Tap on View Edit Account link in Settings screen
    Then I Tap on Profile in Account Setting Screen
    Then I Tap on Edit profile in profile screen
    Then I enter an Special character in First name Field in Edit profile screen
    Then I enter an Special character in Last name Field in Edit profile screen
    Then I enter an Primary Mobile in Edit profile screen
    Then I enter an Special character in Address field in Edit profile screen
    Then I Wait short period for Page to Load
    Then I Tap on Save button
    Then I Wait short period for Page to Load
    Then I Tap on Ok button
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
#    Then I Tap on Marine Tile
    Then I Tap on hamburger menu in landing screen
    Then I Tap on View Edit Account link in Settings screen
    Then I Tap on Profile in Account Setting Screen
    Then I Tap on Edit profile in profile screen

  @sanity1
  Scenario: Verifying application Settings screen Edit profile screen Functionality
    Then I enter an First name in Edit profile screen
    Then I enter an Last name in Edit profile screen
    Then I enter an Primary Mobile in Edit profile screen
    Then I enter an Address in Edit profile screen
    Then I Wait short period for Page to Load
    Then I Tap on Save button
    Then I Wait short period for Page to Load
    Then I Tap on Ok button
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Marine Tile

  @sanity1
  Scenario: Verifying application Settings screen App Settings screen UI
    Then I Tap on back button in Edit Profile Screen
    Then I Tap on back button in Profile Screen
    Then I Tap on back button in Account Settings Screen
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App Settings
    Then I verify App Settings Header text
    Then I verify Language text in App Settings page
    Then I verify selected language is displayed
    Then I verify Temperature text in App Settings page
    Then I verify celsiusText is displayed
    Then I verify fahrenheitText is displayed
    Then I verify Unit text is displayed
    Then I verify selected unit text is displayed
    Then I verify App version text is displayed
    Then I Tap on Back button in App Settings screen

  @sanity1
  Scenario: Verifying application Settings screen-App Settings screen(Set units,Temperature,Language) UI&Functionality
    Then I Wait short period for Page to Load
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App Settings
    Then I Tap on Language in App Settings page
    Then I verify Back Button displayed in Language Page
    Then I verify Language Header Text in Language Page
    Then I Verify Language English Text in Language Page
    Then I Verify Language German Text in Language Page
    Then I Verify Language Spanish (US) Text in Language Page
    Then I Verify Language French Text in Language Page
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Units in App Settings page
    Then I Wait short period for Page to Load
    Then I verify Back Button displayed in Units Page
    Then I verify Units Header Text in Units Page
    Then I verify Metric Text in Units Page
    Then I verify Imperial Text in Units Page
    Then I Tap on Back Button
    Then I Wait short period for Page to Load

  @sanity1
  Scenario: Verifying application App Settings screen(Set units,Temperature,Language) Functionality
    Then I Tap on Language in App Settings page
    Then I Tap on German Language in Language Page
    Then I Tap on Language in App Settings page
    Then I Tap on Spanish (US) Language in Language Page
    Then I Tap on Language in App Settings page
    Then I Tap on French Language in Language Page
    Then I Tap on Language in App Settings page
    Then I Tap on English Language in Language Page
    Then I Tap on Units in App Settings page
    Then I Tap on Imperial Unit in Units Page
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Security Tile on landing screen
    Then I Tap on Gio Fencing Radius from center toggle if it's already in OFF state
    Then I Tap on Back Button
    Then I Tap on hamburger menu in landing screen
    Then I Tap on App Settings
    Then I Tap on Units in App Settings page
    Then I Tap on Metric Unit in Units Page
    Then I Tap on Back Button
    Then I Wait short period for Page to Load
    Then I Tap on Security Tile on landing screen
    Then I Tap on Gio Fencing Radius from center toggle if it's already in OFF state
    Then I Tap on Back Button
    Then I Wait short period for Page to Load











