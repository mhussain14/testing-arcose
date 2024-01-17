@signup
Feature: SignUpIntoRcos
  Author: Mehdi Hussain
  Date : 2024

  //Background:

  @signup
  Scenario: 000 Create new account on the ARCOS website
    * click on the Sign In on the homepage
    * click on Sign Up Or Register button
    * check the first name "First Name"
    * enter the First Name "Mehdi" on the sign up screen
    * check the last name "Last Name" on the sign up screen
    * enter the last Name "Hussain" on the sign up screen
    * check the  text username "Username" on the sign up screen
    * enter the username "mehdi-hussain5" on the sign up screen
    * check the text email "Email" on the sign up screen
    * enter the email "mehdi.hussain5@gmail.com" on the sign up screen
    * check the text password "Password" on the sign up screen
    * enter the password "Abc12345" on the sign up screen
    * click on create account button to create new account
    * user register successfully "Email or Username Already Registered!!"
    * click on login button on the sign up screen

  Scenario: 001 check the validation message for all the fields on the sign up screen
    #* lunch the arcos website
    * refresh the page
    * click on the Sign In on the homepage
    * click on Sign Up Or Register button
    * click on create account button to create new account
    * text first name is "first name is required" on the sign up screen
    * text last name is "last name is required" on the sign up screen
    * text user name is "Username is required" on the sign up screen
    * text email is "Email is required" on the sign up screen
    * text password is "Password is required" on the sign up screen

    Scenario: 002 check the ؒlength of first and last name length
      * refresh the page
      * click on the Sign In on the homepage
      * click on Sign Up Or Register button
      * enter the First Name "abccdefghtinsfmd" on the sign up screen
      * enter the last Name "Hussainnddndnjndnv" on the sign up screen
      * click on create account button to create new account
      * text user name is "Username is required" on the sign up screen
      * text email is "Email is required" on the sign up screen
      * text password is "Password is required" on the sign up screen

  Scenario: 003 check the user name with this format (mehdi_hussain-5)
    * refresh the page
    * click on the Sign In on the homepage
    * click on Sign Up Or Register button
    * enter the First Name "khan" on the sign up screen
    * enter the last Name "khan" on the sign up screen
    * enter the username "kahan_hussain-5" on the sign up screen
    * click on create account button to create new account
    * text email is "Email is required" on the sign up screen
    * text password is "Password is required" on the sign up screen

  Scenario: 004 check the user name with this format (mehdi hussain5)
    * refresh the page
    * click on the Sign In on the homepage
    * click on Sign Up Or Register button
    * enter the First Name "abccdefghtinsfmd" on the sign up screen
    * enter the last Name "Hussainnddndnjndnv" on the sign up screen
    * enter the username "mehdi hussain5" on the sign up screen
    * enter the email "mehdi.hussain5@gmail.com" on the sign up screen
    * click on create account button to create new account
    * text password is "Password is required" on the sign up screen

  Scenario: 005 check the user name with this format (mehdihussain 5)
    * refresh the page
    * click on the Sign In on the homepage
    * click on Sign Up Or Register button
    * enter the First Name "abccdefghtinsfmd" on the sign up screen
    * enter the last Name "Hussainnddndnjndnv" on the sign up screen
    * enter the username "mehdihussain 5" on the sign up screen
    * enter the email "mehdi.hussain5@gmail.com" on the sign up screen
    * enter the password "Abc12345" on the sign up screen
    * click on create account button to create new account
    * text user name is "Invalid username format" on the sign up screen

  Scenario: 006 check the user name with this format (mehdi.hussain.5)
    * refresh the page
    * click on the Sign In on the homepage
    * click on Sign Up Or Register button
    * enter the First Name "abccdefghtinsfmd" on the sign up screen
    * enter the last Name "Hussainnddndnjndnv" on the sign up screen
    * enter the username "mehdi.hussain.5" on the sign up screen
    * enter the email "mehdi.hussain5@gmail.com" on the sign up screen
    * enter the password "Abc12345" on the sign up screen
    * click on create account button to create new account
    #* text user name is "Invalid username format" on the sign up screen

  Scenario: 007 check the email with this format (mehdi..hussain5@gmail.com)
    * refresh the page
    * click on the Sign In on the homepage
    * click on Sign Up Or Register button
    * enter the First Name "abccdefghtinsfmd" on the sign up screen
    * enter the last Name "Hussainnddndnjndnv" on the sign up screen
    * enter the username "mehdi.hussain5" on the sign up screen
    * enter the email "mehdi..hussain5@gmail.com" on the sign up screen
    * enter the password "Abc12345" on the sign up screen
    * click on create account button to create new account
    #* text email is "Enter a valid email" on the sign up screen

  Scenario: 008 check the email with this format (mehdi.hussain5@@gmail.com)
    * refresh the page
    * click on the Sign In on the homepage
    * click on Sign Up Or Register button
    * enter the First Name "abccdefghtinsfmd" on the sign up screen
    * enter the last Name "Hussainnddndnjndnv" on the sign up screen
    * enter the username "mehdi_hussain5" on the sign up screen
    * enter the email "mehdi.hussain5@@gmail.com" on the sign up screen
    * enter the password "Abc12" on the sign up screen
    * click on create account button to create new account
    * text email is "Enter a valid email" on the sign up screen
    * text password is "Password should be of minimum 6 characters length" on the sign up screen

  Scenario: 009 check the email with this format (mehdi.hussain5#@gmail.com)
    * refresh the page
    * click on the Sign In on the homepage
    * click on Sign Up Or Register button
    * enter the First Name "abccdefghtinsfmd" on the sign up screen
    * enter the last Name "Hussainnddndnjndnv" on the sign up screen
    * enter the username "mehdi_hussain5" on the sign up screen
    * enter the email "mehdi.hussain@#gmail.com" on the sign up screen
    * enter the password "12345" on the sign up screen
    * click on create account button to create new account
    * text email is "Enter a valid email" on the sign up screen
    * text password is "Password should be of minimum 6 characters length" on the sign up screen

  Scenario: 010 check the email with this format (mehdi.hussain5@gmail..com)
    * refresh the page
    * click on the Sign In on the homepage
    * click on Sign Up Or Register button
    * enter the First Name "abccdefghtinsfmd" on the sign up screen
    * enter the last Name "Hussainnddndnjndnv" on the sign up screen
    * enter the username "mehdi_hussain5" on the sign up screen
    * enter the email "mehdi.hussain5@gmail..com" on the sign up screen
    * enter the password "Abc" on the sign up screen
    * click on create account button to create new account
    * text email is "Enter a valid email" on the sign up screen
    * text password is "Password should be of minimum 6 characters length" on the sign up screen

  Scenario: 011 check the email with this format (mehdi.hussain5.@.gmail.com)
    * refresh the page
    * click on the Sign In on the homepage
    * click on Sign Up Or Register button
    * enter the First Name "abccdefghtinsfmd" on the sign up screen
    * enter the last Name "Hussainnddndnjndnv" on the sign up screen
    * enter the username "mehdi_hussain5" on the sign up screen
    * enter the email "mehdi.hussain5@.gmail.com" on the sign up screen
    * enter the password "Abc@12345" on the sign up screen
    * click on create account button to create new account
    * text email is "Enter a valid email" on the sign up screen