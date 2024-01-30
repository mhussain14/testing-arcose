@EditUserprofile
  Feature: As user i should be able to update user profile on the user profile page.
    Author: Mehdi
  Date : 10 January 2024

    Background:
      * enter the email "mehdi.hussain@arcelik.com" and password "Arcelik@123" to login

    Scenario: 000 check the user profile by clicking on profile button
      * click on profile edit button
      * user profile image should be displayed
      * text "Profile" click on profile button on the user profile page
      * text user name "@26093387" on the user profile page
      * text profile "Profile" on the user profile page
      * text registered "Registered: 0 months, 0 weeks ago" on the user profile page
      #* check the month count "" on the user profile page
      #* check the text months "" on the user profile page
      #* total week count "" on the user profile page
      #* text the text weeks "" on the user profile page
      * text forum "Forums" on the user profile page
      * text topic started "Topics Started: 0" on the user profile page
      * text replies created "Replies Created: 0" on the user profile page
      * text forum role "Forum Role: Keymaster" on the user profile page
      * text topic "Topics: 0" on the user profile page
      * text replies "Replies: 0" on the user profile page
      * text rookie "Rookie" on the user profile page
      * click on log out button

    Scenario: 002 check the hyperlinks on the profile page
      * click on profile edit button
      * text "Profile" and click on profile hyperlink
      * text "Topic Started" and click on topic started hyperlink
      * text "Replies Created" and click on replies created hyperlink
      * text "Engagements" and click on engagement hyperlink
      * text "Favorites" and click on favorites hyperlink
      * text "Subscriptions" and click on subscription hyperlink
      * text "Edit" and click on edit hyperlink
      * click on log out button

    Scenario: 003 check the edit page
      * click on profile edit button
      * text "Edit" and click on edit hyperlink
      * text name "Name" on the edit page
      * text first name "First Name" on the edit page
      * update the first name "Mehdi" on the edit page
      * text last name "Last Name" on the edit page
      * update last name "Hussain" on the edit page
      * text nick name "Nick Name" on the edit page
      * update nick name "Mehdi" on the edit page
      * text display name "Display Name" on the edit page
      * update display name "Hussain" on the edit page
      * text contact info "Contact Info" on the edit page
      * text website "Website" on the edit page
      * update website "Website" on the edit page
      * text about yourself "About Yourself" on the edit page
      * text biographical info "Biographical Info" on the edit page
      * update biographical info "mehdi hussain is from islamabad" on the edit page
      * text account "Account" on the edit page
      * text username "Username" on the edit page
      * update the username "mehdi.hussain12" on the edit page
      * text email "Email" on the edit page
      * update the email "meh.hussain12@gmail.com" on the edit page
      * text password "Password" on the edit page
      * generate password by clicking on button "Generate Password" on the edit page
      * text language "Language" on the edit page
      * update language "English USA" on the edit page
      * text two factor "Two Factor Authentication" on the edit page
      * click on two factor text "Go here for your two factor authentication settings..." on the edit page
      * text profile pic "Profile Picture" on the edit profile page
      * text "Choose Image" choose the image
      * image should be displayed
      * click on log out button

    Scenario: 004 Reset User Password
      #* check the forgot password link on the  sign in page.
      #* click on the forgot password link.
      #* Verify the that user shoudl be redirected to the forgot password page
      #* check the email address field
      #* enter the email address "" to received the reset password link.
      #* wait for the email 5 mints.
      #* click on the link to open the reset password page.
      #* enter the new password.
      #* click on reset button.