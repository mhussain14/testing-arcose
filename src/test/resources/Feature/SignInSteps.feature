@signIn
  Feature: SignInIntoRcos
    Author: Mehdi Hussain
    Date : 2024

  Background:

    @signIn
    Scenario: Login to website with valid email and password
      * click on the Sign In on the homepage
      * check the text email "Email" on the signIn screen
      * enter the email "mehdi.hussain5@gmail.com" on the sign in screen
      * check the text password "Password" on the sign in screen
      * Enter the password "Abc12345" on the sign in Screen
      * click on sign in button to sign in
      * user register successfully "Logged In Successfully!"
      #* User Not found!, Invalid Email or Password!!, Logged In Successfully!

      Scenario: Log Out from the arcos website
        #* text log out "LOG OUT" on the login screen
        * click on log out button
        * user register successfully "User Logged out!"

      Scenario: check the email and password validation on the log in screen
        * refresh the page
        * click on the Sign In on the homepage
        * click on sign in button to sign in
        * text email is "Email is required" on the sign in screen
        * text password is "Password is required" on the sign in screen
