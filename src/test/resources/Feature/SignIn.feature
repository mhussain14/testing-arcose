@signIn
  Feature: As registered user, i want to login in to the website by entered the valid email and password,
    so i will be able to update my profile.
    Author: Mehdi Hussain
    Date : 2024

  Background:

      @signIn
      Scenario: Login to website with valid email and password
        * click on the Sign In on the homepage
        #* check the text email "Email" on the signIn screen
        * search the text "Email" on page
        * enter the email "mehdi.hussain5@gmail.com" on the sign in screen
        #* check the text password "Password" on the sign in screen
        * search the text "Password" on page
        * Enter the password "Abc12345" on the sign in Screen
        * click on sign in button to sign in
        * user register successfully "Logged In Successfully!"
        #* User Not found!, Invalid Email or Password!!, Logged In Successfully!

      Scenario: Log Out from the arcos website
        * text log out "LOG OUT" on the login screen
        #* search the "LOG OUT" on page
        * click on log out button
        #* user register successfully "Logged In Successfully!"
        * search the text "User Logged out!" on page


      Scenario: check the email and password validation on the log in screen
        * refresh the page
        * click on the Sign In on the homepage
        * click on sign in button to sign in
        #* text email is "Email is required" on the sign in screen
        * search the text "Email is required" on page
        #* text password is "Password is required" on the sign in screen
        * search the text "Password is required" on page

